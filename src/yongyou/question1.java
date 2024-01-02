package yongyou;

/**
 * @author Picker
 * @date 2023/3/18 15:30
 */
public class question1 {
    public static void main(String[] args) {
        String[] strings ={"jack","","tomato"};
        String[] res = sortNickName(strings);
        for (int i = 0; i < strings.length; i++) {
            System.out.println(res[i]+"h");
        }

    }
    public static String[] sortNickName (String[] nickNameArray) {
        // write code here
        int len = nickNameArray.length;
        if(len==0||len==1){
            return nickNameArray;
        }
        for (int i = 0; i < len; i++) {
            if(nickNameArray[i]==""){
                for (int j = i; j < len-1; j++) {
                    nickNameArray[j]=nickNameArray[j+1];
                }
                nickNameArray[len-1]="";
            }
        }
        return  nickNameArray;
    }
}
