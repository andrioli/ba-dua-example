package br.usp.each.saeg.badua.example;

import static br.usp.each.saeg.badua.example.Max.max;

public class MaxTest extends junit.framework.TestCase {

    public void testMax() {
        final int[] array = new int[] { 1, 2, 3, 2 };
        assertEquals(3, max(array, array.length));
    }

}
