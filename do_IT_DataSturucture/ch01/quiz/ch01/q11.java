package _01_.quiz.ch01;

import java.util.Scanner;

public class q11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a= input.nextInt();
        int result =1;
        while (a / 10 != 0){
            a= a/10;  //a= a/10 a+=10 == a= a+10
            result++;

        }
        System.out.println(result);
        }
}
