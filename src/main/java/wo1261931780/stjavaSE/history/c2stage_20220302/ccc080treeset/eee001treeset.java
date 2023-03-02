package wo1261931780.stjavaSE.history.c2stage_20220302.ccc080treeset;

import java.util.Set;
import java.util.TreeSet;

/**
 * Created by Intellij IDEA.
 * Project:index.pb
 * Package:c2stage_20220302.ccc080treeset
 * User:  wo1261931780@gmail.com
 * Time:  2022-03-21-39  星期三
 */
public class eee001treeset {
	public static void main(String[] args) {
		// treeset天生就是为了排序存在
		Set<String> x = new TreeSet<>();
		x.add("2demo1");
		x.add("2demo2");
		x.add("5demo3");
		x.add("3demo4");
		System.out.println(x);// [2demo1, 2demo2, 3demo4, 5demo3]
		// 元素首字母-按照char的int值-去除重复-
	}
}
