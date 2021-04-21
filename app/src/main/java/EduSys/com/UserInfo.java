package EduSys.com;

import EduSys.utils.ReadResource;
import java.io.*;
import java.util.Scanner;

public class UserInfo {

    //Add the data of user example
    private static final String fileName = "txt/UserInfo_test.txt";

    public void PrintUserInfo() throws Exception {
        ReadResource readResource = new ReadResource();
        File fileToRead = readResource.getFile(fileName);

        //Use Scanner class to read the file
        Scanner myReader = new Scanner(fileToRead);

        //The reader uses the delimiter as a whitespace
        //for reading the file
        myReader.useDelimiter(" ");

        System.out.printf("%-15s%-15s\n", "UserID:", myReader.next());
        System.out.printf("%-15s%-15s\n", "User name:", myReader.next());
        System.out.printf("%-15s%-15s\n", "User birthday:", myReader.next());
        System.out.printf("%-15s%-15s\n", "User password:", myReader.next());

        myReader.close();
    }
}
