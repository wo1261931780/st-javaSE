package wo1261931780.stjavaSE.history.c2stage_20220202.ccc035object_api_stringbuilder;

public class ddd047stringbuilder_case {
	public static void main(String[] args) {
		int[] x = {1, 21, 231, 5, 156};
		show(x);
	}

	public static String show(int[] x) {
		StringBuilder x1 = new StringBuilder("该数组内容为：[");
		// 首先要判断数组是否为空

		for (int i = 0; i < x.length; i++) {
			// if (i==x.length - 1) {
			//     x1.append(x[i]);
			// }else{
			//     x1.append(x[i]).append(",");
			// }
			// 上面的太啰嗦
			// StringBuilder xx = i == x.length - 1 ? x1.append(x[i]) : x1.append(x[i]).append(",");
			// 这里xx没有使用
			x1.append(x[i]).append(i == x.length - 1 ? "" : ",");
		}
		x1.append("]");
		// System.out.println(x1);
		// String s = x1.toString();
		// return s;
		return x1.toString();
	}
}
