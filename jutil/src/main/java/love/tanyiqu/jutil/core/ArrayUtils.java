package love.tanyiqu.jutil.core;

import com.sun.istack.internal.Nullable;

import java.lang.reflect.Array;
import java.util.*;

/**
 * Array utils
 */
@SuppressWarnings({"unused", "DuplicatedCode"})
public final class ArrayUtils {

    static final int INDEX_NOT_FOUND = -1;

    ///////////////////////////////////////////////////////////////////////////
    // new array
    ///////////////////////////////////////////////////////////////////////////

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


    ///////////////////////////////////////////////////////////////////////////
    // size
    ///////////////////////////////////////////////////////////////////////////

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


    ///////////////////////////////////////////////////////////////////////////
    // isEmpty
    ///////////////////////////////////////////////////////////////////////////

    /**
     * Return whether the array is empty .
     *
     * @param array The array.
     * @return Whether the array is empty.
     */
    public static boolean isEmpty(@Nullable Object array) {
        return getLength(array) == 0;
    }


    ///////////////////////////////////////////////////////////////////////////
    // get set
    ///////////////////////////////////////////////////////////////////////////

    /**
     * <p>Get the value of the specified index of the array.</p>
     * <p>If the array is null or empty, return the default value.</p>
     * <p>If the index exceeds the size of the array, return the default value.</p>
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
     * <p>Get the value of the specified index of the array.</p>
     * <p>If the array is null or empty, return null.</p>
     * <p>If the index exceeds the size of the array, return <code>null</code>.</p>
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


    ///////////////////////////////////////////////////////////////////////////
    // equals
    ///////////////////////////////////////////////////////////////////////////

    /**
     * Return whether the two arrays are equals.
     *
     * @param array1 One array.
     * @param array2 The other array.
     * @return Whether the two arrays are equals.
     */
    public static boolean equals(@Nullable Object[] array1, @Nullable Object[] array2) {
        return Arrays.deepEquals(array1, array2);
    }

    public static boolean equals(boolean[] array1, boolean[] array2) {
        return Arrays.equals(array1, array2);
    }

    public static boolean equals(byte[] array1, byte[] array2) {
        return Arrays.equals(array1, array2);
    }

    public static boolean equals(char[] array1, char[] array2) {
        return Arrays.equals(array1, array2);
    }

    public static boolean equals(double[] array1, double[] array2) {
        return Arrays.equals(array1, array2);
    }

    public static boolean equals(float[] array1, float[] array2) {
        return Arrays.equals(array1, array2);
    }

    public static boolean equals(int[] array1, int[] array2) {
        return Arrays.equals(array1, array2);
    }

    public static boolean equals(short[] array1, short[] array2) {
        return Arrays.equals(array1, array2);
    }


    ///////////////////////////////////////////////////////////////////////////
    // reverse
    ///////////////////////////////////////////////////////////////////////////

    /**
     * <p>Reverses the order of the given array.</p>
     *
     * <p>There is no special handling for multi-dimensional arrays.</p>
     *
     * <p>This method does nothing for a <code>null</code> input array.</p>
     *
     * @param array the array to reverse, may be <code>null</code>
     */
    public static <T> void reverse(T[] array) {
        if (array == null) {
            return;
        }
        int i = 0;
        int j = array.length - 1;
        T tmp;
        while (j > i) {
            tmp = array[j];
            array[j] = array[i];
            array[i] = tmp;
            j--;
            i++;
        }
    }

    public static void reverse(int[] array) {
        if (array == null) {
            return;
        }
        int i = 0;
        int j = array.length - 1;
        int tmp;
        while (j > i) {
            tmp = array[j];
            array[j] = array[i];
            array[i] = tmp;
            j--;
            i++;
        }
    }

    public static void reverse(long[] array) {
        if (array == null) {
            return;
        }
        int i = 0;
        int j = array.length - 1;
        long tmp;
        while (j > i) {
            tmp = array[j];
            array[j] = array[i];
            array[i] = tmp;
            j--;
            i++;
        }
    }

    public static void reverse(short[] array) {
        if (array == null) {
            return;
        }
        int i = 0;
        int j = array.length - 1;
        short tmp;
        while (j > i) {
            tmp = array[j];
            array[j] = array[i];
            array[i] = tmp;
            j--;
            i++;
        }
    }

    public static void reverse(char[] array) {
        if (array == null) {
            return;
        }
        int i = 0;
        int j = array.length - 1;
        char tmp;
        while (j > i) {
            tmp = array[j];
            array[j] = array[i];
            array[i] = tmp;
            j--;
            i++;
        }
    }

