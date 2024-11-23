package _01_.practice;

import java.util.Scanner;

public class practice1_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int result =0;
        int n = input.nextInt();
        for (int i = 1; i <=n ; i++) {
            result += i;
            if (i< n){
                System.out.print(i+"+");
            }else {
                System.out.print(i+"=");
            }

        }
        System.out.print(result);
    }
}
