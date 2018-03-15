package SharpenSkills.rank7;

/**
 * Created by a.shipulin on 06.03.18.
 */
public class BouncingBall {

    public static int bouncingBall(double h, double bounce, double window) {
        System.out.println("h=" + h);
        // your code
        double cur_height;
        cur_height = h;
        int times = 1;
        int i = 0;
        while (cur_height > 0) {
            i++;
            //System.out.println("i=" + i + " cur_height=" + cur_height);
            cur_height = cur_height * bounce;
            times = times + 2;
        }
        return times;

    }

    public static void main(String[] args) {
        BouncingBall ball = new BouncingBall();
        System.out.println(ball.bouncingBall(30.0d, 0.66d, 1.5d));
    }
}
