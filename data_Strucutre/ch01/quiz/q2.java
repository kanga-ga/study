package ch02.quiz;

import java.util.Arrays;
import java.util.Scanner;
// 배열 역순으로 정렬하기
public class q2 {
    public static void swap(int[]a, int index1, int index2){
        int t = a[index1];
        a[index1] = a[index2];
        a[index2] = t;

    }
    static void reverse(int[]a ){
        for (int i = 0; i <a.length/2 ; i++) {
            System.out.println(a[i]+"과"+a[a.length-i-1]+"을 교환합니다.");
            swap(a,i, a.length-i-1);
            System.out.println(Arrays.toString(a));
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("a.length:");
        int num = input.nextInt();
        int [] array = new int[num];
        for (int i = 0; i < array.length ; i++) {
            System.out.print("원소값 :");
            array[i] = input.nextInt();
        }
        reverse(array);
        System.out.println("배열을 역순으로 정렬했습니다.");
        for (int i = 0; i <num ; i++) {
            System.out.println("array["+i + "] = " + array[i] );

        }

    }
}
