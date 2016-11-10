package br.usp.each.saeg.badua.example;

import junit.framework.Test;
import junit.framework.TestSuite;

public class Suite {

    public static Test suite() {
        final TestSuite suite = new TestSuite();
        suite.addTestSuite(MaxTest.class);
        suite.addTestSuite(SortTest.class);
        return suite;
    }

}
