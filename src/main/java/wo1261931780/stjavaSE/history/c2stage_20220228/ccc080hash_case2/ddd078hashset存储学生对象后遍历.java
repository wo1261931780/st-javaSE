package wo1261931780.stjavaSE.history.c2stage_20220228.ccc080hash_case2;

import lombok.extern.slf4j.Slf4j;

import java.util.HashSet;

@Slf4j
public class ddd078hashset存储学生对象后遍历 {
	public static void main(String[] args) {
		HashSet<ddd077对象类> x = new HashSet<>();
		ddd077对象类 x1 = new ddd077对象类("n1", 11);
		ddd077对象类 x2 = new ddd077对象类("n2", 22);
		ddd077对象类 x3 = new ddd077对象类("n3", 33);
		ddd077对象类 x4 = new ddd077对象类("n4", 44);
		ddd077对象类 x5 = new ddd077对象类("n4", 44);
		// 在不重写方法的情况下，
		// 直接添加会导致添加重复对象
		// hashset的底层方法是hashcode和equals，
		// 这里重写可以将两个变量包含在内，避免出现name和age重复的对象
		x.add(x1);
		x.add(x2);
		x.add(x3);
		x.add(x4);
		x.add(x5);
		for (ddd077对象类 i : x) {
			log.info(i.getName() + "--" + i.getAge());
		}
	}
}
