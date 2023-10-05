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

        // do nothing
        scanner.nextLine();

        System.out.println("Give your email address:");
        String email = scanner.nextLine();

        // Add data to basicData

        user.basicData(name, surname, age, email);



        System.out.println("Enter your address.");
        System.out.println("Street:");
        String street = scanner.nextLine();

        System.out.println("Building number:");
        int buildingNumber = scanner.nextInt();

        System.out.println("Apartment number:");
        int apartmentNumber = scanner.nextInt();

        System.out.println("Zip code:");
        int zipCode = scanner.nextInt();

        // do nothing
        scanner.nextLine();

        System.out.println("City:");
        String city = scanner.nextLine();

        // Add data to addressData
        user.addressData(street, buildingNumber, apartmentNumber, zipCode, city);

        // Setting up password
        Account account = new Account();
        System.out.println("Set up your password:");
        String password = scanner.nextLine();
        account.passwordCheck(password);
    }
}