    public static void reverse(byte[] array) {
        if (array == null) {
            return;
        }
        int i = 0;
        int j = array.length - 1;
        byte tmp;
        while (j > i) {
            tmp = array[j];
            array[j] = array[i];
            array[i] = tmp;
            j--;
            i++;
        }
    }

    public static void reverse(double[] array) {
        if (array == null) {
            return;
        }
        int i = 0;
        int j = array.length - 1;
        double tmp;
        while (j > i) {
            tmp = array[j];
            array[j] = array[i];
            array[i] = tmp;
            j--;
            i++;
        }
    }

    public static void reverse(float[] array) {
        if (array == null) {
            return;
        }
        int i = 0;
        int j = array.length - 1;
        float tmp;
        while (j > i) {
            tmp = array[j];
            array[j] = array[i];
            array[i] = tmp;
            j--;
            i++;
        }
    }

    public static void reverse(boolean[] array) {
        if (array == null) {
            return;
        }
        int i = 0;
        int j = array.length - 1;
        boolean tmp;
        while (j > i) {
            tmp = array[j];
            array[j] = array[i];
            array[i] = tmp;
            j--;
            i++;
        }
    }


    ///////////////////////////////////////////////////////////////////////////
    // subArray
    ///////////////////////////////////////////////////////////////////////////

    @SuppressWarnings("unchecked")
    @Nullable
    public static <T> T[] subArray(@Nullable T[] array, int startIndexInclusive, int endIndexExclusive) {
        return (T[]) realSubArray(array, startIndexInclusive, endIndexExclusive);
    }

    @Nullable
    public static long[] subArray(@Nullable long[] array, int startIndexInclusive, int endIndexExclusive) {
        return (long[]) realSubArray(array, startIndexInclusive, endIndexExclusive);
    }

    @Nullable
    public static int[] subArray(@Nullable int[] array, int startIndexInclusive, int endIndexExclusive) {
        return (int[]) realSubArray(array, startIndexInclusive, endIndexExclusive);
    }

    @Nullable
    public static short[] subArray(@Nullable short[] array, int startIndexInclusive, int endIndexExclusive) {
        return (short[]) realSubArray(array, startIndexInclusive, endIndexExclusive);
    }

    @Nullable
    public static char[] subArray(@Nullable char[] array, int startIndexInclusive, int endIndexExclusive) {
        return (char[]) realSubArray(array, startIndexInclusive, endIndexExclusive);
    }

    @Nullable
    public static byte[] subArray(@Nullable byte[] array, int startIndexInclusive, int endIndexExclusive) {
        return (byte[]) realSubArray(array, startIndexInclusive, endIndexExclusive);
    }

    @Nullable
    public static double[] subArray(@Nullable double[] array, int startIndexInclusive, int endIndexExclusive) {
        return (double[]) realSubArray(array, startIndexInclusive, endIndexExclusive);
    }

    @Nullable
    public static float[] subArray(@Nullable float[] array, int startIndexInclusive, int endIndexExclusive) {
        return (float[]) realSubArray(array, startIndexInclusive, endIndexExclusive);
    }

    @Nullable
    public static boolean[] subArray(@Nullable boolean[] array, int startIndexInclusive, int endIndexExclusive) {
        return (boolean[]) realSubArray(array, startIndexInclusive, endIndexExclusive);
    }

    @SuppressWarnings({"rawtypes", "SuspiciousSystemArraycopy"})
    @Nullable
    private static Object realSubArray(@Nullable Object array, int startIndexInclusive, int endIndexExclusive) {
        if (array == null) {
            return null;
        }
        if (startIndexInclusive < 0) {
            startIndexInclusive = 0;
        }
        int length = getLength(array);
        if (endIndexExclusive > length) {
            endIndexExclusive = length;
        }
        int newSize = endIndexExclusive - startIndexInclusive;
        Class type = array.getClass().getComponentType();
        if (newSize <= 0) {
            return Array.newInstance(type, 0);
        }
        Object subArray = Array.newInstance(type, newSize);
        System.arraycopy(array, startIndexInclusive, subArray, 0, newSize);
        return subArray;
    }


    ///////////////////////////////////////////////////////////////////////////
    // object indexOf
    ///////////////////////////////////////////////////////////////////////////

    /**
     * <p>Returns the index of the specified element in the array.</p>
     * <p>If it does not exist, return -1.</p>
     *
     * @param array        The array.
     * @param objectToFind The element.
     * @return The index of the specified element in the array.
     */
    public static int indexOf(@Nullable Object[] array, @Nullable Object objectToFind) {
        return indexOf(array, objectToFind, 0);
    }

