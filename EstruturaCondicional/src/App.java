import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        var scanner = new Scanner(System.in);
        System.out.println("Informe seu nome:");
        var name = scanner.nextLine();
        System.out.println("Informe sua idade:");
        var age = scanner.nextInt();
        System.out.println("Você é emancipado? (s/n)");
        var isEmancipated = scanner.next().equalsIgnoreCase("s");

        var canDrive = age >= 18 || (age >= 16 && isEmancipated);
        var message = canDrive ? 
            name + ", você pode dirigir \n" :
            name + ", você não pode dirigir \n";

        System.out.println(message);
        System.out.println("Obrigado por usar nosso sistema!");

        scanner.close();
    }
}
