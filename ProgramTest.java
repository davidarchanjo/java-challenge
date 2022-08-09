import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

class ProgramTest {

    @Test
    void testCase1() {
        int[] array = { 7 , 6, 4, -1, 1 ,2 };
        var targetSum = 16;
        var expected = new ArrayList<>();
        expected.add(new Integer[]{7, 6, 4, -1});
        expected.add(new Integer[]{7, 6, 1, 2});
        var actual = Program.fourNumberSum(array, targetSum);
        Assertions.assertArrayEquals(expected.toArray(), actual.toArray());
    }

    @Test
    void testCase2() {
        int[] array = { 1, 2, 3, 4, 5, 6, 7 };
        var targetSum = 10;
        var expected = new ArrayList<>();
        expected.add(new Integer[]{1, 2, 3, 4});
        var actual = Program.fourNumberSum(array, targetSum);
        Assertions.assertArrayEquals(expected.toArray(), actual.toArray());
    }

    @Test
    void testCase3() {
        int[] array = { 5, -5, -2, 2, 3, -3 };
        var targetSum = 0;
        var expected = new ArrayList<>();
        expected.add(new Integer[]{5, -5, -2, 2});
        expected.add(new Integer[]{5, -5, 3, -3});
        expected.add(new Integer[]{-2, 2, 3, -3});
        var actual = Program.fourNumberSum(array, targetSum);
        Assertions.assertArrayEquals(expected.toArray(), actual.toArray());
    }

    @Test
    void testCase4() {
        int[] array = { -2, -1, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        var targetSum = 4;
        var expected = new ArrayList<>();
        expected.add(new Integer[]{-2, -1, 1, 6});
        expected.add(new Integer[]{-2, -1, 2, 5});
        expected.add(new Integer[]{-2, -1, 3, 4});
        expected.add(new Integer[]{-2, 1, 2, 3});
        var actual = Program.fourNumberSum(array, targetSum);
        Assertions.assertArrayEquals(expected.toArray(), actual.toArray());
    }

    @Test
    void testCase5() {
        int[] array = { -1, 22, 18, 4, 7, 11, 2, -5, -3 };
        var targetSum = 30;
        var expected = new ArrayList<>();
        expected.add(new Integer[]{-1, 22, 7, 2});
        expected.add(new Integer[]{-1, 18, 11, 2});
        expected.add(new Integer[]{22, 4, 7, -3});
        expected.add(new Integer[]{22, 11, 2, -5});
        expected.add(new Integer[]{18, 4, 11, -3});
        var actual = Program.fourNumberSum(array, targetSum);
        Assertions.assertArrayEquals(expected.toArray(), actual.toArray());
    }

    @Test
    void testCase6() {
        int[] array = { -10, -3, -5, 2, 15, -7, 28, -6, 12, 8, 11, 5 };
        var targetSum = 20;
        var expected = new ArrayList<>();
        expected.add(new Integer[]{-10, -3, 28, 5});
        expected.add(new Integer[]{-10, 28, -6, 8});
        expected.add(new Integer[]{-3, 2, -7, 28});
        expected.add(new Integer[]{-5, 2, 15, 8});
        expected.add(new Integer[]{-5, 2, 12, 11});
        expected.add(new Integer[]{-5, 12, 8, 5});
        expected.add(new Integer[]{-7, 28, -6, 5});
        var actual = Program.fourNumberSum(array, targetSum);
        Assertions.assertArrayEquals(expected.toArray(), actual.toArray());
    }

    @Test
    void testCase7() {
        int[] array = { 1, 2, 3, 4, 5 };
        var targetSum = 100;
        var expected = new ArrayList<>();
        expected.add(new Integer[]{});
        var actual = Program.fourNumberSum(array, targetSum);
        Assertions.assertArrayEquals(expected.toArray(), actual.toArray());
    }

    @Test
    void testCase8() {
        int[] array = { 1, 2, 3, 4, 5, -5, 6, -6 };
        var targetSum = 5;
        var expected = new ArrayList<>();
        expected.add(new Integer[]{1, 3, -5, 6});
        expected.add(new Integer[]{1, 4, 5, -5});
        expected.add(new Integer[]{1, 4, 6, -6});
        expected.add(new Integer[]{2, 3, 5, -5});
        expected.add(new Integer[]{2, 3, 6, -6});
        expected.add(new Integer[]{2, 4, 5, -6});
        var actual = Program.fourNumberSum(array, targetSum);
        Assertions.assertArrayEquals(expected.toArray(), actual.toArray());
    }
}
