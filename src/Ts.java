import java.util.*;

public class Ts {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入测试用例:");
        String str = input.nextLine();
        String[] word = str.split(" ");
        int len = word.length;
        System.out.println(word[1]);
    }

}
