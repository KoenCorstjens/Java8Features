package eu.corstjens.java8.features.stream;

import org.junit.Test;

import java.io.File;
import java.util.stream.Stream;

import static java.util.stream.Collectors.joining;

/**
 * Created by koencorstjens on 21/04/16.
 */
public class FileExamle {


    @Test
    public void printFolderStructure() {
        File dir = new File(".");
        //print file' in folder comma separated
        String result = Stream.of(dir.listFiles()).map(File::getName).map(String::toUpperCase).collect(joining(","));
        System.out.println(result);
    }


}
