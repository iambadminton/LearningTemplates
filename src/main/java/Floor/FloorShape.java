package Floor;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 * Created by a.shipulin on 11.05.17.
 */
public class FloorShape {
    public static void main(String args[]) {
        String yn;
        yn = "y";
        int i = 0;
        int j = 0; //счетчик
        float boardWidth = 0;
        float minLength = 0;
        float maxLength = 0;
        float minWidth = 0;
        float maxWidth = 0;
        float minX = 0;
        float minY = 0;
        float maxX = 0;
        float maxY = 0;
        float curPosition = 0;
        float heigth = 0;
        int count = 0;


        FloorPoint fp;
        ArrayList<FloorPoint> floorPoints = new ArrayList<FloorPoint>(); // точки, ограничивающие нашу фигуру
        ArrayList<Float> boardsLength = new ArrayList<Float>(); // массив досок, необходимых для укладки
        ArrayList<Float> possibleLength = new ArrayList<Float>(); // массив возможных нарезок
        ArrayList<Float> pieces = new ArrayList<Float>(); // массив обрезков

        Scanner sc = new Scanner(System.in);
        while (yn.equalsIgnoreCase("y")) {
            i++;
            fp = new FloorPoint();
            floorPoints.add(fp);
            System.out.println("x=" + fp.getX() + "  y=" + fp.getY());
            System.out.println("Продолжить(y/n)?");
            if (sc.hasNextLine()) {
                yn = sc.nextLine();
            }
        }

        System.out.println("Введите ширину доски:");
        if (sc.hasNextFloat()) {
            boardWidth = sc.nextFloat();
        }


// зададим возможные длины досок
        yn = "y";
        i = 0;
        while (yn.equalsIgnoreCase("y")) {
            i++;
            //floorPoints.add(fp);
            System.out.println("i=" + i + " yn=" + yn);
            System.out.println("Введите возможную длину доски:");
            if (sc.hasNextFloat()) {
                possibleLength.add(sc.nextFloat());
            }
            System.out.println("Продолжить(y/n)?");
            if (sc.hasNextLine()) {
                yn = sc.next();
            }
        }


// нахождение точек начала и конца(по длине и ширине)
        for (FloorPoint fp3 : floorPoints) {
            j++;
            if (j == 1) {
                minX = fp3.getX();
                maxX = fp3.getX();
                minY = fp3.getY();
                minY = fp3.getY();
            }
            if (minX > fp3.getX()) {
                minX = fp3.getX();
            }
            if (maxX < fp3.getX()) {
                maxX = fp3.getX();
            }

            if (minY > fp3.getY()) {
                minY = fp3.getY();
            }

            if (maxY < fp3.getY()) {
                maxY = fp3.getY();
            }
        }

        System.out.println("Возможные длины досок:");
        for (Float f : possibleLength) {
            System.out.println(f);
        }

        minWidth = getMaxY(minX, floorPoints) - getMinY(minX, floorPoints);
        maxLength = getMaxX(minY, floorPoints) - getMinX(minY, floorPoints);
        maxWidth = getMaxY(maxX, floorPoints) - getMinY(maxX, floorPoints);

        System.out.println("maxWidth=" + maxWidth);
        System.out.println("minWidth=" + minWidth);
        System.out.println("maxLength=" + maxLength);

        System.out.println("boardWidth = " + boardWidth);
        curPosition = getMinX(minY, floorPoints);
        int jj = 0;

        while (curPosition < getMaxX(minY, floorPoints)) {
            jj++;
            heigth = minWidth + jj * boardWidth * (maxWidth - minWidth) / maxLength;
            boardsLength.add(heigth);
            curPosition = curPosition + boardWidth;
        }

        // выведем все длины досок, на которые нужно будет попилить для укладки
        int ii = 0; // счетчик досок
//        System.out.println("Размерность возможных длин:" + possibleLength.size());
        for (Float board : boardsLength) {
            ii++;
            System.out.println("Доска " + ii + ", L=" + board.floatValue());
            pieces.add(possibleLength.get(0) - board);
        }

        System.out.println("Обрезки:");
        ii = 0;
        Float totalLength = new Float(0);
        for (Float p : pieces) {
            ii++;
            System.out.println(ii + "-й:" + p);
        }


        System.out.println("Распределяем доски:");
        int numBoard = 0;
        float piece = 0;
        count = 0;
        Float board;
        ArrayList<Float> boardsLengthForCheck = new ArrayList<Float>(); //новый массив для проверок и модификаций
        boardsLengthForCheck.addAll(boardsLength);
        Iterator<Float> it = boardsLength.iterator();
        boolean pieceIsUseless;
        while (it.hasNext()) {
            board = it.next();

            numBoard++;
            pieceIsUseless = true;

            if(boardsLengthForCheck.get(numBoard - 1) == 0 ) {
                continue;
            }

            Float curPiece = pieces.get(numBoard - 1);
            System.out.println("numBoard=" + numBoard + " длина доски=" + boardsLength.get(numBoard - 1)
                    + " обрезок=" + curPiece + " boardsLengthForCheck.get(numboard)=" + boardsLengthForCheck.get(numBoard - 1));


            //определим, можно ли приспособить обрезок в качестве доски
            for (int kk = boardsLengthForCheck.size() - 1; kk > numBoard - 1 && curPiece > 0; kk--) {

                //System.out.println("kk=" + kk);
                //System.out.println("numBoard=" + numBoard + " curPiece=" + curPiece + " boardsLength.get(kk)=" + boardsLengthForCheck.get(kk));
                if (boardsLengthForCheck.get(kk) <= curPiece && boardsLengthForCheck.get(kk) > 0) {
                    // нашли необходимую нарезку для обрезка
                    // включаем счетчик необходимых для минусовкии необходимых заготовок
                    count++;
                    pieceIsUseless = false;
                    System.out.println("   Обрезок длиной " + curPiece + " от доски "
                            + numBoard + " идет на доску " + (kk + 1) + ", ее длина " + boardsLengthForCheck.get(kk));

                    // изменим длину рассматриваемого обрезка
                    if (curPiece - boardsLengthForCheck.get(kk) <= 0) {
                        //curPiece = new Float(pieces.get(numBoard) - boardsLengthForCheck.get(kk));
                        break;
                    } else {
                        pieces.set(numBoard - 1, pieces.get(numBoard - 1) - boardsLengthForCheck.get(kk));
                        curPiece = new Float(curPiece - boardsLengthForCheck.get(kk));
                    }

                    // удалим доску из массива необходимых
                    boardsLengthForCheck.set(kk, new Float(0));
                    //System.out.println("======= boardsLengthForCheck.set(" + kk + ", new Float(0));");
                }
            }

            if(pieceIsUseless == true && boardsLengthForCheck.get(numBoard - 1) != 0) {
            /*if(pieceIsUseless == true) {*/
                System.out.println("   На доску " + numBoard + " потребуется целая заготовка");
            }
        }
        System.out.println("При длине заготовки = " + possibleLength.get(0) + " необходимое число заготовок = " + (numBoard - count));
    }


