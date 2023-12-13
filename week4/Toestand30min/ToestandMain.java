package week4.Toestand30min;

public class ToestandMain {
    public static void main(String[] args) {
        System.out.println("koffiezetapparaat door bryan en Mike 24-2-2023");

        Toestandmachine toestandmachine = new Toestandmachine();

        toestandmachine.processAan();
        toestandmachine.processHeet();
        toestandmachine.processUit();
        toestandmachine.koffiezetten();
        toestandmachine.koffiezetten();
        toestandmachine.processHeet();
        toestandmachine.processAan();
        toestandmachine.processHeet();
        toestandmachine.koffiezetten();
    }
}
