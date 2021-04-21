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

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;

public class CancelCourse {

  //Add the data of user example file
  private static final String fileName = "txt/EnrolledCoursesList.txt";
  private static final String fileName2 = "txt/CoursesList.txt";
  private boolean check;

  public void checkEnrolledCourses(String compareId) throws Exception {
    //Reuse the method from ShowEnrolledCourses class
    ShowEnrolledCourses checkEnrolled = new ShowEnrolledCourses();
    //Pass the file as the parameter into BufferedReader class
    BufferedReader br = new BufferedReader(new FileReader(fileName));

    String readString = br.readLine();
    //Check courseID in the enrolled course list
    if (checkEnrolled.checkId(readString)) {
      while ((readString = br.readLine()) != null) {
        //Check courseID
        if (compareId.equals(readString)) {
          //Move to the deleteEnrollCourse function
          deleteEnrolledCourse(compareId);
          check = true;
          break;
        } else check = false;
      }
    } else {
      throw new IllegalArgumentException("StudentID is invalid!");
    }

    br.close();
    //Be printed as the course not found in the enrolled course list
    if (check == false) {
      System.out.println("The course has not enrolled yet!!!");
    }
  }

  public void deleteEnrolledCourse(String oldCourseId) throws Exception {
    //Use a temporary file to copy the data excluding the course cancelled
    File inputFile = new File(fileName);
    File tempFile = new File("myTempFile.txt");
    //Pass the file as the parameter into BufferedReader class
    //Pass the file as the parameter into BufferedWriter class
    BufferedReader br = new BufferedReader(new FileReader(inputFile));
    BufferedWriter bw = new BufferedWriter(new FileWriter(tempFile));

    String currentLine;
    //Use a iterative function
    while ((currentLine = br.readLine()) != null) {
      //Use trim newline when comparing with oldCourseId
      String trimmedLine = currentLine.trim();
      if (trimmedLine.equals(oldCourseId)) continue;
      //Use System.getProperty to return a specified key
      //passed as its argument
      bw.write(currentLine + System.getProperty("line.separator"));
    }
    bw.close();
    br.close();
    //Synch the name to remove the temp file and update the root file
    boolean successful = tempFile.renameTo(inputFile);

    if (successful) System.out.println(
      "Cancel the course " + oldCourseId + " completed!!!"
    );
  }

  public void cancelCourse(String compareId) throws Exception {
    //Reuse the method from ShowAvailableCourses class
    ShowAvailableCourses showAvailable = new ShowAvailableCourses();
    //Pass the file as the parameter into BufferedReader class
    BufferedReader br = new BufferedReader(new FileReader(fileName2));

    String readString;
    //Use a iterative function
    while ((readString = br.readLine()) != null) {
      //Here, we check the enroll time and whether the course started?
      String temp = readString.substring(32, 42);
      //Retrieve the start day instead of the Enrollend day
      String temp2 = readString.substring(58, 68);
      String temp3 = readString.substring(0, 7);
      //Using the date format library to form a date format
      SimpleDateFormat formatter1 = new SimpleDateFormat("dd/MM/yyyy");
      Date dateCompare = formatter1.parse(temp);
      Date dateCompare2 = formatter1.parse(temp2);
      //Date dateCompare = new SimpleDateFormat("dd/MM/yyyy").parse(temp);

      if (showAvailable.checkAvailableCourses(dateCompare, dateCompare2)) {
        if (compareId.equals(temp3)) {
          //Check in the enrolled course list
          checkEnrolledCourses(compareId);
          check = true;
          break;
        }
      } else check = false;
    }

    br.close();
    //Be printed as the course not found or it was started
    if (check == false) {
      System.out.println("The CourseID is not existed or it was started!");
    }
  }
}
