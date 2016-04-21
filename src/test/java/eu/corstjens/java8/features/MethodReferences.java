package eu.corstjens.java8.features;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

/**
 * Created by Koen on 19/04/2016.
 */
public class MethodReferences {
    @Test
    public void test() {
        final Car car = Car.create(Car::new);
        List<Car> cars = Arrays.asList(car);

        cars.forEach(Car::collide);
        cars.forEach(Car::repair);

        final Car police = Car.create(Car::new);
        cars.forEach(police::follow);

    }

    public static class Car {
        public static Car create(final Supplier<Car> supplier) {
            return supplier.get();
        }

        public static void collide(final Car car) {
            System.out.println("Collided " + car.toString());
        }

        public void follow(final Car another) {
            System.out.println("Following the " + another.toString());
        }

        public void repair() {
            System.out.println("Repaired " + this.toString());
        }


    }

}
