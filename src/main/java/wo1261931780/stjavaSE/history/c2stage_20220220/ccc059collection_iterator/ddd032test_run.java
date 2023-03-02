package wo1261931780.stjavaSE.history.c2stage_20220220.ccc059collection_iterator;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

@Slf4j
public class ddd032test_run {
	public static void main(String[] args) {
		log.info("开始运行");
		Collection<String> x = new ArrayList<>();
		x.add("a1");
		x.add("a2");
		x.add("a3");
		x.add("a4");
		x.add("a5");
		x.add("a6");
		// 这里必须添加完成以后，再创建对象，否则报错
		// 可以理解为：
		// 1.集合中存在元素的情况下，才能创建有内容的迭代器
		// 2.有内容的情况下，元素才能执行相关是否为空的判断
		Iterator<String> x1 = x.iterator();
		log.info(String.valueOf(x1.hasNext()));// true
		log.info("----------------------------");
		x1.next();// 这里相当于直接向下移动了一个元素，所以后面只能打印出来2-6
		// 下面是循环的三种解法：
		// --------------------------------------------------------------
		// for (int i = 0; i < x.size(); i++) {
		// for (int i = 0; x1.hasNext(); i++) {
		//     log.info(x1.next());
		// }
		// --------------------------------------------------------------
		// do {
		//     log.info(x1.next());
		// } while (x1.hasNext());
		// --------------------------------------------------------------
		while (x1.hasNext()) {
			log.info(x1.next());
		}
	}
}
