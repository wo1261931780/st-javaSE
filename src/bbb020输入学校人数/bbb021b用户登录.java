package bbb020ÊäÈëÑ§Ğ£ÈËÊı;

import java.util.Scanner;

public class bbb021bÓÃ»§µÇÂ¼ {
    Scanner x0 = new Scanner(System.in);
    Scanner x1 = new Scanner(System.in);
    String name1;
    String pw;
    private String name = "name";
    private String password = "123";

    public bbb021bÓÃ»§µÇÂ¼() {
        System.out.println("»¶Ó­");
        for (int i = 0; this.name != name1 || this.password != pw; i++) {
            System.out.println("ÊäÈëÕËºÅ£º");
            name1 = x0.nextLine();
            System.out.println("ÇëÊäÈëÃÜÂë£º");
            pw = x1.nextLine();
            if (this.name.equals(name) && this.password.equals(pw)) {
                System.out.println("»¶Ó­");
                break;
            } else {
                System.out.println("ÕËºÅ/ÃÜÂë´íÎó£¬ÇëÖØĞÂÊäÈë");
            }

        }
        //----------------------------------------------------------------
        // if (this.name.equals(name) && this.password.equals(password)) {
        //     System.out.println("»¶Ó­");
        //     // System.out.println("ÇëÊäÈëÃÜÂë£º");
        //     // password = x.nextLine();
        //     // if (this.password.equals(password)) {
        //     //     System.out.println("»¶Ó­");
        //     // } else {
        //     //     System.out.println("ÃÜÂë´íÎó");
        //     // }
        // } else {
        //     System.out.println("´íÎó£¬³ÌĞò½áÊø");
        // }
        //----------------------------------------------------------------
    }
}
