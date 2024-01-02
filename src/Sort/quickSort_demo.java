package Sort;

import java.util.Arrays;

/**
 * @author Picker
 * @date 2023/6/27 17:32
 */
public class quickSort_demo {
    public static void main(String[] args) {
        int[] array = new int[]{2, 1, 5, 6, 7, 8, 9, 10};
        quickSort(array, 0, array.length - 1);
        System.out.println(Arrays.toString(array));
    }

    public static void quickSort(int[] arr, int startIndex, int endIndex) {
        // 递归结束条件
        if (startIndex >= endIndex) {
            return;
        }
        // 获取基准点
        int pivotIndex = part(arr, startIndex, endIndex);
        // 根据基准点 ，左右部分分别排序
        quickSort(arr, startIndex, pivotIndex - 1);
        quickSort(arr, pivotIndex + 1, endIndex);
    }

    /**
     * 双边循环法
     *
     * @param arr        需要交换的数组
     * @param startIndex 开始下表
     * @param endIndex   结束下表
     * @return 基准点
     */
    private static int part(int[] arr, int startIndex, int endIndex) {
        // 取第一个位置当基准点
        int pivot = arr[startIndex];
        int left = startIndex;
        int right = endIndex;
        while (left != right) {
            // 右边小的左移动
            while (left < right && arr[right] > pivot) {
                right--;
            }
            // 左边大的右移
            while (left < right && arr[left] <= pivot) {
                left++;
            }
            //交换位置
            if (left < right) {
                int p = arr[left];
                arr[left] = arr[right];
                arr[right] = p;
            }
        }
        // 基准点 与 指针重合点交换
        arr[startIndex] = arr[left];
        arr[left] = pivot;
        return left;

    }




}
