package love.tanyiqu.testutil;

import love.tanyiqu.jutil.core.ArrayUtils;
import org.junit.Test;

import java.util.Arrays;

public class ArrayUtilsTest {


    @Test
    public void test() {
        int[] ints = ArrayUtils.newIntArray(1, 2, 3, 4, 5, 5, 57);
        System.out.println(Arrays.toString(ints));
    }


}
