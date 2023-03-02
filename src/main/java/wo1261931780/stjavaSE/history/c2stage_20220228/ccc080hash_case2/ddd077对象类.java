package wo1261931780.stjavaSE.history.c2stage_20220228.ccc080hash_case2;

import java.util.Objects;

public class ddd077对象类 {
	private String name;
	private int age;

	public ddd077对象类() {
	}

	public ddd077对象类(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}

		ddd077对象类 ddd077对象类 = (ddd077对象类) o;

		if (age != ddd077对象类.age) {
			return false;
		}
		// return name != null ? name.equals(ddd077对象类.name) : ddd077对象类.name == null;
		// 用下面的表达
		return Objects.equals(name, ddd077对象类.name);
	}

	@Override
	public int hashCode() {
		int result = name != null ? name.hashCode() : 0;
		result = 31 * result + age;
		return result;
	}
}
