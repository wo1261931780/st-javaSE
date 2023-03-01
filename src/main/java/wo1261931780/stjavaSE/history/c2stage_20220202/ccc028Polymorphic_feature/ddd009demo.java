package wo1261931780.stjavaSE.history.c2stage_20220202.ccc028Polymorphic_feature;
// 案例需要经常复习，里面很好地体现了多态的结构

public class ddd009demo {
	public static void main(String[] args) {
		// 在操作中创建了xx对象
		ddd008animaloperate xx = new ddd008animaloperate();
		// 在狗中，创建了x对象
		ddd007dog x = new ddd007dog();
		xx.use(x);
		// 把狗中的x对象，传递给操作方法中的xx对象，
		// 这样xx对象就可以调用use方法
		// 而use方法调用dog类中的eat方法，因为前面已经传递过x对象，所以x可以直接使用eat
		// 这样狗中的x就可以使用存在于dog类中的eat功能，
		// 狗中的x使用完之后，就sout了出来
		ddd010cat c = new ddd010cat();
		xx.use(c);
		// 这里，多态省去了多余的编译，直接添加对象即可
	}
}
