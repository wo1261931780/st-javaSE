package wo1261931780.stjavaSE.history.c2stage_20220326.ccc093map_api;


import lombok.extern.slf4j.Slf4j;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Map集合的获取功能：
 * <p>
 * V get(Object key):根据键获取值
 * <p>
 * Set<K> keySet():获取所有键的集合
 * <p>
 * Collection<V> values():获取所有值的集合
 */
@Slf4j
public class eee017map常用功能 {
	public static void main(String[] args) {
		Map<String, String> x = new HashMap<>();
		x.put("111", "a1");
		x.put("222", "a2");
		x.put("333", "a3");
		x.put("444", "a4");
		log.info(x.get("111"));
		// 根据键获取数据，a1
		log.info(x.get("ww"));
		// 不存在的键，返回null
		// ------------------------------------------
		// 获取所有key键的集合
		Set<String> x1 = x.keySet();
		for (String x2 : x1) {
			log.info(x2);
		}
		log.info(x1.toString());
		// [111, 222, 333, 444]
		// ------------------------------------------
		// 获取所有值的集合
		Collection<String> x2 = x.values();
		for (String i : x2) {
			log.info(i);
		}
		log.info(x2.toString());
		// 表示这里x2就是一个collection集合
		// [a1, a2, a3, a4]
	}
}
