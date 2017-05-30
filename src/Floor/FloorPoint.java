package Floor;

import java.util.Scanner;

/**
 * Created by a.shipulin on 11.05.17.
 */
public class FloorPoint {
    public float x;
    public float y;

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return this.y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public FloorPoint(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public FloorPoint() {
        float x = 0;
        float y = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите координату X:");
        if (sc.hasNextFloat()) {
            this.x = sc.nextFloat();

        }
        System.out.println("Введите координату Y:");
        if (sc.hasNextFloat()) {
            this.y = sc.nextFloat();
        }
        System.out.println("Вы ввели х=" + this.x + " y=" + this.y);
    }

    public static void main(String[] args) {
        FloorPoint fp = new FloorPoint();
        System.out.println("x=" + fp.getX() + " y=" + fp.getY());
    }
}
