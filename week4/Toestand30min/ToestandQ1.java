package week4.Toestand30min;

public class ToestandQ1 extends Toestand{
    @Override
    public Toestand aan(){
        ToestandQ1 toestandQ1 = new ToestandQ1();
        System.out.println("aanzetten kan niet, hij staat al aan");
        return toestandQ1;
    }

    @Override
    public Toestand uit(){
        ToestandQ0 toestandQ0 = new ToestandQ0();
        System.out.println("hij wordt nu heet");
        return toestandQ0;
    }
    @Override
    public Toestand heet(){
        ToestandQ2 toestandQ2 = new ToestandQ2();
        System.out.println("hij gaat nu uit");
        return toestandQ2;
    }

    @Override
    public Toestand zetKoffie(){
        System.out.println("kan geen koffie zetten, hij is nog niet heet");
        ToestandQ1 toestandQ1 = new ToestandQ1();
        return toestandQ1;
    }
    public String toString(){
        return ("\nde currentstate = Q1");
    }
}
