package concurrent.c_025;

import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class T06_ArrayBlockingQueue {

	static BlockingQueue<String> strs = new ArrayBlockingQueue<>(10);

	static Random r = new Random();

	public static void main(String[] args) throws InterruptedException {
		for (int i = 0; i < 9; i++) {
			strs.put("a" + i);
		}


		strs.put("aaa"); //满了就会等待，程序阻塞
		System.out.println(Thread.currentThread().getName() + " take -" + strs.take());
		//strs.add("aaa");
		//strs.offer("aaa");
		//strs.offer("aaa", 1, TimeUnit.SECONDS);
		
		System.out.println(strs);
	}
}
