import java.util.Scanner;

public class IMC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your height in meters:");
        double height = scanner.nextDouble();
        System.out.println("Enter your weight in kg:");
        double weight = scanner.nextDouble();        
        double imc = weight / (height * height);
        System.out.println("Your IMC is: " + imc);

        if (imc < 18.5) {
            System.out.println("Underweight.");
        } else if (imc >= 18.6 && imc <= 24.9) {
            System.out.println("Ideal weight");
        } else if (imc >= 25.0 && imc <= 29.9) {
            System.out.println("Slightly overweight");
        } else if (imc >= 30.0 && imc <= 34.9) {
            System.out.println("Grade I obesity");
        } else if (imc >= 35.0 && imc <= 39.9) {
            System.out.println("Grade II obesity (Severe obesity)");
        } else {
            System.out.println("Grade III obesity (Morbid obesity)");
        }
        scanner.close();
    }
}
