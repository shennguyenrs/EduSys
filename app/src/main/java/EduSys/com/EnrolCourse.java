/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.src.main.java.EduSys.com;

/**
 *
 * @author ericknick
 */
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;

public class EnrolCourse {
    //Add the data of user example file
    private static final String fileName = "src/main/resources/txt/EnrolledCoursesList.txt";
    private static final String fileName2 = "src/main/resources/txt/CoursesList.txt";
    private boolean check;
    
    public void checkEnrolledCourses(String compareId) throws Exception{
        //Reuse the method from ShowEnrolledCourses class
        ShowEnrolledCourses checkEnrolled = new ShowEnrolledCourses();
        //Pass the file as the parameter into BufferedReader class
        BufferedReader br = new BufferedReader(new FileReader(fileName));
        
        String readString = br.readLine();
        //Check courseID in the enrolled course list
        if(checkEnrolled.checkId(readString)){
            while ((readString = br.readLine()) != null){
                //Check courseID
                if(compareId.equals(readString)){
                    System.out.println("The course has already enrolled!!!");
                    check = true;
                    break;
                } else check = false;
       
            }
            
        }else {
              throw new IllegalArgumentException("StudentID is invalid!");  
        }

        br.close();
        //The courseID is not contained in the enrolled course file
        if(check == false){
            writeEnrolledCourse(compareId);
        }
    }
    
    public void writeEnrolledCourse(String newCourseId) throws Exception{
        //Pass the file as the parameter into BufferedWriter class
        BufferedWriter bw = new BufferedWriter(new FileWriter(fileName, true));
        //bw.newLine();
        //Write the new courseID into the file
        bw.write(newCourseId);
        bw.close();
        System.out.println("You registered into a new course " + newCourseId);
    }
    
    public void enrolCourse(String compareId) throws Exception{
        //Reuse the method from ShowAvailableCourses class
        ShowAvailableCourses showAvailable = new ShowAvailableCourses();
        //Pass the file as the parameter into BufferedReader class
        BufferedReader br = new BufferedReader(new FileReader(fileName2));
        
        String readString;
        //Use a iterative function
        while((readString = br.readLine()) != null){
            String temp = readString.substring(32,42);
            //System.out.println(temp);
            String temp2 = readString.substring(45,55);
            String temp3 = readString.substring(0,7);
            //Using the date format library to form a date format
            SimpleDateFormat formatter1 = new SimpleDateFormat("dd/MM/yyyy");
            Date dateCompare = formatter1.parse(temp);
            Date dateCompare2 = formatter1.parse(temp2);
            //Date dateCompare = new SimpleDateFormat("dd/MM/yyyy").parse(temp);
            
            //Check the valid days through the checkAvailableCourses function 
            //from the ShowAvailableCourse class
            if(showAvailable.checkAvailableCourses(dateCompare, dateCompare2)){
                if(compareId.equals(temp3)){
                    checkEnrolledCourses(compareId);
                    check = true;
                    break;
                }
            } else check = false;
        }
        
        br.close();
        //Be printed as the course not found
        if(check == false){
            System.out.println("The CourseID is not existed or available!");
        }
    }
}
