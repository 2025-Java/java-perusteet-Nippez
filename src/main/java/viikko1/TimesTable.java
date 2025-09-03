package viikko1;

public class TimesTable {
    public static String table(int n) {
        String[] lines = new String[10];

        for (int i = 1; i <= 10; i++) {
            lines[i - 1] = n + " x " + i + " = " + (n * i);
        }

        return String.join("\n", lines) + "\n";
    }


    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Anna numero 1-10:");
            return;
        }

        int number = Integer.parseInt(args[0]);
        System.out.println(table(number));
    }
}
