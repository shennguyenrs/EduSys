import src.FunctionClass.*;

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