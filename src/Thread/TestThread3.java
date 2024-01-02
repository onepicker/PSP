package Thread;

/**
 * @author Picker
 * @date 2022/3/5 10:07
 */
//实现Runnable接口 重写run方法 执行线程需要丢入runnable实例
public class TestThread3 implements Runnable{
    /**
     * When an object implementing interface <code>Runnable</code> is used
     * to create a thread, starting the thread causes the object's
     * <code>run</code> method to be called in that separately executing
     * thread.
     * <p>
     * The general contract of the method <code>run</code> is that it may
     * take any action whatsoever.
     *
     * @see Thread#run()
     */
    @Override
    public void run() {
        for (int i = 0; i < 200; i++) {
            System.out.println("我在看代码"+i);
        }
    }

    public static void main(String[] args) {
        //创建线程对象，通过线程对象开启我们的线程
        TestThread3 testThread = new TestThread3();

        new Thread(testThread).start();
        for (int i = 0; i < 1000; i++) {
            System.out.println("我在学习多线程"+i);
        }
    }
}
