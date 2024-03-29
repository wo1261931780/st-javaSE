package wo1261931780.stjavaSE.history.c2stage_20220220.ccc057collection;
/**
 * Collection集合常用方法:
 * boolean add(E e):添加元素
 * boolean remove(Object o):从集合中移除指定的元素
 * void clear():清空集合中的元素
 * boolean contains(Object o):判断集合中是否存在指定的元素
 * boolean isEmpty():判断集合是否为空
 * int size():集合的长度，也就是集合中元素的个数
 * <p>
 * Alt+7   打开一个窗口，能够看到类的所有信息
 * <p>
 * //创建集合对象
 * Collection<String> c = new ArrayList<String>();
 * <p>
 * //boolean add(E e):添加元素
 * // log.info(c.add("hello"));
 * c.add("hello");
 * <p>
 * //boolean remove(Object o):从集合中移除指定的元素
 * // log.info(c.remove("world"));
 * // log.info(c.remove("javaee"));
 * <p>
 * //void clear():清空集合中的元素
 * // c.clear();
 * <p>
 * //boolean contains(Object o):判断集合中是否存在指定的元素
 * // log.info(c.contains("world"));
 * // log.info(c.contains("javaee"));
 * <p>
 * //boolean isEmpty():判断集合是否为空
 * // log.info(c.isEmpty());
 * <p>
 * //int size():集合的长度，也就是集合中元素的个数
 * log.info(c.size());
 * <p>
 * //输出集合对象
 * log.info(c);
 * <p>
 * //创建集合对象
 * Collection<String> c = new ArrayList<String>();
 * <p>
 * //boolean add(E e):添加元素
 * // log.info(c.add("hello"));
 * c.add("hello");
 * <p>
 * //boolean remove(Object o):从集合中移除指定的元素
 * // log.info(c.remove("world"));
 * // log.info(c.remove("javaee"));
 * <p>
 * //void clear():清空集合中的元素
 * // c.clear();
 * <p>
 * //boolean contains(Object o):判断集合中是否存在指定的元素
 * // log.info(c.contains("world"));
 * // log.info(c.contains("javaee"));
 * <p>
 * //boolean isEmpty():判断集合是否为空
 * // log.info(c.isEmpty());
 * <p>
 * //int size():集合的长度，也就是集合中元素的个数
 * log.info(c.size());
 * <p>
 * //输出集合对象
 * log.info(c);
 */
/**
 //创建集合对象
 Collection<String> c = new ArrayList<String>();

 //boolean add(E e):添加元素
 // log.info(c.add("hello"));
 c.add("hello");

 //boolean remove(Object o):从集合中移除指定的元素
 // log.info(c.remove("world"));
 // log.info(c.remove("javaee"));

 //void clear():清空集合中的元素
 // c.clear();

 //boolean contains(Object o):判断集合中是否存在指定的元素
 // log.info(c.contains("world"));
 // log.info(c.contains("javaee"));

 //boolean isEmpty():判断集合是否为空
 // log.info(c.isEmpty());

 //int size():集合的长度，也就是集合中元素的个数
 log.info(c.size());

 //输出集合对象
 log.info(c);
 */

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.Collection;

@Slf4j
public class ccc003collection常用方法add {
	public static void main(String[] args) {
		Collection<String> x = new ArrayList<>();
		// 我们为什么要使用collection集合？
		// 通过多态的方式创建，可以使用collection中的api，换句话来说，功能更多
		x.add("aaa");
		x.add("bbb");
		// x.add("aaa");
		log.info(x.toString());
		// 输出结果：[aaa, bbb, aaa]
		// 实际上是存在重复添加的情况
		// --------------------------------------------------------
		// 查看源码：
		// public boolean add(E e) {
		//     modCount++;
		//     add(e, elementData, size);
		//     return true;
		// }
		// --------------------------------------------------------
		log.info(String.valueOf(x.add("aaa")));
		// 所有的x.add()都会返回true
		log.info(x.toString());
		// 和上面的不同，集合的输出可以按顺序
		// 第一次输出两个对象，添加完成以后，输出三个
		// 进入源代码视图以后，
		// alt+7即可进入项目结构
	}
}
