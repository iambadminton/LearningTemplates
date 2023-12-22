package advanced_capabilities.unsafe_class;

public class Person {
    private String name;
    private int money;

    public Person(String name) {
        this.name = name;
        this.money = 5;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}
