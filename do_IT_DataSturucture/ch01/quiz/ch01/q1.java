package _01_.quiz.ch01;

public class q1 {
     public static int max4(int a,int b,int c, int d) {
     int max = a;
     if (a<b){
         max=b;
     }
        if (b<c){
            max=c;
        }
        if (c<d){
            max=d;
        }
        return max;
    }

    public static void main(String[] args) {
         System.out.println(q1.max4(1,2,3,4));
    }
}
