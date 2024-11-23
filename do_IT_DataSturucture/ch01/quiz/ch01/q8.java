package _01_.quiz.ch01;

import java.util.Scanner;

public class q8 {
    public static void main(String[] args) {
        int num;
        int i = 0;
        Scanner input = new Scanner(System.in);
        num = input.nextInt();
        int result = num * (num + 1) / 2;

        System.out.println(result);
    }

}