    public static int indexOf(@Nullable Object[] array, @Nullable final Object objectToFind, int startIndex) {
        if (array == null) {
            return INDEX_NOT_FOUND;
        }
        if (startIndex < 0) {
            startIndex = 0;
        }
        if (objectToFind == null) {
            for (int i = startIndex; i < array.length; i++) {
                if (array[i] == null) {
                    return i;
                }
            }
        } else {
            for (int i = startIndex; i < array.length; i++) {
                if (objectToFind.equals(array[i])) {
                    return i;
                }
            }
        }
        return INDEX_NOT_FOUND;
    }

    public static int lastIndexOf(@Nullable Object[] array, @Nullable Object objectToFind) {
        return lastIndexOf(array, objectToFind, Integer.MAX_VALUE);
    }

    public static int lastIndexOf(@Nullable Object[] array, @Nullable Object objectToFind, int startIndex) {
        if (array == null) {
            return INDEX_NOT_FOUND;
        }
        if (startIndex < 0) {
            return INDEX_NOT_FOUND;
        } else if (startIndex >= array.length) {
            startIndex = array.length - 1;
        }
        if (objectToFind == null) {
            for (int i = startIndex; i >= 0; i--) {
                if (array[i] == null) {
                    return i;
                }
            }
        } else {
            for (int i = startIndex; i >= 0; i--) {
                if (objectToFind.equals(array[i])) {
                    return i;
                }
            }
        }
        return INDEX_NOT_FOUND;
    }

    ///////////////////////////////////////////////////////////////////////////
    // long indexOf
    ///////////////////////////////////////////////////////////////////////////

    public static int indexOf(@Nullable long[] array, long valueToFind) {
        return indexOf(array, valueToFind, 0);
    }

    public static int indexOf(@Nullable long[] array, long valueToFind, int startIndex) {
        if (array == null) {
            return INDEX_NOT_FOUND;
        }
        if (startIndex < 0) {
            startIndex = 0;
        }
        for (int i = startIndex; i < array.length; i++) {
            if (valueToFind == array[i]) {
                return i;
            }
        }
        return INDEX_NOT_FOUND;
    }

    public static int lastIndexOf(@Nullable long[] array, long valueToFind) {
        return lastIndexOf(array, valueToFind, Integer.MAX_VALUE);
    }

    public static int lastIndexOf(@Nullable long[] array, long valueToFind, int startIndex) {
        if (array == null) {
            return INDEX_NOT_FOUND;
        }
        if (startIndex < 0) {
            return INDEX_NOT_FOUND;
        } else if (startIndex >= array.length) {
            startIndex = array.length - 1;
        }
        for (int i = startIndex; i >= 0; i--) {
            if (valueToFind == array[i]) {
                return i;
            }
        }
        return INDEX_NOT_FOUND;
    }

    ///////////////////////////////////////////////////////////////////////////
    // int indexOf
    ///////////////////////////////////////////////////////////////////////////

    public static int indexOf(@Nullable int[] array, int valueToFind) {
        return indexOf(array, valueToFind, 0);
    }

    public static int indexOf(@Nullable int[] array, int valueToFind, int startIndex) {
        if (array == null) {
            return INDEX_NOT_FOUND;
        }
        if (startIndex < 0) {
            startIndex = 0;
        }
        for (int i = startIndex; i < array.length; i++) {
            if (valueToFind == array[i]) {
                return i;
            }
        }
        return INDEX_NOT_FOUND;
    }

    public static int lastIndexOf(@Nullable int[] array, int valueToFind) {
        return lastIndexOf(array, valueToFind, Integer.MAX_VALUE);
    }

    public static int lastIndexOf(@Nullable int[] array, int valueToFind, int startIndex) {
        if (array == null) {
            return INDEX_NOT_FOUND;
        }
        if (startIndex < 0) {
            return INDEX_NOT_FOUND;
        } else if (startIndex >= array.length) {
            startIndex = array.length - 1;
        }
        for (int i = startIndex; i >= 0; i--) {
            if (valueToFind == array[i]) {
                return i;
            }
        }
        return INDEX_NOT_FOUND;
    }


    ///////////////////////////////////////////////////////////////////////////
    // short indexOf
    ///////////////////////////////////////////////////////////////////////////

    public static int indexOf(@Nullable short[] array, short valueToFind) {
        return indexOf(array, valueToFind, 0);
    }

    public static int indexOf(@Nullable short[] array, short valueToFind, int startIndex) {
        if (array == null) {
            return INDEX_NOT_FOUND;
        }
        if (startIndex < 0) {
            startIndex = 0;
        }
        for (int i = startIndex; i < array.length; i++) {
            if (valueToFind == array[i]) {
                return i;
            }
        }
        return INDEX_NOT_FOUND;
    }

