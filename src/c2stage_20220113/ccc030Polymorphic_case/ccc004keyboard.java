package c2stage_20220113.ccc030Polymorphic_case;

public class ccc004keyboard extends ccc002usb{
    @Override
    void get_in() {
        System.out.println("keyboard get in");
    }

    @Override
    void get_out() {
        System.out.println("keyboard get out");
    }
    void type() {
        System.out.println("keyboard type in");
    }
}
