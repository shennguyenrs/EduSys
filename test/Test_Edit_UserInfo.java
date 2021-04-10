package test;

import src.FunctionClass.*;

public class Test_Edit_UserInfo {
    public static void main(String[] args){
        //Create a new Edit_UserInfo object
        Edit_UserInfo edit = new Edit_UserInfo();
        
        //Scan the old info of user
        try{
            edit.scanInfo();
        }catch (Exception e){
            e.printStackTrace();
            System.exit(1);
        }

        //User set and get new information
        edit.setStudentID("002");
        //String ID = edit.getStudentID();
        edit.setStudentName("Alex-Ander");
        //String name = edit.getStudentName();
        edit.setStudentBirthday("2000");
        //String birthday = edit.getStudentBirthday();
        edit.setStudentPassword("12345678");
        //String password = edit.getStudentPassword();
        
        //Test to show new info
        /*
        System.out.println("The new studentID is " + ID);
        System.out.println("The new student name is " + name);
        System.out.println("The new student birthday is " + birthday);
        System.out.println("The new student password is " + password);
        */

        //Save the new data
        try{
            edit.saveInfo();
        }catch (Exception e){
            e.printStackTrace();
            System.exit(1);
        }
    }
}
