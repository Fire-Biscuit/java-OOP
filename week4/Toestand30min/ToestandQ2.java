package week4.Toestand30min;

public class ToestandQ2 extends Toestand{
    @Override
    public Toestand aan(){
        ToestandQ1 toestandQ1 = new ToestandQ1();
        System.out.println("hij wordt nu niet meer heet maar staan nog wel aan");
        return toestandQ1;
    }

    @Override
    public Toestand uit(){
        ToestandQ0 toestandQ0 = new ToestandQ0();
        System.out.println("hij gaat nu uit");
        return toestandQ0;
    }
    @Override
    public Toestand heet(){
        ToestandQ2 toestandQ2 = new ToestandQ2();
        System.out.println("heet worden kan niet, hij is al heet");
        return toestandQ2;
    }
    @Override
    public Toestand zetKoffie(){
        System.out.println("hij zet nu koffie");
        ToestandQ2 toestandQ2 = new ToestandQ2();
        return toestandQ2;
    }
    public String toString(){
        return ("\nde currentstate = Q2");
    }
}
