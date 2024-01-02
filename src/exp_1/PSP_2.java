package exp_1;//import java.util.Calendar;

import java.util.*;

public class PSP_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("输入年份:");
        int year = input.nextInt();
        if (year < 1800 || year > 3000)
            return;
        System.out.println("输出月份:");
        int month = input.nextInt();
        int flag = 0;//判断是否为闰年
        int day = 0;//每月的总天数
        if (year % 4 == 0 && year % 100 == 0 || year % 400 == 0)
            flag = 1;
        switch (month) {
            case 4:
            case 6:
            case 9:
                day = 30;
                break;
            case 2:
                if (flag == 1)
                    day = 28;
                else day = 29;
                break;
            default:
                day = 31;
        }
        Calendar c = Calendar.getInstance();
        c.set(year, month - 1, 1);
        //int weekday = calendar.get(Calendar.DAY_OF_WEEK)-1;
        int week = c.get(Calendar.DAY_OF_WEEK) - 1;
        System.out.println();
        System.out.println("\t\t\t" + year + "年" + month + "月");
        System.out.println("一\t二\t三\t四\t五\t六\t日");
        for (int j = 1; j < week - 1; j++) {
            System.out.print("\t");
        }
        for (int i = 1; i <= day; i++) {
            System.out.print(i + "\t");
            if ((i + week - 2) % 7 == 0)
                System.out.println();
        }


    }

}

