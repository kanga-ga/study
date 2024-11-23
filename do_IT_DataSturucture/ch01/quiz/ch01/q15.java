package _01_.quiz.ch01;

public class q15 {
    static void triangleLB(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void triangleLU(int n) {
        for (int i = n; i > 0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");

            }
            System.out.println();
        }
    }

    static void triangleRU(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j >= i)
                    System.out.print("*");
                else
                    System.out.print(" ");

            }
            System.out.println();
        }
    }
    static void triangleRB(int n){
        for (int i = n; i >=0 ; i--) {
            for (int j = 0; j <n ; j++) {
                if (j>=i){
                    System.out.print("*");
                }else System.out.print(" ");

            }
            System.out.println();
        }
    }


    public static void main(String[] args) {

        triangleLB(5);
        System.out.println();
        triangleLU(5);
        System.out.println();
        triangleRU(5);
        System.out.println();
        triangleRB(5);
    }
}
