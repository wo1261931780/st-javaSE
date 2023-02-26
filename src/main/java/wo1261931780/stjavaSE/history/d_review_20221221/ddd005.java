package d_review_20221221;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by Intellij IDEA.
 * Project:st-java.github.io
 * Package:d_review_20221221
 *
 * @author liujiajun_junw
 * @Date 2022-12-14-03  星期四
 * @description
 */
public class ddd005 {
	public static void main(String[] args) {
		int number = 7;
		int[] scores = new int[number];
		Random x = new Random();
		for (int i = 0; i < number; i++) {
			int temper_score = x.nextInt(101);
			System.out.println("当前评委" + i + "给出的分数是：" + temper_score);
			scores[i] = temper_score;
		}
		Arrays.sort(scores);
		System.out.println(Arrays.toString(scores));
		int total = 0;
		for (int i = 1; i < scores.length - 1; i++) {
			total += scores[i];
		}
		System.out.println(total);
		System.out.println("最终成绩为:" + total / (number - 2));
	}
}
