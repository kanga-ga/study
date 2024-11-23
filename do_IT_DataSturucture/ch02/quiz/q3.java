package ch02.quiz;

import java.util.Scanner;
// 배열의 합 구하기
public class q3 {
    static int sumOf(int[]a){
        int sum=0;
        for (int i = 0; i < a.length ; i++) {
            sum += a[i];

        }
        System.out.println("배열의 합은");
        System.out.println(sum);
        return sum;

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("배열의 크기를 입력해주세요");
        int []a = new int[input.nextInt()];
        for (int i = 0; i <a.length ; i++) {
            System.out.println("배열의 내용을 입력해주세요.");
            a[i] = input.nextInt();

        }

        sumOf(a);
    }
}
