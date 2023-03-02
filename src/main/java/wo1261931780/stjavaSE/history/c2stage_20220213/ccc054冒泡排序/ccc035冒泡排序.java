package wo1261931780.stjavaSE.history.c2stage_20220213.ccc054冒泡排序;

import lombok.extern.slf4j.Slf4j;

/**
 * 冒泡排序：
 * <p>
 * 一种排序的方式，对要进行排序的数据中相邻的数据进行两两比较，将较大的数据放在后面，
 * <p>
 * 依次对所有的数据进行操作，直至所有数据按要求完成排序
 */
@Slf4j
public class ccc035冒泡排序 {
	public static void main(String[] args) {
		int[] arr = {12, 4, 165, 1, 564, 864, 1, 5, 7, 8};
		log.info("start-----------");
		for (int x = 0; x < arr.length - 1; x++) {
			algorithm(arr, x);
		}
	}

	/**
	 * 冒泡排序
	 *
	 * @param arr 数组
	 * @param x   指针
	 */
	public static void algorithm(int[] arr, int x) {
		int temp;
		for (int x1 = 0; x1 < arr.length - x - 1; x1++) {
			if (arr[x1] > arr[x1 + 1]) {
				temp = arr[x1];
				arr[x1] = arr[x1 + 1];
				arr[x1 + 1] = temp;
			}
		}
	}
}
