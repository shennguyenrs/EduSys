/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.src.test.java.EduSys.app;

import app.src.main.java.EduSys.com.ShowAvailableCourses;

/**
 *
 * @author ericknick
 */
public class Test_ShowAvailableCourses {
    public static void main(String[] args){
        ShowAvailableCourses show = new ShowAvailableCourses();
        
        //System.out.printf("%-10s%-15s%n", "CourseID", "Course's Name");
        
        try{
            show.ShowAvailableCourses();
        }catch(Exception e){
            e.printStackTrace();
            System.exit(1);
        }
    }
}
