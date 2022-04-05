package c2stage_20220404.ccc113stage_project.src.java.app;

import bean.ccc001movie;
import bean.ccc002user;
import bean.ccc003customer;
import bean.ccc004business;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.math.BigDecimal;
import java.util.*;

/**
 * Created by Intellij IDEA.
 * Project:demo_project
 * Package:app
 * User:  wo1261931780@gmail.com
 * Time:  2022-04-22-58  星期一
 */
public class ccc001rundemo {
    public static final List<bean.ccc002user> user_list = new ArrayList<>();
    public static final Map<ccc004business, List<ccc001movie>> movie_list = new HashMap<>();
    public static final Logger LOGGER = LoggerFactory.getLogger("ccc001rundemo.class");
    public static final Scanner de_scanner = new Scanner(System.in);
    public static ccc002user login_user;// 设定一个全局变量，记住当前的登录用户信息
    // 黑马的做法是，
    // 每次添加新的商家信息，新建一个用户和排片信息list
    // 我可以将创建对象的操作封装为一个方法，然后重复调用即可

    static {
        // add_user();
        ccc002user x1 = new ccc003customer();
        x1.setName("a1");
        x1.setSex("女");
        x1.setTel(123456);
        x1.setAccount("a1");
        x1.setBalance(1000);
        x1.setPassword("a1");
        user_list.add(x1);
        ccc002user x2 = new ccc004business();
        x2.setName("a1");
        x2.setSex("男");
        x2.setTel(123456);
        x2.setAccount("a1");
        x2.setBalance(1000);
        x2.setPassword("a1");
        user_list.add(x2);
        List<ccc001movie> demo1 = new ArrayList<>();
        ccc001movie m1 = new ccc001movie();
        m1.setMovie_name("m1");
        m1.setMovie_price(100);
        m1.setMovie_actor("aa");
        m1.setMovie_time("2022年4月5日15:02:08");
        m1.setMovie_score(0);
        m1.setMovie_remain_tickets(200);
        demo1.add(m1);
        movie_list.put((ccc004business) x2, demo1);

    }

    public static void main(String[] args) {
        // add_user();


        system_interface();


    }

    public static void add_user() {
        Scanner demo = new Scanner(System.in);
        System.out.println("请输入用户类型：");
        System.out.println("1为商家，2为消费者");
        int user_type = demo.nextInt();
        switch (user_type) {
            case 1:
                System.out.println("当前为商家类型");
                add_business();
                break;
            case 2:
                System.out.println("当前为用户类型");
                add_customer();
                break;
            default:
                break;
        }
    }

    public static void add_business() {
        List<ccc001movie> x = new ArrayList<>();
        ccc004business x1 = new ccc004business();
        Scanner demo = new Scanner(System.in);
        System.out.println("请输入用户地址");
        String demo1 = demo.nextLine();
        x1.setAddress(demo1);
        System.out.println("请输入商店名称");
        String demo2 = demo.nextLine();
        x1.setShop_name(demo2);
        movie_list.put(x1, x);
        add_all_user(x1);
    }

    public static void add_customer() {
        List<ccc003customer> x = new ArrayList<>();
        ccc003customer x1 = new ccc003customer();
        Scanner demo = new Scanner(System.in);
        add_all_user(x1);
    }

    public static void add_all_user(ccc002user x) {
        Scanner x1 = new Scanner(System.in);
        System.out.println("请输入登录名称：");
        x.setAccount(x1.nextLine());
        System.out.println("请输入登录密码：");
        x.setPassword(x1.nextLine());
        System.out.println("请输入用户性别：");
        x.setSex(x1.nextLine());
        System.out.println("请进行实名认证：");
        x.setName(x1.nextLine());
        // /^[1-9]\d{5}(?:18|19|20)\d{2}(?:0\d|10|11|12)(?:0[1-9]|[1-2]\d|30|31)\d{3}[\dXx]$/
        System.out.println("请输入电话：");
        x.setTel(x1.nextInt());
        // /^\d{3}-\d{8}$|^\d{4}-\d{7}$/
        System.out.println("请输入余额：");
        x.setBalance(x1.nextInt());
        user_list.add(x);
    }

    public static void add_movie(List<ccc001movie> x) {
        ccc001movie x1 = new ccc001movie();
        System.out.println("请输入电影名称：");
        x1.setMovie_name(de_scanner.nextLine());
        System.out.println("请输入电影主演：");
        x1.setMovie_actor(de_scanner.nextLine());
        System.out.println("请输入电影时间：");
        x1.setMovie_time(de_scanner.nextLine());
        System.out.println("请输入电影票价：");
        x1.setMovie_price(de_scanner.nextInt());
        System.out.println("请输入电影分数：");
        x1.setMovie_score(de_scanner.nextInt());
        x.add(x1);
        System.out.println("电影名称" + "\t" + "主演" + "\t" + "时间" + "\t" + "票价" + "\t" + "分数");
        System.out.println(x1.getMovie_name() + "\t" + x1.getMovie_actor() + "\t" + x1.getMovie_time() + "\t" + x1.getMovie_price() + "\t" + x1.getMovie_score());
        System.out.println("添加完毕");
    }

