/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package EduSys.com;

import EduSys.utils.GetResource;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 *
 * @author ericknick
 */

public class ShowCourseInfo {

    //Add the data of user example file
    private static final String fileName = "txt/CoursesList.txt";
    private boolean check;

    public void showCourseInfo(String compareId) throws Exception {
        GetResource reader = new GetResource();
        //Reuse the method from ShowAvailableCourses class
        ShowAvailableCourses checkAvailable = new ShowAvailableCourses();
        //Pass the file as the parameter into BufferedReader class
        BufferedReader br = reader.readResource(fileName);

        String readString;

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

        //Use a iterative function
        while ((readString = br.readLine()) != null) {
            //Getting the Enroll time and CourseID
            String temp = readString.substring(32, 42);
            String temp2 = readString.substring(46, 55);
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
                //Check courseID to show
                if (compareId.equals(temp3)) {
                    System.out.println(readString);
                    check = true;
                    break;
                } else check = false;
            }
        }

        br.close();

        //Be printed as the course not found
        if (check == false) System.out.println(
            "The course does not exist or wrong courseID!!!"
        );
    }
}
