import java.util.HashMap;
import java.util.Scanner;

public class Account {
    // User account
    String login;
    String password;
    int uppercaseCount;
    int digitCount;
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

    public void passwordCheck(String password) {
        this.password = password;

        if (password.length() >= 8) {
            for (int i = 0; i < password.length(); i++) {
                char[] passwordChar = password.toCharArray();
                if (Character.isUpperCase(passwordChar[i])) uppercaseCount++;
                if (Character.isDigit(passwordChar[i])) digitCount++;
            }
            if (uppercaseCount >= 1 && digitCount >= 1) {
                String correctPassword = password;
                System.out.println(password);
            }
        }
        else System.out.println("Password is incorrect");
    }
}
