package ccc022接口及其特点;

public class ccc004test_run {
    public static void main(String[] args) {
        System.out.println("我是主类");
        ccc001test_inter x = new ccc002test_interimpl();
        System.out.println(x.age);
    }
}
