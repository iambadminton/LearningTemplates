package Streamapi.vertexacadenmycom;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Human {
    private final String name;
    private final List<String> pets;

    public Human(String name, List<String> pets) {
        this.name = name;
        this.pets = pets;
    }

    public static void main(String[] args) {
        List<Human> list = Arrays.asList(
                new Human("Alex", Arrays.asList("Lucy", "Buddy")),
                new Human("John", Arrays.asList("Frankie", "Rosie")),
                new Human("Marta", Arrays.asList("Simba", "Tilly"))
        );

        List<String> petNames = list.stream()
                .map(human -> human.pets)
                .flatMap(pets -> pets.stream())
                .collect(Collectors.toList());
        petNames.stream().forEach(System.out::println);
    }
}
