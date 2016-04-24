package eu.corstjens.java8.features.stream;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

/**
 * Created by koencorstjens on 21/04/16.
 */
public class StreamExample {

    private ExecutorService executorService = Executors.newFixedThreadPool(10);

    public static boolean isPrime(int number) {
        return number > 1 && IntStream.range(2, number).noneMatch(i -> (number % i == 0));
    }

    @Test
    public void exampleRunTasks() {

        IntStream.range(0, 10).forEach(i -> executorService.submit(() -> System.out.println("Running task " + i)));
        System.out.println("Tasks Started ");
        executorService.shutdown();

    }

    @Test
    public void isPrime() {
        int number = 5;
        boolean result = isPrime(number);
        Assert.assertEquals(true, result);
    }

    @Test
    public void First100Primes() {
        //Good code is like a story not like a puzzle
        List<Integer> sqrtOfFirst100Primes = Stream.iterate(1, e -> e + 1).filter(StreamExample::isPrime).limit(100).collect(toList());
        sqrtOfFirst100Primes.forEach(System.out::println);
        Assert.assertEquals(100, sqrtOfFirst100Primes.size());

    }

}
