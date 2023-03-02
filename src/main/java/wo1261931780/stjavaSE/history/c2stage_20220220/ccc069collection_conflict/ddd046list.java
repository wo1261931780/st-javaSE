package wo1261931780.stjavaSE.history.c2stage_20220220.ccc069collection_conflict;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author junw
 */
@Slf4j
public class ddd046list {
	public static void main(String[] args) {
		List<String> x = new ArrayList<>();
		x.add("hello");
		x.add("world");
		x.add("java");
		// Iterator<String> x1 = x.iterator();
		log.info("循环开始");
		// while (x1.hasNext()) {
		//     String x2 = x1.next();
		//     log.info(x2);
		//     if (x2.equals("world")) {
		//         x.add("javaee");
		//         // ConcurrentModificationException
		//         // 出现并发修改异常
		//     }
		// }
		for (int i = 0; i < x.size(); i++) {
			String x2 = x.get(i);
			if ("world".equals(x2)) {
				x.add("javaee");
			}
		}
		// 从源码分析，没有报错是因为没有做判断
		// next方法，每次都会判断实际数量和预计数量，二者不相同的时候出现异常
		// get方法没有类似的校验，所以可行
		log.info(x.toString());
		log.info("结束");
	}
}
