package wo1261931780.stjavaSE.history.ab_history_20211002.bbb024遍历统计大小写;

public class bbb047string学习 {
    public static void main(String[] args) {
        char[] cha={'a','b','c'};
        String x1=new String(cha);
        System.out.println(x1);
        //结果：abc

        byte[] by={95,94,93,110,111,112};
        String x2=new String(by);//这里会把数据转化为字符串，字母的底层还是数字，所以数字会转化为字母。
        System.out.println("["+x2+"]");
        //结果：[_^]nop]

        String x3 ="asdasdasdasdas";
        System.out.println(x3);
        //结果：asdasdasdasdas
    }
}
