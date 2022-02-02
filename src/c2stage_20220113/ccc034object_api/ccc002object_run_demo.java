package c2stage_20220113.ccc034object_api;

public class ccc002object_run_demo {
    public static void main(String[] args) {
        System.out.println("--------------");
        ccc001object s = new ccc001object(20, "junw");
        //给出的是x的地址值:c2stage_20220113.ccc034Commonly_used_api.ccc035object@776ec8df
        System.out.println(s);
        //原文给出的结果不方便阅读，
        //所以需要重写tostring命令，
        //重写操作在object中进行
        /*
            public void println(Object x) {
                String s = String.valueOf(x);
                //这里用String.valueOf方法，把x传递到valueOf中，
                //进入下一步
                if (getClass() == PrintStream.class) {
                    writeln(String.valueOf(s));
                } else {
                    synchronized (this) {
                        print(s);
                        newLine();
                    }
                }
            }
    //--------------------------------------------
        public static String valueOf(Object obj) {
            //上面传递过来之后，obj实际上就是x
            return (obj == null) ? "null" : obj.toString();
            //这里判断obj是否=null，
            //因为obj为x，而x为ccc035object x=new ccc035object(20,"junw");
            //所以x不等于null，进而去执行obj.toString()，
            //进入下一步
        }
    //--------------------------------------------
        */
        System.out.println(s.toString());
        //综上所述，x.toString()，实际上是我的ccc035object类，继承了始祖object类
        //而始祖object类，有tostring方法，所以我可以直接调用
        //tostring方法的作用是返回的是类名+@+代码的哈希值
        //所以我直接得到结果：“c2stage_20220113.ccc034Commonly_used_api.ccc035object@776ec8df”
        //代码的内部有判断流程，但最终使用的还是object中的tostring方法，所以结果一致
        // 最终输出的结果是重写后的格式：
        // ccc035object{age=20, name='junw'}
        // 2022年1月29日23:54:10，今天没写代码，春节放假回到深圳


    }
}
