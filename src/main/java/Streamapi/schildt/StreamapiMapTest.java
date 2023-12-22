package Streamapi.schildt;

import java.util.*;
import java.util.stream.Stream;

public class StreamapiMapTest {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        Stream<Integer> stream = list.stream();
        Integer sum = stream.map((a) -> a * a).reduce(0, (a, b) -> a + b);
        System.out.printf("sum = %d", sum);

        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.addAll(list);

        linkedList.addFirst(8);
        System.out.println("=============");
        linkedList.forEach((el) -> System.out.println(el));

        System.out.println("============== iterator for list:");
        Iterator<Integer> iterator = list.listIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("==== обход с помощью spliterator.tryAdvance");
        Stream<Integer> stream2 = list.stream();
        Spliterator<Integer> spliterator = stream2.spliterator();
        while(spliterator.tryAdvance(e -> System.out.println(e)));
        System.out.println("====== обход с помощью spliterator.forEachRemaining");
        Stream<Integer> stream3 = list.stream();
        Spliterator<Integer> spliterator3 = stream3.spliterator();
        spliterator3.forEachRemaining(e-> System.out.println(e));
    }
}
