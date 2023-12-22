package LearnEnum;

public enum Planet {
    MERCURY(100, 100),
    VENUS(200, 200),
    EARTH(300, 300),
    MARS(400, 400),
    JUPITER(500, 500),
    SATURN(600, 600),
    URANUS(700, 700),
    NEPTUNE(800, 800);

    private final double mass;
    private final double radius;
    private final double surfaceGravity;
    private static final double G = 6.67300E-11;

    Planet(int mass, int radius) {
        this.mass = mass;
        this.radius = radius;
        surfaceGravity = G * mass / (radius * radius);
    }

    public double mass() {
        return mass;
    }
    public double radius() {
        return radius;
    }
    public double getSurfaceGravity() {
        return surfaceGravity;
    }
    public  double surfaceWeight(double mass) {
        return mass * surfaceGravity;
    }


}
