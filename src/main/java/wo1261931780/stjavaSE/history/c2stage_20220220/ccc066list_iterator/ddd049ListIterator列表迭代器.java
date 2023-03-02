package wo1261931780.stjavaSE.history.c2stage_20220220.ccc066list_iterator;


import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
/**
 * ListIterator：列表迭代器
 * <p>
 * 通过List集合的listIterator?()方法得到，所以说它是List集合特有的迭代器
 * <p>
 * 用于允许程序员沿任一方向遍历列表的列表的迭代器，在迭代期间修改列表，并获取列表中迭代器的当前位置
 * <p>
 * ListIterator中的常用方法
 * <p>
 * E next()：返回迭代中的下一个元素
 * <p>
 * boolean hasNext()：如果迭代具有更多元素，则返回 true
 * <p>
 * E previous?()：返回列表中的上一个元素
 * <p>
 * boolean hasPrevious?()：如果此列表迭代器在相反方向遍历列表时具有更多元素，则返回 true
 * <p>
 * void add?(E e)：将指定的元素插入列表
 */
@Slf4j
public class ddd049ListIterator列表迭代器 {
	public static void main(String[] args) {
		List<String> x = new ArrayList<>();
		x.add("aaa");
		x.add("bbb");
		x.add("ccc");
		ListIterator<String> x1 = x.listIterator();
		// 注释部分可运行，但属于非重点
		// ------------------------------------------------------
		// while (x1.hasNext()) {
		//     String x2 = x1.next();
		//     log.info(x2);
		// }
		// log.info("执行结束");
		// log.info(x);
		// // 这里的遍历，默认是从最后一个元素开始进行
		// while (x1.hasPrevious()) {
		//     String x3 = x1.previous();
		//     log.info(x3);
		// }
		// log.info("end");
		// ------------------------------------------------------
		while (x1.hasNext()) {
			String x2 = x1.next();
			log.info(x2);
			if (x2.equals("ccc")) {
				x1.add("javaee");
			}
			// 相比原来的并发问题
			// 这里的add方法是来自于listiterator列表迭代器
			// 列表迭代器没有出现报错
			// 从源码分析，
			// 列表迭代器中的add方法，将实际修改值，赋值给理论修改值
			// 同时，在可能出现报错的情况中，设置try...catch方法，对报错进行跳过
			// 最终add没有异常
		}
		log.info(x.toString());
	}
}
