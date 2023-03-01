package wo1261931780.stjavaSE.history.c2stage_20220202.ccc035object_api_stringbuilder;


public class ccc001stringbuilder {
    public static void main(String[] args) {
        StringBuilder x=new StringBuilder();
        x.append(11);
        x.append(22);
        // 源码是这个：
        // @Override
        // @IntrinsicCandidate
        // public StringBuilder append(int i) {
        //     super.append(i);
        //     return this;
        // }
        // 最终append返回的是一个StringBuilder对象
        // 因此对象后，直接加append就可以继续使用
        // 从而形成了链式编程
        x.append(33);
        System.out.println(x);

    }
}
