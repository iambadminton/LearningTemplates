package optionalexperiments;

import com.google.gson.stream.JsonToken;

import java.sql.SQLOutput;
import java.util.Optional;

public class OptionalMapFlapMapExample {
    public static void main(String[] args) {
        Optional<String> nonEmptyGender = Optional.of("male");
        Optional<String> emptyGender = Optional.empty();

        System.out.println("Non-empty Optional:: " + nonEmptyGender.map(String::toUpperCase));
        System.out.println("Empty Optional:: " + emptyGender.map(String::toUpperCase));

        Optional<Optional<String>> nonEmptyOptionalGender = Optional.of(Optional.of("male"));
        System.out.println("Optional.value ::" + nonEmptyOptionalGender);
        System.out.println("Optional.map ::" + nonEmptyOptionalGender.map(gender -> gender.map(String::toUpperCase)));
        System.out.println("Optional.flapMap ::" + nonEmptyOptionalGender.flatMap(gender -> gender.map(String::toUpperCase)));

    }
}
