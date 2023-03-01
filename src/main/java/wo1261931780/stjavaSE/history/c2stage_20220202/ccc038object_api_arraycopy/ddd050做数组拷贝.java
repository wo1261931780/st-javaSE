package wo1261931780.stjavaSE.history.c2stage_20220202.ccc038object_api_arraycopy;

import java.util.Arrays;
// 3、做数组拷贝（了解）

/**
 * arraycopy(Object src,  int  srcPos,
 * Object dest, int destPos,
 * int length)
 * 参数一：被拷贝的数组
 * 参数二：从哪个索引位置开始拷贝
 * 参数三：复制的目标数组
 * 参数四：粘贴位置
 * 参数五：拷贝元素的个数
 */
public class ddd050做数组拷贝 {
	public static void main(String[] args) {
		int[] x = new int[6];
		int[] x1 = {1, 1, 1, 2, 1, 3, 1, 4};
		System.arraycopy(x1, 2, x, 3, 2);
		//----------目标数组，起始位，粘贴到x数组，粘贴索引3，复制长度2
		System.out.println(Arrays.toString(x));// 注意这里有s，是Arrays
	}
}
