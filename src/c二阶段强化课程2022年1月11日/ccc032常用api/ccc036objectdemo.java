package c二阶段强化课程2022年1月11日.ccc032常用api;

public class ccc036objectdemo {
    public static void main(String[] args) {
        System.out.println("--------------");
        ccc035object s = new ccc035object(20, "junw");
        //给出的是x的地址值:c二阶段强化课程2022年1月11日.ccc032常用api.ccc035object@776ec8df
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
        public String toString() {
            return getClass().getName() + "@" + Integer.toHexString(hashCode());
            //这里是最终结果，返回的是类名+@+代码的哈希值
            //结果为：“c二阶段强化课程2022年1月11日.ccc032常用api.ccc035object@776ec8df”
        }
    //--------------------------------------------
        */
        System.out.println(s.toString());
        //综上所述，x.toString()，实际上是我的ccc035object类，继承了始祖object类
        //而始祖object类，有tostring方法，所以我可以直接调用
        //tostring方法的作用是返回的是类名+@+代码的哈希值
        //所以我直接得到结果：“c二阶段强化课程2022年1月11日.ccc032常用api.ccc035object@776ec8df”
        //代码的内部有判断流程，但最终使用的还是object中的tostring方法，所以结果一致

    }
}
