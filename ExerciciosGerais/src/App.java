import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number:");
        var number = scanner.nextInt();

        if (number < 0) {
            System.out.println("Negative number entered. Exiting...");
        } else if (number == 0) {
            System.out.println("Zero entered. A number multiplied by zero is zero. Exiting...");
        } else {
            for (var multiplier = 1; multiplier <= 10; multiplier++) {
                var result = number * multiplier;
                System.out.println(number + " x " + multiplier + " = " + result);                    
            }
        }
        
        
        /*  Scanner scanner = new Scanner(System.in);
            System.out.println("Enter a number:");
            var number = scanner.nextInt();
        
            while (true) {
            if (number < 0) {
                System.out.println("Negative number entered. Exiting...");
                break;
            } else if (number == 0) {
                System.out.println("Zero entered. A number multiplied by zero is zero. Exiting...");
                break;
            } else {
                for (var multiplier = 1; multiplier <= 10; multiplier++) {
                    var result = number * multiplier;
                    System.out.println(number + " x " + multiplier + " = " + result);                    
                }
                break;
            }
        } */
        scanner.close();
    }
}
