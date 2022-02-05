package c2stage_20220203.ccc040api_date;

import java.text.ParseException;
import java.util.Date;
import java.util.Scanner;

public class ddd003¿ÎÌÃÔËĞĞ {
    public static void main(String[] args) throws ParseException {
        Scanner x = new Scanner(System.in);
        System.out.println("ÇëÊäÈë×Ö·û´®£º");
        String x1 = x.nextLine();
        Date x2 = new Date();
        String x3 = ddd002¿ÎÌÃĞ´·¨.Datetostring(x2, "yyyy-MM-dd-HH-mm-ss");
        System.out.println(x3);
        // System.out.println("ÇëÊäÈë×Ö·û´®£º");
        // String x2 = x.nextLine();
        Date x4 = ddd002¿ÎÌÃĞ´·¨.stringtodate(x1, "yyyy-MM-dd-HH-mm-ss");
        System.out.println(x4);

    }
}
