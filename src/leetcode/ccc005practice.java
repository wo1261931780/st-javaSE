package leetcode;

import java.util.Scanner;

public class ccc005practice {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int x1 = x.nextInt();
        Scanner xx = new Scanner(System.in);
        String x2 = xx.nextLine();
        Scanner xxx = new Scanner(System.in);
        int x3 = xxx.nextInt();
        // split1(x2);
        if (x3 == 0) {
            rank1(split1(x2));
        } else {

        }

    }

    public static String[] split1(String xx) {
        String[] x2 =  xx.split(" ");
        // char[] x2=xx.toCharArray();
        return x2;
    }

    public static void rank1(String[] xx) {
        for (int i = 0; i < xx.length-1; i++) {
            int mid=0;
            // if (xx[i] > xx[i + 1]) {
            //     mid = xx[i + 1];
            //     xx[i + 1] = xx[i];
            //     xx[i] = mid;
            // }
            for (int j = 0; j < xx.length-i; j++) {
                if ((int)xx[j] > (int)xx[j + 1]) {
                    mid = (int)xx[j + 1];
                    xx[j + 1] = (int)xx[j];
                    xx[j] = mid;
                }
            }
        }
        System.out.println(xx.toString());
    }
}
