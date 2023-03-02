package wo1261931780.stjavaSE.history.c2stage_20220302.ccc079linkedhashset;

import lombok.extern.slf4j.Slf4j;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * LinkedHashSet集合特点
 * <p>
 * 1:哈希表和链表实现的Set接口，具有可预测的迭代次序
 * <p>
 * 2:由链表保证元素有序，也就是说元素的存储和取出顺序是一致的
 * <p>
 * 3:由哈希表保证元素唯一，也就是说没有重复的元素
 */
@Slf4j
public class ddd080linkedhashset {
	public static void main(String[] args) {
		LinkedHashSet<String> x = new LinkedHashSet<>();
		x.add("a1");
		x.add("a2");
		x.add("a3");
		x.add("a4");
		x.add("a5");
		x.add("a5");
		x.add("a5");
		for (String i : x) {
			log.info(i);
		}
		show();
	}

	public static void show() {
		Set<Integer> x = new TreeSet<>();
		x.add(123);
		x.add(2345);
		x.add(135);
		x.add(3453);
		x.add(34);
		for (Integer demo : x) {
			log.info(String.valueOf(demo));
		}
		log.info(x.toString());
	}
}
