package c2stage_20220503.ccc182Dynamic_Proxy;

/**
 * Created by Intellij IDEA.
 * Project:st-java.github.io
 * Package:c2stage_20220503.ccc182Dynamic_Proxy
 * User:  wo1261931780@gmail.com
 * Time:  2022-05-08-31  星期二
 */
public class ccc002serviceimpl implements ccc001service {
    // 直接写，会造成大量的代码冗余，因此需要代理帮助我们完成这个中间的功能

    @Override
    public boolean login(String acc, String paw) {
        // long starttime = System.currentTimeMillis();
        try {
            if (acc.equals("admin") && paw.equals("123")) {
                System.out.println("登录成功");
                Thread.sleep(1000);
                return true;
            }
        } catch (Exception e) {
            // throw new RuntimeException(e);
            e.printStackTrace();
        } finally {
            // long endtime = System.currentTimeMillis();
            // System.out.println("登录耗时：" + (endtime - starttime) / 1000 + "s");
        }
        return false;

    }

    @Override
    public void deleteuser() {
        // long starttime = System.currentTimeMillis();
        try {
            Thread.sleep(2000);
            System.out.println("搜索了2000个用户");
        } catch (Exception e) {
            // throw new RuntimeException(e);
            e.printStackTrace();
        }
        // long endtime = System.currentTimeMillis();
        // System.out.println("登录耗时：" + (endtime - starttime) / 1000 + "s");
    }

    @Override
    public boolean deleteuser(String acc, String paw) {
        // long starttime = System.currentTimeMillis();
        try {
            Thread.sleep(2000);
            System.out.println("搜索了1000个用户");
            return true;
        } catch (Exception e) {
            // throw new RuntimeException(e);
            e.printStackTrace();
        }
        // long endtime = System.currentTimeMillis();
        // System.out.println("登录耗时：" + (endtime - starttime) / 1000 + "s");
        return false;
    }
}
