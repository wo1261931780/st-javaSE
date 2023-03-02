package wo1261931780.stjavaSE.history.c2stage_20220220.ccc073genericity_method;

import lombok.extern.slf4j.Slf4j;

/**
 * Created by Intellij IDEA.
 * Project:index.pb
 * Package:c2stage_20220220.ccc073genericity_method
 * User:  wo1261931780@gmail.com
 * Time:  2022-02-12-04  星期日
 */
@Slf4j
public class ccc001genericity {
	public static void main(String[] args) {
		int[] s = {165, 4, 687, 89, 789, 79};
		String[] s1 = {"11", "11", "11", "11", "11", "11"};
		show(s);
		show(s1);
		// ------------------------------------------------
		// show2(int[] s);
		// show2(s);
		show2(s1);// 泛型方法中定义了数组，
		// 就需要设置引用类型的数组，基本类型会报错
	}

	public static <T> void show(T t) {
		log.info("run dev");
	}

	// 自定义一个实现所有数组拼接的方法

	public static <T> void show2(T[] t) {// 泛型的代表字母需要一致
		// 如果泛型是数组类型，使用过程中，需要设置为引用类型，而不是基本类型
		StringBuilder x = new StringBuilder("[");
		if (t != null) {
			// for (T i:t){
			//     x.append(i);
			// }
			for (int i = 0; i < t.length; i++) {
				// if (i == t.length - 1) {
				//     x.append(i);
				// } else {
				//     x.append(t[i]).append(",");
				// }
				x.append(t[i]).append(i == t.length - 1 ? "" : ",");
			}
			x.append("]");
		}
		x.toString();
	}
}
