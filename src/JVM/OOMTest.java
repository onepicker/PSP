package JVM;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Picker
 * @date 2022/3/9 16:57
 */
public class OOMTest {
    static class  heapOOM{

    }

    public static void main(String[] args) {
        List<heapOOM> list = new ArrayList<heapOOM>();
        while (true){
            list.add(new heapOOM());
        }
    }
}
