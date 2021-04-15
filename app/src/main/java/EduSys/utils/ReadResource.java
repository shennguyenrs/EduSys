package EduSys.utils;

import java.io.*;
import java.net.URI;
import java.net.URL;
import java.net.URISyntaxException;

public class ReadResource {

    private InputStream getFileAsStream(String filename) {
        ClassLoader classLoader = getClass().getClassLoader();
        InputStream inputStream = classLoader.getSystemResourceAsStream(filename);

        if (inputStream == null)
        {
            throw new IllegalArgumentException("File is not found! "+filename);
        } else {
            return inputStream;
        }
    }
}
