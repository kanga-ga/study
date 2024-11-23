package ch02.quiz;

import java.util.Random;
import java.util.Scanner;

// 키뿐만 아니라 사람 수도 난수로 생성하도로 실습 2-5 수정
public class q1 {
    static int maxOf(int[] a ){
        if(a.length == 0){
            throw new IllegalArgumentException("배열이 비어있습니다.");
        }
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

        int num = random.nextInt(2);
        int[] height = new int[num];
        System.out.println("사람수 : "+num);
        for (int i = 0; i <num ; i++) {
            height[i] = 100+ random.nextInt(90);
            System.out.println("height" +i+":"+ height[i]);

        }
        System.out.println("최대값은" + maxOf(height)+"입니다");

    }

}


