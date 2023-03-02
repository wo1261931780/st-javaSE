package wo1261931780.stjavaSE.history.c2stage_20220326.ccc094map_for;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by Intellij IDEA.
 * Project:index.pb
 * Package:c2stage_20220326.ccc092map
 * User:  wo1261931780@gmail.com
 * Time:  2022-03-17-05  ÐÇÆÚÈÕ
 */
public class ccc001forkey {
	public static void main(String[] args) {
		Map<String, Integer> x = new HashMap<>();
		x.put("a1", 11);
		x.put("a2", 22);
		x.put("a3", 33);
		x.put("a4", 44);
		x.put("a5", 55);
		Set<String> demoset = x.keySet();
		for (String s : demoset) {
			Integer getkey = x.get(s);
			System.out.println(s + "--------" + getkey);
		}
	}
}
