package exp_2.PSP_3;

public class Graduate extends Student {
    boolean jug() {
        if ((math + language + major) / 3 >= 80)
            return true;
        else
            return false;
    }
}
