package e二阶段收尾2021年10月12日day9.eee077复制视频;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class eee077复制视频 {
    public static void main(String[] args) throws IOException {
        System.out.println("开始");
        File x = new File("l:\\java\\11.mp4");
        FileInputStream x1 = new FileInputStream(x);
        FileOutputStream x2 = new FileOutputStream("l:\\java\\demo\\22.mp4");
        byte[] xx = new byte[1024];
        int x3;
        while ((x3 = x1.read()) != -1) {
            x2.write(xx, 0, x3);

        }
        x1.close();
        x2.close();
        System.out.println("结束");

    }
}
