package wo1261931780.stjavaSE.history.c2stage_20220220.ccc065list;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Intellij IDEA.
 * Project:index.pb
 * Package:c2stage_20220220.ccc065list
 * User:  wo1261931780@gmail.com
 * Time:  2022-02-19-49  ÐÇÆÚÎå
 */
@Slf4j
public class ccc001demo {
	public static void main(String[] args) {
		List<String> x = new ArrayList<>();
		x.add("demo");
		x.add("22222");
		x.add("33333");
		x.add("44444");
		x.add("55555");
		// ********************************
		log.info(x.toString());// [ccc038demo, 22222, 33333, 44444, 55555]
		x.add(2, "0000");
		log.info(x.toString());// [ccc038demo, 22222, 0000, 33333, 44444, 55555]
		// ********************************
		log.info(x.get(1));
		log.info(x.set(0, "1111"));
		log.info(x.toString());
	}
}
