import java.util.Scanner;

public class DifferentFrom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number:");
        var firstNumber = scanner.nextInt();
        var keepVerifying = true;

        while (keepVerifying) {
            System.out.println("Enter the next number:");
            var secondNumber = scanner.nextInt();

            // Ignorar se for menor que o número inicial
            if (secondNumber < firstNumber) {
                System.out.printf("Number ignored (less than %d)%n", firstNumber);
                continue; // volta para pedir outro número
            }

            // Calcula o resto
            var result = secondNumber % firstNumber;
            keepVerifying = result == 0; // continua apenas se for divisível

            System.out.printf("%d %% %d = %d%n", secondNumber, firstNumber, result);
        }

        System.out.println("Number is not divisible by the first. Exiting...");
        scanner.close();
    }
}
