package wo1261931780.stjavaSE.history.c2stage_20220213.ccc051正则表达式;

/**
 * Created by Intellij IDEA.
 * Project:index.pb
 * Package:c2stage_20220213.ccc051正则表达式
 * User:  wo1261931780@gmail.com
 * Time:  2022-02-16-54  星期日
 */
public class ccc004字符串分割 {
	public static void main(String[] args) {
		String x = "刘佳珺111刘佳珺asd刘佳珺adasdasd111asdadas1a1sda32";
		String[] demo = x.split("\\w+");
		for (int i = 0; i < demo.length; i++) {
			System.out.println(demo[i]);
		}
		String showStr = x.replaceAll("\\w+", " ");
		System.out.println(showStr);
	}
}
