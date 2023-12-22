package inner_classes;

public class Boieng737_100 extends Boeing737 {

    public int height;
    public Color color;

    public Boieng737_100(int manufactureYear, Boeing737.Color color, int height, Color color1) {
        super(manufactureYear, color);
        this.height = height;
        this.color = color1;
    }

    public static enum Color {
        RED, WHITE, BLACK;
    }

    public static void main(String[] args) {
        Boeing737 boeing737 = new Boeing737(10, Boeing737.Color.RED);


    }
}
