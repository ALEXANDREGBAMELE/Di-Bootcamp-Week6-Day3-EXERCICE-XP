package io.github.jiangdequan;

public class TriangleNumber {
    public static void main(String[] args) {
        for (int i = 0; i <= 7; i++) {
            for (int j = i; j > 0; j--) {
                System.out.print(" " + i + " ");
            }
            System.out.println("\n");
        }
    }

}