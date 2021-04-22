package EduSys.app;

import EduSys.com.Login;
import EduSys.com.Welcome;

public class App {

    public static void main(String args[]) {
        Welcome welcomeScreen = new Welcome();

        try {
            welcomeScreen.welcome();

            String choose = welcomeScreen.getOption();

            switch (choose) {
                case "1":
                    Login newLogin = new Login();
                    newLogin.loginScreen();
                    break;
                case "0":
                    System.out.println("Good Bye!\n");
                    break;
                default:
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.exit(1);
        }
    }
}
