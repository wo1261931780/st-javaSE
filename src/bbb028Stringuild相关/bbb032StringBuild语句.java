package bbb028Stringuild相关;

public class bbb032StringBuild语句 {
    public static void main(String[] args) {
        StringBuilder aa1 = new StringBuilder();
        //new也可以通过后缀，自动补充前缀
        StringBuilder b11 = new StringBuilder("123");
        System.out.println(b11);
        //123
        StringBuilder xx=b11.append(555);
        StringBuilder x1=b11.append(2.5);
        //结果是123555，相当于在b11后面直接接上了555
        //括号内是字符串需要加上双引号，其他可以直接跟结果
        System.out.println(xx);
        //1235552.5
        if(b11==xx){
            System.out.println(true);
        }else {
            System.out.println(false);
        }
        //xx的意思是，在b11的后面加上555，然后赋值给xx.
        //但是b11和xx是同一个对象，因为b11已经拓展了555。
        b11.append(66666);
        //也说明不需要加前缀。,而且结果是直接跟在后面
        b11.append(111).append(222).append(333);
        //链式编程
        System.out.println(b11);
        //1235552.566666111222333
        if(b11==xx){
            System.out.println(true);
            System.out.println(xx);
            //1235552.566666111222333
        }else {
            System.out.println(false);
        }
        //这里b11和xx一起改变
        b11.reverse();
        //333222111666665.2555321
        //直接进行字符串反转，前提要求b11是string类型
        System.out.println(b11);
    }
}
