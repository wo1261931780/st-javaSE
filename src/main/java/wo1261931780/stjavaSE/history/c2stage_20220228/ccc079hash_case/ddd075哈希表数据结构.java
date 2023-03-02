package wo1261931780.stjavaSE.history.c2stage_20220228.ccc079hash_case;

public class ddd075哈希表数据结构 {
	public static void main(String[] args) {
		// 我有五个数据：hello，world，java，通话，测试
		// 默认的哈希表长度为16，所以默认空位为0-15
		// 经过计算，得出了hello和world的哈希值，
		// 对哈希值进行取余，xxx%16=2，所以hello和world两个都储存到2号位置上
		// 但是2号位置只有一个，所以二者先进行哈希值比较，结果不同，所以同时储存
		// 展现的结果是：hello和world同时储存到2号位置上
		// 如果哈希值不相同，那么直接存，
		// 相同，就继续比较内容，内容相同则直接跳过
	}
}
