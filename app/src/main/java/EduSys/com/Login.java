package EduSys.com;

import java.util.Scanner;

public class Login {
    private String username = new String();
    private String password = new String();
    public static Scanner input = new Scanner(System.in);

    public void loginScreen() throws Exception {
        String newUser = new String();
        String newPass = new String();

        System.out.println("- Login -");
        
        System.out.println("Username:");
        newUser = input.nextLine();
        System.out.println("Password:");
        newPass = input.nextLine();

        // Set username and password
        setUsername(newUser);
        setPassword(newPass);

        input.close();
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
    
    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
