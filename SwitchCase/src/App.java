import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        var scanner = new Scanner(System.in);
        System.out.println("Informe um número de 1 até 7:");
        var option = scanner.nextInt();

        switch (option) {
            /*
            case 1 -> System.out.println("domingo");
            case 2 -> System.out.println("segunda-feira");
            case 3 -> System.out.println("terça-feira");
            case 4 -> System.out.println("quarta-feira");
            case 5 -> System.out.println("quinta-feira");
            case 6 -> System.out.println("sexta-feira");
            case 7 -> System.out.println("sábado");
            default -> System.out.println("Opção inválida");
            */

            /*
            var message = switch (option) {
                case 1, 7 -> {
                    var day = option == 1 ? "domingo" : "sábado";
                    yield String.format("Hoje é %s. fim de semana, uhul!!", day);
                }
                case 1 -> "domingo";
                case 2 -> "segunda-feira";
                case 3 -> "terça-feira";
                case 4 -> "quarta-feira";
                case 5 -> "quinta-feira";
                case 6 -> "sexta-feira";
                case 7 -> "sábado";
            };
            System.out.println(message);
            default -> System.out.println("Opção inválida");
            */

            case 1:
                System.out.println("Sábado");
                break;
            case 2:
                System.out.println("Domingo");
                break;
            case 3:
                System.out.println("Segunda-feira");
                break;
            case 4:
                System.out.println("Terça-feira");
                break;
            case 5:
                System.out.println("Quarta-feira");
                break;
            case 6:
                System.out.println("Quinta-feira");
                break;
            case 7:
                System.out.println("Sexta-feira");
                break;
            default:
                System.out.println("Opção inválida");
                break;
                
        }
        scanner.close();
    }
}
