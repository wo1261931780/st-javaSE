package wo1261931780.stjavaSE.history.c2stage_20220326.ccc094map_for;

import lombok.extern.slf4j.Slf4j;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

@Slf4j
public class eee019map遍历1 {
	public static void main(String[] args) {
		Map<String, String> x = new HashMap<>();
		x.put("111", "a1");
		x.put("222", "a2");
		x.put("333", "a3");
		x.put("444", "a4");
		Set<String> x1 = x.keySet();
		log.info(x1.toString());
		for (String x2 : x1) {
			log.info(x.get(x2) + "--" + x2);
			// 需要注意的是，集合的底层是set，遍历是无序的
			// 首先x1是x中的键值，
			// 使用x2对x1进行遍历，每次得到的都是x1的键值
			// 然后x.get(x2)就是根据键值获取具体的数据
		}
		log.info("结束");
	}
}
