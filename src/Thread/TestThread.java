package Thread;

/**
 * @author Picker
 * @date 2022/3/14 15:31
 */
public class TestThread {
    private static  Object object=new Object();

    private static int count=1;

    public static void main(String[] args) {
        new Thread(() -> {
            while (count<100){
                synchronized (object){
                    //打印偶数
                    if ((count&1)==0){
                        System.out.println(Thread.currentThread().getName()+":"+count);
                        count++;
                    }
                }

            }
        }).start();
        new Thread(() -> {
            while (count<100){
                synchronized (object){
                    if ((count&1)==1){
                        System.out.println(Thread.currentThread().getName()+":"+count);
                        count++;
                    }
                }

            }
        }).start();
    }
}
