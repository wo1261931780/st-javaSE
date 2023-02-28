package wo1261931780.stjavaSE.history.c2stage_20220113.ccc013brother_constructor;

public class ccc025run {
    public static void main(String[] args) {
        ccc024father x=new ccc024father();
        x.setName("aa");
        System.out.println(x.getName()+"--"+x.getAge());//aa--0
        // 这里没有赋值，所以使用的是无参构造方法
        ccc024father x1=new ccc024father("bb");
        System.out.println(x1.getName()+"--"+x1.getAge());// bb--11
        // 这里使用的是兄弟构造器，所以默认给了11

        ccc024father x2=new ccc024father("cc",33);
        System.out.println(x2.getName()+"--"+x2.getAge());// cc--33
        // 带参构造方法
    }
}
