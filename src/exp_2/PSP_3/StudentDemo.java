package exp_2.PSP_3;

public class StudentDemo {

    public static void main(String[] args) {
        Undergraduate std1 = new Undergraduate();
        Graduate std2 = new Graduate();
        std1.math = 90;
        std1.language = 80;
        std1.major = 95;
        std2.math = 70;
        std2.language = 80;
        std2.major = 75;
        if (std1.jug()) {

            System.out.println("Pass!");
        } else
            System.out.println("Failed!");
        if (std2.jug()) {
            System.out.println("Pass!");
        } else
            System.out.println("Failed!");

    }

}
