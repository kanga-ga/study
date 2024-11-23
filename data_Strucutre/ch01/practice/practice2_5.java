package ch02.practice;
import java.util.Random;
import java.util.Scanner;


// 배열 최댓 값찾기
public class practice2_5 {
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
        Random random = new Random();
        Scanner input = new Scanner(System.in);
        System.out.println("최대 값을 구합니다");
        System.out.println("사람수 : ");
        int num = input.nextInt();
        int[] height = new int[num];

        for (int i = 0; i <num ; i++) {
            height[i] = 100+ random.nextInt(90);
            System.out.println("height" +i+":"+ height[i]);

        }
        System.out.println("최대값은" + maxOf(height)+"입니다");

    }

}
