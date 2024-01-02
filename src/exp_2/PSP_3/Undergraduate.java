package exp_2.PSP_3;

public class Undergraduate extends Student {
    boolean jug() {
        if ((math + language + major) / 3 >= 60)
            return true;
        else
            return false;
    }
}
