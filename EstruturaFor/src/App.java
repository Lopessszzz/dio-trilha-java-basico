import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        for (var arg : args) {
            System.out.println(arg);
        }

        var scanner = new Scanner(System.in);
        for (var i = 1; i < 100; i++) {
            if (i == 101) break;
            System.out.println(i);
        }
        scanner.close();
    }
}
