package c2stage_20220113.ccc023abstract_class_Design_Patterns;

public class ccc002bank_huoqi extends ccc001bank_abstract {
    public ccc002bank_huoqi(String acc,double cash) {
        super(acc,cash);
    }

    @Override
    public double caculate_rates( ) {
        System.out.println("override");
        double profits = getBalances() * 0.35 / 100;
        System.out.println("ÊÕÒæÎª£º"+ profits);
        return profits;

    }


}
