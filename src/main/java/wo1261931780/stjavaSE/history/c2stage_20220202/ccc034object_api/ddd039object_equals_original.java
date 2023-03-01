package wo1261931780.stjavaSE.history.c2stage_20220202.ccc034object_api;

public class ddd039object_equals_original {
    public static void main(String[] args) {
        String x = null;
        String x1 = "123";
        // System.out.println(Object.equals(x, x1));//这里不是静态方法，jdk17中，不允许这样调用
        // 源码在这里：
        // public boolean equals(Object obj) {
        //     return (this == obj);
        // }
        // jdk7中是静态方法，可以直接调用，但是这里不行


    }


}
