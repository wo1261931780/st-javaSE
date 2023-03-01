package wo1261931780.stjavaSE.history.c2stage_20220202.ccc028Polymorphic_feature;

public class ddd005feature {
	public static void main(String[] args) {
		ddd007dog x = new ddd007dog();
		show(x);
	}
	// 该方法集中体现了多态的优势
	// 首先show方法中，需要的是animal类型的对象
	// 但是我在上面调用的时候，直接使用dog类对象
	// 结果是，这里的show方法运用了多态的方式进行创建
	// 相当于show(ddd006animal x=new ddd007dog)
	// 于是show方法内使用的eat，是dog类中的方法体

	// -------------------------------------
	// 运用这种方法的好处是，show内部可以调用所有的动物类对象


	public static void show(ddd006animal x) {
		System.out.println("show method");
		x.eat();
	}

}
