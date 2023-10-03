import java.util.HashMap;
import java.util.Scanner;

public class Account {
    // User account
    String login;
    String password;
    public void registerUser() {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, String> userAccount = new HashMap<>();

        System.out.println("Set up your email as login:");
        login = scanner.nextLine();

        System.out.println("Password must be 8 characters long with one uppercase letter and one number.");
        System.out.println("Enter your password:");
        password = scanner.nextLine();

        userAccount.put(login, password);
    }
}
