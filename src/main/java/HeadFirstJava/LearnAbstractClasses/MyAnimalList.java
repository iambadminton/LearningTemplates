package HeadFirstJava.LearnAbstractClasses;


import java.util.ArrayList;

/**
 * Created by a.shipulin on 14.11.17.
 */
public class MyAnimalList {
    private Animal[] animals = new Animal[5];
    private int nextIndex = 0;
    ArrayList<Object> list = new ArrayList<Object>();
    Animal animal;

    public void add(Animal a) {
        if(nextIndex < animals.length) {
            animals[nextIndex] = a;
            System.out.println("Animal добавлен в ячейку " + nextIndex + " Тип " + a.getClass());
            nextIndex++;
        }
    }

    public static void main(String[] args) {
        MyAnimalList myAnimalList = new MyAnimalList();
        myAnimalList.animal = myAnimalList.animals[0];

        System.out.println(myAnimalList.hashCode());
    }

}
