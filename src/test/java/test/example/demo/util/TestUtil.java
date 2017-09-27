package test.example.demo.util;

import java.io.IOException;
import java.nio.charset.Charset;

import org.springframework.http.MediaType;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * The Class TestUtil.
 */
public class TestUtil {

    /** The Constant APPLICATION_JSON_UTF8. */
    public static final MediaType APPLICATION_JSON_UTF8 = new MediaType(
            MediaType.APPLICATION_JSON.getType(),
                MediaType.APPLICATION_JSON.getSubtype(),
                Charset.forName("utf8"));

    /**
     * Convert object to json bytes.
     *
     * @param object
     *            the object
     * @return the byte[]
     * @throws IOException
     *             Signals that an I/O exception has occurred.
     */
    public static byte[] convertObjectToJsonBytes(Object object) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        mapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
        return mapper.writeValueAsBytes(object);
    }

    /**
     * Creates the string with length.
     *
     * @param length
     *            the length
     * @return the string
     */
    public static String createStringWithLength(int length) {
        StringBuilder builder = new StringBuilder();

        for (int index = 0; index < length; index++) {
            builder.append('a');
        }

        return builder.toString();
    }

}