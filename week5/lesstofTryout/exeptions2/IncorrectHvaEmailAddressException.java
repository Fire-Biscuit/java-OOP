package week5.lesstofTryout.exeptions2;

public class IncorrectHvaEmailAddressException extends Exception{
    public IncorrectHvaEmailAddressException(String message) {
        super(message);
    }

    public boolean login(String email, String password) throws IncorrectHvaEmailAddressException {
        if(!email.contains("@hva.nl")) {
            throw new IncorrectHvaEmailAddressException("Dit is geen HvA emailadres.");
        }
        return true;
    }
}
