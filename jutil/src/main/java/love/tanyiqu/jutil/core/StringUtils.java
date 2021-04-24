package love.tanyiqu.jutil.core;

import java.nio.charset.Charset;

public class StringUtils {


    /**
     * Returns whether the string is empty.
     *
     * @param s string
     * @return Whether the string is empty.
     */
    public static boolean isEmptyStr(final String s) {
        return isSpace(s);
    }

    /**
     * Returns whether the string is empty.
     *
     * @param s The string.
     * @return Whether the string is empty.
     */
    public static boolean isSpace(final String s) {
        if (s == null) return true;
        for (int i = 0, len = s.length(); i < len; ++i) {
            if (!Character.isWhitespace(s.charAt(i))) {
                return false;
            }
        }
        return true;
    }


    /**
     * Get safe charset
     *
     * @param charsetName Charset name.
     * @return A safe charset name.
     */
    public static String getSafeCharset(String charsetName) {
        String cn = charsetName;
        if (StringUtils.isSpace(charsetName) || !Charset.isSupported(charsetName)) {
            cn = "UTF-8";
        }
        return cn;
    }
}
