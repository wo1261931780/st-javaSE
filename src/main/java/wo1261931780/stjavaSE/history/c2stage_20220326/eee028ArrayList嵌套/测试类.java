package wo1261931780.stjavaSE.history.c2stage_20220326.eee028ArrayList嵌套;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

/**
 * 需求：
 * 创建一个ArrayList集合，存储三个元素，每一个元素都是HashMap，每一个HashMap的键和值都是String，并遍历
 * 思路：
 * 1:创建ArrayList集合
 * 2:创建HashMap集合，并添加键值对元素
 * 3:把HashMap作为元素添加到ArrayList集合
 * 4:遍历ArrayList集合
 * 给出如下的数据:
 * 第一个HashMap集合的元素：
 * 孙策		大乔
 * 周瑜		小乔
 * 第二个HashMap集合的元素：
 * 郭靖		黄蓉
 * 杨过		小龙女
 * 第三个HashMap集合的元素：
 * 令狐冲	任盈盈
 * 林平之	岳灵珊
 */
public class 测试类 {
	/**
	 * 2021年10月10日09:58:24，复习内容
	 */
	public static void main(String[] args) {
		ArrayList<HashMap<String, String>> x = new ArrayList<>();
		HashMap<String, String> x1 = new HashMap<>();
		x1.put("111", "a1");
		x1.put("222", "a2");
		HashMap<String, String> x2 = new HashMap<>();
		x1.put("333", "a3");
		x1.put("444", "a4");
		HashMap<String, String> x3 = new HashMap<>();
		x1.put("555", "a5");
		x1.put("666", "a6");
		x.add(x1);
		x.add(x2);
		x.add(x3);
		System.out.println("开始执行");
		for (HashMap<String, String> x4 : x) {
			Set<String> x5 = x4.keySet();
			for (String x6 : x5) {
				System.out.println(x6 + "--" + x4.get(x6));
			}
		}
	}
}
