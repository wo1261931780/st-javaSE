package wo1261931780.stjavaSE.history.c2stage_20220302.ccc081treeset_case;

/**
 * Created by Intellij IDEA.
 * Project:index.pb
 * Package:c2stage_20220302.ccc081treeset_case
 * User:  wo1261931780@gmail.com
 * Time:  2022-03-21-53  星期三
 */
public class eee003appleObject implements Comparable<eee003appleObject> {
	private double weight;
	private String name;
	private int price;
	private String address;

	@Override
	public String toString() {
		return "eee003appleObject{" +
				       "weight=" + weight +
				       ", name='" + name + '\'' +
				       ", price=" + price +
				       ", address='" + address + '\'' +
				       '}';
	}

	public eee003appleObject() {
	}

	public eee003appleObject(double weight, String name, int price, String address) {
		this.weight = weight;
		this.name = name;
		this.price = price;
		this.address = address;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	// 重写比较器
	// 自定义比较方法

	@Override
	public int compareTo(eee003appleObject o) {
		return this.price - o.price >= 0 ? 1 : -1;
		// 内部的判断方法：0表示相同，去除
		// 1表示大于
		// -1表示小于
	}
}
