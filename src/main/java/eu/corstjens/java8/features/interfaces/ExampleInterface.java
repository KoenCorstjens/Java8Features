package eu.corstjens.java8.features.interfaces;

/**
 * Created by Koen on 19/04/2016.
 */
public interface ExampleInterface {
    default String testDefault() {
        return "Default implementation";
    }
}
