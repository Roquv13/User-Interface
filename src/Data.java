import java.util.Scanner;

public class Data {
    public void dataPrint() {
        Scanner scanner = new Scanner(System.in);
        User user = new User();

        System.out.println("Which data do you want to print:");
        System.out.println("1. Display basic data about user");
        System.out.println("2. Display address data about user");
        System.out.println("3. Display both data");
        System.out.println("4. Exit");
        System.out.println("Select:");
        int selection = scanner.nextInt();
        switch (selection) {
            case 1 -> user.basicDataPrint();
            case 2 -> user.addressDataPrint();
            case 3 -> {
                user.basicDataPrint();
                user.addressDataPrint();
            }
            case 4 -> System.out.println("Exit");
        }
    }
}
