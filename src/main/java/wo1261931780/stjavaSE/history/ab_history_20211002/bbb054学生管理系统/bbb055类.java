package wo1261931780.stjavaSE.history.ab_history_20211002.bbb054学生管理系统;

// alt+inselt直接写
public class bbb055类 {
	private String number = "";
	private String name = "";
	private String age = "";
	private String address = "";

	public bbb055类() {
	}

	public bbb055类(String number, String name, String age, String address) {
		this.number = number;
		this.name = name;
		this.age = age;
		this.address = address;
		System.out.println("赋值完成--------");
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getNumber() {
		return number;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getAge() {
		return age;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getAddress() {
		return address;
	}
}
