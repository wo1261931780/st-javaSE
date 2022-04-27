package ab往期学习2021年10月2日.bbb011商城案例;

import java.util.Scanner;

public class bbb004shopcar_getset {
    public static void main(String[] args) {
        bbb003商品类getset[] x = new bbb003商品类getset[100];
        while (true) {
            int i = Interface_root();
            switch (i) {
                case 1:
                    add(x);
                    break;
                case 2:
                    del(x);
                    break;
                case 3:
                    change(x);
                    break;
                case 4:
                    show(x);
                    settlement(x);
                    cls_all(x);
                    break;
                case 5:
                    cls_all(x);
                    break;
                default:
                    show(x);
                    System.out.println("请重新输入");
                    System.out.println("*****************************");
            }
        }
    }


    public static int Interface_root() {
        Scanner x = new Scanner(System.in);
        System.out.println("欢迎进入");
        System.out.println("1--添加商品");
        System.out.println("2--删除商品");
        System.out.println("3--修改商品信息");
        System.out.println("4--全部结算");
        System.out.println("5--清空购物车");
        System.out.println("--请输入对应指令--");
        int command = x.nextInt();
        System.out.println("*****************************");
        return command;
    }

    public static void add(bbb003商品类getset[] s) {
        Scanner goods = new Scanner(System.in);
        System.out.println("请输入商品名称：");
        String addname = goods.nextLine();
        System.out.println("请输入商品价格：");
        int addprice = goods.nextInt();
        System.out.println("请输入商品数量：");
        int addnum = goods.nextInt();
        System.out.println("请输入商品id：");
        int addid = goods.nextInt();
        bbb003商品类getset x = new bbb003商品类getset(addname, addprice, addnum, addid);
        for (int i = 0; i < s.length; i++) {
            if (s[i] == null) {
                s[i] = x;
                System.out.println("添加完毕");
                return;
            }
        }
    }

    public static void del(bbb003商品类getset[] s) {
        Scanner x = new Scanner(System.in);
        String delname = x.nextLine();
        for (int i = 0; i < s.length; i++) {
            if (s[i].getName().equals(delname)) {
                s[i] = null;
                System.out.println("删除成功");
                return;
            }
        }
        System.out.println("没有该商品，请重新输入");
    }

    public static void change(bbb003商品类getset[] s) {
        Scanner x = new Scanner(System.in);
        int chid = x.nextInt();
        for (int i = 0; i < s.length; i++) {
            if (s[i].getId() == chid) {
                System.out.println("请输入name：");
                s[i].setName(x.nextLine());
                System.out.println("请输入price：");
                s[i].setPrice(x.nextInt());
                System.out.println("请输入num：");
                s[i].setNum(x.nextInt());
                return;
            }
        }
        System.out.println("没有该商品，请重新输入");
    }

    public static void settlement(bbb003商品类getset[] s) {
        int tol = 0;
        for (int i = 0; i < s.length; i++) {
            if (s[i] == null) {
                break;
            } else {
                tol += s[i].getPrice() * s[i].getNum();
            }
        }
        System.out.println("总价格是：" + tol);
    }

    public static void cls_all(bbb003商品类getset[] s) {
        for (int i = 0; i < s.length; i++) {
            s[i] = null;
        }
        System.out.println("清空完成");
    }

    public static void show(bbb003商品类getset[] s) {
        System.out.println("id名" + "\t" + "名称" + "\t" + "价格" + "\t" + "数量");
        for (int i = 0; i < s.length; i++) {
            if (s[i] == null) {
                System.out.println("查询结束");
                return;
            } else {
                System.out.println(s[i].getId() + "\t\t" + s[i].getName() + "\t" + s[i].getPrice() + "\t" + s[i].getNum());
            }
        }
        // System.out.println("清空完成");
    }


}
