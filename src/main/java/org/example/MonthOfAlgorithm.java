package org.example;

public class MonthOfAlgorithm {
    public static void main(String[] args) {
        int quarterOf = quarterOf(2);
        System.out.println(quarterOf);
    }
    public static int quarterOf(int month) {
        if (month < 1 || month > 12) {
            throw new IllegalArgumentException ("Invalid month value" + month);
        }
        return (month - 1)/3 + 1;
    }
}
