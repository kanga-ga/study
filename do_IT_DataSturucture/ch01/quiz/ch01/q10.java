package _01_.quiz.ch01;

import java.util.Scanner;

public class q10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        System.out.println("a의 값"+ a);
        int b = input.nextInt();
        System.out.println("b의 값"+ b);
        while (b < a) {
            System.out.println("a보다 큰값을 입력하십시요");
            b = input.nextInt();
            System.out.println("b의 값"+ b);
        }

        System.out.println("b-a는" + (b-a));
    }
}

