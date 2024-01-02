package leetode_Offer;



/**
 * @author Picker
 * @date 2022/4/8 16:37
 */
public class offer_76 {
    public static int findKthLargest(int[] nums, int k) {
        Quick_Sort(nums,0,nums.length-1);
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
        return nums[k-1];
    }
    static void Quick_Sort(int[] nums, int begin, int end){
        if(begin > end)
            return;
        int tmp = nums[begin];
        int i = begin;
        int j = end;
        while(i != j){
            while(nums[j] >= tmp && j > i)
                j--;
            while(nums[i] <= tmp && j > i)
                i++;
            if(j > i){
                int t = nums[i];
                nums[i] = nums[j];
                nums[j] = t;
            }
        }
        nums[begin] = nums[i];
        nums[i] = tmp;
        Quick_Sort(nums, begin, i-1);
        Quick_Sort(nums, i+1, end);
    }

    public static void main(String[] args) {

    }


}
/*
////
//// Created by 86134 on 2021/10/25.
////
//#include<bitsdc++.h>
//using namespace std;
//int a[100200]={0};
//int main(){
//    int n,k,temp;
//    cin>>n>>k;
//    for(int i = 0; i<n; i++)
//    {
//        cin>>temp;
//        a[temp]++;
//    }
//    temp=0;
//    int i=0;
//    while(temp<k)
//    {
//        temp+=a[i];
//        i++;
//    }
//    cout<<i-1;
//}*/
