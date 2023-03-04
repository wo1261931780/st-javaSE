package wo1261931780.stjavaSE.history.c2stage_20220502.ccc170tcp_browser;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * Created by Intellij IDEA.
 * Project:st-java.github.io
 * Package:c2stage_20220502.ccc170tcp_browser
 * User:  wo1261931780@gmail.com
 * Time:  2022-05-12-23  星期一
 */
public class ccc010 {
	public static ExecutorService pool = new ThreadPoolExecutor(3,
			5,
			5,
			TimeUnit.SECONDS,
			new ArrayBlockingQueue<>(5),
			Executors.defaultThreadFactory(),
			new ThreadPoolExecutor.AbortPolicy());

	public static void main(String[] args) {
		try {
			ServerSocket x = new ServerSocket(7777);
			Socket accept = x.accept();
			// ccc002thread demoth = new ccc002thread(accept);
			pool.execute(new ccc011thread(accept));
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}
}


//~ Formatted by Jindent --- http://www.jindent.com
