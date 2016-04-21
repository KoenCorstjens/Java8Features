package eu.corstjens.java8.features.base64;

import org.junit.Assert;
import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.util.Base64;
import java.util.UUID;

/**
 * Created by koencorstjens on 21/04/16.
 */
public class Base64Test {

    @Test
    public void testEncodeDecodeToString() throws UnsupportedEncodingException {
        String input = "JAVA 8 result";
        System.out.println(input);

        String base64encodedString = Base64.getEncoder().encodeToString(input.getBytes("utf-8"));
        System.out.println("base64encodedString: " + base64encodedString);

        byte[] base64decodedBytes = Base64.getDecoder().decode(base64encodedString);
        String result = new String(base64decodedBytes, "utf-8");
        System.out.println("Original String: " + result);

        Assert.assertEquals(input, result);

    }

    @Test
    public void testMimeEncoder() throws UnsupportedEncodingException {
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < 10; ++i) {
            stringBuilder.append(UUID.randomUUID().toString());
        }

        System.out.println("Input string: " + stringBuilder.toString());

        byte[] mimeBytes = stringBuilder.toString().getBytes("utf-8");
        String mimeEncodedString = Base64.getMimeEncoder().encodeToString(mimeBytes);
        System.out.println("Base64 Encoded String (MIME) :" + mimeEncodedString);
    }
}
