package wo1261931780.stjavaSE.history.c2stage_20220220.ccc065list;

import lombok.extern.slf4j.Slf4j;

import java.util.LinkedList;

/**
 * LinkedList集合的特有功能：
 * <p>
 * public void addFirst(E e)：在该列表开头插入指定的元素
 * <p>
 * public void addLast(E e)：将指定的元素追加到此列表的末尾
 * <p>
 * public E getFirst()：返回此列表中的第一个元素
 * <p>
 * public E getLast()：返回此列表中的最后一个元素
 * <p>
 * public E removeFirst()：从此列表中删除并返回第一个元素
 * <p>
 * public E removeLast()：从此列表中删除并返回最后一个元素
 */
@Slf4j
public class ddd064linkedlist特有方法 {
	public static void main(String[] args) {
		// 注意，这里的底层是链表
		LinkedList<String> x = new LinkedList<>();
		x.add("a1");
		x.add("a2");
		x.add("a3");
		log.info(String.valueOf(x));
		x.addFirst("first_code");
		x.addLast("last_code");
		log.info(String.valueOf(x));
		// [first_code, a1, a2, a3, last_code]
		log.info("----------------------------");
		log.info(x.getFirst());
		log.info(x.getLast());
		// 直接返回获取到的元素
		log.info("----------------------------");
		log.info(x.removeFirst());
		log.info(x.removeLast());
		// 返回被修改的元素
		log.info("----------------------------");
		log.info(String.valueOf(x));
		// [a1, a2, a3]
	}
}
