public class exs2 {

    public static void main(String[] args) {
        var i = 0;
        while (args.length > i) {
            System.out.println(args[i]);
            i++;
        }
    

        i = 0;

        System.out.println("-----");

        if (args.length > 0) {
            do {
                System.out.println(args[i]);
                i++;
            } while (args.length > i);
        } else {
            System.out.println("No arguments provided.");
        }

        do {
            System.out.println(args[i]);
            i++;
        } while (args.length > i);

    }
}
