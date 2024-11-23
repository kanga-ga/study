package _01_.quiz.ch01;

public class q9 {
    public static int sumof(int a, int b){
        int result =0;
        if (a>=b){
            while (b!=a+1){
                result+=b;
                b++;

        }
            System.out.println(result);
        } else if (a<=b) {
            while (a!=b+1){
                result+=a;
                a++;

            }
            System.out.println(result);
        }else {
            System.out.println("0");
        }
        return result;
    }

    public static void main(String[] args) {
            sumof(6,4);
    }
}
