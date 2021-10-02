package abc往期学习2021年10月2日.ccc032常用api;

public class ccc038equalsdemo {
    public static void main(String[] args) {
        ccc037equals x=new ccc037equals("ss",10);
        ccc037equals xx=new ccc037equals("ss",10);
        System.out.println(x.equals(xx));
        /*
        System.out.println("----------------------------------");
            public boolean equals(Object obj) {
            //this=x
            //obj=xx
            //比较的还是地址值
                return (this == obj);
            }think you
        System.out.println("----------------------------------");
        */
    }
}
