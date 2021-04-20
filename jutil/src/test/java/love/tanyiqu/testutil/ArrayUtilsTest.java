package love.tanyiqu.testutil;

import love.tanyiqu.jutil.core.ArrayUtils;
import org.junit.Test;

public class ArrayUtilsTest {


    @Test
    public void test() {


//        int[] ints = ArrayUtils.newIntArray(1, 2, 3, 4, 5, 5, 57);
//        System.out.println(ArrayUtils.toString(ints));


//        Integer[] integers = new Integer[5];
//        integers[0] = 4;
//        integers[1] = 4;
//        integers[2] = 4;
//        integers[3] = 5;
//        integers[4] = 4;


        float[] floats = new float[]{1.1f, 1.2000f, 1.3f, 1.444f, 0};
        System.out.println(ArrayUtils.toString(floats));
        floats = ArrayUtils.remove(floats, 1);
        System.out.println(ArrayUtils.toString(floats));
    }


}