    public static void system_interface() {
        while (true) {
            System.out.println("============请选择要进行的操作============");
            System.out.println("1.账号登录");
            System.out.println("2.账号注册");
            System.out.println("3.退出系统");
            String demo_command = de_scanner.nextLine();
            switch (demo_command) {
                case "1":
                    acc_login();
                    // break;
                    return;
                case "2":
                    add_user();
                    break;
                case "3":
                    System.out.println("感谢使用，系统退出中……");
                    break;
                default:
                    System.out.println("指令有误，请重新输入");
                    break;
            }
        }
    }

    public static void acc_login() {
        while (true) {
            System.out.println("============请输入账号密码============");
            System.out.println("账号：");
            String acc = de_scanner.nextLine();
            System.out.println("密码：");
            String paw = de_scanner.nextLine();
            user_list.forEach(s -> {
                if (s.getAccount().equals(acc) && s.getPassword().equals(paw)) {
                    String title = s.getSex().equals("男") ? "先生" : "女士";
                    System.out.println("登录成功，欢迎" + s.getName() + title + "，正在进入操作界面……");
                    login_user = s;
                    LOGGER.info("账号登录");//也是通过定义常量的方式来展示结果
                    info_show(login_user);
                    return;
                } else {
                    System.out.println("请检查账号密码");
                    return;
                }
            });
        }
    }

    public static void info_show(ccc002user x) {
        while (true) {
            System.out.println("============请选择操作============");
            System.out.println("0.展示用户信息");
            System.out.println("1.展示全部影片信息");
            System.out.println("2.查询电影");
            System.out.println("3.电影评分");
            System.out.println("4.电影购票");
            System.out.println("5.退出系统");
            if (x instanceof ccc004business) {
                // System.out.println("5.退出系统");
                System.out.println("6.添加电影");
                System.out.println("7.下架电影");
                System.out.println("8.修改电影信息");
                System.out.println("9.查看名下排片");
                // System.out.println("10.展示商家信息");
            }
            String command = de_scanner.nextLine();
            select(command, x);
            // 购票成功以后，这里会执行两遍
        }
    }

    public static void select(String command, ccc002user x) {
        switch (command) {
            case "0":
                show_login_acc_info(login_user);
                break;
            case "1":
            case "2":
                show_all_movies(login_user, Integer.parseInt(command));
                break;
            case "3":
            case "4":
                change_movie_info(Integer.parseInt(command));
                break;
            case "5":
                System.out.println("感谢使用");
                System.exit(0);
                break;
            default:
                break;
        }
        if (x instanceof ccc004business) {
            List<ccc001movie> demo = movie_list.get(x);
            switch (command) {
                case "6":
                    add_movie(demo);
                    break;
                case "7":
                case "8":
                    del_movie(demo, Integer.parseInt(command));
                    break;
                case "9":
                    show_acc_moives(login_user);
                    break;
                default:
                    break;
            }
        }
        System.out.println("------------------------------------------------");
    }

    private static void change_movie_info(int command) {
        if (movie_list.isEmpty()) {
            System.out.println("暂无电影");
            return;
        }
        System.out.println("请输入电影名称：");
        String change_title = de_scanner.nextLine();

        for (Map.Entry<ccc004business, List<ccc001movie>> m : movie_list.entrySet()) {
            for (ccc001movie m1 : m.getValue()) {
                if (m1.getMovie_name().contains(change_title)) {// ee的标准，别这么low
                    switch (command) {
                        case 3:
                            System.out.println("请输入电影评分：");
                            int s1 = de_scanner.nextInt();
                            m1.setMovie_score(s1);
                            System.out.println("评分成功");
                            return;
                        case 4:
                            System.out.println("请确定购票数量：");
                            int num = de_scanner.nextInt();
                            int num_origin = m1.getMovie_remain_tickets();
                            m1.setMovie_remain_tickets(num_origin - num);
                            System.out.println("剩余电影票：" + m1.getMovie_remain_tickets());
                            // ------------------
                            double cost = BigDecimal.valueOf(m1.getMovie_price()).multiply(BigDecimal.valueOf(num)).doubleValue();
                            //num*m1.getMovie_price(),
                            // 上面只能得到不精准的数据，所以需要bigdecimal来包装
                            double user_balance = login_user.getBalance();
                            login_user.setBalance(user_balance - cost);
                            System.out.println("花费" + cost + "元");
                            System.out.println("当前用户账户金额：" + login_user.getBalance());
                            // ------------------
                            double boss_balance = m.getKey().getBalance();
                            m.getKey().setBalance(boss_balance + cost);
                            System.out.println("老板账户余额：" + m.getKey().getBalance());
                            System.out.println("购票成功");
                            return;
                        default:
                            break;
                    }
                }
            }
        }

    }

