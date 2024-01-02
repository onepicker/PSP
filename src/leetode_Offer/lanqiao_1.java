package leetode_Offer;

/**
 * @author Picker
 * @date 2022/4/9 10:26
 */
public class lanqiao_1 {
    public static void main(String[] args) {


        long num = 187L;
        for (;;num+=187*2){
            if (check(num)){
                System.out.println(num);
                break;
            }
        }

    }

    public static boolean check(Long num){

        if(num % 3 == 2 && num % 4 == 1 && num % 5 == 4 && num % 7 == 4 && num % 8 == 1 && num % 9 == 2 && num % 13 == 10 && num %14 ==11
                && num % 16 == 9 && num%17 == 0&& num%18==11&&num%19==18&&num%21==11&&num%22==11&&num%23==15&&num%24==17&&num%25==9&&num%26==23
                &&num%27==20&&num%28==25&&num%29==16&&num%31==27&&num%32==25&&num%33==11&&num%34==17&&num%35==4&&num%36==29&&num%37==22&&num%38==37
                &&num%39==23&&num%40==9&&num%41==1&&num%42==11&&num%43==11&&num%44==33&&num%45==29&&num%46==15&&num%47==5&&num%48==41&&
                num%49==467
        ){
            return true;
        }
        return false;
    }
}
