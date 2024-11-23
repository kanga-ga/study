package ch02.practice;

import java.util.Scanner;

public class practice2_4 {
    static int maxOf(int[] a ){
        int max=a[0];
        for (int i = 0; i <a.length ; i++) {
            if(a[i]> max){
                max = a[i];
            }

        }
        return max;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("최대 값을 구합니다");
        System.out.println("사람수 : ");
        int num = input.nextInt();
        int[] height = new int[num];

        for (int i = 0; i <num ; i++) {
            System.out.println("height" +i+":");
            height[i] = input.nextInt();
        }
        System.out.println("최대값은" + maxOf(height)+"입니다");

    }

}