    public static int lastIndexOf(@Nullable short[] array, short valueToFind) {
        return lastIndexOf(array, valueToFind, Integer.MAX_VALUE);
    }

    public static int lastIndexOf(@Nullable short[] array, short valueToFind, int startIndex) {
        if (array == null) {
            return INDEX_NOT_FOUND;
        }
        if (startIndex < 0) {
            return INDEX_NOT_FOUND;
        } else if (startIndex >= array.length) {
            startIndex = array.length - 1;
        }
        for (int i = startIndex; i >= 0; i--) {
            if (valueToFind == array[i]) {
                return i;
            }
        }
        return INDEX_NOT_FOUND;
    }


    ///////////////////////////////////////////////////////////////////////////
    // char indexOf
    ///////////////////////////////////////////////////////////////////////////

    public static int indexOf(@Nullable char[] array, char valueToFind) {
        return indexOf(array, valueToFind, 0);
    }

    public static int indexOf(@Nullable char[] array, char valueToFind, int startIndex) {
        if (array == null) {
            return INDEX_NOT_FOUND;
        }
        if (startIndex < 0) {
            startIndex = 0;
        }
        for (int i = startIndex; i < array.length; i++) {
            if (valueToFind == array[i]) {
                return i;
            }
        }
        return INDEX_NOT_FOUND;
    }

    public static int lastIndexOf(@Nullable char[] array, char valueToFind) {
        return lastIndexOf(array, valueToFind, Integer.MAX_VALUE);
    }

    public static int lastIndexOf(@Nullable char[] array, char valueToFind, int startIndex) {
        if (array == null) {
            return INDEX_NOT_FOUND;
        }
        if (startIndex < 0) {
            return INDEX_NOT_FOUND;
        } else if (startIndex >= array.length) {
            startIndex = array.length - 1;
        }
        for (int i = startIndex; i >= 0; i--) {
            if (valueToFind == array[i]) {
                return i;
            }
        }
        return INDEX_NOT_FOUND;
    }


    ///////////////////////////////////////////////////////////////////////////
    // byte indexOf
    ///////////////////////////////////////////////////////////////////////////

    public static int indexOf(@Nullable byte[] array, byte valueToFind) {
        return indexOf(array, valueToFind, 0);
    }

    public static int indexOf(@Nullable byte[] array, byte valueToFind, int startIndex) {
        if (array == null) {
            return INDEX_NOT_FOUND;
        }
        if (startIndex < 0) {
            startIndex = 0;
        }
        for (int i = startIndex; i < array.length; i++) {
            if (valueToFind == array[i]) {
                return i;
            }
        }
        return INDEX_NOT_FOUND;
    }

    public static int lastIndexOf(@Nullable byte[] array, byte valueToFind) {
        return lastIndexOf(array, valueToFind, Integer.MAX_VALUE);
    }

    public static int lastIndexOf(@Nullable byte[] array, byte valueToFind, int startIndex) {
        if (array == null) {
            return INDEX_NOT_FOUND;
        }
        if (startIndex < 0) {
            return INDEX_NOT_FOUND;
        } else if (startIndex >= array.length) {
            startIndex = array.length - 1;
        }
        for (int i = startIndex; i >= 0; i--) {
            if (valueToFind == array[i]) {
                return i;
            }
        }
        return INDEX_NOT_FOUND;
    }


    ///////////////////////////////////////////////////////////////////////////
    // double indexOf
    ///////////////////////////////////////////////////////////////////////////

    public static int indexOf(@Nullable double[] array, double valueToFind) {
        return indexOf(array, valueToFind, 0);
    }

    public static int indexOf(@Nullable double[] array, double valueToFind, double tolerance) {
        return indexOf(array, valueToFind, 0, tolerance);
    }

    public static int indexOf(@Nullable double[] array, double valueToFind, int startIndex) {
        if (ArrayUtils.isEmpty(array)) {
            return INDEX_NOT_FOUND;
        }
        if (startIndex < 0) {
            startIndex = 0;
        }
        for (int i = startIndex; i < array.length; i++) {
            if (valueToFind == array[i]) {
                return i;
            }
        }
        return INDEX_NOT_FOUND;
    }

    public static int indexOf(@Nullable double[] array, double valueToFind, int startIndex, double tolerance) {
        if (ArrayUtils.isEmpty(array)) {
            return INDEX_NOT_FOUND;
        }
        if (startIndex < 0) {
            startIndex = 0;
        }
        double min = valueToFind - tolerance;
        double max = valueToFind + tolerance;
        for (int i = startIndex; i < array.length; i++) {
            if (array[i] >= min && array[i] <= max) {
                return i;
            }
        }
        return INDEX_NOT_FOUND;
    }

