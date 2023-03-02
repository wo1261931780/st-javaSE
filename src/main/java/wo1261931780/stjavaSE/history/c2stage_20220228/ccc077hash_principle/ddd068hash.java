package wo1261931780.stjavaSE.history.c2stage_20220228.ccc077hash_principle;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ddd068hash {
	public static void main(String[] args) {
		log.info("开始");
		ddd069对象类 x1 = new ddd069对象类("aa1", 11);
		ddd069对象类 x2 = new ddd069对象类("aa2", 22);
		ddd069对象类 x3 = new ddd069对象类("aa3", 33);
		int xx = x1.hashCode();
		log.info(String.valueOf(xx));
		log.info(String.valueOf(x1.hashCode()));
		// 默认情况下，调用的是object类中的方法
		// 该方法中，不同对象的哈希数据是不相同的
		// 哈希值，是根据对象的地址/字符串/数字，这三个计算出来的int类型数据
	}
}
