package eu.corstjens.java8.features.interfaces.impl;

import eu.corstjens.java8.features.interfaces.ExampleInterface;

/**
 * Created by Koen on 19/04/2016.
 */
public class OverridableImplementationForExampleInterface implements ExampleInterface {
    public String testDefault() {
        return "Overridden implementation";
    }

}
