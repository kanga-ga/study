package _01_.practice;

import java.util.Scanner;

public class practive1_8 {
    public static void main(String[] args) {
        int num = 0;
        Scanner input = new Scanner(System.in);
        int a= input.nextInt();
        for (int i = 0; i <a ; i++) {
            for (int j = 0; j <=i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
