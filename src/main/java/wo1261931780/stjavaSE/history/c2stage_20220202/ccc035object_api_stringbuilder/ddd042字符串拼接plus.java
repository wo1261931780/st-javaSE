package wo1261931780.stjavaSE.history.c2stage_20220202.ccc035object_api_stringbuilder;

public class ddd042字符串拼接plus {
	public static void main(String[] args) {
		//         int[] arr={1,5,41,32,154,564,654,86};
		//         StringBuilder xx=new StringBuilder("[");
		//         for (int x=0;x<arr.length;x++){
		//             if (x==arr.length-1) {
		//                 xx.append(arr[x]+"]");
		//             }else {
		//                 xx.append(arr[x]+",");
		//             }
		//         }
		// //        System.out.println(xx+"]");
		// //        xx.append("]");
		//         System.out.println(xx);
		//         String a=xx.toString();
		//         System.out.println(a);
		System.out.println("开始执行");
		int[] x = {1, 2, 2, 13, 1, 2, 5, 4, 5};
		StringBuilder x1 = new StringBuilder();
		x1.append("[");
		for (int i = 0; i < x.length; i++) {
			if (i == x.length - 1) {
				x1.append(x[i]).append("]");
			} else {
				x1.append(x[i]).append(",");
			}
		}
		// x1.append("]");
		System.out.println(x1);
	}
}
