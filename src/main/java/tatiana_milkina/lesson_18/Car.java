package tatiana_milkina.lesson_18;

public class Car {
    private CarTypes type;

    private String brand;
    private String model;
    private float cost;

    public Car(CarTypes type, String brand, String model, float cost) {
        this.type = type;
        this.brand = brand;
        this.model = model;
        this.cost = cost;
    }

    public CarTypes getType() {
        return type;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public float getCost() {
        return cost;
    }
}
