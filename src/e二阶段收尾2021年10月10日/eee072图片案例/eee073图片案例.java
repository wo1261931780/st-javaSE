package e二阶段收尾2021年10月10日.eee072图片案例;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class eee073图片案例 {
    public static void main(String[] args) throws IOException {
        File x = new File("l:\\java\\demo.png");
        FileInputStream x1 = new FileInputStream(x);
        FileOutputStream x2 = new FileOutputStream("l:\\java\\demo\\xx.png");
        // 第一次运行的时候没有指定对象xx.png，以后需要注意
        byte[] x3 = new byte[1024];
        // 这个1024是数据的存储格式，默认1024及其整数倍
        int x4;
        while ((x4 = x1.read(x3)) != -1) {
            x2.write(x3, 0, x4);
        }
        // 本质上，所有的文件，都是字节构成的对象
        // 这里对字节流操作所进行的读写，实际上就是我们os中的复制粘贴功能
        x1.close();
        x2.close();
        System.out.println("结束");
    }
}
