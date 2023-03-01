package wo1261931780.stjavaSE.history.c2stage_20220430.ccc160tcpudp;

import java.io.IOException;
import java.net.InetAddress;

/**
 * Created by Intellij IDEA.
 * Project:index.pb
 * Package:c2stage_20220306.ccc83
 * User:  wo1261931780@gmail.com
 * Time:  2022-03-13-23  星期日
 */
public class ccc001gethostname {
    public static void main(String[] args) throws IOException {
        // InetAddress x = InetAddress.getLocalHost();
        // System.out.println(x);// LAPTOP-OUE6761M/192.168.3.115
        // 获得名称+ip地址
        // System.out.println(x.getHostName());// 192.168.3.132
        // 分开获取，只得到内网的ip
        // System.out.println(x.getHostAddress());// LAPTOP-OUE6761M

        // 还可以直接通过域名/公网ip，获取公网中服务器的ip地址
        // InetAddress x1 = InetAddress.getByName("www.baidu.com");
        InetAddress x1 = InetAddress.getByName("www.junwdemonet.com");
        // InetAddress x1 = InetAddress.getByName("116.62.70.43");// 这里用域名和ip都是可以的
        System.out.println(x1.getHostName());// www.junwdemonet.com
        System.out.println(x1.getHostAddress());// 14.215.177.39
        // 多次获取，可能ip不一样，因为服务器做了集群，避免一台宕机导致所有人无法使用

        InetAddress x2 = InetAddress.getByName("14.215.177.39");// 直接获取地址也能得到一样的结果
        System.out.println(x2.getHostName());// 14.215.177.39，比较慢，因为相当于做了一次联网操作

        System.out.println(x2.isReachable(2000));// 判断时延内，是否可以联通
        // 一般可以用一个定时器，设置自动判断联通，如果不能联通，可能就挂了，需要做处理
    }
}
