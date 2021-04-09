package src.FunctionClass;
import java.io.*;
import java.util.*;

public class Edit_UserInfo {
    private String studentName;
    private String studentID;
    private String studentBirthday;
    private String studentPassword;
    private String constantID;
    private static final String fileName = "src/FunctionClass/UserInfo_test.txt";

    //Set the student name based on the user input
    public void setStudentName(String studentName){
        this.studentName = studentName;
    } 
    //Set the student birthday based on the user input
    public void setStudentBirthday(String studentBirthday){
        if(Integer.parseInt(studentBirthday) <= 1900 || Integer.parseInt(studentBirthday) >= 2010){
            throw new IllegalArgumentException("The birthday is not suitable!");
        }
        this.studentBirthday = studentBirthday;
    } 
    //Set the studentID based on the user input
    public void setStudentID(String studentID){
        if(!studentID.equals(this.constantID)){
            throw new IllegalArgumentException("The ID can not be changed!");
        }
        this.studentID = studentID;
    }
    //Set the student password based on the user input
    public void setStudentPassword(String studentPassword){
        if(studentPassword == null){
            throw new IllegalArgumentException("The password can not be null!");
        }
        this.studentPassword = studentPassword;
    } 

    public String getStudentID() {return studentID;}
    
    public String getStudentName() {return studentName;} 

    public String getStudentBirthday() {return studentBirthday;}

    public String getStudentPassword() {return studentPassword;}

    public void scanInfo() throws Exception{
        //Pass the path of the data to read
        File fileToRead = new File(fileName);
        //Use Scanner class to read the file
        Scanner myReader = new Scanner(fileToRead);
        
        //The reader uses the delimiter as a whitespace 
        //for reading the file
        myReader.useDelimiter(" ");
        String constantID = myReader.next();
        this.constantID = constantID;
        //System.out.println("The constantID is " + this.constantID);
        myReader.close();
    }

    public void saveInfo() throws Exception{
        //Pass the path of the data to write
        FileWriter writer = new FileWriter(fileName);
        //Use BufferedWriter to write the file
        BufferedWriter bw = new BufferedWriter(writer);

        //Save the new data
        bw.write(studentID);
        bw.write(" ");
        bw.write(studentName);
        bw.write(" ");
        bw.write(studentBirthday);
        bw.write(" ");
        bw.write(studentPassword);
        System.out.println("Save information successful!");
        bw.close();
    }
}
