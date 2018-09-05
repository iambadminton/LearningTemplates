package SharpenSkills.rank4;

import java.util.TreeSet;

/**
 * Created by a.shipulin on 05.07.18.
 */
public class TreeSetTest {
    public static void main(String[] args) {

        TreeSet<String> states = new TreeSet<String>();

        // добавим в список ряд элементов
        states.add("Germany");
        states.add("France");
        states.add("Italy");
        states.add("Great Britain");

        System.out.printf("TreeSet contains %d elements \n", states.size());

        // удаление элемента
        //states.remove("Germany");
        for(String state : states){

            System.out.println(state);
        }
    }
}
