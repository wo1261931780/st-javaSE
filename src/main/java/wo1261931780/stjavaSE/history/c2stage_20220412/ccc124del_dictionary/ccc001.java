package c2stage_20220412.ccc124del_dictionary;

/**
 * Created by Intellij IDEA.
 * Project:st-java.github.io
 * Package:c2stage_20220412.ccc124del_dictionary
 * User:  wo1261931780@gmail.com
 * Time:  2022-05-15-07  星期三
 */

import java.io.File;

/**
 目标：删除非空文件夹
 */
public class ccc001 {
    public static void main(String[] args) {
        deleteDir(new File("D:/new"));
    }

    /**
     删除文件夹，无所谓里面是否有内容，都可以删除
     * @param dir
     */
    public static void deleteDir(File dir){
        // 1、判断dir存在且是文件夹
        if(dir != null && dir.exists() && dir.isDirectory()){
            // 2、提取一级文件对象。
            File[] files = dir.listFiles();
            // 3、判断是否存在一级文件对象，存在则遍历全部的一级文件对象去删除
            if(files != null && files.length > 0){
                // 里面有内容
                for (File file : files) {
                    // 4、判断file是文件还是文件夹，文件直接删除
                    if(file.isFile()){
                        file.delete();
                    }else {
                        // 递归删除
                        deleteDir(file);
                    }
                }
            }
            // 删除自己
            dir.delete();
        }
    }
}
