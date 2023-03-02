package wo1261931780.stjavaSE.history.c2stage_20220326.ccc096linkedhashmap;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by Intellij IDEA.
 * Project:index.pb
 * Package:c2stage_20220326.ccc096linkedhashmap
 * User:  wo1261931780@gmail.com
 * Time:  2022-03-20-55  星期日
 */
public class ccc001linkedhashmap {
	public static void main(String[] args) {
		Map<String, Integer> x = new LinkedHashMap<>();
		x.put("demo1", 111);
		x.put("demo3", 333);
		x.put("demo2", 222);
		x.put("demo5", 555);
		x.put("demo4", 444);
		System.out.println(x);// {demo1=111, demo3=333, demo2=222, demo5=555, demo4=444}
		// 按照添加顺序进行打印
	}
}
