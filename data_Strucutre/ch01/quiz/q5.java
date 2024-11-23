package ch02.quiz;

import java.util.Arrays;
import java.util.Scanner;

// a에 b를 복사하는데 역순으로 복사
public class q5 extends q4 {
    static void swap(int[] a, int index1, int index2) {
        int t = a[index1];
        a[index1] = a[index2];
        a[index2] = t;
    }

    static void rcopy(int[] a) {
        for (int i = 0; i < a.length / 2; i++) {
            swap(a,i,a.length-i-1);

        }
    }


        public static void main (String[]args){
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
            copy(a, b);
            rcopy(a);
            System.out.println(Arrays.toString(a));
            System.out.println(Arrays.toString(b));

        }
    }



