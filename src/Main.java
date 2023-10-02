import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        User user = new User();
        Scanner scanner = new Scanner(System.in);

        System.out.println("What's your name?");
        String name = scanner.nextLine();

        System.out.println("What's your surname?");
        String surname = scanner.nextLine();

        System.out.println("How old are you?");
        int age = scanner.nextInt();

        System.out.println("Give your email address:");
        String email = scanner.nextLine();

        user.basicInfo(name, surname, age, email);
    }
}