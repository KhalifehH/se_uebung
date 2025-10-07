import java.util.Scanner;

public class greeting {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bitte geben Sie Ihren Namen ein: ");
        String name = scanner.nextLine();

        System.out.println("Hallo: " + name + "!");

        scanner.close();
    }
}
