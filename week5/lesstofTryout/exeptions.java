package week5.lesstofTryout;

public class exeptions {

    public static void main(String[] args) {
        try {
            String[] maanden = new String[]{"januari", "februari", "maart", "april", "mei", "juni",
                    "juli", "augustus", "september", "oktober", "november", "december"};
            System.out.println(maanden[0]);
            System.out.println(maanden[5]);
            System.out.println(maanden[15]);
        }catch (Exception e){
            System.out.println("c   array out of bounds");
        }finally{
            System.out.println("fase 1");
        }

        try{
            System.out.println(12/0);
        }catch(Exception e){
            System.out.println("c   12/0 kan niet");
        }finally{
            System.out.println("fase 2");
        }

        try {
            String naam = null;
            System.out.println("null kan niet: " + naam.length());
        }catch(Exception e){
            System.out.println("c    null kan niet");
        }finally {
            System.out.println("fase 3");
        }
    }
}
