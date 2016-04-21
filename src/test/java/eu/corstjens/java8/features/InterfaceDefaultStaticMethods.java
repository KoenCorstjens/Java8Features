package eu.corstjens.java8.features;

import eu.corstjens.java8.features.interfaces.ExampleInterface;
import eu.corstjens.java8.features.interfaces.impl.DefaultImplementationForExampleInterface;
import eu.corstjens.java8.features.interfaces.impl.OverridableImplementationForExampleInterface;
import org.junit.Test;

/**
 * Created by Koen on 19/04/2016.
 */
public class InterfaceDefaultStaticMethods {
    @Test
    public void testDefaultMethods() {
        ExampleInterface exampleInterface1 = new OverridableImplementationForExampleInterface();
        System.out.println("exampleInterface1.testDefault: " + exampleInterface1.testDefault());

        ExampleInterface exampleInterface2 = new DefaultImplementationForExampleInterface();
        System.out.println("exampleInterface2.testDefault: " + exampleInterface2.testDefault());
    }
}
