package c2stage_20220416.ccc133try_with_resource;

import java.io.*;

/**
 * Created by Intellij IDEA.
 * Project:index.pb
 * Package:c2stage_20220416.ccc133try_with_resource
 * User:  wo1261931780@gmail.com
 * Time:  2022-04-13-17  ������
 */
public class ccc001 {
    public static void main(String[] args) {
        File x = new File("C:\\Users\\1\\Documents\\GitHub\\st-java.github.io\\src\\c2stage_20220416\\ccc133try_with_resource\\ccc001.txt");
        File xx = new File("C:\\Users\\1\\Documents\\GitHub\\st-java.github.io\\src\\c2stage_20220416\\ccc133try_with_resource\\ccc001.java");
        try (
                InputStream x2 = new FileInputStream(xx);
                OutputStream x1 = new FileOutputStream(x);
                // ������˲��������е���Դȫ���ŵ�����
                // ��ʹ�����쳣����ԴҲ���Զ��رգ�
                // �ô����Զ��رգ�ͬʱ��������finally
                // int xxxx=0;
                // �������ֻ��������Դ������������ᱨ��
                // ���е���Դ����ʵ���̳���closeable�ӿ�
                demoresource demoresource = new demoresource();

        ) {
            byte[] demo = new byte[1024];
            int len;
            while ((len = x2.read(demo)) != -1) {
                x1.write(demo, 0, len);
                System.out.println("ִ����д�����");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class demoresource implements AutoCloseable {

    @Override
    public void close() throws Exception {
        System.out.println("������Դ���ұ��ͷ���");
    }
}