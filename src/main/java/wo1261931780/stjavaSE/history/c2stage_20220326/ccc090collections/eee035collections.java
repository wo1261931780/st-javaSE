package wo1261931780.stjavaSE.history.c2stage_20220326.ccc090collections;
/*
    Collections类的概述
        是针对集合操作的工具类

    Collections类的常用方法
        public static <T extends Comparable<? super T>> void sort?(List<T> list)：将指定的列表按升序排序
        public static void reverse?(List<?> list)：反转指定列表中元素的顺序
        public static void shuffle?(List<?> list)：使用默认的随机源随机排列指定的列表
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class eee035collections {
	public static void main(String[] args) {
		List<Integer> x = new ArrayList<>();
		x.add(ran());
		x.add(ran());
		x.add(ran());
		x.add(ran());
		// 上面几个调用随机数方法生成数据
		// --------------------------------
		// x.add(12);
		// x.add(789);
		// x.add(12487);
		// x.add(65465);
		// x.add(6487);
		// --------------------------------
		Collections.sort(x);
		// 按顺序排序，
		// 无视添加数据的顺序，按照自然数大小，从小到大
		// --------------------------------
		// Collections.reverse(x);
		// 按照添加数据的顺序，反向排序
		// 举例：
		// 添加1/2/9/5，正常输出为1295，反向就是5921
		// --------------------------------
		// Collections.shuffle(x);
		// 将添加数据的顺序打乱，
		// 举例：
		// 添加1/2/9/5，正常输出为1295，打乱就是2591等等
		// --------------------------------
		System.out.println(x);
	}

	public static int ran() {
		Random x1 = new Random();
		int x2 = x1.nextInt(200);
		return x2;
	}
}
