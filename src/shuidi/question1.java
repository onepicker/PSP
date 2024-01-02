package shuidi;

import java.util.Scanner;

/**
 * @author Picker
 * @date 2023/3/9 19:32
 */
public class question1 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int year = input.nextInt();//年份
        int day = input.nextInt();//所检查的日期
        int year0 =1900;
        int days = 0;  //相隔多少天
        int week=0;
        int count =0;
        for (int y = year0; y<=year; y++){
            if (isRun(y)==true){
                days+=366;
            }
            if(isRun(y)==false) {
                days+=365;
            }
            week=1+(days%7);//这一年第一天是星期几(1月1日)
//            System.out.println("今年是"+y+"第一天是周"+week);
            int target=0;//记录每月这个日期是这年的第几天
            for (int i = 0; i < 12; i++) {
                if(i==0){
                    target=day;
                    if (isSat(week,target)){

                        count++;
                        System.out.println("现在是"+y+"年： "+(i+1)+"月 "+count);
                    }
                }
                if(i==1||i==3||i==5||i==7||i==8||i==10){
                    target+=31;
                    if (isSat(week,target)){

                        count++;
                        System.out.println("现在是"+y+"年： "+(i+1)+"月 "+count);
                    }

                }
                if(i==2){
                    if(isRun(y)){
                        target+=29;
                    }
                    else {
                        target+=28;
                    }
                    if (isSat(week,target)){
                        count++;
                    }
                }
                if(i==4||i==6||i==9||i==11){
                    target+=30;
                    if (isSat(week,target)){

                        count++;
                        System.out.println("现在是"+y+"年： "+(i+1)+"月 "+count);
                    }
                }
            }
        }

        System.out.println(count);



    }
    static boolean isRun(int year){
        if((year%4==0&&year%100!=0)||year%400==0){
            return  true;
        }
        return false;
    }
    static boolean isSat(int week, int target){
        if((week+target-1)%7==6){
            return true;
        }
        return false;
    }
}
