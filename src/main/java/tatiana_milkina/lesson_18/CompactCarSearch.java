package tatiana_milkina.lesson_18;

public class CompactCarSearch implements Searchable{
    @Override
    public boolean test(Car car) {
        return car.getType().equals(CarTypes.COMPACT);
    }
}
