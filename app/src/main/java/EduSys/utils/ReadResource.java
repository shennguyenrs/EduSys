package EduSys.utils;

import java.io.*;

public class ReadResource {

  public File getFile(String filename) throws IOException {
    ClassLoader classLoader = getClass().getClassLoader();
    File file = new File(classLoader.getResource(filename).getFile());

    return file;
  }
}
