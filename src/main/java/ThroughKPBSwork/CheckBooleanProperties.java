package ThroughKPBSwork;

public class CheckBooleanProperties {
    public static void main(String[] args) {
        String stringValue="true";
        Boolean booleanValue = Boolean.valueOf(stringValue);
        if(booleanValue) {
            System.out.println("true;");
        }
        else {
            System.out.println("not true");
        }

    }
}
