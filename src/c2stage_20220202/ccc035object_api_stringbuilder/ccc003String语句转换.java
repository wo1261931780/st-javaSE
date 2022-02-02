package c2stage_20220202.ccc035object_api_stringbuilder;

public class ccc003String语句转换 {
    public static void main(String[] args) {
        // StringBuilder xx= new StringBuilder();
        // xx.append(65465);
        // String x=xx.toString();
        // //这里，转换的前提是，xx已经是build类型了，所以可以理解为：
        // //我定义了一个x的字符串变量，然后对xx执行了转换命令。
        // StringBuilder z=new StringBuilder(x);
        // //这里进行的转换，相当于定义了一个新的z，然后把x的字符传过来。
        StringBuilder x1 = new StringBuilder();
        x1.append("111");
        System.out.println(x1);
        String x2 = x1.toString();
        System.out.println(x2);
        String x3 = "222";
        System.out.println(x3);
        StringBuilder x4 = new StringBuilder(x3);
        // 转换的目的在于
        // java的方法中，字符串接收默认使用string类型的
        // 如果传递stringbuilder类型，会不被接受
        // 因此要用tostring做一次转化

        // 不过，从内存图来看，string本身就是基于stringbuilder做的
    }
}
