package c2stage_20220202.ccc038object_api_arraycopy;

import java.util.Arrays;
// 3�������鿽�����˽⣩
/**
 arraycopy(Object src,  int  srcPos,
 Object dest, int destPos,
 int length)
 ����һ��������������
 �����������ĸ�����λ�ÿ�ʼ����
 �����������Ƶ�Ŀ������
 �����ģ�ճ��λ��
 �����壺����Ԫ�صĸ���
 */
public class ccc001 {
    public static void main(String[] args) {
        int[] x=new int[6];
        int[] x1={1,1,1,2,1,3,1,4};
        System.arraycopy(x1,2,x,3,2);
        //----------Ŀ�����飬��ʼλ��ճ����x���飬ճ������3�����Ƴ���2
        System.out.println(Arrays.toString(x));//ע��������s����Arrays
    }
}