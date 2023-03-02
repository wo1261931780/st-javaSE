package wo1261931780.stjavaSE.history.c2stage_20220220.ccc057collection;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.Collection;
@Slf4j
public class ccc004collection常用方法remove {
	public static void main(String[] args) {
		log.info("开始");
		Collection<String> x = new ArrayList<>();
		x.add("aaa");
		x.add("aaa");
		x.add("aaa");
		x.add("aaa");
		log.info(x.toString());
		// [aaa, aaa, aaa, aaa]
		x.remove("aaa");
		log.info(x.toString());
		// [aaa, aaa, aaa]
		// 默认每个aaa作为一个对象，移除操作按照次数进行
		log.info(String.valueOf(x.remove("aaa")));
		// true
		log.info(String.valueOf(x.remove("aaa1")));
		// 结果有true/false，对不存在的对象进行移除，导致失败
		// false
	}
}
