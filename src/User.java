import java.util.HashMap;
import java.util.Scanner;

public class User {
    //User basic infomations
    String name;
    String surname;
    int age;
    String email;

    // User address
    String street;
    int buildingNumber;
    int apartmentNumber;
    int zipCode;
    String city;

    // User account
    String login;
    String password;

    public void basicData(String name, String surname, int age, String email) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.email = email;
    }

    public void addressData(String street, int buildingNumber, int apartmentNumber, int zipCode, String city) {
        this.street = street;
        this.buildingNumber = buildingNumber;
        this.apartmentNumber = apartmentNumber;
        this.zipCode = zipCode;
        this.city = city;
    }

    public void basicDataPrint() {
        System.out.println("Name: " + name + "\tSurname: " + surname + "\tAge: " + age);
        System.out.println("E-Mail: " + email);;
    }

    public void addressDataPrint() {
        System.out.println("Address: " + street + "\t" + buildingNumber + "/" + apartmentNumber);
        System.out.println("Zip code: " + zipCode + "\t" + city);
    }

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
