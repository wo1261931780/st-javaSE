package abc往期学习2021年10月2日.bbb028Stringuild相关;

public class bbb033String语句转换 {
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
    }
}
