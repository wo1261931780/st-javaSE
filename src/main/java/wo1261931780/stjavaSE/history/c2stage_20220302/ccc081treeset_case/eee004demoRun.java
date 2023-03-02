package wo1261931780.stjavaSE.history.c2stage_20220302.ccc081treeset_case;

import lombok.extern.slf4j.Slf4j;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by Intellij IDEA.
 * Project:index.pb
 * Package:c2stage_20220302.ccc081treeset_case
 * User:  wo1261931780@gmail.com
 * Time:  2022-03-21-55  星期三
 */
@Slf4j
public class eee004demoRun {
	public static void main(String[] args) {
		Set<eee003appleObject> x = new TreeSet<>();
		x.add(new eee003appleObject(11.11, "aa", 11, "bb"));
		x.add(new eee003appleObject(11.12, "aa", 12, "bb"));
		log.info(x.toString());// 直接输出会报错，因为没有比较规则，默认比较了地址
		log.info("-----------------------------");
		// 这里就是内部自带了比较器
		Set<eee003appleObject> x1 = new TreeSet<>(new Comparator<eee003appleObject>() {
			@Override
			public int compare(eee003appleObject o1, eee003appleObject o2) {
				return o1.getPrice() - o2.getPrice();
			}
		});
		Set<eee003appleObject> x2 = new TreeSet<>(new Comparator<eee003appleObject>() {
			@Override
			public int compare(eee003appleObject o1, eee003appleObject o2) {
				// return o1.getPrice() - o2.getPrice();
				return Double.compare(o1.getPrice(), o2.getPrice());
			}
		});
		x2.add(new eee003appleObject(11.11, "demo1", 22, "bb"));
		x2.add(new eee003appleObject(11.11, "demo1", 22, "bb"));
		x2.add(new eee003appleObject(11.21, "demo2", 23, "bb"));
		log.info(x2.toString());

		// lambda表达式简化：
		Set<eee003appleObject> x3 = new TreeSet<>((eee003appleObject o1, eee003appleObject o2) -> {
			return Double.compare(o1.getPrice(), o2.getPrice());
		});
		x3.add(new eee003appleObject(11.11, "demo1", 22, "bb"));
		x3.add(new eee003appleObject(11.11, "demo1", 22, "bb"));
		x3.add(new eee003appleObject(11.21, "demo2", 23, "bb"));
		log.info(x2.toString());
		// lambda表达式简化2：
		Set<eee003appleObject> x4 = new TreeSet<>((eee003appleObject o1, eee003appleObject o2) -> Double.compare(o1.getPrice(), o2.getPrice()));
	}
}
