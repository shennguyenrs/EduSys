package EduSys.com;

import EduSys.utils.*;
import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Welcome {

    private static final String filename = "txt/banner.txt";
    private String option;
    private String[] optionArr = { "1", "2", "3", "0" };
    public static Scanner input = new Scanner(System.in);

    public void welcome() throws Exception {
        GetResource reader = new GetResource();
        BufferedReader in = reader.readResource(filename);

        String line;

        System.out.println(
            "========================================================"
        );
        System.out.println();

        // Display banner
        while ((line = in.readLine()) != null) {
            System.out.println(line);
        }

        in.close();

        System.out.println(
            "               Welcome to Education System              "
        );
        System.out.println(
            "========================================================"
        );
        System.out.println();

        System.out.println("1 - Login");
        System.out.println("2 - Search course information");
        System.out.println("3 - View opening courses");
        System.out.println("0 - Exit");
        System.out.println("-----------------------------");

        System.out.println("Enter your choose:");

        while ((option = input.nextLine()) != null) {
            // Input Option validation
            Boolean check = Arrays.asList(optionArr).contains(option);

            // Give message on invalid input
            // or break the loop on correct input
            if (!check) {
                System.out.println(
                    "Your choose is invalid! Please choose again!"
                );
            } else {
                break;
            }
        }
    }

    public String getOption() {
        return option;
    }
}
