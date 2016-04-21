package eu.corstjens.java8.features;

import org.junit.Test;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

/**
 * Created by Koen on 19/04/2016.
 */
public class ParameterNames {
    public static void exampleMethod(String[] args) throws Exception {

    }

    @Test
    public void test() throws NoSuchMethodException {
        Method method = ParameterNames.class.getMethod("exampleMethod", String[].class);
        for (final Parameter parameter : method.getParameters()) {
            System.out.println("Parameter: " + parameter.getName());
            // will print Parameter: arg0 without using -parameters argument
            // will print Parameter: args when using -parameters argument
            // see pom.xml for <compilerArgument>-parameters</compilerArgument>
        }
    }


}
