package wo1261931780.stjavaSE.history.c2stage_20220202.ccc027Polymorphic;

// 作为子类
public class ddd003dog extends ddd002animal {
	public int age = 20;
	public int weight = 10;

	@Override
	public void eat() {
		//        super.eat();
		System.out.println("dog fight for food with other animal");
	}

	public void damagehome() {
		System.out.println("damage your home is completed");
	}
}
