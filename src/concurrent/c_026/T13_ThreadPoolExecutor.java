/**
 * 自定义线程池
 */
package concurrent.c_026;


import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class T13_ThreadPoolExecutor {
    private static LinkedBlockingQueue<Runnable> queue = new LinkedBlockingQueue<Runnable>();
	public static void main(String[] args) {


		ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1,
				2,3, TimeUnit.MINUTES,queue,new ThreadPoolExecutor.AbortPolicy());

	}
}
