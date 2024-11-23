package ch02.practice;


// 1부터 1000까지 소수 갯수와 나눗셈 수 구하기
public class practice2_10 {
    public static void main(String[] args) {
        int count= 0; // 나눗셈 몇번
        int sosu= 0; //소수갯수
        int[]prime=new int[500];

        prime[sosu++] = 2; // 소수를 저장할 배열의 0번쨰 인덱스에 2를 넣음 1은 소수가 아니라 2부터 소수임

        for (int i = 3; i <=1000 ; i+=2) { // 짝수는 소수가 아니기 떄문에 i +=2
            int j;
            for (j = 1; j <sosu ; j++) {
                count++;
                if(i%prime[j]==0){
                    break;
                }
            }
           if (sosu==j)
               prime[sosu++] = i;
        }
        for (int i = 0; i <sosu ; i++) {
            System.out.println(prime[i]);

        }
        System.out.println(count);

    }
}
