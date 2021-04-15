/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.src.test.java.EduSys.app;

import app.src.main.java.EduSys.com.FindCourse;

/**
 *
 * @author ericknick
 */
public class Test_FindCourse {
    public static void main(String[] args){
        FindCourse find = new FindCourse();
        
        try{
            find.findCourse("0CS5121");
        }catch(Exception e){
            e.printStackTrace();
            System.exit(1);
        }
    }
}
