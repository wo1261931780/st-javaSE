package e二阶段收尾2021年10月12日day9.eee111文件到集合改进案例;

import java.io.*;
import java.util.ArrayList;

public class eee112测试类 {
    public static void main(String[] args) throws IOException {
        BufferedReader x = new BufferedReader(new FileReader("l:\\java\\11.txt"));
        // 学号：111	姓名：aaa	年龄：11	地址：a1
        ArrayList<eee113对象类> x1 = new ArrayList<>();
        String i;
        while ((i = x.readLine()) != null) {
            String[] x3 = i.split("，");
            eee113对象类 x2 = new eee113对象类();
            x2.setNum(x3[0]);
            x2.setName(x3[1]);
            x2.setAge(x3[2]);
            // x2.setAge(Integer.parseInt(x3[2]));
            // 可以这样直接转换一次
            x2.setAddress(x3[3]);
            x1.add(x2);
        }
        System.out.println(x1);
        System.out.println("------------------");
        for (eee113对象类 i2 : x1) {
            String x2 = "学号：" + i2.getNum() + "\t姓名：" + i2.getName() + "\t年龄：" + i2.getAge() + "\t地址：" + i2.getAddress();
            System.out.println(x2);
        }
    }
}
