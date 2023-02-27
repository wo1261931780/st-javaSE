package wo1261931780.stjavaSE.history.ab_history_20211002.aaa001初期学习集合;

public class aaa007三元运算符 {
	public static void main(String[] args) {
		// ceshi
		int tiger1 = 100;
		int tiger2 = 200;
		//        重量是否相等
		boolean zl = tiger1 == tiger2 ? true : false;
		// 三元运算符的含义：
		// int weight                  = t1==t2       ?    true:false;
		// 定义int类型的weight,结果等于右边=判断t1是否等于t2，是，就输出true，否则输出否。
		System.out.println(zl);
		// 1号比较重
		// boolean max = tiger1 > tiger2 ? true : false;
		// 输出结果
		// System.out.println("shifouxiangdeng:"+zl);
		// System.out.println("1hao:"+max);
		System.out.println("-------------");
		int h1 = 984231;
		int h2 = 49842613;
		int h3 = 9846231;
		int taller = h1 > h2 ? h1 : h2;
		int tallst = taller > h3 ? taller : h3;
		// 问号右边，可以是true/false，也可以是两个具体表达式
		System.out.println("max:" + tallst);
		// 2021年12月15日23:45:01，补充知识
		System.out.println("-------------拓展知识-------------");
		int i = 1;
		int j = 2;
		int k = 3;
		int rsMax1 = i > j ? (i > k ? i : k) : (j > k ? j : k);
		// 三个数据比较直接用一行代码表示

		System.out.println(rsMax1);
	}
}
