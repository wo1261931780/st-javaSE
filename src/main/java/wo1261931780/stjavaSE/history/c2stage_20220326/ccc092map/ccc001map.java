package wo1261931780.stjavaSE.history.c2stage_20220326.ccc092map;

import lombok.extern.slf4j.Slf4j;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by Intellij IDEA.
 * Project:index.pb
 * Package:c2stage_20220326.ccc092map
 * User:  wo1261931780@gmail.com
 * Time:  2022-03-11-24  星期日
 */
@Slf4j
public class ccc001map {
	public static void main(String[] args) {
		Map<String, Integer> x = new HashMap<>();
		x.put("qwe", 123);
		log.info(String.valueOf(x.put("qwe", 123)));
		x.put("qwe", 333);
		log.info(x.toString());//{qwe=333}
		// 首先，不会添加重复元素，
		// 其次，当key相同的时候，会对之前的数据进行一次覆盖
		x.put("aa", 333);
		log.info(x.toString());// {aa=333, qwe=333}
		// 栈类型的数据
		// 所有的集合都是写内容，因为内部重写了tostring方法
		log.info("******************************");
		show();// linkedhashmap是有序的，按照元素添加顺序进行设置
		// show_clear(x);
		// show_isempty(x);
		// show_contains(x);
		// show_getvalue(x);
		// show_set(x);
		// show_value(x);
		log.info("******************************");
		show_add();
	}

	public static void show() {
		log.info("******************************");

		Map<String, Integer> x = new LinkedHashMap<>();
		x.put("qwe", 123);
		log.info(String.valueOf(x.put("qwe", 123)));
		x.put("bbb", 333);
		log.info(x.toString());
		x.put("aa", 333);
		log.info(x.toString());
	}

	public static void show_clear(Map<String, Integer> x) {
		log.info("******************************");

		x.clear();
	}

	public static void show_isempty(Map<String, Integer> x) {
		log.info("******************************");

		log.info(String.valueOf(x.isEmpty()));
	}

	public static void show_getvalue(Map<String, Integer> x) {
		log.info("******************************");

		Integer result = x.get("1");// 没有的情况下就是null
		// 一般都是根据key去获取value
		log.info(String.valueOf(result));
		x.remove("qwe");
		log.info(x.toString());
	}

	public static void show_contains(Map<String, Integer> x) {
		log.info("******************************");

		log.info(String.valueOf(x.containsKey("aa")));
		log.info(String.valueOf(x.containsValue("aa")));
	}

	public static void show_set(Map<String, Integer> x) {
		log.info("******************************");

		Set<String> demoset = x.keySet();
		// 这里返回一个set类型的集合对象
		log.info(demoset.toString());
	}

	public static void show_value(Map<String, Integer> x) {
		Collection<Integer> demo_value = x.values();
		// 获取所有值，设置为一个collection集合，因为值可以重复，所以collection内部是可以重复的
		log.info(demo_value.toString());// [333, 333]
	}

	public static void show_add() {
		Map<String, Integer> x1 = new HashMap<>();
		x1.put("a1", 11);
		x1.put("a2", 22);
		Map<String, Integer> x2 = new HashMap<>();
		// x2.put("a1", 11);
		// x2.put("a2", 22);
		// x2.put("a3", 33);
		x2.put("aa1", 33);
		x2.put("aa2", 44);
		x2.put("aa3", 55);
		x1.putAll(x2);
		log.info(x1.toString());// 如果二者的内容完全相同，就不会发生变化
		// {a1=11, aa1=33, a2=22, aa3=55, aa2=44}
		// 最终还是按照key的顺序进行添加
	}
}
