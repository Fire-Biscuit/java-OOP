package week4.Toestand30min;

public class ToestandQ0 extends Toestand{
    @Override
    public Toestand aan(){
        ToestandQ1 toestandQ1 = new ToestandQ1();
        System.out.println("hij staat nu aan");
        return toestandQ1;
    }
    @Override
    public Toestand uit(){
        ToestandQ0 toestandQ0 = new ToestandQ0();
        System.out.println("uitzetten kan niet, hij staat al uit");
        return toestandQ0;
    }
    @Override
    public Toestand heet(){
        ToestandQ0 toestandQ0 = new ToestandQ0();
        System.out.println("heet worden kan niet, hij staat nog uit");
        return toestandQ0;
    }
    @Override
    public Toestand zetKoffie(){
        System.out.println("kan geen koffie zetten, hij staat uit");
        ToestandQ0 toestandQ0 = new ToestandQ0();
        return toestandQ0;
    }

    public String toString(){
        return ("\nde currentstate = Q0");
    }
}
