package br.usp.each.saeg.badua.example;

public class Sort {

    public static void sort(final int[] a, final int n) {
        int sortupto, maxpos, mymax, index;
        sortupto = 0;
        while (sortupto < n - 1) {
            mymax = a[sortupto];
            maxpos = sortupto;
            index = sortupto + 1;
            while (index < n) {
                if (a[index] > mymax) {
                    mymax = a[index];
                    maxpos = index;
                }
                index++;
            }
            index = a[sortupto];
            a[sortupto] = mymax;
            a[maxpos] = index;
            sortupto++;
        }
    }

}
