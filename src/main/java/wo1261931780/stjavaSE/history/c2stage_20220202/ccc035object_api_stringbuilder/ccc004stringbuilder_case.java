package c2stage_20220202.ccc035object_api_stringbuilder;

public class ccc004stringbuilder_case {
    public static void main(String[] args) {
        int[] x = {1, 21, 231, 5, 156};
        show(x);
    }

    public static String show(int[] x) {
        StringBuilder x1 = new StringBuilder("����������Ϊ��[");
        // ����Ҫ�ж������Ƿ�Ϊ��

        for (int i = 0; i < x.length; i++) {
            // if (i==x.length - 1) {
            //     x1.append(x[i]);
            // }else{
            //     x1.append(x[i]).append(",");
            // }
            // �����̫����
            // StringBuilder xx = i == x.length - 1 ? x1.append(x[i]) : x1.append(x[i]).append(",");
            // ����xxû��ʹ��
            x1.append(x[i]).append(i==x.length - 1 ?"":",");

        }
        x1.append("]");
        // System.out.println(x1);
        // String s = x1.toString();
        // return s;
        return x1.toString();
    }
}
