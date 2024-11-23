package ch02.practice;

public class practice2_11 {
    public static void main(String[] args) {
        int count = 0;
        int sosu = 0;

        int[] array = new int[500];

        array[sosu++] = 2;
        array[sosu++] = 3;

        for (int i = 5; i < 1000; i += 2) {
            boolean flag = false;
            int j;
            for (j = 1; array[j]* array[j]<=i ; j++) {
                count +=2;
                if (i % array[j] == 0) {
                    flag =true;
                    break;
                }
            }
            if (!flag){
                array[sosu++] = j;
                count++;
            }
        }
        for (int i = 0; i <sosu ; i++) {
            System.out.println(array[i]);
        }
        System.out.println(count);
    }
}
