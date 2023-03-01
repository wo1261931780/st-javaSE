package wo1261931780.stjavaSE.history.c2stage_20220416.ccc133try_with_resource;

import java.io.*;

/**
 * Created by Intellij IDEA.
 * Project:index.pb
 * Package:c2stage_20220416.ccc133try_with_resource
 * User:  wo1261931780@gmail.com
 * Time:  2022-04-13-17  星期六
 */
public class ccc001 {
    public static void main(String[] args) {
        File x = new File("C:\\Users\\1\\Documents\\GitHub\\st-java.github.io\\src\\c2stage_20220416\\ccc133try_with_resource\\ccc001.txt");
        File xx = new File("C:\\Users\\1\\Documents\\GitHub\\st-java.github.io\\src\\c2stage_20220416\\ccc133try_with_resource\\ccc001thread_extends.java");
        try (
                InputStream x2 = new FileInputStream(xx);
                OutputStream x1 = new FileOutputStream(x);
                // 这里简化了操作，所有的资源全部放到里面
                // 即使出现异常，资源也会自动关闭，
                // 好处是自动关闭，同时不用设置finally
                // int xxxx=0;
                // 但是这里，只能设置资源，其他的命令会报错
                // 所有的资源，其实都继承了closeable接口
                demoresource demoresource = new demoresource();

        ) {
            byte[] demo = new byte[1024];
            int len;
            while ((len = x2.read(demo)) != -1) {
                x1.write(demo, 0, len);
                System.out.println("执行了写入操作");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class demoresource implements AutoCloseable {// 继承了autocloseable接口的都被认定为资源——因为可以关闭
    @Override
    public void close() throws Exception {
        System.out.println("我是资源，我被释放了");
    }
}
