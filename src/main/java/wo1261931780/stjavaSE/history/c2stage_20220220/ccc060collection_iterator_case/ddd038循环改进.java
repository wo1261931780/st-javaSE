package wo1261931780.stjavaSE.history.c2stage_20220220.ccc060collection_iterator_case;


import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Scanner;

/**
 * 使用迭代器和循环，收集输入的信息，然后储存到集合中
 * <p>
 * 输入三个信息以后，将集合中的信息全部遍历出来
 */
@Slf4j
public class ddd038循环改进 {
	public static void main(String[] args) {
		Collection<ddd036student> x = new ArrayList<>();
		for (int i = 0; i < 3; i++) {
			log.info("请输入第" + (i + 1) + "位信息：");
			ddd036student x2 = showdemo();// 直接调用方法创建对象
			x.add(x2);
		}
		// Iterator<ddd036student> xx = x.iterator();
		// while (xx.hasNext()) {
		// 	ddd036student x5 = xx.next();
		// 	log.info(x5.getName() + "," + x5.getAge());// 我这里也可以直接链式编程，因为返回的就是对象，对象调用getset方法直接展示结果
		// }
		// 直接将上面替换为增强for-----------------------------------
		for (ddd036student x5 : x) {
			log.info(x5.getName() + "," + x5.getAge());
		}
	}

	public static ddd036student showdemo() {
		Scanner x1 = new Scanner(System.in);
		log.info("name:");
		String x2 = x1.nextLine();
		log.info("age:");
		int x3 = x1.nextInt();
		return new ddd036student(x2, x3);
	}
}
