package inner_classes;

public class Boeing737 {

    private int manufactureYear;
    private static int maxPassengersCount = 300;

    private Color color;

    public Boeing737(int manufactureYear, Color color) {
        this.manufactureYear = manufactureYear;
        this.color = color;
    }

    public int getManufactureYear() {
        return manufactureYear;
    }

    public static class Drawing {

        public static int getMaxPassengersCount() {

            return maxPassengersCount;
        }
    }

    public static enum Color {
        RED, WHITE;
    }
}




