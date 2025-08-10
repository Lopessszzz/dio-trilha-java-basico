import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        System.out.println("Por favor, digite o número da agência:");
        Scanner scanner = new Scanner(System.in);
        int numeroAgencia = scanner.nextInt();
        System.out.println("Por favor, digite o número da conta:");
        int numeroConta = scanner.nextInt();
        System.out.println("Por favor, digite o seu nome:");
        String nomeCliente = scanner.next();
        System.out.println("Por favor, digite o saldo inicial:");
        double saldoInicial = scanner.nextDouble();
        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %d, conta %d e seu saldo %.2f já está disponível para saque%n", nomeCliente, numeroAgencia, numeroConta, saldoInicial);

        scanner.close();
    }
}
