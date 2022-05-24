package com.company;

import java.util.Scanner;

public class P03RectangleArea_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int area = a * b;
        System.out.println(area);
    }
}
