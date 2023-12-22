package LearnEnum;

public class TestMaintMethod {
    public static void main(String[] args) {
        MaintMethod method = MaintMethod.valueOf("OWN_STRENGTH");
        System.out.println(method.getDescr() + " " + method.getAbbr());
    }
}
