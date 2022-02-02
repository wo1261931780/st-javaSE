package c2stage_20220202.ccc038object_api_arraycopy;

import java.util.Arrays;

public class ccc001 {
    public static void main(String[] args) {
        int[] x=new int[6];
        int[] x1={1,1,1,2,1,3,1,4};
        System.arraycopy(x1,2,x,3,2);
        //----------目标数组，起始位，粘贴到x数组，粘贴索引3，复制长度2
        System.out.println(Arrays.toString(x));//注意这里有s，是Arrays



    }
}
