import src.FlowClass.*;
import src.DataClass.*;
import src.DatabaseInteractionClass.*;
import src.FunctionClass.*;

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
