package t;

/**
 * 
 * Title: TestRun 线程锁
 * 
 * Description:
 * 
 * @author ZhongLingYun
 * 
 * @date 2018年8月4日
 * 
 */
public class TestRun extends Thread {
	private static int apple = 100;

	@Override
	public void run() {
		eat(Thread.currentThread().getName());
	}

	public void eat(String name) {

		// 此处加锁，防止资源不共享，可自行注释掉看不加锁的情况
		while (apple > 0) {
			synchronized (TestRun.class) {
				System.out.println(name + "吃了地" + apple + "个苹果");
				apple = apple - 1; }
		}
	}

	public static void main(String[] args) {
		TestRun trun1 = new TestRun();
		TestRun trun2 = new TestRun();
		trun1.start();
		trun2.start();
	}

}
