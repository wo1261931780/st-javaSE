package wo1261931780.stjavaSE.history.ab_history_20211002.bbb010学生类和方法;

public class bbb010面向对象基础 {
	public static void main(String[] args) {
		// Scanner xx= new Scanner();
		// xx是new出来的对象，在堆内存中存在，而堆内存中的都有默认值。
		// 根据对象的种类，字符串返回null，int整数返回0。
		bbb011学生类 c = new bbb011学生类();
		// 在011类中新建一个对象c
		// 然后这个对象c调用了类中的方法study
		c.study();
		// study()是一个方法
		// 方法的调用就是直接输入study()即可
		System.out.println(c.name);
		// name是一个变量，一般直接用string name定义即可
		// 变量无法像上面的命令一样独立输出，所以必须放入语句中
		c.name = "1111";
		// 可以进行变量的修改，这里都是堆内存中的数据
		System.out.println(c.name);
	}

	public void xx1() {
		// class是一个类，xx1只是类中的一个方法罢了
		// 20-25天
	}
}
