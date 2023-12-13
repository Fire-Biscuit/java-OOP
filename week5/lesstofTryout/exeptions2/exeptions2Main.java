package week5.lesstofTryout.exeptions2;

public class exeptions2Main {
    public static void main(String[] args) {

        exeptions2tryouts1 object = new exeptions2tryouts1();
        object.test4();

        String message = "error";
        IncorrectHvaEmailAddressException exeption = new IncorrectHvaEmailAddressException(message);

        try {
            exeption.login("pietje@hva.nl", "geheim");
        } catch (IncorrectHvaEmailAddressException e) {
            System.out.println("Fout bij inloggen: " + e.getMessage());
        }
    }
}
