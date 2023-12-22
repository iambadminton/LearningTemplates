package udemy_java.collections;

public class MyLinkedListTest {
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add(1);
        myLinkedList.add(2);
        myLinkedList.add(10);

        System.out.println(myLinkedList.toString());

        myLinkedList.remove(1);

        System.out.println(myLinkedList.toString());

        myLinkedList.remove(1);

        System.out.println(myLinkedList.toString());


    }
}
