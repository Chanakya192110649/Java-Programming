import java.util.Scanner;

public class ValidateUserName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the user name: ");
        String username1 = scanner.nextLine();

        System.out.println("Reenter the user name: ");
        String username2 = scanner.nextLine();

        if (username1.equals(username2)) {
            System.out.println("User name is Valid");
        } else {
            System.out.println("User name is Invalid");
        }

        scanner.close();
    }
}
