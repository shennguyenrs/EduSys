package EduSys.com;

import EduSys.utils.GetResource;
import java.io.*;
import java.util.Scanner;

public class UserInfo {

    //Add the data of user example
    private static final String fileName = "txt/UserInfo_test.txt";
    int studentId = 0;

    public UserInfo(int studentId) {
        this.studentId = studentId;
    }

    public void printInfo() throws Exception {
        GetResource reader = new GetResource();
        BufferedReader in = reader.readResource(fileName);

        //Use Scanner class to read the file
        Scanner myReader = new Scanner(in);

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
