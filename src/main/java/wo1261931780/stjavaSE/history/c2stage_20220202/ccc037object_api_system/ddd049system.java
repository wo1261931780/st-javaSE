package wo1261931780.stjavaSE.history.c2stage_20220202.ccc037object_api_system;

import lombok.extern.slf4j.Slf4j;

/**
 * 目标：System系统类的使用。
 * <p>
 * System代表当前系统。（虚拟机系统）
 * <p>
 * 静态方法：
 * 1.public static void exit(int status):终止JVM虚拟机，非0是异常终止。
 * <p>
 * 2.public static long currentTimeMillis():获取当前系统此刻时间毫秒值。(重点)
 * <p>
 * 3.可以做数组的拷贝。
 * <p>
 * arraycopy(Object var0, int var1, Object var2, int var3, int var4);
 * <p>
 * 参数一：原数组
 * <p>
 * 参数二：从原数组的哪个位置开始赋值。
 * <p>
 * 参数三：目标数组
 * <p>
 * 参数四：赋值到目标数组的哪个位置
 * <p>
 * 参数五：赋值几个。
 */
@Slf4j
public class ddd049system {
	/**
	 * 不能被实例化==不能new一个新的对象
	 */
	public static void main(String[] args) {
		log.info("----------------");
		// System.exit(0);
		// 终止java虚拟机，非0则异常退出
		// system命令是对虚拟机的命令，System.命令即可
		log.info(String.valueOf(System.currentTimeMillis()));
		// 这个是和1970年之间的毫秒值
		log.info(System.currentTimeMillis() * 1.0 / 60 / 3600 / 24 / 30 / 365 + "年");
		double x = System.currentTimeMillis() * 1.0 / 60 / 3600 / 24 / 30 / 365;
		log.info(x + "年");

		log.info("****************");
		long x1 = System.currentTimeMillis();
		for (int i = 0; i < 10000; i++) {
			log.info(String.valueOf(i));
		}
		long x2 = System.currentTimeMillis();
		log.info("total:" + (x2 - x1) + "ms");
		// 简单说明：
		// log.info();也是system的输出语句
		// System.currentTimeMillis();是类似语句
		// System属于不需要导包的类型
	}
}
