/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.src.test.java.EduSys.app;

import app.src.main.java.EduSys.com.ShowCourseInfo;

/**
 *
 * @author ericknick
 */
public class Test_ShowCourseInfo {
    public static void main(String[] args){
        ShowCourseInfo info = new ShowCourseInfo();
        
        try{
            info.ShowCourseInfo("0CS5121");
        }catch(Exception e){
            e.printStackTrace();
            System.exit(1);
        }
        
    }
}
