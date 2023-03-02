package wo1261931780.stjavaSE.history.c2stage_20220326.ccc093map_api;


import lombok.extern.slf4j.Slf4j;

import java.util.HashMap;
import java.util.Map;

/**
 * Map集合的基本功能：
 * <p>
 * V put(K key,V value)：添加元素
 * <p>
 * V remove(Object key)：根据键删除键值对元素
 * <p>
 * void clear()：移除所有的键值对元素
 * <p>
 * boolean containsKey(Object key)：判断集合是否包含指定的键
 * <p>
 * boolean containsValue(Object value)：判断集合是否包含指定的值(自学)
 * <p>
 * boolean isEmpty()：判断集合是否为空
 * <p>
 * int size()：集合的长度，也就是集合中键值对的个数
 */
@Slf4j
public class eee015map基本功能 {
	public static void main(String[] args) {
		Map<String, String> x = new HashMap<>();
		x.put("111", "a1");
		x.put("222", "a2");
		x.put("333", "a3");
		x.put("444", "a4");
		log.info(x.toString());
		log.info(x.remove("aaa"));
		// 结果为null
		log.info(x.remove("111"));
		// 返回被删除的元素a1
		log.info(x.toString());
		// {222=a2, 333=a3, 444=a4}
		// ----------------------------------------------------
		log.info(String.valueOf(x.containsKey("222")));
		log.info(String.valueOf(x.containsValue("a3")));
		// 判断map中是否包含指定和key和value
		// 返回的都是true和false
		// ----------------------------------------------------
		// x.clear();
		// log.info(x);
		// 直接清空所有的数据
		// ----------------------------------------------------
		log.info(String.valueOf(x.isEmpty()));
		// 判断集合是否为空
		log.info(String.valueOf(x.size()));
		// 判断集合长度
	}
}
