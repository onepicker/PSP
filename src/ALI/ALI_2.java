package ALI;

import java.util.HashMap;

/**
 * @author Picker
 * @date 2022/3/24 13:57
 */
/*pattern = "", str= 返回 ture*/
public class ALI_2 {
    public static void main(String[] args) {
        String patttern = "abbac";
        String str = "北京 杭州 北京 北京 上海";
        System.out.println(wordPattern(patttern,str));
    }
    public static boolean wordPattern(String pattern, String str) {
        HashMap<Character,String> map = new HashMap<>();
        char[] ch1 = pattern.toCharArray();
        String[] str1 = str.split(" ");
        if(ch1.length!=str1.length){
            return false;
        }
        for (int i = 0; i < ch1.length; i++) {
            String val = map.get(ch1[i]);
            if(val!=null){
                return val.equals(str1[i]);
            }
            else if(!map.values().contains(str1[i])){
                map.put(ch1[i],str1[i]);
            }
            else {
                return false;
            }
        }
        return true;
    }
}
