package wo1261931780.stjavaSE.history.ab_history_20211002.bbb039ATM案例;

import java.util.ArrayList;
import java.util.Scanner;

public class bbb075运行 {
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        ArrayList<bbb074账户类> a1 = new ArrayList();
// 相比正式的系统来说，还是有很多问题，比如没有做极限情况的设置
// 也没有做转账系统，
        while (true) {

            int chooseResult = interfaceStart(scanner1);
            if (chooseResult == 1) {
                bbb074账户类 accountInfo = interfaceLogin(scanner1, a1);
                out:
                while (true) {
                    int loginChoose = interfaceAccountOperate(scanner1, a1, accountInfo);
                    switch (loginChoose) {
                        case 1:
                            querydemo(scanner1, a1, accountInfo);
                            break;
                        case 2:
                            deposit(scanner1, a1, accountInfo);
                            break;
                        case 3:
                            interfaceCash(scanner1, a1, accountInfo);
                            break;
                        case 4:
                            transferdemo(scanner1, a1, accountInfo);
                            break;
                        case 5:
                            changeAccountDetail(scanner1, a1, accountInfo);
                            break;
                        case 6:
                            break out;
                        case 7:
                            logoutAccount(scanner1, a1, accountInfo);
                            // break out;
                            return;//直接返回就可以，不需要break
                        default:
                            System.out.println("不要调皮");

                    }
                }
            } else if (chooseResult == 2) {
                interfaceRegister(scanner1, a1);
            } else {
                break;
            }
        }
    }

    public static int interfaceStart(Scanner scanner1) {
        System.out.println("=====================请输入命令=====================");
        System.out.println("1.登录账户");
        System.out.println("2.注册账户");
        System.out.println("请选择操作：");
        int startInt = scanner1.nextInt();
        return startInt;
    }

    public static bbb074账户类 interfaceLogin(Scanner scanner1, ArrayList<bbb074账户类> a) {
        // bbb074账户类 account_demo = new bbb074账户类();
        Scanner x1 = new Scanner(System.in);
        System.out.println("=====================欢迎进入登录页面=====================");
        for (int i1 = 0; i1 < 3; i1++) {
            System.out.println("请输入账户名称：");
            String loginAccount = x1.nextLine();
            System.out.println("请输入账户密码：");
            String loginPassword = x1.nextLine();
            for (int i = 0; i < a.size(); i++) {
                if (a.get(i).getAccountName().equals(loginAccount) && a.get(i).getAccountpassword().equals(loginPassword)) {
                    System.out.println("登录成功");
                    return a.get(i);
                }
            }
            System.out.println("信息错误，请重新输入,当前还有" + (2 - i1) + "次机会");
        }
        System.out.println("次数用完，你是loser");
        return null;
    }

    public static void interfaceRegister(Scanner scanner1, ArrayList<bbb074账户类> a) {
        bbb074账户类 accountDemo = new bbb074账户类();
        System.out.println("=====================欢迎进入开户操作=====================");
        Scanner xx = new Scanner(System.in);
        System.out.println("请输入账户名称：");
        String s1 = xx.nextLine();
        accountDemo.setAccountName(s1);
        Scanner xx2 = new Scanner(System.in);

        System.out.println("请输入账户密码：");
        String s2 = xx2.nextLine();
        accountDemo.setAccountpassword(s2);
        // System.out.println("请设置取现额度：");

        // int s3 = xx2.nextInt();
        // account_demo.setAccountcashlimit(s3);
        accountDemo.setAccountcashlimit(3000);
        a.add(accountDemo);
        System.out.println("创建完毕，请重新登陆");
        // return account_demo;
    }

    public static int interfaceAccountOperate(Scanner scanner1, ArrayList<bbb074账户类> a, bbb074账户类 info) {
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
        System.out.println("5.修改信息");
        System.out.println("6.退出");
        System.out.println("7.注销账户");
        System.out.println("请选择操作：");
        int accountOperateInt = scanner1.nextInt();
        return accountOperateInt;
    }

    public static void querydemo(Scanner scanner1, ArrayList<bbb074账户类> a, bbb074账户类 info) {
        System.out.println("=====================请输入账号密码=====================");
        // 这里合理的逻辑是，输入密码，校验是否正确，正确就给出信息
        // 但问题在于，要获取密码就必须得到对应的对象地址，集合才能校验
        for (int i = 0; i < 3; i++) {
            String i1 = scanner1.nextLine();
            if (info.getAccountpassword().equals(i1)) {
                System.out.println("账号名称：" + info.getAccountName());
                System.out.println("账号索引：" + info.getAccountNumber());
                System.out.println("账号余额：" + info.getAccountbalance());
                System.out.println("账号取现额度：" + info.getAccountcashlimit());
                return;
            }
            System.out.println("信息错误，请重新输入,当前还有" + (2 - i) + "次机会");
        }
        System.out.println("次数用完，你是loser");
        return;
    }

    public static void deposit(Scanner scanner1, ArrayList<bbb074账户类> a, bbb074账户类 info) {
        System.out.println("=====================请输入存款信息=====================");
        for (int i = 0; i < 3; i++) {
            String i1 = scanner1.nextLine();
            if (info.getAccountpassword().equals(i1)) {
                System.out.println("请输入金额：");//这里必须是正数,也需要做判断，不过小项目暂时不考虑这么多
                int cashBalance = scanner1.nextInt() + info.getAccountbalance();
                info.setAccountbalance(cashBalance);
                System.out.println("账号名称：" + info.getAccountName());
                System.out.println("账号索引：" + info.getAccountNumber());
                System.out.println("账号余额：" + info.getAccountbalance());
                System.out.println("账号取现额度：" + info.getAccountcashlimit());
                return;
            }
            System.out.println("信息错误，请重新输入,当前还有" + (2 - i) + "次机会");
        }
        System.out.println("次数用完，你是loser");
        return;


    }

    public static void interfaceCash(Scanner scanner1, ArrayList<bbb074账户类> a, bbb074账户类 info) {
        System.out.println("=====================请输入取款命令=====================");
        System.out.println("请输入取款金额：");
        int cashOutNum = scanner1.nextInt();
        if (cashOutNum > info.getAccountcashlimit() || cashOutNum > info.getAccountbalance()) {
            System.out.println("超过额度，请重新输入");
        } else {
            int cashNow = info.getAccountbalance() - cashOutNum;
            info.setAccountbalance(cashNow);
            System.out.println("cash success,当前余额" + info.getAccountbalance());
        }
        // return cash_out_num;
    }

    public static void transferdemo(Scanner scanner1, ArrayList<bbb074账户类> a, bbb074账户类 info) {
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

    public static void changeAccountDetail(Scanner scanner1, ArrayList<bbb074账户类> a, bbb074账户类 info) {
        System.out.println("=====================请输入修改信息=====================");
        Scanner x1 = new Scanner(System.in);
        System.out.println("请输入账户名：");
        info.setAccountName(x1.nextLine());
        System.out.println("请输入账户取现额度：");
        info.setAccountcashlimit(x1.nextInt());
        System.out.println("修改成功");
        // System.out.println("请输入账户名：");
    }

    public static void logoutAccount(Scanner scanner1, ArrayList<bbb074账户类> a, bbb074账户类 info) {
        System.out.println("=====================请输入账号密码=====================");
        Scanner x1 = new Scanner(System.in);
        while (true) {
            System.out.println("密码：");
            if (info.getAccountpassword().equals(x1.nextLine())) {
                System.out.println("确定删除账号？1确定");
                if (x1.nextInt() == 1) {
                    for (int i = 0; i < a.size(); i++) {
                        if (a.get(i) == info) {
                            a.remove(i);
                            System.out.println("删除成功");
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
