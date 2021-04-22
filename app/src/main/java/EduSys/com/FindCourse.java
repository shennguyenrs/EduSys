/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package EduSys.com;

/**
 *
 * @author ericknick
 */

import EduSys.utils.GetResource;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;

public class FindCourse {

    //Add the data of user example file
    private static final String fileName = "txt/CoursesList.txt";
    private boolean check;

    public void findCourse(String compareId) throws Exception {
        GetResource reader = new GetResource();
        //Reuse the method from ShowAvailableCourses class
        ShowAvailableCourses checkAvailable = new ShowAvailableCourses();
        //Pass the file as the parameter into BufferedReader class
        BufferedReader br = reader.readResource(fileName);

        String readString;

        //Use a iterative function
        while ((readString = br.readLine()) != null) {
            //Getting the Enroll time and courseID
            String temp = readString.substring(32, 42);
            String temp2 = readString.substring(45, 55);
            String temp3 = readString.substring(0, 7);
            //Using the date format library to form a date format
            SimpleDateFormat formatter1 = new SimpleDateFormat("dd/MM/yyyy");
            Date dateCompare = formatter1.parse(temp);
            Date dateCompare2 = formatter1.parse(temp2);

            //Check the valid days through the checkAvailableCourses function
            //from the ShowAvailableCourse class
            if (
                checkAvailable.checkAvailableCourses(dateCompare, dateCompare2)
            ) {
                if (compareId.equals(temp3)) {
                    check = true;
                    break;
                } else check = false;
            }
        }

        br.close();

        //Print the course info or throw an exception
        if (check == true) {
            System.out.printf(
                "%-10s%-22s%-13s%-13s%-13s%-13s%-22s%-10s%n%n",
                "CourseID",
                "Course's Name",
                "Enroll Start",
                "Enroll End",
                "Start",
                "End",
                "Description",
                "Lecturer"
            );
            System.out.println(readString);
        } else System.out.println(
            "The course does not exist or wrong courseID!!!"
        );
    }
}
