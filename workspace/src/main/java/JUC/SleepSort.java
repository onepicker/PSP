package JUC;

/**
 * @author Picker
 * @date 2022/4/7 22:42
 */
public class SleepSort {
    public static void sleepSort(int[] nums){
        for (int i = 0; i < nums.length; i++) {
            final int time = nums[i];
            new Thread(()->{
                try {
                    Thread.sleep(time);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(time);
            }).start();
        }
    }

    public static void main(String[] args) {
        int[] nums = {7,5,3,2,1,5};
        sleepSort(nums);
    }

}
