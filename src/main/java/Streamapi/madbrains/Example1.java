package Streamapi.madbrains;


import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Employee {
    private String name;
    private int salary;

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }
}

public class Example1 {
    public static void main(String[] args) {
        Integer empIds[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        List<Integer> list = Stream.of(empIds)
                .filter(e -> e > 3)
                .collect(Collectors.toList());
        list.forEach(System.out::println);

        Long count = Stream.of(empIds)
                .filter(e -> e > 3)
                .count();
        System.out.println("count = " + count);


    }
}
