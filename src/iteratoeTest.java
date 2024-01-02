import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author Picker
 * @date 2022/3/4 11:46
 */
public class iteratoeTest {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("hello");
        list.add("hello");
        list.add("hello");
        list.add("hello");

        Iterator<String> it = list.iterator();
        while(it. hasNext()){
             String obj = it. next();
             System. out. println(obj);
             }

    }
}
