package c2stage_20220113.ccc013brother_constructor;

public class ccc003run {
    public static void main(String[] args) {
        ccc001father x=new ccc001father();
        x.setName("aa");
        System.out.println(x.getName()+"--"+x.getAge());//aa--0
        // 这里没有赋值，所以使用的是无参构造方法
        ccc001father x1=new ccc001father("bb");
        System.out.println(x1.getName()+"--"+x1.getAge());// bb--11
        // 这里使用的是兄弟构造器，所以默认给了11

        ccc001father x2=new ccc001father("cc",33);
        System.out.println(x2.getName()+"--"+x2.getAge());// cc--33
        // 带参构造方法




    }
}
