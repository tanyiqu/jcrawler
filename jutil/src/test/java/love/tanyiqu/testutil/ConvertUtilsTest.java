package love.tanyiqu.testutil;

import love.tanyiqu.jutil.core.ArrayUtils;
import love.tanyiqu.jutil.core.ConvertUtils;
import org.junit.Test;

public class ConvertUtilsTest {

    @Test
    public void test() {

        System.out.println(ConvertUtils.int2HexString(1024));

        System.out.println(ConvertUtils.hexString2Int("ff"));

    }

}
