package ch02.practice;

public class practice2_9 {
    public static void main(String[] args) {
        int count = 1;
        for (int n = 0; n < 1000; n++) {
           int i;
            for ( i = 2; i < n; i++) {
                ++count;
                if (n % i == 0) {
                    break;
                }

            }
            if (n==i){
                System.out.println(i);
            }
        }
        System.out.println(count);
    }
}
