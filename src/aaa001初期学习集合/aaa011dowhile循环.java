package aaa001初期学习集合;

public class aaa011dowhile循环 {
    public static void main(String[] args) {
	/*
	Scanner b11 = new Scanner(System.in);
	System.out.println("请输入厚度:");
	int xx = b11.nextInt();
	int count = 0;
	int zf = 645968746;
	while (xx < zf) {
		xx *= 2;
		count++;
	}
	System.out.println("需要折叠"+count+"次");
	*/
        double xx = 9943213;
        //输入珠穆朗玛峰的高度，
        // 一张纸折叠多少次能超过珠峰的高度
        int x1 = 0;
        do {
            x1++;
            xx = xx / 2;

        } while (xx > 1354);

        System.out.println(x1);


    }

}
