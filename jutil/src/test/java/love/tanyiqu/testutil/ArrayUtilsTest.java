package love.tanyiqu.testutil;

import love.tanyiqu.jutil.core.ArrayUtils;
import org.junit.Test;

public class ArrayUtilsTest {


    @Test
    public void test() {

        /*
        int[] ints = ArrayUtils.newIntArray(1, 2, 3, 4, 5, 5, 57);
        System.out.println(Arrays.toString(ints));
        */

        /*
        int[] emp = ArrayUtils.newIntArray();

        System.out.println(ArrayUtils.getLength(ints));

        System.out.println(ArrayUtils.isEmpty(emp));

        ArrayUtils.set(ints, 1, 666);

        System.out.println(ArrayUtils.isEmpty(ints));

        System.out.println(ArrayUtils.get(ints, -5, null));
        System.out.println(ArrayUtils.get(ints, 7));

        */

//        ArrayUtils.reverse(ints);
//
//        System.out.println(Arrays.toString(ints));
//        System.out.println(Arrays.toString(ArrayUtils.subArray(ints,1,3)));

//        Integer[] integers = new Integer[5];
//        integers[0] = 4;
//        integers[1] = 4;
//        integers[2] = 4;
//        integers[3] = 5;
//        integers[4] = 4;

        /*

        int index = ArrayUtils.indexOf(integers, 5);
        System.out.println(index);
        System.out.println(ArrayUtils.lastIndexOf(integers, 5));
        */

        float[] floats = new float[]{1.1f, 1.2000f, 1.3f, 1.444f, 0};

//        System.out.println(ArrayUtils.indexOf(floats, 1.2f));


//        List<Float> floatList = ArrayUtils.toList(ArrayUtils.toObject(floats));
//        System.out.println(floatList);
//
//
//        System.out.println(ArrayUtils.toList(integers));
//        System.out.println(ArrayUtils.toArrayList(integers));
//        System.out.println(ArrayUtils.toLinkedList(integers));
//        System.out.println(ArrayUtils.toUnmodifiableList(integers));

        System.out.println(ArrayUtils.toList(ArrayUtils.toObject(floats)));
        ArrayUtils.sort(floats);
        System.out.println(ArrayUtils.toList(ArrayUtils.toObject(floats)));

    }


}
