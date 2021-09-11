package titov.homework2.task3;

import javassist.ClassPool;

public class MetaspaceOOM {
    static ClassPool classPool = ClassPool.getDefault();

    public static void main(String[] args) throws Exception{
        for (int i = 0; i < 10000000; i++) {
            classPool.makeClass("NewClass"+i).toClass();
        }
    }
}
