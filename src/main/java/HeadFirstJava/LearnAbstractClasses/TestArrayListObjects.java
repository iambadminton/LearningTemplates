package HeadFirstJava.LearnAbstractClasses;

import java.util.ArrayList;

/**
 * Created by a.shipulin on 15.11.17.
 */
public class TestArrayListObjects {
    public static void main(String[] args) {
        ArrayList<Object> list = new ArrayList<Object>();
        Anything anything;
        anything = new Anything();

        list.add(anything);
        list.add(anything);
        list.add(anything);
        list.add(anything);
        list.add(new String("ddd"));

        for (Object curObject : list) {
            if (curObject instanceof Anything) {
                System.out.print("Это Anything.");
            }
            if(curObject instanceof Object) {
                System.out.println(" Это Object!");
            }


        }
    }
}
