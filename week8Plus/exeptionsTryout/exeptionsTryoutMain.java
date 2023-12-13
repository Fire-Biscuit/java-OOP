package week8Plus.exeptionsTryout;

public class exeptionsTryoutMain {
    public static void main(String[] args) {
        System.out.println(login("naam@gmail.com"));
        System.out.println(login("voornaam@hva.nl"));
    }

    public static String login (String input){
        String returner = "NULL";
        try {
            if(hieroLogin(input)){
                returner = "Succesvol ingelogd";
            }
            //bij de methode meegegeven dus je MOET er wat mee
        } catch (IncorrectHvaEmailAddressExceptions e) {
            returner = "Fout bij inloggen: " + e.getMessage();
        }
        return returner;
    }

    //bij de methode meegegeven dus je MOET er wat mee
    public static boolean hieroLogin(String email) throws IncorrectHvaEmailAddressExceptions {
        if (!email.contains("@hva.nl")) {
            throw new IncorrectHvaEmailAddressExceptions("Dit is geen HvA emailadres.");
        }
        return true;
    }
}