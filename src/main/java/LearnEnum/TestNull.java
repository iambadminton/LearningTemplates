package LearnEnum;

public class TestNull {
    public static void main(String[] args) {
        TestHerb herb = new TestHerb("полынь");
        herb.name = null;
        if(!(herb.name.equalsIgnoreCase("")) && !(herb.name == null)) {
            System.out.println("herb = " + herb);
        }
    }
}
