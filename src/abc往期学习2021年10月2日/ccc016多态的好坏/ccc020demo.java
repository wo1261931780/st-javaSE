package abc往期学习2021年10月2日.ccc016多态的好坏;
//案例需要经常复习，里面很好地体现了多态的结构

public class ccc020demo {
    public static void main(String[] args) {
        // 在操作中创建了xx对象
        ccc019animaloperate xx = new ccc019animaloperate();
        // 在狗中，创建了x对象
        ccc018dog x = new ccc018dog();
        xx.use(x);
        // 把狗中的x对象，传递给操作方法中的xx对象，
        // 这样xx对象就可以调用use方法
        // 而use方法调用dog类中的eat方法，因为前面已经传递过x对象，所以x可以直接使用eat
        // 这样狗中的x就可以使用存在于dog类中的eat功能，
        // 狗中的x使用完之后，就sout了出来
        ccc021cat c = new ccc021cat();
        xx.use(c);
        // 这里，多态省去了多余的编译，直接添加对象即可
    }
}
