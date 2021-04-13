package EduSys.app;

import EduSys.com.Welcome;
import EduSys.com.Login;

public class App {
    public static void main(String args[]) {
        Welcome welcomeScreen = new Welcome();

        try {
            welcomeScreen.welcome();
            String choose = welcomeScreen.getOption();

            //if(choose.equals("1")) {
                //Login newLogin = new Login();
                //newLogin.loginScreen();
            //}

            if(choose.equals("0")) {
                System.out.println("Good Bye");
                System.exit(0);
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.exit(1);
        }
    }
}
