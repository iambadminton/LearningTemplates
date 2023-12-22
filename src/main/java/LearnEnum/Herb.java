package LearnEnum;

public class Herb {
    enum Type{ANNUAL, PERENIAL, BIENIAL};
    final String name;
    final Type type;

    public Herb(String name, Type type) {
        this.name = name;
        this.type = type;
    }

    @Override
    public String toString() {
        return name;
    }


}
