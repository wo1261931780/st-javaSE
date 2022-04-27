package c2stage_20220416.ccc132try_catch_finally;

import java.io.*;

/**
 * Created by Intellij IDEA.
 * Project:index.pb
 * Package:c2stage_20220416.ccc132try_catch_finally
 * User:  wo1261931780@gmail.com
 * Time:  2022-04-12-54  星期六
 */
public class ccc002 {
    public static void main(String[] args) throws IOException {
        File x = new File("C:\\Users\\1\\Documents\\GitHub\\st-java.github.io\\src\\c2stage_20220416\\ccc132try_catch_finally\\ccc002.java");
        File xx = new File("C:\\Users\\1\\Documents\\GitHub\\st-java.github.io\\src\\c2stage_20220416\\ccc132try_catch_finally\\ccc002.txt");
        InputStream x1 = null;
        OutputStream x2 = null;
        int len = 0;
        byte[] demo = new byte[1024];
        try {
            x1 = new FileInputStream(x);
            len = x1.read(demo);
            // x2 = new FileOutputStream(xx, true);
            x2 = new FileOutputStream(xx);
            x2.write(demo, 0, len);
            return;//这里的返回语句，即使执行，导致方法暂停，也不会影响finally的语句
            // 同理，finally中如果有return，最终会执行finally中的代码
            // 正常的逻辑应该是，return1=11，return2=22，
            // 最终只会返回return2的结果，导致return1的返回结果消失
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } finally {
            System.out.println("测试-----------------------------");
            // 就算我上面抛出异常，finally中的命令也会执行出来
            // 要想finally不执行，只有jvm中途退出，
            try {
                if (x1 != null && x2 != null) {
                    x1.close();//可能上面已经关闭过，再次关闭出现异常报错
                    x2.close();
                }
                // 避免资源没有被加载
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            System.out.println("结束");

        }
    }
}
