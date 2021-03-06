package abc;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

import mycallable.MyRunnable;

public class Run1_ext {
	public static void main(String[] args) throws InterruptedException {
		ScheduledThreadPoolExecutor executor = new ScheduledThreadPoolExecutor(
				10);
		Runnable runnable1 = new MyRunnable("A");
		ScheduledFuture future = executor.schedule(runnable1, 0,
				TimeUnit.SECONDS);
		Thread.sleep(2000);
		BlockingQueue<Runnable> queue = executor.getQueue();
		System.out.println("A处size()=" + queue.size());
		System.out.println("取消结果为：" + future.cancel(true));
		queue = executor.getQueue();
		System.out.println("B处size()=" + queue.size());
		System.out.println("main end!");
	}
}
