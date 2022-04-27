package c2stage_20220113.ccc021abstract_catdog_case;

import java.util.Scanner;

public class ccc003test_run {
    public static void main(String[] args) {
        System.out.println("开始运行");
        ccc001test_animal x = new ccc002test_dog();
        Scanner x1 = new Scanner(System.in);
        String xx = x1.nextLine();
        int xx2 = x1.nextInt();
        x.setName(xx);
        x.setAge(xx2);
        x.eat(x);
    }
}
