package com.epam.rd.autotasks.max;

public class MaxMethod {
    public static int max(int[] values) {
        //throw new UnsupportedOperationException();
        int maxElem = values[0];

        for (int value : values) {
            if (maxElem < value) maxElem = value;
        }
        return maxElem;
    }

    public static void main(String[] args) {
        int[] vals = new int[]{ -2, 0, 10, 5 };
        int result = MaxMethod.max(vals);
        System.out.println(result == 10); // true
    }
}
