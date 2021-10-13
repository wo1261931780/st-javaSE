package e二阶段收尾2021年10月12日day9.eee074字节缓冲流;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class eee075字节缓冲流 {
    public static void main(String[] args) throws FileNotFoundException {
        File x = new File("L:\\java\\demo.txt");
        // FileOutputStream x1 = new FileOutputStream(x);
        BufferedOutputStream x1 = new BufferedOutputStream(new FileOutputStream(x));
        // 上面的代码合并了两个命令

    }
}
