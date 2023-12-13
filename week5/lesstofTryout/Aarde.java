package week5.lesstofTryout;

public class Aarde {
    private static Aarde instance;

    private Aarde() {}

    public static Aarde getInstance(){
        if(Aarde.instance==null){
            Aarde.instance=new Aarde();

        }
        return Aarde.instance;
    }


}
