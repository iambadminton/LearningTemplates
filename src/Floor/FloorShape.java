package Floor;

import java.util.ArrayList;
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
            if(sc.hasNextFloat()) {
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
        for(Float f: possibleLength) {
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
        for(Float p: pieces) {
            ii++;
            System.out.println(ii +"-й:" + p);
        }


        System.out.println("Распределяем доски:");
        ii = 0;
        float piece = 0;
        count = 0;
        for(Float board:boardsLength) {
            ii++;
            System.out.println("шаг " + ii+ "-й: boardsLength.size()=" + boardsLength.size() );
            /*for(int j=0; j<= pieces.size(); j++) {
                if(pieces.get(j) >=  )
            }*/
            int kk=0;
            while(kk<= boardsLength.size()-1) {
                kk++;
                System.out.println("kk=" + kk + " boardsLength.size()=" + boardsLength.size() + " boardsLength.get(kk)="
                        + boardsLength.get(kk) + "  pieces.get(ii)=" + pieces.get(ii));
                if(pieces.get(ii) >= boardsLength.get(kk)) {
                    System.out.println("Доска " + board.floatValue() + " обрезок " + pieces.get(kk) + " для доски " + boardsLength.get(kk) );
                    boardsLength.remove(kk);
                    pieces.remove(ii);
                    break;
                }
                count++;
            }

        }
        System.out.println("Общее число заготовок = " + count);




        /*ArrayList<FloorPoint> opt = new ArrayList<>();
        opt = calcOptimum(floorPoints);*/
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
        ArrayList<Float> razn = new ArrayList<>();
        //System.out.println("<== calcOptimum ==>");
        for (FloorPoint fp2 : fp) {
            //System.out.println("calcOptimum:: x=" + fp2.getX() + "y=" + fp2.getY());
            razn.add(fp2.getX() + fp2.getY());
        }
        return razn;
    }

}
