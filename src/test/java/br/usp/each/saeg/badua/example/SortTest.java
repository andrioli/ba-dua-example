package br.usp.each.saeg.badua.example;

import static br.usp.each.saeg.badua.example.Sort.sort;

import java.util.Arrays;

public class SortTest extends junit.framework.TestCase {

    public void testSort() {
        final int[] array = new int[] { 2, 3, 1 };
        final int[] expected = new int[] { 3, 2, 1 };
        sort(array, array.length);
        assertTrue(Arrays.equals(expected, array));
    }

}
