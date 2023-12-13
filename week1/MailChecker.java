package week1;

public class MailChecker {
    public static void main(String[] args) {
        // Opgave 2 van week 1: Regex voor controle HvA email adres

        System.out.println(isGeldigeHvaEmailAdres("naam@gmail.com"));

        System.out.println(isGeldigeHvaEmailAdres("naam.achternaam@hva.nl"));

        System.out.println(isGeldigeHvaEmailAdres("hvaid@ad.hva.nl"));

        System.out.println(isGeldigeHvaEmailAdres("schardm@ad.hva.nl"));

        System.out.println(isGeldigeHvaEmailAdres("naam.achternaam@outlook.nl"));

    }

    static boolean isGeldigeHvaEmailAdres(String input){

        boolean result = false;
        String expressie = "(([a-zA-Z.]+\\@)|([a-zA-Z]+\\.[a-zA-Z]+\\@))+((ad\\.hva\\.nl)|(hva\\.nl))";
        if (input.matches(expressie)){
            result = true;
        }

        return result;
    }
}
