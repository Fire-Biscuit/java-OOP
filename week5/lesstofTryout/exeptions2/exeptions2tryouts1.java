package week5.lesstofTryout.exeptions2;

public class exeptions2tryouts1 {
    public void  test1(){

        String[] maanden = new String[] { "januari", "februari", "maart", "april", "mei", "juni",
                "juli", "augustus", "september", "oktober", "november", "december" };

        for (int i = 0; i < 15; i++) {
            try{
                System.out.println(maanden[i]);
            } catch (ArrayIndexOutOfBoundsException e){
                System.out.println("array is out of bounds");
            }
        }
    }
    public void test2(){
        try{
            System.out.println(12/0);
        } catch (ArithmeticException e){
            System.out.println("delen ddor 0 kan niet");
        }
    }
    public void test3(){
        try{
            String naam = null;
            System.out.println(naam);
        } catch (NullPointerException e){
            System.out.println("kan geen null doen");
        }
    }
    public void test4(){
        try{

            String[] maanden = new String[] { "januari", "februari", "maart", "april", "mei", "juni",
                    "juli", "augustus", "september", "oktober", "november", "december" };


            for (int i = 0; i < 15; i++) {
                    System.out.println(maanden[i]);
            }

            String naam = null;
            System.out.println(naam);

            System.out.println(12/0);

        } catch (NullPointerException e){
            System.out.println("kan geen null doen");
        } catch (ArithmeticException e){
            System.out.println("delen ddor 0 kan niet");
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("array is out of bounds");
        }
    }
}
