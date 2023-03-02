package wo1261931780.stjavaSE.history.c2stage_20220220.ddd052三种方法遍历学生案例;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
/**
 * 需求：
 * 创建一个存储学生对象的集合，存储3个学生对象，使用程序实现在控制台遍历该集合
 * <p>
 * 思路：
 * 1:定义学生类
 * <p>
 * 2:创建List集合对象
 * <p>
 * 3:创建学生对象
 * <p>
 * 4:把学生添加到集合
 * <p>
 * 5:遍历集合
 * <p>
 * 迭代器：集合特有的遍历方式
 * <p>
 * 普通for：带有索引的遍历方式
 * <p>
 * 增强for：最方便的遍历方式
 */
public class ddd054运行类 {
	public static void main(String[] args) {

		List<ddd053对象类> x = new ArrayList<>();
		ddd053对象类 x1 = new ddd053对象类("a1", 11);
		ddd053对象类 x2 = new ddd053对象类("a2", 22);
		ddd053对象类 x3 = new ddd053对象类("a3", 33);
		x.add(x1);
		x.add(x2);
		x.add(x3);
		// ---------------------------------------------------------------
		for (int i = 0; i < x.size(); i++) {
			ddd053对象类 xx = x.get(i);
			System.out.println(xx.getName() + "," + xx.getAge());
		}
		System.out.println("第一次遍历结束----------------------------------");
		Iterator<ddd053对象类> xx1 = x.iterator();
		while (xx1.hasNext()) {
			ddd053对象类 s = xx1.next();
			System.out.println(s.getName() + "--" + s.getAge());
		}
		System.out.println("第二次遍历结束----------------------------------");
		ListIterator<ddd053对象类> xx2 = x.listIterator();
		// while (xx2.hasNext()) {
		//     ddd053对象类 xx3 = xx2.next();
		//     System.out.println(xx3.getName() + "**" + xx3.getAge());
		// }
		for (ddd053对象类 i : x) {
			System.out.println(i.getName() + "**" + i.getAge());
		}
		System.out.println("第三次遍历结束----------------------------------");


	}
}
