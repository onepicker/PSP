package Thread;

/**
 * @author Picker
 * @date 2022/3/5 9:44
 */
public class TestThread1 extends Thread{
    @Override
    public void run(){
        for (int i = 0; i < 20; i++) {
            System.out.println("我在看代码"+i);
        }
    }
    public static void main(String[] args) {
        TestThread1 testThread1 = new TestThread1();
        testThread1.start();

        for (int i = 0; i < 1000; i++) {
            System.out.println("我在学习多线程"+i);
        }

    }
}
