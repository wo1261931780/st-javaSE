package c2stage_20220410.ccc123file_recusion_search;

import java.io.File;

/**
 * Created by Intellij IDEA.
 * Project:index.pb
 * Package:c2stage_20220410.ccc123file_recusion_search
 * User:  wo1261931780@gmail.com
 * Time:  2022-04-21-50  星期日
 */
public class ccc001demo_name {
    public static void main(String[] args) {
        show(new File("e:/"), "nginx.conf");
    }

    private static void show(File f1, String f2) {
        if (f1.isDirectory() && f1 != null) {
            File[] f1_list = f1.listFiles();
            if (f1_list != null) {
                for (File file : f1_list) {
                    if (file.isFile()) {
                        if (file.getName().contains(f2)) {
                            System.out.println("找到了");
                            System.out.println(file.getAbsolutePath());
                            // Runtime xx = Runtime.getRuntime();
                            // try {
                            //     xx.exec(file.getAbsolutePath());
                            //     // 这里的启动功能，是使用了java虚拟机的功能，
                            //     // 但是启动只能针对exe文件，其他的暂时不生效
                            // } catch (IOException e) {
                            //     e.printStackTrace();
                            // }
                            return;
                            // 为什么这里没有终止程序
                        }
                    } else {
                        show(file, f2);
                    }
                }
            }
        } else {
            System.out.println("目录为空");
        }

    }
}
