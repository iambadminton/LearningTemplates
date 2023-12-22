package JustTest;

public class DriveVehicle {
    public static void main(String[] args) {
        Vehicle car = new Car("Toyota");
        if(car instanceof Vehicle) {
            System.out.println("car is instance of Vehicle");
        }
        if(car instanceof Car) {
            System.out.println("car is instance of Car ");
        }

        System.out.println("car.getClass = " + car.getClass());

        car = null;

        if(car instanceof Vehicle) {
            System.out.println("car is instance of Vehicle");
        }
        if(car instanceof Car) {
            System.out.println("car is instance of Car ");
        }

    }
}
