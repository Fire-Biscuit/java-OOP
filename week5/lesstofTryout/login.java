package week5.lesstofTryout;

public class login{
    
    public boolean loginWithName(String username) throws extraTestExeption{
        if(!username.contains("@") || !username.contains(".")){
            throw new extraTestExeption("foute login");
        }
        return true;
    }
}
