package eu.corstjens.java8.features.stream;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.joining;

/**
 * Created by koencorstjens on 24/04/16.
 */
public class Count {
    String[] words = {"test", "qaz", "test", "bla", "test", "bla"};
    List<String> wordsList = Arrays.asList(words);

    @Test
    public void count() {
        Map<String, Long> collect =
                wordsList.stream().collect(groupingBy(Function.identity(), counting()));
        System.out.println(collect);
    }

    @Test
    public void sum() {
        long result = wordsList.stream().mapToLong(e -> 1L).sum();
        Assert.assertEquals(6l, result);
        System.out.println(result);
    }

    @Test
    public void join() {
        String result = wordsList.stream().collect(joining(" , "));
        System.out.println(result);
    }
}
