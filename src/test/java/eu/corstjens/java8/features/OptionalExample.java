package eu.corstjens.java8.features;

import org.junit.Test;

import java.util.Optional;

/**
 * Created by Koen on 19/04/2016.
 */
public class OptionalExample {

    @Test
    public void nullabel() {
        printName(null);
    }

    @Test
    public void notnull() {
        printName("Koen");
    }

    private void printName(String name) {
        Optional<String> firstName = Optional.ofNullable(name);
        System.out.println("Name is set? " + firstName.isPresent());
        System.out.println("Name: " + firstName.orElseGet(() -> "[none]"));
        System.out.println(firstName.map(s -> "Hey " + s + "!").orElse("Hey Stranger!"));
        System.out.println();
    }
}
