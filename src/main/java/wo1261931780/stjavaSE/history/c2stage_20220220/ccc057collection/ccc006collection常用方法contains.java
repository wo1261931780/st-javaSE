package wo1261931780.stjavaSE.history.c2stage_20220220.ccc057collection;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.Collection;
@Slf4j
public class ccc006collection常用方法contains {
	public static void main(String[] args) {
		log.info("开始");
		Collection<String> x = new ArrayList<>();
		x.add("aaa");
		x.add("aaa");
		x.add("aaa");
		x.add("aaa");
		x.contains("bbb");
		log.info(String.valueOf(x.contains("bbb")));
		// false
		// 判断元素是否存在
		x.add("bbb");
		log.info(String.valueOf(x.contains("bbb")));
	}
}
