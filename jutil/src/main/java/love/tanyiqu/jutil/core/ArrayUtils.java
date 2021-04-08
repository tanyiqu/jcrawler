package love.tanyiqu.jutil.core;

import com.sun.istack.internal.Nullable;

import java.lang.reflect.Array;

/**
 * Array utils
 */
@SuppressWarnings("unused")
public final class ArrayUtils {


    /**
     * Return a new array only of those given elements.
     *
     * @param array The array.
     * @return a new array only of those given elements.
     */
    public static int[] newIntArray(int... array) {
        return array;
    }

    public static long[] newLongArray(long... array) {
        return array;
    }

    public static short[] newShortArray(short... array) {
        return array;
    }

    public static char[] newCharArray(char... array) {
        return array;
    }

    public static byte[] newByteArray(byte... array) {
        return array;
    }

    public static double[] newDoubleArray(double... array) {
        return array;
    }

    public static float[] newFloatArray(float... array) {
        return array;
    }

    public static boolean[] newBooleanArray(boolean... array) {
        return array;
    }


    /**
     * Return the size of array.
     *
     * @param array The array.
     * @return Size of array.
     */
    public static int getLength(@Nullable Object array) {
        if (array == null)
            return 0;
        return Array.getLength(array);
    }


    /**
     * Return whether the array is empty .
     *
     * @param array The array.
     * @return Whether the array is empty.
     */
    public static boolean isEmpty(@Nullable Object array) {
        return getLength(array) == 0;
    }


    /**
     * Get the value of the specified index of the array.
     * If the array is null or empty, return the default value.
     * If the index exceeds the size of the array, return the default value.
     *
     * @param array        The array.
     * @param index        The index of the array.
     * @param defaultValue The default value.
     * @return The value of the specified index of the array.
     */
    @Nullable
    public static Object get(@Nullable Object array, int index, @Nullable Object defaultValue) {
        if (isEmpty(array))
            return defaultValue;
        try {
            return Array.get(array, index);
        } catch (Exception ignore) {
            return defaultValue;
        }
    }


    /**
     * Get the value of the specified index of the array.
     * If the array is null or empty, return null.
     * If the index exceeds the size of the array, return null.
     *
     * @param array The array.
     * @param index The index of the array.
     * @return The value of the specified index of the array.
     */
    @Nullable
    public static Object get(@Nullable Object array, int index) {
        return get(array, index, null);
    }


    /**
     * Set the value of the specified index of the array.
     *
     * @param array The array.
     * @param index The index into the array.
     * @param value The new value of the indexed component.
     */
    public static void set(@Nullable Object array, int index, @Nullable Object value) {
        if (array == null) return;
        Array.set(array, index, value);
    }

}
