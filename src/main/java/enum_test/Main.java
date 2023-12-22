package enum_test;

public class Main {
    public enum Car {
        AUDI("Audi"),
        BMW("bmw");

        private String descr;

        Car(String descr) {
            this.descr = descr;
        }

        public String getDescr() {
            return descr;
        }
    }

    public Car car;

    public Main(Car car) {
        this.car = car;
    }

    public static void main(String[] args) {
        Main test = new Main(Car.AUDI);
        System.out.println(test.car.descr);
    }
}
