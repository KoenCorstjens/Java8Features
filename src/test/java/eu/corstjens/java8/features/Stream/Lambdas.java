package eu.corstjens.java8.features.stream;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Koen on 19/04/2016.
 */
public class Lambdas {

    @Test
    public void lambdas() {
        System.out.println("Example lambdas");
        Arrays.asList("Test a", "Test b", "Test c").forEach(e -> System.out.println(e));
        //or
        Arrays.asList("Test a", "Test b", "Test c").forEach(System.out::println);
        System.out.println();
    }

    @Test
    public void lambdasBlockFunction() {
        System.out.println("Example lambdas block function");
        Arrays.asList("Test a", "Test b", "Test C").forEach(e -> {
            System.out.print(e);
            System.out.print(" ");
            System.out.print(e);
            System.out.println();
        });
        System.out.println();
    }

    @Test
    public void lambdasClassMembers() {
        System.out.println("Example lambdas class members");
        final String separator = ",";
        Arrays.asList("Test a", "Test b", "Test C").forEach(
                (String e) -> System.out.print(e + separator));
        System.out.println();
    }

    @Test
    public void lambdasReturnResult() {
        System.out.println("example how to sort a list by using lambdas");
        List<String> strings = Arrays.asList("c", "a", "b", "z", "1", "p");
        System.out.println("input: ");
        strings.forEach(System.out::print);
        System.out.println();

        //sort list
        strings.sort((e1, e2) -> {
            int result = e1.compareTo(e2);
            return result;
        });

        System.out.println("sorted: ");
        strings.forEach(System.out::print);
        System.out.println();
    }
}
