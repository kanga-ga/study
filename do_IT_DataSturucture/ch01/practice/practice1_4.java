package _01_.practice;

import java.util.Scanner;

public class practice1_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("n의합을 구합니다");
        System.out.println("n의 값을 입력하십시요");
        int cnt =0;
        int result = 0;
        int n=1;
        int i= input.nextInt();
        while(n<=i){
            result +=n;
            n++;
            System.out.println("n의합"+result);
        }
        System.out.println(result);
    }
}