    public static int lastIndexOf(@Nullable double[] array, double valueToFind) {
        return lastIndexOf(array, valueToFind, Integer.MAX_VALUE);
    }

    public static int lastIndexOf(@Nullable double[] array, double valueToFind, double tolerance) {
        return lastIndexOf(array, valueToFind, Integer.MAX_VALUE, tolerance);
    }

    public static int lastIndexOf(@Nullable double[] array, double valueToFind, int startIndex) {
        if (ArrayUtils.isEmpty(array)) {
            return INDEX_NOT_FOUND;
        }
        if (startIndex < 0) {
            return INDEX_NOT_FOUND;
        } else if (startIndex >= array.length) {
            startIndex = array.length - 1;
        }
        for (int i = startIndex; i >= 0; i--) {
            if (valueToFind == array[i]) {
                return i;
            }
        }
        return INDEX_NOT_FOUND;
    }

    public static int lastIndexOf(@Nullable double[] array, double valueToFind, int startIndex, double tolerance) {
        if (ArrayUtils.isEmpty(array)) {
            return INDEX_NOT_FOUND;
        }
        if (startIndex < 0) {
            return INDEX_NOT_FOUND;
        } else if (startIndex >= array.length) {
            startIndex = array.length - 1;
        }
        double min = valueToFind - tolerance;
        double max = valueToFind + tolerance;
        for (int i = startIndex; i >= 0; i--) {
            if (array[i] >= min && array[i] <= max) {
                return i;
            }
        }
        return INDEX_NOT_FOUND;
    }


    ///////////////////////////////////////////////////////////////////////////
    // float indexOf
    ///////////////////////////////////////////////////////////////////////////

    public static int indexOf(@Nullable float[] array, float valueToFind) {
        return indexOf(array, valueToFind, 0);
    }

    public static int indexOf(@Nullable float[] array, float valueToFind, int startIndex) {
        if (ArrayUtils.isEmpty(array)) {
            return INDEX_NOT_FOUND;
        }
        if (startIndex < 0) {
            startIndex = 0;
        }
        for (int i = startIndex; i < array.length; i++) {
            if (valueToFind == array[i]) {
                return i;
            }
        }
        return INDEX_NOT_FOUND;
    }

    public static int lastIndexOf(@Nullable float[] array, float valueToFind) {
        return lastIndexOf(array, valueToFind, Integer.MAX_VALUE);
    }

    public static int lastIndexOf(@Nullable float[] array, float valueToFind, int startIndex) {
        if (ArrayUtils.isEmpty(array)) {
            return INDEX_NOT_FOUND;
        }
        if (startIndex < 0) {
            return INDEX_NOT_FOUND;
        } else if (startIndex >= array.length) {
            startIndex = array.length - 1;
        }
        for (int i = startIndex; i >= 0; i--) {
            if (valueToFind == array[i]) {
                return i;
            }
        }
        return INDEX_NOT_FOUND;
    }


    ///////////////////////////////////////////////////////////////////////////
    // bool indexOf
    ///////////////////////////////////////////////////////////////////////////

    public static int indexOf(@Nullable boolean[] array, boolean valueToFind) {
        return indexOf(array, valueToFind, 0);
    }

    public static int indexOf(@Nullable boolean[] array, boolean valueToFind, int startIndex) {
        if (ArrayUtils.isEmpty(array)) {
            return INDEX_NOT_FOUND;
        }
        if (startIndex < 0) {
            startIndex = 0;
        }
        for (int i = startIndex; i < array.length; i++) {
            if (valueToFind == array[i]) {
                return i;
            }
        }
        return INDEX_NOT_FOUND;
    }

    public static int lastIndexOf(@Nullable boolean[] array, boolean valueToFind) {
        return lastIndexOf(array, valueToFind, Integer.MAX_VALUE);
    }

    public static int lastIndexOf(@Nullable boolean[] array, boolean valueToFind, int startIndex) {
        if (ArrayUtils.isEmpty(array)) {
            return INDEX_NOT_FOUND;
        }
        if (startIndex < 0) {
            return INDEX_NOT_FOUND;
        } else if (startIndex >= array.length) {
            startIndex = array.length - 1;
        }
        for (int i = startIndex; i >= 0; i--) {
            if (valueToFind == array[i]) {
                return i;
            }
        }
        return INDEX_NOT_FOUND;
    }

    ///////////////////////////////////////////////////////////////////////////
    // contains
    ///////////////////////////////////////////////////////////////////////////

    public static boolean contains(@Nullable Object[] array, @Nullable Object objectToFind) {
        return indexOf(array, objectToFind) != INDEX_NOT_FOUND;
    }

