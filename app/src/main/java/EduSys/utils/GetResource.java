package EduSys.utils;

import java.io.*;

public class GetResource {

    public ClassLoader classLoader = getClass().getClassLoader();

    public BufferedReader readResource(String filename) throws IOException {
        InputStream inputStream = classLoader.getResourceAsStream(filename);
        BufferedReader reader = new BufferedReader(
            new InputStreamReader(inputStream)
        );

        return reader;
    }
}
