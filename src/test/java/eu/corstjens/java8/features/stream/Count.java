package eu.corstjens.java8.features.stream;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

/**
 * Created by koencorstjens on 24/04/16.
 */
public class Count {

    @Test
    public void count() {
        String[] words = {"test", "qaz", "test", "bla", "test", "bla"};
        List<String> wordsList = Arrays.asList(words);
        Map<String, Long> collect =
                wordsList.stream().collect(groupingBy(Function.identity(), counting()));
        System.out.println(collect);
    }

    @Test
    public void sum() {
        String[] words = {"test", "qaz", "test", "bla", "test", "bla"};
        List<String> wordsList = Arrays.asList(words);
        long result = wordsList.stream().mapToLong(e -> 1L).sum();
        Assert.assertEquals(6l, result);
        System.out.println(result);
    }
}
