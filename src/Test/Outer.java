package Test;


/**
 * @author Picker
 * @date 2022/3/2 21:38
 */
public class Outer {
    private static void test(final int i){
        new Service() {
            public void method(){
                for(int j=0; j<i; j++){
                    System.out.println("匿名内部类");
                }
            }

        }.method();
    }

    public static void main(String[] args) {
        test(4);
    }
}
//匿名内部类必须继承或实现一个已有的接口
interface Service{
    void method();
}
