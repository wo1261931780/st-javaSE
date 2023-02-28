package c2stage_20220416.eee076四种方式复制视频;
/*
    需求：
        把E:\\itcast\\字节流复制图片.avi 复制到模块目录下的 字节流复制图片.avi

    思路：
        1:根据数据源创建字节输入流对象
        2:根据目的地创建字节输出流对象
        3:读写数据，复制图片(一次读取一个字节数组，一次写入一个字节数组)
        4:释放资源

    四种方式实现复制视频，并记录每种方式复制视频的时间
        1:基本字节流一次读写一个字节             共耗时：64565毫秒
        2:基本字节流一次读写一个字节数组          共耗时：107毫秒
        3:字节缓冲流一次读写一个字节             共耗时：405毫秒
        4:字节缓冲流一次读写一个字节数组          共耗时：60毫秒
 */

import java.io.*;

public class eee077四种方式复制视频 {
    public static void main(String[] args) throws IOException {
        onecopy();
        System.out.println("--------------------");
        onesz();
        System.out.println("--------------------");
        cc_onebyte();
        System.out.println("--------------------");
        cc_onesz();
    }

    /**
     * 1:基本字节流一次读写一个字节             共耗时：64565毫秒
     */
    public static void onecopy() throws IOException {
        long t1 = System.currentTimeMillis();
        File x = new File("l:\\java\\11.mp4");
        FileInputStream x1 = new FileInputStream(x);
        FileOutputStream x2 = new FileOutputStream("l:\\java\\ccc038demo\\onecopy.mp4");
        int i;
        while ((i = x1.read()) != -1) {
            x2.write(i);
        }
        x1.close();
        x2.close();
        System.out.println("onecpoy结束");
        long t2 = System.currentTimeMillis();
        // System.out.println((t2 - t1) / 1000 + "秒");
        System.out.println((t2 - t1) + "毫秒");
    }

    /**
     * 2:基本字节流一次读写一个字节数组          共耗时：107毫秒
     */
    public static void onesz() throws IOException {
        // System.out.println("开始");
        long t1 = System.currentTimeMillis();
        File x = new File("l:\\java\\11.mp4");
        FileInputStream x1 = new FileInputStream(x);
        FileOutputStream x2 = new FileOutputStream("l:\\java\\ccc038demo\\onesz.mp4");
        byte[] xx = new byte[1024];
        int x3;
        // while ((x3 = x1.read()) != -1) {
        // 注意了，
        // 这里写法不同，需要把数组传递过来
        // 可以理解为：
        // 我每次read的长度为xx数组的长度
        while ((x3 = x1.read(xx)) != -1) {
            x2.write(xx, 0, x3);
        }
        // 在未设置read数组长度的情况下，
        // 输出得到的文件大小有问题，
        // 同时输出速度相当慢
        x1.close();
        x2.close();
        long t2 = System.currentTimeMillis();
        System.out.println("onesz结束");
        // System.out.println((t2 - t1) / 1000 + "秒");
        System.out.println((t2 - t1) + "毫秒");
    }

    /**
     * 3:字节缓冲流一次读写一个字节             共耗时：405毫秒
     */
    public static void cc_onebyte() throws IOException {
        long t1 = System.currentTimeMillis();
        File x = new File("l:\\java\\11.mp4");
        BufferedInputStream x1 = new BufferedInputStream(new FileInputStream(x));
        BufferedOutputStream x2 = new BufferedOutputStream(new FileOutputStream("l:\\java\\ccc038demo\\cc_onebyte.mp4"));
        int i;
        while ((i = x1.read()) != -1) {
            x2.write(i);
        }
        x1.close();
        x2.close();
        System.out.println("cc_onebyte结束");
        long t2 = System.currentTimeMillis();
        // System.out.println((t2 - t1) / 1000 + "秒");
        System.out.println((t2 - t1) + "毫秒");
    }

    /**
     * 4:字节缓冲流一次读写一个字节数组          共耗时：60毫秒
     */
    public static void cc_onesz() throws IOException {
        long t1 = System.currentTimeMillis();
        File x = new File("l:\\java\\11.mp4");
        BufferedInputStream x1 = new BufferedInputStream(new FileInputStream(x));
        BufferedOutputStream x2 = new BufferedOutputStream(new FileOutputStream("l:\\java\\ccc038demo\\cc_onesz.mp4"));
        int i;
        byte[] x3 = new byte[1024];
        while ((i = x1.read(x3)) != -1) {
            x2.write(x3, 0, i);
        }
        x1.close();
        x2.close();
        System.out.println("cc_onesz结束");
        long t2 = System.currentTimeMillis();
        // System.out.println((t2 - t1) / 1000 + "秒");
        System.out.println((t2 - t1) + "毫秒");
    }
    // 最终结果：
    //     onecpoy结束
    // 9921毫秒
    // --------------------
    //     onesz结束
    // 15毫秒
    // --------------------
    //     cc_onebyte结束
    // 79毫秒
    // --------------------
    //     cc_onesz结束
    // 5毫秒
}
