package ab往期学习2021年10月2日.aaa001初期学习集合;

public class aaa015c静态和动态初始化 {
    public static void main(String[] args) {
        System.out.println("静态初始化");
        // int[] arr = new int[]{1, 1, 1, 2, 3};
        int[] arr = {1, 1, 2, 3, 4, 4};
        System.out.println(arr);
        System.out.println(arr[2]);
        System.out.println("--------------------------");
        /*
         * 静态初始化，就是一开始把数组的数据写死，数组的长度也固定。
         * 动态初始化，一开始只确定了数组的长度，数组的数字默认是0，地址也随机分配
         * */

        // System.out.println(arr[7]);
        // 直接访问不存在的元素，就会出现索引越界
        // ArrayIndexOutOfBoundsException
        // int[] arr=null;
        // 上面的强行访问，会造成空指针――――说人话就是，arr无法访问地址为空的数组
        // NullPointerException
        for (int i = 0; i < arr.length; i++) {
            System.out.println("输出第" + i + "位的数据为：" + arr[i]);
        }
        //上面是数组遍历，下面是在遍历的基础上，判断最值
        System.out.println("--------------------------");
        int max = arr[0];
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("最大值为：" + max);
        System.out.println("最小值为：" + min);
        // 2021年12月26日15:17:41，补充学习
        // 目标：掌握动态初始化元素默认值的规则。
        // 1、整型数组的元素默认值都是0
        int[] arrr = new int[10];
        System.out.println(arrr[0]);
        System.out.println(arrr[9]);

        // 2、字符数组的元素默认值是多少呢？ 0
        char[] chars = new char[100];
        System.out.println((int)chars[0]);
        System.out.println((int)chars[99]);

        // 3、浮点型数组的元素默认值是0.0
        double[] scores = new double[90];
        System.out.println(scores[0]);
        System.out.println(scores[89]);

        // 4、布尔类型的数组
        boolean[] booleans = new boolean[100];
        System.out.println(booleans[0]);
        System.out.println(booleans[99]);

        // 5、引用类型的数组
        String[] names = new String[90];
        System.out.println(names[0]);
        System.out.println(names[89]);

        // int[] arrs = new int[3]{30, 40, 50};
        //静态和动态初始化，二者不可混用
    }
}
