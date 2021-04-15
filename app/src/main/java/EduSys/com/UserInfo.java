package app.src.main.java.EduSys.com;

import java.io.*;
import java.util.Scanner;

public class UserInfo
{
    //Add the data of user example
    private static final String fileName = "src/main/resources/txt/UserInfo_test.txt";

    public static void PrintUserInfo() throws Exception{
            //Pass the path of the data to read
            File fileToRead = new File(fileName);
            //Use Scanner class to read the file
            Scanner myReader = new Scanner(fileToRead);
            
            //The reader uses the delimiter as a whitespace 
            //for reading the file
            myReader.useDelimiter(" ");

            //Print the userID
            System.out.printf("%-15s%-15s\n", "UserID:", myReader.next());
            //Print the user name
            System.out.printf("%-15s%-15s\n", "User name:", myReader.next());
            //Print the user birthday (year)
            System.out.printf("%-15s%-15s\n", "User birthday:", myReader.next());
            //Print the user password
            System.out.printf("%-15s%-15s\n", "User password:", myReader.next());
            
            myReader.close();
    }
}
