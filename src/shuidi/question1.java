package shuidi;

import java.util.Scanner;

/**
 * @author Picker
 * @date 2023/3/9 19:32
 */
public class question1 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int year = input.nextInt();//���
        int day = input.nextInt();//����������
        int year0 =1900;
        int days = 0;  //���������
        int week=0;
        int count =0;
        for (int y = year0; y<=year; y++){
            if (isRun(y)==true){
                days+=366;
            }
            if(isRun(y)==false) {
                days+=365;
            }
            week=1+(days%7);//��һ���һ�������ڼ�(1��1��)
//            System.out.println("������"+y+"��һ������"+week);
            int target=0;//��¼ÿ���������������ĵڼ���
            for (int i = 0; i < 12; i++) {
                if(i==0){
                    target=day;
                    if (isSat(week,target)){

                        count++;
                        System.out.println("������"+y+"�꣺ "+(i+1)+"�� "+count);
                    }
                }
                if(i==1||i==3||i==5||i==7||i==8||i==10){
                    target+=31;
                    if (isSat(week,target)){

                        count++;
                        System.out.println("������"+y+"�꣺ "+(i+1)+"�� "+count);
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
                        System.out.println("������"+y+"�꣺ "+(i+1)+"�� "+count);
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
