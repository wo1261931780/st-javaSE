package wo1261931780.stjavaSE.history.ab_history_20211002.bbb041类和重新学习;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class bbb078测试类 {
	String brand = "";
	int price = 0;
	private String id;

	public void pay(String brand, int price) {
		// 定义方法来设置成员变量
		log.info("使用类：");
		// 设置成员变量为传递过来的数值
		this.brand = brand;
		this.price = price;
		log.info("种类是：" + brand + "，价格是：" + price);
	}
}
