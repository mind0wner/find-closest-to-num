package com.task;

import java.util.Scanner;

import static java.lang.Math.*;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {-1, 2, 3, 5, -4, 1, -6};
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter num: ");
            int num = sc.nextInt();
            System.out.println("In set array, closest to "+num+": " + findClosestToNum(numbers, num));
        }
    }

    private static int findClosestToNum(int[] ints, int x) {
        int min = ints[0];
        for (int num : ints) {
            if (abs(num - x) < abs(x - min)) {
                min = num;
            }
        }
        return abs(min);
    }
}