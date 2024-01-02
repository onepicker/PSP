package SYNC.T1;

/**
 * @author Picker
 * @date 2022/3/17 15:39
 */
/**
 * @Author:yuess
 * @Description:
 * @Date:Create in 16:11
 * @Modified By:
 */
public class Test {

    synchronized static void  fun1() throws InterruptedException {
        System.out.println("加锁的方法1开始执行");
        Thread.sleep(2000);
        System.out.println("加锁的方法1执行结束");
    }
    synchronized static void  fun2() throws InterruptedException {
        System.out.println("加锁的方法2开始执行");
        Thread.sleep(2000);
        System.out.println("加锁的方法2执行结束");
    }

    public static void main(String[] args) {
        Test obj1=new Test();
        Test obj2=new Test();

        new Thread(() -> {
            try {
                obj1.fun1();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();

        new Thread(() -> {
            try {
                obj1.fun2();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
    }


}