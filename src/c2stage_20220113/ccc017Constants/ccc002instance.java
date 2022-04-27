package c2stage_20220113.ccc017Constants;

import java.util.Scanner;

public class ccc002instance {
    public static final int MOVE_UP = 1;
    public static final int MOVE_DOWN = 2;
    public static final int MOVE_LEFT = 3;
    public static final int MOVE_RIGHT = 4;
    // 使用常量，实现输入和输出的按键映射

    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        System.out.println("输入");
        int xx = x.nextInt();
        show(xx);
    }

    public static void show(int xx) {
        switch (xx) {
            case MOVE_UP:
                System.out.println("up");
                break;
            case MOVE_DOWN:
                System.out.println("down");
                break;
            case MOVE_LEFT:
                System.out.println("left");
                break;
            case MOVE_RIGHT:
                System.out.println("right");
                break;
            default:
                System.out.println("end");
        }
    }
}