    private static void show_all_movies(ccc002user login_user, int command) {
        movie_list_exist();
        for (Map.Entry<ccc004business, List<ccc001movie>> demo : movie_list.entrySet()) {
            System.out.println("电影名称" + "\t" + "主演" + "\t" + "时间" + "\t" + "票价" + "\t" + "分数");
            List<ccc001movie> demo1 = demo.getValue();
            for (ccc001movie result : demo1) {
                if (command == 1) {

                    System.out.println(result.getMovie_name() + "\t" + result.getMovie_actor() + "\t" + result.getMovie_time() + "\t" + result.getMovie_price() + "\t" + result.getMovie_score());

                } else if (command == 2) {
                    System.out.println("请输入查询名称：");
                    String query_name = de_scanner.nextLine();
                    if (result.getMovie_name().contains(query_name)) {
                        System.out.println("找到了结果：");
                        System.out.println("电影名称" + "\t" + "主演" + "\t" + "时间" + "\t" + "票价" + "\t" + "分数");
                        System.out.println(result.getMovie_name() + "\t" + result.getMovie_actor() + "\t" + result.getMovie_time() + "\t" + result.getMovie_price() + "\t" + result.getMovie_score());
                    }
                }
            }
        }

    }

    private static void movie_list_exist() {
        if (movie_list.isEmpty()) {
            System.out.println("暂无电影");
            return;
        }
        // 选择评分和查询，返回结果以后，不会结束方法的运行，
        // 因为结束的是这个方法，而不是评分的方法
        // ，进而导致case穿透出现失效的情况
        // 这种问题就要从源代码去解决
    }

    private static void del_movie(List<ccc001movie> demo, int command) {
        movie_list_exist();

        // 这里应该做电影存在的判断，没做
        System.out.println("请输入电影名称：");
        String change_title = de_scanner.nextLine();
        for (ccc001movie m : demo) {
            // if (m.getMovie_name().equals(change_title)) {
            if (m.getMovie_name().contains(change_title)) {// ee的标准，别这么low
                //contains只要包含就可以，比如名称abc，只要输入a，结果就是true
                if (command == 7) {
                    System.out.println("确定要下架电影" + m.getMovie_name() + "?Y/N");
                    String s = de_scanner.nextLine().equals("Y") ? "成功" : "取消";
                    demo.remove(m);
                    System.out.println("下架" + s);
                    LOGGER.warn("下架了一部电影");
                    return;
                } else if (command == 8) {
                    System.out.println("请输入需要修改的信息：");
                    int change_price = de_scanner.nextInt();
                    m.setMovie_price(change_price);
                    System.out.println("修改成功！");
                    System.out.println("电影名称" + "\t" + "主演" + "\t" + "时间" + "\t" + "票价" + "\t" + "分数");
                    System.out.println(m.getMovie_name() + "\t" + m.getMovie_actor() + "\t" + m.getMovie_time() + "\t" + m.getMovie_price() + "\t" + m.getMovie_score());
                    return;
                }
            }
        }
    }

    private static void show_acc_moives(ccc002user x) {
        movie_list_exist();

        List<ccc001movie> demo = movie_list.get(x);
        if (!demo.isEmpty()) {
            System.out.println("电影名称" + "\t" + "主演" + "\t" + "时间" + "\t" + "票价" + "\t" + "分数");
            for (ccc001movie x1 : demo) {
                System.out.println(x1.getMovie_name() + "\t" + x1.getMovie_actor() + "\t" + x1.getMovie_time() + "\t" + x1.getMovie_price() + "\t" + x1.getMovie_score());
            }
            System.out.println("展示完毕");
        } else {
            System.out.println("买几部电影再说吧");
        }
    }

    private static void show_login_acc_info(ccc002user x) {
        System.out.println("当前用户的名称：" + x.getName());
        System.out.println("当前用户的性别：" + x.getSex());
        System.out.println("当前用户的电话：" + x.getTel());
        System.out.println("当前用户的余额：" + x.getBalance());

        if (x instanceof ccc004business) {
            System.out.println("当前用户的店铺名称:" + ((ccc004business) x).getShop_name());
            System.out.println("当前用户的店铺地址:" + ((ccc004business) x).getAddress());
            Collection<List<ccc001movie>> movies = movie_list.values();
            // movies.forEach(s->s.);
        }
    }


}
