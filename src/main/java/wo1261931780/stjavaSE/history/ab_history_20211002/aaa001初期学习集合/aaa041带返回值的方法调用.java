package wo1261931780.stjavaSE.history.ab_history_20211002.aaa001初期学习集合;

//这里主要学习不同的方法，根数据类型，需要设置不同的返回值
//比如数据是布尔类型的，那么返回true/false


public class aaa041带返回值的方法调用 {
    public static void main(String[] args) {
        // public static void mmmm(){}
        // public公开
        // static静态
        // void默认类型，这里，如果是int，那么就返回int，布尔就是布尔。
        // mmmm(){}方法体
        System.out.println("------------------");
        // demo1(22);这里是执行方法后，直接获取的结果，例如方法返回了1，那么整个语句=1。
        // 因为语句的结果需要使用，所以必须有对应的变量进行接收
        int res = demo1(22);
        // 上面就是用res来接收命令的执行结果
        //相当于int res=1;
        // System.out.println(demo1(22));
        System.out.println(res);
        // 相比较而言，直接用res接收结果，比使用语句展示，简单很多
    }

    // 举例：public static boolean mmmm(){
    // return true;
    // }
    public static int demo1(int number) {

        return 1;
    }
}
