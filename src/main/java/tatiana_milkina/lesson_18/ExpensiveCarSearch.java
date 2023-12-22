package tatiana_milkina.lesson_18;

public class ExpensiveCarSearch implements Searchable {
    @Override
    public boolean test(Car car) {
        return car.getCost() > 20000;
    }
}
