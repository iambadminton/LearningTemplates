package OracleTutorial.DeckOfCards.LearnCollections;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Write a program that prints its arguments in random order.
 * Do not make a copy of the argument array.
 * Demonstrate how to print out the elements using both streams and the traditional enhanced for statement.
 */
public class PrintRandomOrder {
    public static void main(String[] args) {
        List<String> list = Arrays.asList(args);
        Collections.shuffle(list);
        list.stream()
                .forEach(e -> System.out.format("%s ", e));
        /*for(String arg: args) {

        }*/
    }




}
