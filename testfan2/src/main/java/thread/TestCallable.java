package thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

class Task implements Callable<Integer> {

	private int begin;
	private int end;

	public Task(int begin, int end) {
		super();
		this.begin = begin;
		this.end = end;
	}

	public Integer call() throws Exception {
		//long thread.sleep(10000);
		System.out.println("子线程在进行计算");
		int sum = 0;
		for (int i = begin; i <= end; i++)
			sum += i;
		return sum;
	}

	
}

public class TestCallable {

	public static void main(String[] args) {
		// 第一种方式
		System.out.println("start...");
		long start=System.currentTimeMillis();
		ExecutorService executor = Executors.newCachedThreadPool();
		Task task = new Task(1, 50);
		FutureTask<Integer> futureTask = new FutureTask<Integer>(task);
		executor.submit(futureTask);

		Task task2 = new Task(51, 100);
		FutureTask<Integer> futureTask2 = new FutureTask<Integer>(task2);
		executor.submit(futureTask2);

		Task task3 = new Task(51, 100);
		FutureTask<Integer> futureTask3 = new FutureTask<Integer>(task3);
		executor.submit(futureTask3);
		// 第二种方式，注意这种方式和第一种方式效果是类似的，只不过一个使用的是ExecutorService，一个使用的是Thread
		/*
		 * Task task = new Task(); FutureTask<Integer> futureTask = new
		 * FutureTask<Integer>(task); Thread thread = new Thread(futureTask);
		 * thread.start();
		 */

		System.out.println("主线程在执行任务");

		try {
			// FutureTask
			System.out.println("task运行结果" + (futureTask.get() + futureTask2.get()+futureTask3.get()));
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (ExecutionException e) {
			e.printStackTrace();
		}

		System.out.println("所有任务执行完毕");
		System.out.println("end......");
		long end=System.currentTimeMillis();
		System.out.println("end--task" + (end - start) );
		executor.shutdown();
	}
}
