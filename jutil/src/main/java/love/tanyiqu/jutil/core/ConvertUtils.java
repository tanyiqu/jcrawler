package love.tanyiqu.jutil.core;

@SuppressWarnings({"unused"})
public class ConvertUtils {


    public static String int2HexString(int num) {
        return Integer.toHexString(num);
    }

    public static int hexString2Int(String hexString) {
        return Integer.parseInt(hexString, 16);
    }

}
