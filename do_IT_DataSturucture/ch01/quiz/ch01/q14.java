package _01_.quiz.ch01;

import java.util.Scanner;

public class q14 {
    public static void main(String[] args) {
        System.out.println("사각형을 출력합니다");
        Scanner input = new Scanner(System.in);
        int a= input.nextInt();
        int[][] array = new int[a][a];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length ; j++) {
                System.out.print("*");

            }
            System.out.println();
        }
    }
}
