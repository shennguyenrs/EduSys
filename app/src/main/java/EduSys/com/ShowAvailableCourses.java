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
import java.util.*;
import java.text.SimpleDateFormat;

public class ShowAvailableCourses {
    //Add the data of user example file
    private static final String fileName = "src/main/resources/txt/CoursesList.txt";
    
    public void ShowAvailableCourses() throws Exception{
        
        FileReader fileToRead = new FileReader(fileName);
        //Pass the file as the parameter into BufferedReader class
        BufferedReader br = new BufferedReader(fileToRead);
        
        String readString;
        
        System.out.printf("%-10s%-15s%n%n", "CourseID", "Course's Name");
        //Use a iterative function
        while((readString = br.readLine()) != null){
            //Getting the Enroll time and basic course info
            String temp = readString.substring(32,42);
            String temp2 = readString.substring(46,55);
            String temp3 = readString.substring(0,29);
            //Using the date format library to form a date format
            SimpleDateFormat formatter1 = new SimpleDateFormat("dd/MM/yyyy");
            Date dateCompare = formatter1.parse(temp);
            Date dateCompare2 = formatter1.parse(temp2);
            //Check the valid days through the checkAvailableCourses function
            if(checkAvailableCourses(dateCompare, dateCompare2)){
                System.out.println(temp3);
            }
        }
        br.close(); 
            
    }
    //Function to check the valid date
    public boolean checkAvailableCourses(Date dateCompare, Date dateCompare2){
            Date dateCurrent = new Date();
            
            return (dateCurrent.compareTo(dateCompare) >= 0 && dateCurrent.compareTo(dateCompare2) <= 0);
    }
  
}
