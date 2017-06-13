package OracleTutorial.DeckOfCards.TestCloneMethod;

/**
 * Created by a.shipulin on 13.06.17.
 */
public class Employee implements Cloneable {

    private int empoyeeId;
    private String employeeName;
    private Department department;

    public Employee(int id, String name, Department dept) {
        this.empoyeeId = id;
        this.employeeName = name;
        this.department = dept;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    //Accessor/mutators methods will go there
}