    public static boolean contains(@Nullable int[] array, int valueToFind) {
        return indexOf(array, valueToFind) != INDEX_NOT_FOUND;
    }

    public static boolean contains(@Nullable long[] array, long valueToFind) {
        return indexOf(array, valueToFind) != INDEX_NOT_FOUND;
    }

    public static boolean contains(@Nullable short[] array, short valueToFind) {
        return indexOf(array, valueToFind) != INDEX_NOT_FOUND;
    }

    public static boolean contains(@Nullable char[] array, char valueToFind) {
        return indexOf(array, valueToFind) != INDEX_NOT_FOUND;
    }

    public static boolean contains(@Nullable byte[] array, byte valueToFind) {
        return indexOf(array, valueToFind) != INDEX_NOT_FOUND;
    }

    public static boolean contains(@Nullable float[] array, float valueToFind) {
        return indexOf(array, valueToFind) != INDEX_NOT_FOUND;
    }

    public static boolean contains(@Nullable double[] array, double valueToFind) {
        return indexOf(array, valueToFind) != INDEX_NOT_FOUND;
    }

    public static boolean contains(@Nullable double[] array, double valueToFind, double tolerance) {
        return indexOf(array, valueToFind, 0, tolerance) != INDEX_NOT_FOUND;
    }

    public static boolean contains(@Nullable boolean[] array, boolean valueToFind) {
        return indexOf(array, valueToFind) != INDEX_NOT_FOUND;
    }

    ///////////////////////////////////////////////////////////////////////////
    // char converters
    ///////////////////////////////////////////////////////////////////////////

    @Nullable
    public static char[] toPrimitive(@Nullable Character[] array) {
        if (array == null) {
            return null;
        } else if (array.length == 0) {
            return new char[0];
        }
        final char[] result = new char[array.length];
        for (int i = 0; i < array.length; i++) {
            result[i] = array[i];
        }
        return result;
    }

    @Nullable
    public static char[] toPrimitive(@Nullable Character[] array, char valueForNull) {
        if (array == null) {
            return null;
        } else if (array.length == 0) {
            return new char[0];
        }
        final char[] result = new char[array.length];
        for (int i = 0; i < array.length; i++) {
            Character b = array[i];
            result[i] = (b == null ? valueForNull : b);
        }
        return result;
    }

    @Nullable
    public static Character[] toObject(@Nullable char[] array) {
        if (array == null) {
            return null;
        } else if (array.length == 0) {
            return new Character[0];
        }
        final Character[] result = new Character[array.length];
        for (int i = 0; i < array.length; i++) {
            result[i] = array[i];
        }
        return result;
    }

    ///////////////////////////////////////////////////////////////////////////
    // long converters
    ///////////////////////////////////////////////////////////////////////////

    @Nullable
    public static long[] toPrimitive(@Nullable Long[] array) {
        if (array == null) {
            return null;
        } else if (array.length == 0) {
            return new long[0];
        }
        final long[] result = new long[array.length];
        for (int i = 0; i < array.length; i++) {
            result[i] = array[i];
        }
        return result;
    }

    @Nullable
    public static long[] toPrimitive(@Nullable Long[] array, long valueForNull) {
        if (array == null) {
            return null;
        } else if (array.length == 0) {
            return new long[0];
        }
        final long[] result = new long[array.length];
        for (int i = 0; i < array.length; i++) {
            Long b = array[i];
            result[i] = (b == null ? valueForNull : b);
        }
        return result;
    }

    @Nullable
    public static Long[] toObject(@Nullable long[] array) {
        if (array == null) {
            return null;
        } else if (array.length == 0) {
            return new Long[0];
        }
        final Long[] result = new Long[array.length];
        for (int i = 0; i < array.length; i++) {
            result[i] = array[i];
        }
        return result;
    }

    ///////////////////////////////////////////////////////////////////////////
    // int converters
    ///////////////////////////////////////////////////////////////////////////

