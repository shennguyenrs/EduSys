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
import java.util.Scanner;

public class ShowEnrolledCourses {
    //Add the data of user example file
    private static final String fileName = "src/main/resources/txt/EnrolledCoursesList.txt";
    private static final String fileName2 = "src/main/resources/txt/UserInfo_test.txt";
    
    public void ShowEnrolledCourses() throws Exception{
        //Load the file to read into the FileReader class
        FileReader fileToRead = new FileReader(fileName);
        //Pass the file as the parameter into BufferedReader class
        BufferedReader br = new BufferedReader(fileToRead);
        //Assign the line to a string
        String readString = br.readLine();
        
        System.out.printf("%-10s%n%n", "Enrolled Courses");
        //Check if the studentID matchs with the user info
        if(checkId(readString)){
            //Using loop to print each line as the enrolled courseID
            while ((readString = br.readLine()) != null){
                
                System.out.println(readString);
            
            }
            
        }else{
              throw new IllegalArgumentException("StudentID is invalid!");  
        }
        
        br.close();
    }
    
    //Function to check the ID is valid or not
    public boolean checkId(String compareId) throws Exception{
        Scanner sr = new Scanner(new File(fileName2));
      
        return compareId.equals(sr.next());
   
    }
        
}

