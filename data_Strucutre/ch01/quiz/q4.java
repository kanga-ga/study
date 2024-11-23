package ch02.quiz;

import java.util.Arrays;
import java.util.Scanner;

// 배열 b의 원소들을 배열 a로 복사
public class q4 {
    public static void copy(int[] a, int[] b) {
        int len = a.length <= b.length? a.length
                :b.length;
        for (int i = 0; i < len; i++) {
            a[i] = b[i];
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int[] a = new int[size];
        System.out.println("원소값 입력");
        for (int i = 0; i < size; i++) {
            a[i] = input.nextInt();
        }
        System.out.println(Arrays.toString(a));
        int size1 = input.nextInt();
        int[] b = new int[size1];
        System.out.println("b의 원소값 입력");
        for (int i = 0; i < size1; i++) {
            b[i] = input.nextInt();
        }
        System.out.println(Arrays.toString(b));
        copy(a,b);
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));

    }
}
