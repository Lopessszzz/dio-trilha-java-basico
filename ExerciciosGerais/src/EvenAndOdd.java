import java.util.Scanner;

public class EvenAndOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the first number:");
        int firstNumber = scanner.nextInt();
        
        System.out.println("Enter the second number:");
        int secondNumber = scanner.nextInt();

        // Identifica maior e menor
        int start = Math.max(firstNumber, secondNumber);
        int end = Math.min(firstNumber, secondNumber);

        // Loop decrescente sempre do maior para o menor
        for (int i = start; i >= end; i--) {
            if (i % 2 == 0) {
                System.out.println(i + " is even.");
            } else {
                System.out.println(i + " is odd.");
            }
        }

        scanner.close();


        /* Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a first number:");
        int firstNumber = scanner.nextInt();
        System.out.println("Enter a second number:");
        int secondNumber = scanner.nextInt();
        for (int i = firstNumber; i >= secondNumber; i--) {
            if (i % 2 == 0) {
                System.out.println(i + " is even.");
            } else {
                System.out.println(i + " is odd.");
            }
        }
        scanner.close(); */
    }
}
