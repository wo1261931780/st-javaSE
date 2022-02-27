package c2stage_20220220.ccc072genericity_class;

/**
 * Created by Intellij IDEA.
 * Project:index.pb
 * Package:c2stage_20220220.ccc072genericity_case2
 * User:  wo1261931780@gmail.com
 * Time:  2022-02-11-23  星期日
 */
public class ccc002demo_run {
    public static void main(String[] args) {
        ccc001myarraylist<String> x=new ccc001myarraylist<>();
        // 相当于我设置了一个测试类
        // 这个测试类没有指定的对象类型，可以使用string和int等等
        // 按照上面的String类型去添加对象以后
        x.add("11");
        x.add("22");
        x.add("33");
        x.add("44");
        System.out.println(x);//我在内部对tostring方法执行了重写
        // 所以可以直接打印结果
        // 但是本质上，我还是在使用ArrayList的api

    }
}
