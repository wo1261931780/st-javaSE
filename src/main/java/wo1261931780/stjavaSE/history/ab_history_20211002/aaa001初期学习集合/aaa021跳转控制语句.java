package wo1261931780.stjavaSE.history.ab_history_20211002.aaa001初期学习集合;

/**
 * Created by Intellij IDEA.
 * Project:st-javaSE
 * Package:wo1261931780.stjavaSE.history.ab_history_20211002.aaa001初期学习集合
 *
 * @author liujiajun_junw
 * @Date 2023-02-10-17  星期一
 * @description
 */
public class aaa021跳转控制语句 {
	public static void main(String[] args) {
		// 2021年12月16日11:50:52，补充学习，跳转关键字
		// 目标：理解break 和 continue的作用。
		// 场景：假如你又有老婆了，然后你犯错了，你老婆罚你做5天家务，每天都是洗碗。
		// 但是洗碗到第三天后心软了 原谅你了不用洗了
		for (int i654 = 0; i654 < 5; i654++) {
			System.out.println("快乐的洗碗~~~~");
			if (i654 == 2) {
				break; // 跳出并结束当前循环的执行~~
			}
		}

		// continue 跳出当前循环的当次执行，进入循环的下一次
		// 场景：假如你又有老婆了，然后你犯错了，你老婆罚你做5天家务，
		// 每天都是洗碗。但是洗碗到第三天后心软了 原谅你了不用洗了 但是依然不解恨 继续洗第4天 5天
		for (int i1654 = 1; i1654 <= 5; i1654++) {
			if (i1654 == 3) {
				continue; // 立即跳出当次执行，进入循环的下一次！
			}
			System.out.println("洗碗：" + i1654);
		}
	}
}
