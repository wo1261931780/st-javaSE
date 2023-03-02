package wo1261931780.stjavaSE.history.c2stage_20220326.ccc097treemap;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

/**
 * Created by Intellij IDEA.
 * Project:index.pb
 * Package:c2stage_20220326.ccc097treemap
 * User:  wo1261931780@gmail.com
 * Time:  2022-03-21-02  星期日
 */
public class ccc002rundemo {
	public static void main(String[] args) {
		Map<ccc001object, Integer> demo = new TreeMap<>();
		ccc001object x1 = new ccc001object("123", 100);
		ccc001object x2 = new ccc001object("123", 200);
		ccc001object x3 = new ccc001object("123", 300);
		ccc001object x4 = new ccc001object("123", 300);
		demo.put(x3, 123);
		demo.put(x1, 123);
		demo.put(x2, 123);
		demo.put(x1, 123);
		demo.put(x4, 123);
		// System.out.println(ccc038demo);
		// c2stage_20220326.ccc097treemap.ddd036object@4eec7777=123
		// 没有对对象进行重写的情况下，只会得到对象的地址
		// ******************************************************************************
		System.out.println(demo);
		// ddd036object{name='123', price=123}=46578
		// 即使对象的内容相同，也会因为地址的差异，打印重复结果
		// 但是treemap的不同之处在于，可以对结果进行排序，
		// 这里默认按照price进行排序

		// ******************************************************************************
		// 也可以在这里对排序规则进行一次重写
		// Map<ddd036object, String> demo2 = new TreeMap<>(new Comparator<ddd036object>() {
		//     @Override
		//     public int compare(ddd036object o1, ddd036object o2) {
		//         return Double.compare(o1.getPrice(), o2.getPrice());
		//     }
		// });
		// Map<ddd036object, String> demo2 = new TreeMap<>((o1, o2) -> Double.compare(o1.getPrice(), o2.getPrice()));
		Map<ccc001object, String> demo2 = new TreeMap<>(Comparator.comparingDouble(ccc001object::getPrice));
	}
}
