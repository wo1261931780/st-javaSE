package aaa001初期学习集合;

public class aaa011dowhile循环 {
    // public static void main(String[] args) {
    // /*
    // Scanner b11 = new Scanner(System.in);
    // System.out.println("请输入厚度:");
    // int xx = b11.nextInt();
    // int count = 0;
    // int zf = 645968746;
    // while (xx < zf) {
    // 	xx *= 2;
    // 	count++;
    // }
    // System.out.println("需要折叠"+count+"次");
    // */
    //     double xx = 9943213;
    //     //输入珠穆朗玛峰的高度，
    //     // 一张纸折叠多少次能超过珠峰的高度
    //     int x1 = 0;
    //     do {
    //         x1++;
    //         xx = xx / 2;
    //     } while (xx > 1354);
    //     System.out.println(x1);
    // }
    //----------------------------------------------------------------------------------
    //2021年9月7日14:43:04，循环一共有三种
    //1.for(条件){}
    //2.do{}while(条件)
    //3.while(条件){}
    //三者的不同之处在于，
    //1.do{}while()循环中，会先执行一遍do内部的命令，然后再执行while中的条件判断。
    //2.for循环和while循环，二者的变量位置不同，
    // for在内部定义变量i，while在外面定义好i
    //3.如果命令行中，出现死循环，直接ctrl+c即可强制结束
    //死循环
		/*
		for(;;) {
			System.out.println("for");
		}
		*/
        /*
        while(true) {
            System.out.println("while");
        }
        */
        /*
                do {
                System.out.println("do...while");
            }while(true);
         */
    //***********************************************************************************
    // public static void main(String[] args) {
    //     double xx = 9943213;
    //     //使用for循环，完成折叠次数的计算
    //     int x1 = 1;
    //     for (int x2 = 0; x1 < xx; x2++) {
    //         x1 *= 2;
    //         System.out.println("此时循环次数为：" + x2);
    //     }
    //     System.out.println(x1);
    // }
    // //----------------------------------------------------------------------------------
    // public static void main(String[] args) {
    //     double xx = 9943213;
    //     //使用do()while{}循环，完成折叠次数的计算
    //     int x1 = 1;
    //     int x2 = 0;
    //     do {
    //         x1 *= 2;
    //         //原式为x1+=x1*2，
    //         //实际上只需要写一次乘法即可
    //         x2++;
    //         //不同之处，在于x2会多计算一次，最终为15次
    //         System.out.println("此时循环次数为：" + x2);
    //         System.out.println(x1);
    //     } while (x1 < xx);
    // }
    //----------------------------------------------------------------------------------
    public static void main(String[] args) {
        double xx = 9943213;
        //使用do()while{}循环，完成折叠次数的计算
        int x1 = 1;
        int x2 = 0;
        while (x1 < xx) {
            x1 *= 2;
            x2++;
            System.out.println(x1);
            System.out.println("此时循环次数为：" + x2);
        }
    }
}
