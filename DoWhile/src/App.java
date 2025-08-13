import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        var scanner = new Scanner(System.in);
        var name = "";
        while (true) {
            System.out.print("Enter your name (or 'exit' to quit): ");
            name = scanner.next();
            

            if (name.equalsIgnoreCase("exit")) {
                break;
            }

            System.out.println("Hello, " + name + "!");
        }
        System.out.println("Goodbye!");
        scanner.close();
    }
}
