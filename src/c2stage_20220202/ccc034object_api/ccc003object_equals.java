package c2stage_20220202.ccc034object_api;

public class ccc003object_equals {
    // 2022年1月31日20:27:35，抢红包去了
// 2022年2月1日09:16:14，开始第一次push
// 2022年2月2日10:00:32，开始上课
    public static void main(String[] args) {
        show();
    }

    public static void show(){
        ccc001object x = new ccc001object(11, "aaa");
        ccc001object x1 = new ccc001object(11, "aaa");
        //对于上面的两个对象来说，内容相同，就意味着对象是同一个
        // 但是直接使用equals只能比较地址是否一致

        System.out.println(x.equals(x1));//结果为false
        System.out.println(x==x1);//结果为false
        //如果需要比较内容，就要在对象类中，进行方法的重写
        // 这里的重写位置，不是show方法中，而是创建对象的类中
    }


}
