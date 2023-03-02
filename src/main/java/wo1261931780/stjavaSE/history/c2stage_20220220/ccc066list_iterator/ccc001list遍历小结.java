package wo1261931780.stjavaSE.history.c2stage_20220220.ccc066list_iterator;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Intellij IDEA.
 * Project:index.pb
 * Package:c2stage_20220220.ccc066list_iterator
 * User:  wo1261931780@gmail.com
 * Time:  2022-02-19-57  星期六
 */
@Slf4j
public class ccc001list遍历小结 {
	public static void main(String[] args) {
		List<String> demo = new ArrayList<>();
		demo.add("111");
		demo.add("222");
		demo.add("333");
		demo.add("444");
		show(demo);
		show2(demo);
		show3(demo);
		show4(demo);
	}

	// 需要知道遍历位置/对遍历有要求的时候使用

	public static void show(List<String> x) {
		for (int i = 0; i < x.size(); i++) {
			log.info(x.get(i));
		}
	}

	public static void show2(List<String> x) {
		Iterator<String> demo = x.iterator();
		while (demo.hasNext()) {
			String x1 = demo.next();
			log.info("迭代器：" + x1);
		}
	}

	public static void show3(List<String> x) {
		for (String i : x) {
			log.info("增强for：" + i);
		}
	}

	public static void show4(List<String> x) {
		x.forEach(s -> log.info("foreach:" + s));
	}

	public static void show5(List<String> x) {
		x.forEach(System.out::println);
	}
}
