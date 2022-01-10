package abc往期学习2021年10月2日.bbb029储存然后遍历的操作;

import java.util.ArrayList;

public class bbb001集合和泛型 {
    public static void main(String[] args) {
        ArrayList x = new ArrayList();
        ArrayList<String> x1 = new ArrayList<>();//1.7开始，泛型后面的可以不写
        ArrayList<Integer> x2 = new ArrayList<>();
        ArrayList<Object> x3 = new ArrayList<>();//非要使用泛型，也必须填入object
    }
}
