package c2stage_20220202.ccc036object_api_math;
//public static int abs?(int a)�����ز����ľ���ֵ

//public static double ceil?(double a)�����ش��ڻ���ڲ�������Сdoubleֵ������һ������

//public static double floor?(double a)������С�ڻ���ڲ��������doubleֵ������һ������

//public static int round?(float a)�������������뷵����ӽ�������int

//public static int max?(int a,int b)����������intֵ�еĽϴ�ֵ

//public static int min?(int a,int b)����������intֵ�еĽ�Сֵ(��ѧ)

//public static double pow?(double a,double b)������a��b���ݵ�ֵ

//public static double random?()������ֵΪdouble����ֵ��[0.0,1.0)

/**
 Ŀ�꣺Math���ʹ�á�
 Math��������ѧ���㡣
 Math���еķ���ȫ���Ǿ�̬������ֱ�����������ü��ɡ�
 ������
 ������                                          ˵��
 public static int abs(int a)                   ��ȡ����a�ľ���ֵ��
 public static double ceil(double a)            ����ȡ��
 public static double floor(double a)           ����ȡ��
 public static double pow(double a, double b)   ��ȡa��b����
 public static long round(double a)             ��������ȡ��
 С�᣺
 ��ס��
 */

public class ccc033math {
    public static void main(String[] args) {
        //12�����ؾ���ֵ
        System.out.println(Math.abs(12));
        System.out.println(Math.abs(-12));
        System.out.println("----");
        //13�����ء�=x
        System.out.println(Math.ceil(12.1));
        //-12���ء�=x
        System.out.println(Math.ceil(-12.1));
        System.out.println("----");
        //12�����ء�=x
        System.out.println(Math.floor(12.1));
        //-13�����ء�=x
        System.out.println(Math.floor(-12.1));
        System.out.println("----");
        //12.0����������
        System.out.println(Math.round(12.1));
        //-13.0����������
        System.out.println(Math.round(-12.1));
        //-13��F��ʾ��float����
        System.out.println(Math.round(-12.1F));
        System.out.println("----");
        //12.2���ϴ�ֵ
        System.out.println(Math.max(12.1, 12.2));
        //12.1����Сֵ
        System.out.println(Math.min(12.1, 12.2));
        System.out.println("----");
        //8������2��3�η�
        System.out.println(Math.pow(2, 3));
        System.out.println("----");
        //[0.0-1.0)֮��������,����0.0��������1.0
        System.out.println(Math.random());
        //ȡ��
        System.out.println((int) (Math.random() * 100));
        //System.out.println(Math.abs(-55));

        // ����Ҫ3-9���������
        // ����-3���͵õ�0-6�������
        // ����ֱ��random������ҿ�
        // Math.random()*7;�õ�һ��0-7������ҿ�
        // Ϊ�˵õ�0-6����Ҫint���ͣ����Խ���һ��ǿת
        // (int) Math.random()*7
        // ���ھ��ܵõ�0-6
        // int i = (int) Math.random() * 7 + 3;
        // i����3-9
    }

}