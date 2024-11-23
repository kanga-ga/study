package ch02.practice;

import java.util.Arrays;
import java.util.Scanner;
// 배열의 원소가 같은지 확인하는 메소드 실습
public class practice2_7 {
    static boolean arrayEqual(int[]a,int[]b){
        if(a.length != b.length){
            return false;
        }
        for (int i = 0; i < a.length ; i++) {
            if(a[i]!=b[i]){
                return false;
            }

        }
    return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int []a = new int[size];
        for (int i = 0; i <size ; i++) {
            System.out.println("원소값 입력");
            a[i] = input.nextInt();
        }
        System.out.println(Arrays.toString(a));
        int size1 = input.nextInt();
        int []b = new int[size1];
        for (int i = 0; i <size1 ; i++) {
            System.out.println("원소값 입력");
            b[i] = input.nextInt();
        }
        System.out.println(Arrays.toString(b));
        System.out.println(arrayEqual(a,b)?"같습니다":
                "같지않습니다.");
    }



}
