package LearnEnum;

public class WeightTable {
    public static void main(String[] args) {
        double earthWeight = Double.parseDouble(args[0]);
        double mass = earthWeight / Planet.EARTH.getSurfaceGravity();
        for (Planet p : Planet.values()) {
            System.out.println(p.toString());
            System.out.printf("Weight on %s is %f%n", p, p.surfaceWeight(mass));
        }
    }
}