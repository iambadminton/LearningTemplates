package HeadFirstJava;

/**
 * Created by a.shipulin on 11.12.17.
 */
public class Employee implements java.io.Serializable {
    public String name;
    public String address;
    public transient int SSN;
    public int number;

    public void mailCheck() {
        System.out.println("Mailing a check to " + name + " " + address);
    }
}
