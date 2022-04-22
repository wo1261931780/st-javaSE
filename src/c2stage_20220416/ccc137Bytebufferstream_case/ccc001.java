package c2stage_20220416.ccc137Bytebufferstream_case;

import java.io.*;

/**
 * Created by Intellij IDEA.
 * Project:index.pb
 * Package:c2stage_20220416.ccc137Bytebufferstream_case
 * User:  wo1261931780@gmail.com
 * Time:  2022-04-20-13  星期六
 */
public class ccc001 {
    public static void main(String[] args) {
        // File x = new File("C:\\Users\\1\\Downloads\\123.mp4");
        // File xx = new File("C:\\Users\\1\\Downloads\\");
        File x = new File("C:\\Users\\1\\Documents\\GitHub\\st-java.github.io\\src\\c2stage_20220416\\ccc137Bytebufferstream_case\\ccc001thread_extends.java");
        File xx = new File("C:\\Users\\1\\Documents\\GitHub\\st-java.github.io\\src\\c2stage_20220416\\ccc137Bytebufferstream_case\\");
        // show1(x,xx);
        // show2(x, xx);
        // show3(x, xx);
        // show4(x, xx);
    }

    public static void show1(File x, File xx) {
        File xx1 = new File(xx + "copy1.mp4");
        long sttime = System.currentTimeMillis();
        System.out.println(sttime);
        try (
                InputStream x1 = new FileInputStream(x);
                OutputStream x2 = new FileOutputStream(xx1);
                // 定义也必须在内部
        ) {
            int len;
            while ((len = x1.read()) != -1) {
                x2.write(len);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        long endtime = System.currentTimeMillis();
        int during = (int) (endtime - sttime);
        System.out.println("写入结束" + (during / 60) + "秒");
    }

    public static void show2(File x, File xx) {
        File xx2 = new File(xx + "copy2.mp4");
        long sttime = System.currentTimeMillis();
        System.out.println(sttime);
        try (
                InputStream x1 = new FileInputStream(x);
                OutputStream x2 = new FileOutputStream(xx2);
        ) {
            byte[] demo = new byte[1024];
            int len;
            while ((len = x1.read(demo)) != -1) {
                x2.write(demo, 0, len);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        long endtime = System.currentTimeMillis();
        int during = (int) (endtime - sttime);
        System.out.println("写入结束" + (during / 60) + "秒");
    }

    public static void show3(File x, File xx) {
        File xx3 = new File(xx + "copy3.mp4");
        long sttime = System.currentTimeMillis();
        System.out.println(sttime);
        try (
                InputStream x1 = new BufferedInputStream(new FileInputStream(x));
                OutputStream x2 = new BufferedOutputStream(new FileOutputStream(xx3));
        ) {
            int len;
            while ((len = x1.read()) != -1) {
                x2.write(len);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        long endtime = System.currentTimeMillis();
        int during = (int) (endtime - sttime);
        System.out.println("写入结束" + (during / 60) + "秒");
    }

    public static void show4(File x, File xx) {
        // File xx4 = new File(xx + "copy4.mp4");
        File xx4 = new File(xx + "copy4.txt");
        long sttime = System.currentTimeMillis();
        System.out.println(sttime);
        try (
                InputStream x1 = new BufferedInputStream(new FileInputStream(x));
                OutputStream x2 = new BufferedOutputStream(new FileOutputStream(xx4));
        ) {
            int len;
            byte[] demo = new byte[1024];
            while ((len = x1.read()) != -1) {
                x2.write(demo, 0, len);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        long endtime = System.currentTimeMillis();
        int during = (int) (endtime - sttime);
        System.out.println("写入结束" + (during / 60) + "秒");
    }


}
