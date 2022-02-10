package leetcode;

import java.util.Scanner;

public class ccc004practice {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        while (x.hasNextInt()) {
            int num = x.nextInt();
            if (num <= 0 || num > 100) {
                return;
            }
            //if(num%2==0){
            int demoj = num * num;
            for (int i = demoj - num + 1, j = 0; j < num; i += 2, j++) {
                if (j == num - 1) {
                    System.out.print(i);
                } else {
                    System.out.print(i + "+");
                }
            }
            //}else{
            //  int demoo=num*num;
            //for(int i=demoo-num+1,j=0;j<num;i+=2,j++){
            //  System.out.print(i+"+");
            //}

            //}

        }
    }

}