    public static float getMinX(float y, ArrayList<FloorPoint> fp) {
        float minX = Float.MAX_VALUE;
        //System.out.println("=====>");
        for (FloorPoint fp4 : fp) {
            //System.out.println("=====> minX=" + minX);
            if (fp4.getY() == y && minX > fp4.getX()) {
                minX = fp4.getX();
            }
        }
        return minX;
    }


    public static float getMaxX(float y, ArrayList<FloorPoint> fp) {
        float maxX = Float.MIN_VALUE;
        for (FloorPoint fp4 : fp) {
            if (fp4.getY() == y && maxX < fp4.getX()) {
                maxX = fp4.getX();
            }
        }
        return maxX;
    }


    public static float getMinY(float x, ArrayList<FloorPoint> fp) {
        float minY = Float.MAX_VALUE;
        for (FloorPoint fp4 : fp) {
            if (fp4.getX() == x && minY > fp4.getY()) {
                minY = fp4.getY();
            }
        }
        return minY;
    }

    public static float getMaxY(float x, ArrayList<FloorPoint> fp) {

        float maxY = 0;
        for (FloorPoint fp4 : fp) {
            if ((fp4.getX() == x) && (maxY <= fp4.getY())) {
                maxY = fp4.getY();
            }
        }
        return maxY;
    }

    public static ArrayList calcOptimum(ArrayList<FloorPoint> fp) {
        ArrayList<Float> razn = new ArrayList<Float>();
        for (FloorPoint fp2 : fp) {
            razn.add(fp2.getX() + fp2.getY());
        }
        return razn;
    }

}
