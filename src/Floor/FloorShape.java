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

        FloorPoint fp;
        ArrayList<FloorPoint> floorPoints = new ArrayList<FloorPoint>();
        ArrayList<Float> boardsLength = new ArrayList<Float>();
        Scanner sc = new Scanner(System.in);
        while (yn.equalsIgnoreCase("y")) {
            i++;
            //fp = new FloorPoint(i,i);
            fp = new FloorPoint();
            floorPoints.add(fp);
            //System.out.println("i=" + i + " floorPoints.size=" + floorPoints.size());
            System.out.println("x=" + fp.getX() + "  y=" + fp.getY());
            System.out.println("Продолжить(y/n)?");
            if (sc.hasNextLine()) {
                yn = sc.nextLine();
            }
        }
//        System.out.println("Size is " + floorPoints.size());
//        for (FloorPoint fp1 : floorPoints) {
//            System.out.println(fp1.getX() + "," + fp1.getY());
//        }
        System.out.println("Введите ширину доски:");
        if (sc.hasNextFloat()) {
            boardWidth = sc.nextFloat();
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

//        System.out.println("minX = " + minX + ", maxX=" + maxX + ", minY=" + minY + ", maxY=" + maxY);
//        System.out.println("getMinX(" + minY + ")=" + getMinX(minY, floorPoints));
//        System.out.println("getMaxX(" + minY + ")=" + getMaxX(minY, floorPoints));
//        System.out.println("getMinY(" + maxX + ")=" + getMinY(maxX, floorPoints));
//        System.out.println("getMaxY(" + maxX + ")=" + getMaxY(maxX, floorPoints));


        minWidth = getMaxY(minX, floorPoints) - getMinY(minX, floorPoints);
        maxLength = getMaxX(minY, floorPoints) - getMinX(minY, floorPoints);
        maxWidth = getMaxY(maxX, floorPoints) - getMinY(maxX, floorPoints);

        System.out.println("maxWidth=" + maxWidth);
        System.out.println("minWidth=" + minWidth);
        System.out.println("maxLength=" + maxLength);

//        for (FloorPoint fp4 : floorPoints) {
//        }

        System.out.println("boardWidth = " + boardWidth);
        curPosition = getMinX(minY, floorPoints);
        int jj = 0;

        while(curPosition < getMaxX(minY, floorPoints)) {
            jj++;
            heigth = minWidth + jj*boardWidth*(maxWidth-minWidth)/maxLength;
            boardsLength.add(heigth);
            curPosition = curPosition + boardWidth;
        }

        // выведем все длины досок, на которые нужно будет попилить для укладки
        int ii = 0; // счетчик досок
        for(Float board: boardsLength) {
            ii++;
            System.out.println("Доска " + ii + ", L=" + board.floatValue());
        }

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
        //System.out.println("=====>");
        for (FloorPoint fp4 : fp) {
            //System.out.println("=====> maxX=" + maxX);
            if (fp4.getY() == y && maxX < fp4.getX()) {
                maxX = fp4.getX();
            }
        }
        return maxX;
    }


    public static float getMinY(float x, ArrayList<FloorPoint> fp) {
        float minY = Float.MAX_VALUE;
        //System.out.println("=====>");
        for (FloorPoint fp4 : fp) {
            //System.out.println("=====> minX=" + minX);
            if (fp4.getX() == x && minY > fp4.getY()) {
                minY = fp4.getY();
            }
        }
        return minY;
    }


    public static float getMaxY(float x, ArrayList<FloorPoint> fp) {
        //float maxY = Float.MIN_VALUE;

        float maxY = 0;
        ;
        //System.out.println("=====>");
        for (FloorPoint fp4 : fp) {
            //System.out.println("=====> maxX=" + maxX);
            if ((fp4.getX() == x) && (maxY <= fp4.getY())) {
                maxY = fp4.getY();
            }
        }
        return maxY;
    }


}
