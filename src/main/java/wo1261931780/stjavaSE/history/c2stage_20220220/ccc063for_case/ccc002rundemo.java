package wo1261931780.stjavaSE.history.c2stage_20220220.ccc063for_case;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.function.Consumer;

/**
 * Created by Intellij IDEA.
 * Project:index.pb
 * Package:c2stage_20220220.ccc063for_case
 * User:  wo1261931780@gmail.com
 * Time:  2022-02-13-47  星期五
 */
@Slf4j
public class ccc002rundemo {
	public static void main(String[] args) {
		Collection<ccc001object> x = new ArrayList<>();
		x.add(new ccc001object("11", 11, 11));// 不能直接add
		x.add(new ccc001object("22", 22, 22));// 因为这里add添加的都是对象，需要进行带参构造
		x.add(new ccc001object("33", 33, 33));
		log.info("增强for循环：");
		for (ccc001object x1 : x) {
			log.info(x1.getName() + "\t" + x1.getAge() + "\t" + x1.getPrice());
		}
		log.info("迭代器：");
		Iterator<ccc001object> demoit = x.iterator();
		// while (x.iterator().hasNext()) {//因为返回的是一个对象，所以可以直接链式编程
		// 但是直接创建，会导致死循环，而index没有那么多
		// 这里相当于每次返回了一个新的迭代器对象，然后对迭代器对象判断是否为空，
		// 如果为空，就进行下一次循环
		while (demoit.hasNext()) {
			// log.info(demoit.next());// 直接遍历只会得到对象
			ccc001object show = demoit.next();
			log.info(show.getName() + "--" + show.getAge() + "--" + show.getPrice());
		}
		log.info("foreach循环：");
		x.forEach(new Consumer<ccc001object>() {
			@Override
			public void accept(ccc001object xx) {
				log.info(xx.getName() + "**" + xx.getAge() + "**" + xx.getPrice());
			}
		});
		log.info("lambda表达式：");
		x.forEach(x1 -> log.info(x1.getName() + "==" + x1.getAge() + "==" + x1.getPrice()));
	}
}
