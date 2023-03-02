package wo1261931780.stjavaSE.history.c2stage_20220326.ccc089Variable_parameters;
/*
    Arrays工具类中有一个静态方法：
        public static <T> List<T> asList?(T... a)：返回由指定数组支持的固定大小的列表

    List接口中有一个静态方法：
        public static <E> List<E> of?(E... elements)：返回包含任意数量元素的不可变列表

    Set接口中有一个静态方法：
        public static <E> Set<E> of?(E... elements) ：返回一个包含任意数量元素的不可变集合
 */

import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
@Slf4j
public class eee012可变参数的使用 {
	public static void main(String[] args) {
		// public static <T> List<T> asList?(T... a)：返回由指定数组支持的固定大小的列表
		List<String> x = Arrays.asList("a1", "a2", "a3");
		// 这里，添加固定元素可以使用，但是不能继续使用添加和删除
		// x.add("aa");
		// x.remove("aa");
		// 这两个都会出现运行时异常
		// x.set(1, "aaaa");
		// 这里会返回被修改的元素
		log.info(x.set(1, "aaaa"));
		// aslist相当于固定了集合的大小
		log.info(x.toString());
		// public static <E> List<E> of?(E... elements)：返回包含任意数量元素的不可变列表
		List<String> x1 = List.of("a1", "a1", "a1", "aqweqwe", "aqweq");
		log.info(x1.toString());
		// 首先是允许重复元素的，
		// x1.remove("a1");
		// 其次是列表固定，不允许增删改
		// public static <E> Set<E> of?(E... elements) ：返回一个包含任意数量元素的不可变集合
		Set<String> x2 = Set.of("a1", "a2", "a3");
		// 同样是不可变集合，不可变包括了不可增删，
		// 这里还包括了set本身的特点，不能存在重复元素，一开始存在就会报错
		log.info(x2.toString());
	}
}
