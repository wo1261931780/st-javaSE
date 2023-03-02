package wo1261931780.stjavaSE.history.c2stage_20220302.ddd086比较器排序;

import lombok.extern.slf4j.Slf4j;

import java.util.Comparator;
import java.util.TreeSet;
@Slf4j
public class ddd087比较器 {
	public static void main(String[] args) {
		log.info("开始");
		TreeSet<ddd088对象类> x = new TreeSet<>(new Comparator<ddd088对象类>() {
			@Override
			public int compare(ddd088对象类 o1, ddd088对象类 o2) {
				int num = o1.getAge() - o2.getAge();
				return num == 0 ? o1.getName().compareTo(o2.getName()) : num;
			}
			// 这里使用匿名内部类，相当于新建了一个比较器，而我重写了比较器方法
			// 内部类在方法内部，所以this指代的是比较器
			// o1表示的是this.xx,o2表示s.xx
			// 补充一下：
			// 我有一个类，类有一个方法，同时继承了一个父类
			// 类中定义的age，需要使用this.age访问
			// 方法中定义的age可以直接访问
			// 父类中的age需要使用super.age访问
			// 需要注意的一点在于，
			// 自然排序是在对象类中重写方法，而这里直接在构建treeSet的时候进行重写操作
		});
		ddd088对象类 x1 = new ddd088对象类("a1", 11);
		ddd088对象类 x2 = new ddd088对象类("a2", 22);
		ddd088对象类 x3 = new ddd088对象类("a3", 33);
		ddd088对象类 x4 = new ddd088对象类("a1", 11);
		ddd088对象类 x5 = new ddd088对象类("f1", 33);
		x.add(x4);
		x.add(x3);
		x.add(x2);
		x.add(x1);
		x.add(x5);
		for (ddd088对象类 i : x) {
			log.info(i.getName() + "--" + i.getAge());
		}
	}
}
