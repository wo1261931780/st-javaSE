package abc往期学习2021年10月2日.bbb039ATM案例;

import java.util.ArrayList;
import java.util.Scanner;

public class bbb002运行 {
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        ArrayList<bbb001账户类> a1 = new ArrayList();
        int choose_result = interface_start(scanner1);

        while (true) {
            if (choose_result == 1) {
                bbb001账户类 account_info = interface_login(scanner1, a1);
                out:
                while (true) {
                    int login_choose = interface_account_operate(scanner1, a1, account_info);
                    switch (login_choose) {
                        case 1:
                            querydemo(scanner1, a1, account_info);
                            break;
                        case 2:
                            deposit(scanner1, a1, account_info);
                            break;
                        case 3:
                            interface_cash(scanner1, a1, account_info);
                            break;
                        case 4:
                            transferdemo(scanner1, a1, account_info);
                            break;
                        case 5:
                            change_account_detail(scanner1, a1, account_info);
                            break;
                        case 6:
                            break out;
                        case 7:
                            logout_account(scanner1, a1, account_info);
                            break;
                        default:
                            System.out.println("不要调皮");

                    }
                }
            } else if (choose_result == 2) {
                interface_register(scanner1, a1);
            } else {
                break;
            }
        }
    }

    public static int interface_start(Scanner scanner1) {
        System.out.println("=====================请输入命令=====================");
        System.out.println("1.登录账户");
        System.out.println("2.注册账户");
        System.out.println("请选择操作：");
        int start_int = scanner1.nextInt();
        return start_int;
    }

    public static bbb001账户类 interface_login(Scanner scanner1, ArrayList<bbb001账户类> a) {
        // bbb001账户类 account_demo = new bbb001账户类();
        System.out.println("=====================欢迎进入登录页面=====================");
        for (int i1 = 0; i1 < 3; i1++) {
            System.out.println("请输入账户名称：");
            String login_account = scanner1.nextLine();
            System.out.println("请输入账户密码：");
            String login_password = scanner1.nextLine();
            for (int i = 0; i < a.size(); i++) {
                if (a.get(i).getAccountName().equals(login_account) && a.get(i).getAccountpassword().equals(login_password)) {
                    System.out.println("登录成功");
                    return a.get(i);
                }
            }
            System.out.println("信息错误，请重新输入,当前还有" + (2 - i1) + "次机会");
        }
        System.out.println("次数用完，你是loser");
        return null;
    }

    public static void interface_register(Scanner scanner1, ArrayList<bbb001账户类> a) {
        bbb001账户类 account_demo = new bbb001账户类();
        System.out.println("=====================欢迎进入开户操作=====================");
        System.out.println("请输入账户名称：");
        String s1 = scanner1.nextLine();
        account_demo.setAccountName(s1);
        Scanner xx = new Scanner(System.in);
        Scanner xx2 = new Scanner(System.in);

        System.out.println("请输入账户密码：");
        String s2 = xx.nextLine();
        account_demo.setAccountpassword(s2);
        System.out.println("请设置取现额度：");

        int s3 = xx2.nextInt();
        account_demo.setAccountcashlimit(s3);
        a.add(account_demo);
        System.out.println("创建完毕，请重新登陆");
        // return account_demo;
    }

    public static int interface_account_operate(Scanner scanner1, ArrayList<bbb001账户类> a, bbb001账户类 info) {
        // String account_info = "";
        // for (int i = 0; i < a.size(); i++) {
        //     if (info == a.get(i).getAccountNumber()) {
        //         account_info = a.get(i).getAccountName();
        //     }
        // }
        // 我可以在上面直接用name作为返回数据，不需要这样多此一举

        System.out.println("=====================欢迎" + info.getAccountName() + "进入操作列表=====================");
        System.out.println("1.查询");
        System.out.println("2.存款");
        System.out.println("3.取款");
        System.out.println("4.转账");
        System.out.println("5.修改密码");
        System.out.println("6.退出");
        System.out.println("7.注销账户");
        System.out.println("请选择操作：");
        int account_operate_int = scanner1.nextInt();
        return account_operate_int;
    }

    public static void querydemo(Scanner scanner1, ArrayList<bbb001账户类> a, bbb001账户类 info) {
        int i1 = scanner1.nextInt();
        System.out.println("=====================请输入账号密码=====================");
        // 这里合理的逻辑是，输入密码，校验是否正确，正确就给出信息
        // 但问题在于，要获取密码就必须得到对应的对象地址，集合才能校验
        for (int i = 0; i < 3; i++) {
            if (info.getAccountpassword().equals(i1)) {
                System.out.println("账号名称：" + info.getAccountName());
                System.out.println("账号索引：" + info.getAccountNumber());
                System.out.println("账号余额：" + info.getAccountbalance());
                System.out.println("账号取现额度：" + info.getAccountcashlimit());
                return;
            }
            System.out.println("信息错误，请重新输入,当前还有" + (2 - i1) + "次机会");
        }
        System.out.println("次数用完，你是loser");
        return;
    }

    public static void deposit(Scanner scanner1, ArrayList<bbb001账户类> a, bbb001账户类 info) {
        int i1 = scanner1.nextInt();
        System.out.println("=====================请输入存款信息=====================");
        for (int i = 0; i < 3; i++) {
            if (info.getAccountpassword().equals(i1)) {
                System.out.println("请输入金额：");
                int cash_balance = scanner1.nextInt() + info.getAccountbalance();
                info.setAccountbalance(cash_balance);
                System.out.println("账号名称：" + info.getAccountName());
                System.out.println("账号索引：" + info.getAccountNumber());
                System.out.println("账号余额：" + info.getAccountbalance());
                System.out.println("账号取现额度：" + info.getAccountcashlimit());
                return;
            }
            System.out.println("信息错误，请重新输入,当前还有" + (2 - i1) + "次机会");
        }
        System.out.println("次数用完，你是loser");
        return;


    }

    public static void interface_cash(Scanner scanner1, ArrayList<bbb001账户类> a, bbb001账户类 info) {
        System.out.println("=====================请输入取款命令=====================");
        System.out.println("请输入取款金额：");
        int cash_out_num = scanner1.nextInt();
        if (cash_out_num > info.getAccountcashlimit() || cash_out_num > info.getAccountbalance()) {
            System.out.println("超过额度，请重新输入");
        } else {
            int cash_now = info.getAccountbalance() - cash_out_num;
            info.setAccountbalance(cash_now);
            System.out.println("cash success,当前余额" + info.getAccountbalance());
        }
        // return cash_out_num;
    }

    public static void transferdemo(Scanner scanner1, ArrayList<bbb001账户类> a, bbb001账户类 info) {
        System.out.println("=====================请输入转账信息=====================");
        int i = scanner1.nextInt();
        for (int i1 = 0; i1 < a.size(); i1++) {
            if (a.get(i).getAccountNumber() == i) {
                System.out.println("转账成功");
                info.setAccountbalance(info.getAccountbalance() - i);
                System.out.println("当前账户余额：" + info.getAccountbalance());
                return;
            }
        }
        System.out.println("无对应账户，请重新输入");
    }

    public static void change_account_detail(Scanner scanner1, ArrayList<bbb001账户类> a, bbb001账户类 info) {
        System.out.println("=====================请输入修改信息=====================");
        System.out.println("请输入账户名：");
        info.setAccountName(scanner1.nextLine());
        System.out.println("请输入账户取现额度：");
        info.setAccountcashlimit(scanner1.nextInt());
        System.out.println("修改成功");
        // System.out.println("请输入账户名：");
    }

    public static void logout_account(Scanner scanner1, ArrayList<bbb001账户类> a, bbb001账户类 info) {
        System.out.println("=====================请输入账号密码=====================");
        while (true) {
            System.out.println("密码：");
            if (info.getAccountpassword().equals(scanner1.nextLine())) {
                System.out.println("确定删除账号？");
                if (scanner1.nextInt() == 1) {
                    for (int i = 0; i < a.size(); i++) {
                        if (a.get(i) == info) {
                            a.remove(i);
                            return;
                        }
                    }
                } else {
                    return;
                }
            }
        }
    }
}
