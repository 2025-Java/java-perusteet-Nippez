package viikko1;

public class PasswordAttempts {
    public static String login(String[] tries) {
        String password = "java123";

        for (int i = 0; i < tries.length && i < 3; i++){
            if (tries[i].equals(password)){

                return "Tervetuloa!";
            }

        }
        return "Liian monta virheellistä yritystä.";
    }
}
