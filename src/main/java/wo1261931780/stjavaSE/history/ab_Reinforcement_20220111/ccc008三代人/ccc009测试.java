package wo1261931780.stjavaSE.history.ab_Reinforcement_20220111.ccc008三代人;

public class ccc009测试 {
	public static void main(String[] args) {
		System.out.println("开始---------------");
		ccc007son x1 = new ccc007son();
		// 儿子自带的方法
		x1.skating();
		// 因为儿子继承了父亲，所以可以使用父亲的方法
		x1.smoke();
		// 又因为父亲继承了爷爷，根据多层继承关系，儿子也可以调用爷爷的方法
		x1.drink();
		// 这就是单个继承和多层继承
		// 继承，实际上可以使子类使用父类的方法
		// 这里的调用方式，首先子类溜冰，在子类中找到方法
		// 然后子类抽烟，但是子类中没有方法，所以自动到父类中寻找，然后调用
		// 然后子类饮酒，同样的流程，父类没有，就在父类的父类（爷爷类）中寻找
	}
}
