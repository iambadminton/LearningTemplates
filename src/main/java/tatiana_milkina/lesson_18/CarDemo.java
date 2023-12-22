package tatiana_milkina.lesson_18;

public class CarDemo {
    public static void main(String[] args) {
        Car carMazda3 = new Car(CarTypes.COMPACT, "Mazda", "3", 18000f);
        Car carMazda6 = new Car(CarTypes.CEDAN, "Mazda", "6", 22000f);
        Car carNissanQuashkai = new Car(CarTypes.SUV, "Nissan", "Quashkai", 20000f);
        Car carMitsubishiPS = new Car(CarTypes.ALLROADS, "Mitsubishi", "Pajero Sprot", 45000f);

        Car[] myFavoritCars  = new Car[]{carMazda3, carMazda6, carMitsubishiPS, carNissanQuashkai};
        CarDemo demo = new CarDemo();
        //System.out.println(demo.getCarsNumber(myFavoritCars, new ExpensiveCarSearch()));
        System.out.println(demo.getCarsNumber(myFavoritCars,
                car -> car.getCost() > 20000));
    }


    private int getCarsNumber(Car[] cars, Searchable s) {
        int result = 0;
        for(Car car: cars) {
            if(s.test(car)) {
                result++;
            }
        }
        return result;
    }
}
