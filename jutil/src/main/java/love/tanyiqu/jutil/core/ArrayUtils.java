package love.tanyiqu.jutil.core;

import com.sun.istack.internal.Nullable;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Array utils
 */
@SuppressWarnings({"unused", "DuplicatedCode"})
public final class ArrayUtils {

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

}
