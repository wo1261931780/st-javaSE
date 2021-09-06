package ccc038time;

import java.util.Date;

public class ccc039 {
    public static void main(String[] args) {
        Date dd=new Date();
        System.out.println(dd);
//        dd.setTime(12648);

        System.out.println(dd.getTime()/1000/3600/24/365);


    }
}