    @Nullable
    public static int[] toPrimitive(@Nullable Integer[] array) {
        if (array == null) {
            return null;
        } else if (array.length == 0) {
            return new int[0];
        }
        final int[] result = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            result[i] = array[i];
        }
        return result;
    }

    @Nullable
    public static int[] toPrimitive(@Nullable Integer[] array, int valueForNull) {
        if (array == null) {
            return null;
        } else if (array.length == 0) {
            return new int[0];
        }
        final int[] result = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            Integer b = array[i];
            result[i] = (b == null ? valueForNull : b);
        }
        return result;
    }

    @Nullable
    public static Integer[] toObject(@Nullable int[] array) {
        if (array == null) {
            return null;
        } else if (array.length == 0) {
            return new Integer[0];
        }
        final Integer[] result = new Integer[array.length];
        for (int i = 0; i < array.length; i++) {
            result[i] = array[i];
        }
        return result;
    }

    ///////////////////////////////////////////////////////////////////////////
    // short converters
    ///////////////////////////////////////////////////////////////////////////

    @Nullable
    public static short[] toPrimitive(@Nullable Short[] array) {
        if (array == null) {
            return null;
        } else if (array.length == 0) {
            return new short[0];
        }
        final short[] result = new short[array.length];
        for (int i = 0; i < array.length; i++) {
            result[i] = array[i];
        }
        return result;
    }

    @Nullable
    public static short[] toPrimitive(@Nullable Short[] array, short valueForNull) {
        if (array == null) {
            return null;
        } else if (array.length == 0) {
            return new short[0];
        }
        final short[] result = new short[array.length];
        for (int i = 0; i < array.length; i++) {
            Short b = array[i];
            result[i] = (b == null ? valueForNull : b);
        }
        return result;
    }

    @Nullable
    public static Short[] toObject(@Nullable short[] array) {
        if (array == null) {
            return null;
        } else if (array.length == 0) {
            return new Short[0];
        }
        final Short[] result = new Short[array.length];
        for (int i = 0; i < array.length; i++) {
            result[i] = array[i];
        }
        return result;
    }

    ///////////////////////////////////////////////////////////////////////////
    // byte converters
    ///////////////////////////////////////////////////////////////////////////

    @Nullable
    public static byte[] toPrimitive(@Nullable Byte[] array) {
        if (array == null) {
            return null;
        } else if (array.length == 0) {
            return new byte[0];
        }
        final byte[] result = new byte[array.length];
        for (int i = 0; i < array.length; i++) {
            result[i] = array[i];
        }
        return result;
    }

    @Nullable
    public static byte[] toPrimitive(@Nullable Byte[] array, byte valueForNull) {
        if (array == null) {
            return null;
        } else if (array.length == 0) {
            return new byte[0];
        }
        final byte[] result = new byte[array.length];
        for (int i = 0; i < array.length; i++) {
            Byte b = array[i];
            result[i] = (b == null ? valueForNull : b);
        }
        return result;
    }

    @Nullable
    public static Byte[] toObject(@Nullable byte[] array) {
        if (array == null) {
            return null;
        } else if (array.length == 0) {
            return new Byte[0];
        }
        final Byte[] result = new Byte[array.length];
        for (int i = 0; i < array.length; i++) {
            result[i] = array[i];
        }
        return result;
    }

    ///////////////////////////////////////////////////////////////////////////
    // double converters
    ///////////////////////////////////////////////////////////////////////////

    @Nullable
    public static double[] toPrimitive(@Nullable Double[] array) {
        if (array == null) {
            return null;
        } else if (array.length == 0) {
            return new double[0];
        }
        final double[] result = new double[array.length];
        for (int i = 0; i < array.length; i++) {
            result[i] = array[i];
        }
        return result;
    }

    @Nullable
    public static double[] toPrimitive(@Nullable Double[] array, double valueForNull) {
        if (array == null) {
            return null;
        } else if (array.length == 0) {
            return new double[0];
        }
        final double[] result = new double[array.length];
        for (int i = 0; i < array.length; i++) {
            Double b = array[i];
            result[i] = (b == null ? valueForNull : b);
        }
        return result;
    }

    @Nullable
    public static Double[] toObject(@Nullable double[] array) {
        if (array == null) {
            return null;
        } else if (array.length == 0) {
            return new Double[0];
        }
        final Double[] result = new Double[array.length];
        for (int i = 0; i < array.length; i++) {
            result[i] = array[i];
        }
        return result;
    }

    ///////////////////////////////////////////////////////////////////////////
    // float converters
    ///////////////////////////////////////////////////////////////////////////

    @Nullable
    public static float[] toPrimitive(@Nullable Float[] array) {
        if (array == null) {
            return null;
        } else if (array.length == 0) {
            return new float[0];
        }
        final float[] result = new float[array.length];
        for (int i = 0; i < array.length; i++) {
            result[i] = array[i];
        }
        return result;
    }

    @Nullable
    public static float[] toPrimitive(@Nullable Float[] array, float valueForNull) {
        if (array == null) {
            return null;
        } else if (array.length == 0) {
            return new float[0];
        }
        final float[] result = new float[array.length];
        for (int i = 0; i < array.length; i++) {
            Float b = array[i];
            result[i] = (b == null ? valueForNull : b);
        }
        return result;
    }

    @Nullable
    public static Float[] toObject(@Nullable float[] array) {
        if (array == null) {
            return null;
        } else if (array.length == 0) {
            return new Float[0];
        }
        final Float[] result = new Float[array.length];
        for (int i = 0; i < array.length; i++) {
            result[i] = array[i];
        }
        return result;
    }

    ///////////////////////////////////////////////////////////////////////////
    // boolean converters
    ///////////////////////////////////////////////////////////////////////////

    @Nullable
    public static boolean[] toPrimitive(@Nullable Boolean[] array) {
        if (array == null) {
            return null;
        } else if (array.length == 0) {
            return new boolean[0];
        }
        final boolean[] result = new boolean[array.length];
        for (int i = 0; i < array.length; i++) {
            result[i] = array[i];
        }
        return result;
    }

    @Nullable
    public static boolean[] toPrimitive(@Nullable Boolean[] array, boolean valueForNull) {
        if (array == null) {
            return null;
        } else if (array.length == 0) {
            return new boolean[0];
        }
        final boolean[] result = new boolean[array.length];
        for (int i = 0; i < array.length; i++) {
            Boolean b = array[i];
            result[i] = (b == null ? valueForNull : b);
        }
        return result;
    }

    @Nullable
    public static Boolean[] toObject(@Nullable boolean[] array) {
        if (array == null) {
            return null;
        } else if (array.length == 0) {
            return new Boolean[0];
        }
        final Boolean[] result = new Boolean[array.length];
        for (int i = 0; i < array.length; i++) {
            result[i] = (array[i] ? Boolean.TRUE : Boolean.FALSE);
        }
        return result;
    }


    ///////////////////////////////////////////////////////////////////////////
    // to List
    ///////////////////////////////////////////////////////////////////////////

    @SafeVarargs
    public static <T> List<T> toList(@Nullable T... array) {
        if (array == null || array.length == 0) {
            return Collections.emptyList();
        }
        return Arrays.asList(array);
    }

    @SafeVarargs
    public static <T> List<T> toUnmodifiableList(@Nullable T... array) {
        return Collections.unmodifiableList(toList(array));
    }

    @SafeVarargs
    public static <T> List<T> toArrayList(@Nullable T... array) {
        List<T> list = new ArrayList<>();
        if (array == null || array.length == 0) return list;
        list.addAll(Arrays.asList(array));
        return list;
    }

    @SafeVarargs
    public static <T> List<T> toLinkedList(@Nullable T... array) {
        List<T> list = new LinkedList<>();
        if (array == null || array.length == 0) return list;
        list.addAll(Arrays.asList(array));
        return list;
    }


    ///////////////////////////////////////////////////////////////////////////
    // to List
    ///////////////////////////////////////////////////////////////////////////

    public static <T> void sort(@Nullable T[] array, Comparator<? super T> c) {
        if (array == null || array.length < 2) return;
        Arrays.sort(array, c);
    }

    public static void sort(@Nullable byte[] array) {
        if (array == null || array.length < 2) return;
        Arrays.sort(array);
    }

    public static void sort(@Nullable char[] array) {
        if (array == null || array.length < 2) return;
        Arrays.sort(array);
    }

    public static void sort(@Nullable double[] array) {
        if (array == null || array.length < 2) return;
        Arrays.sort(array);
    }

    public static void sort(@Nullable float[] array) {
        if (array == null || array.length < 2) return;
        Arrays.sort(array);
    }

    public static void sort(@Nullable int[] array) {
        if (array == null || array.length < 2) return;
        Arrays.sort(array);
    }

    public static void sort(@Nullable long[] array) {
        if (array == null || array.length < 2) return;
        Arrays.sort(array);
    }

    public static void sort(@Nullable short[] array) {
        if (array == null || array.length < 2) return;
        Arrays.sort(array);
    }


    ///////////////////////////////////////////////////////////////////////////
    // toString
    ///////////////////////////////////////////////////////////////////////////

    public static String toString(@Nullable Object array) {
        if (array == null) return "null";
        if (array instanceof Object[]) {
            return Arrays.deepToString((Object[]) array);
        } else if (array instanceof boolean[]) {
            return Arrays.toString((boolean[]) array);
        } else if (array instanceof byte[]) {
            return Arrays.toString((byte[]) array);
        } else if (array instanceof char[]) {
            return Arrays.toString((char[]) array);
        } else if (array instanceof double[]) {
            return Arrays.toString((double[]) array);
        } else if (array instanceof float[]) {
            return Arrays.toString((float[]) array);
        } else if (array instanceof int[]) {
            return Arrays.toString((int[]) array);
        } else if (array instanceof long[]) {
            return Arrays.toString((long[]) array);
        } else if (array instanceof short[]) {
            return Arrays.toString((short[]) array);
        }
        throw new IllegalArgumentException("Array has incompatible type: " + array.getClass());
    }
}
