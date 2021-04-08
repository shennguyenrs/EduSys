import src.*;

public class App {
    public static void main(String args[]) {
        Welcome welcomeScreen = new Welcome();

        try {
            welcomeScreen.main();
        } catch (Exception e) {
            e.printStackTrace();
            System.exit(1);
        }
    }
}
