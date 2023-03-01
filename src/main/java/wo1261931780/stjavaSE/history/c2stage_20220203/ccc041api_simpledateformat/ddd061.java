package wo1261931780.stjavaSE.history.c2stage_20220203.ccc041api_simpledateformat;

import lombok.extern.slf4j.Slf4j;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@Slf4j
public class ddd061 {
	public static void main(String[] args) throws ParseException {
		// 构建对象x1
		Date x1 = new Date();
		// 为了操作x1，我需要使用x的方法
		SimpleDateFormat x = new SimpleDateFormat();
		// 用完了之后，需要w来接收结果
		String w = x.format(x1);
		// 结果为：2021/5/10 下午4:58
		log.info(w);
		// ----------------------------------------------

		// Date x2=new Date(); 不需要新建一个时间
		SimpleDateFormat xx = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
		// 2021年05月10日 17:04:10
		String w2 = xx.format(x1);
		log.info(w2);
		log.info("-------------------");

		String ss = "1564年56月54日 12:54:87";
		SimpleDateFormat xxx = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
		Date ss2 = xxx.parse(ss);
		// alt+enter会剔除异常，输入后，顶栏出现throws ParseException
		log.info(String.valueOf(ss2));
	}
}
