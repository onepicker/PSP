package JVM;

import org.openjdk.jol.info.ClassLayout;

/**
 * @author  Picker
 * @date  2022/3/31 16:00
 */

public class newObject {
     private static class T{
         long s;

     }
    public static void main(String[] args) {
         T t = new T();
        System.out.println(ClassLayout.parseInstance(t).toPrintable());

    }
}
