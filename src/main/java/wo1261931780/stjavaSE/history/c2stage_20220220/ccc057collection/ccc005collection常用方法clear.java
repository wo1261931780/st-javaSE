package wo1261931780.stjavaSE.history.c2stage_20220220.ccc057collection;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.Collection;
@Slf4j
public class ccc005collection常用方法clear {
	public static void main(String[] args) {
		log.info("开始运行");
		Collection<String> x = new ArrayList<>();
		x.add("aaa");
		x.add("aaa");
		x.add("aaa");
		x.add("aaa");
		x.add("aaa");
		x.add("aaa");
		log.info(x.toString());
		// [aaa, aaa, aaa, aaa, aaa, aaa]
		x.clear();
		log.info(x.toString());
		// []
	}
}
