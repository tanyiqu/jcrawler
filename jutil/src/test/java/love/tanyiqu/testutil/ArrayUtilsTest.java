package love.tanyiqu.testutil;

import love.tanyiqu.jutil.core.ArrayUtils;
import org.junit.Test;

import java.util.Arrays;

public class ArrayUtilsTest {


    @Test
    public void test() {
        int[] ints = ArrayUtils.newIntArray(1, 2, 3, 4, 5, 5, 57);

        int[] emp = ArrayUtils.newIntArray();

        System.out.println(ArrayUtils.getLength(ints));

        System.out.println(ArrayUtils.isEmpty(emp));

        ArrayUtils.set(ints, 1, 666);

        System.out.println(ArrayUtils.isEmpty(ints));

        System.out.println(ArrayUtils.get(ints, -5, null));
        System.out.println(ArrayUtils.get(ints, 7));

        System.out.println(Arrays.toString(ints));
    }


}
