package SharpenSkills.rank6;

/**
 * https://www.codewars.com/kata/5870db16056584eab0000006/train/java
 * Create your own mechanical dartboard that gives back your score based on the coordinates of your dart.
 * <p>
 * Task:
 * Use the scoring rules for a standard dartboard:
 * Finish method:
 * java: public String getScore(double x, double y);
 * The coordinates are (x, y) are always relative to the center of the board (0, 0). The unit is millimeters. If you
 * throw your dart 5 centimeters to the left and 3 centimeters below, it is written as:
 * java: String score = dartboard.getScore(-50, -30);
 * <p>
 * Possible scores are:
 * Outside of the board: "X"
 * Bull's eye: "DB"
 * Bull: "SB"
 * A single number, example: "10"
 * A triple number: "T10"
 * A double number: "D10"
 * A throw that ends exactly on the border of two sections results in a bounce out. You can ignore this because all the
 * given coordinates of the tests are within the sections.
 * The diameters of the circles on the dartboard are:
 * Bull's eye: 12.70 mm
 * Bull: 31.8 mm
 * Triple ring inner circle: 198 mm
 * Triple ring outer circle: 214 mm
 * Double ring inner circle: 324 mm
 * Double ring outer circle: 340 mm
 * If you liked this kata, you can continue with: Let's Play Darts: Beat The Power!
 */
public class Dartboard {

    public String getScore(double x, double y) {
        // Start your coding here...
        final double doubleRingOuterDiameter = 340d;
        final double doubleRingInnerDiameter = 324d;
        final double tripleRingOuterDiameter = 214d;
        final double tripleRingInnerDiameter = 198d;
        final double bullDiameter = 31.8d;
        final double bullEyeDiameter = 12.7d;
        final int[] points = {0, 13, 4, 18, 1, 20, 5, 12, 9, 14, 11, 8, 16, 7, 19, 3, 17, 2, 15, 10, 6};

        String k = new String("");
        String res = null;

        double r = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
        double teta = Math.toDegrees(Math.atan2(y, x)); // угол к осям координат
        int sectorIndex = 0;
        if (teta < 0) {
            teta = 360 - Math.abs(teta);
        }
        sectorIndex = (int) Math.round((teta - (teta + 9) % 18) / 18);

        System.out.println("x=" + x + " y=" + y + " teta=" + teta + " sectorIndex=" + sectorIndex);
        System.out.println("teta=" + teta + " sectorIndex=" + sectorIndex + " value=" + points[sectorIndex]);
        System.out.println("r=" + r);
        if (r > doubleRingOuterDiameter / 2) {
            res = new String("X");
            return res;
        }

        if(r<=bullEyeDiameter/2) {
            res="DB";
            return res;

        }

        if(r>bullEyeDiameter/2 && r<=bullDiameter/2) {
            res = "SB";
            return res;
        }

        if (r <= doubleRingOuterDiameter / 2 && r >= doubleRingInnerDiameter / 2) {
            k = new String("D");

        }
        if (r <= tripleRingOuterDiameter / 2 && r >= tripleRingInnerDiameter / 2) {
            k = new String("T");
        }
        res = k + points[sectorIndex];


        return res;
    }

    public static void main(String[] args) {
        Dartboard dartboard = new Dartboard();
        //System.out.println(dartboard.getScore(-133.69, -147.38));
        System.out.println(dartboard.getScore(-5.43, 117.95)); // д.б. 20, т.е. 1-ый сектор
        System.out.println(dartboard.getScore(-73.905, -95.94)); // д.б. 7, т.е. 12-ый сектор
        System.out.println("=====================");
        System.out.println(dartboard.getScore(2.38, -6.06)); // д.б. 7, т.е. 12-ый сектор

    }
}