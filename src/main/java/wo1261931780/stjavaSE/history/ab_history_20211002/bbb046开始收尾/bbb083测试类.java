package wo1261931780.stjavaSE.history.ab_history_20211002.bbb046开始收尾;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.Scanner;

@Slf4j
public class bbb083测试类 {
	public static void main(String[] args) {
		Scanner zz = new Scanner(System.in);
		log.info("请输入姓名：");
		String z1 = zz.nextLine();
		log.info("请输入年龄：");
		int z2 = zz.nextInt();
		ArrayList<bbb082类> xx = new ArrayList<>();
		bbb082类 x1 = new bbb082类("name", 11);
		// 以前创建不了，因为x1不是一个对象，只是一个单独的变量
		xx.add(x1);
		bbb082类 x2 = new bbb082类(z1, z2);
		xx.add(x2);
		bbb082类 x3 = new bbb082类(z1, z2);
		xx.add(x3);
		log.info("开始遍历操作：");
		for (int s = 0; s < xx.size(); s++) {
			bbb082类 z = xx.get(s);
			log.info(z.getName() + z.getAge());
		}

		// ArrayList<String> zq=new ArrayList<>();
		// Scanner xx=new Scanner(System.in);
		// log.info("请开始输入姓名：");
		// String name=xx.nextLine();
		// log.info("请开始输入年龄：");
		// int age=xx.nextInt();
		// zq.add(name+age);
		// zq.add(name+age);
		// zq.add(name+age);
		// log.info(zq);
		// for (int x=0;x<zq.size();x++){
		//     String s=zq.get(x);
		//     log.info(s);
		// }上面都是已经完成的方法
	}
}
