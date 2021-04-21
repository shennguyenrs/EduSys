/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.src.test.java.EduSys.app;

import app.src.main.java.EduSys.com.*;
/**
 *
 * @author ericknick
 */
public class Test_User_Info {
    public static void main (String[] args){
        try{
            UserInfo.PrintUserInfo();
        }catch (Exception e){
            e.printStackTrace();
            System.exit(1);
        }
    }
}
