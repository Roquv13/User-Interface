import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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
        System.out.println("E-Mail: " + email);
        ;
    }

    public void addressDataPrint() {
        System.out.println("Address: " + street + "\t" + buildingNumber + "/" + apartmentNumber);
        System.out.println("Zip code: " + zipCode + "\t" + city);
    }

    public void dataPrint() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Which data do you want to print:");
        System.out.println("1. Display basic data about user");
        System.out.println("2. Display address data about user");
        System.out.println("3. Display both data");
        System.out.println("4. Exit");
        System.out.println("Select:");
        int selection = scanner.nextInt();
        switch (selection) {
            case 1 -> basicDataPrint();
            case 2 -> addressDataPrint();
            case 3 -> {
                basicDataPrint();
                addressDataPrint();
            }
            case 4 -> System.out.println("Exit");
        }
    }
}
