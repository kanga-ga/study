package ch02.practice;
// 입력 받은 정수를 (2~16진수로 변환)
public class practice_2_8_1 {
        static int Converter(int x, int r, char[] d) {
            int num = 0;
            String dchar = "0123456789ABCDEF";
            do {
                d[num++] = dchar.charAt(x % r); // r진수로 변환하여 배열에 저장
                x /= r;
            } while (x != 0);
            return num; // 변환된 자릿수 반환
        }

        public static void main(String[] args) {
            char[] a = new char[20];
            int digits = Converter(24, 2, a); // 24를 2진수로 변환

            // 변환된 결과를 거꾸로 출력
            System.out.print("2진수 변환 결과: ");
            for (int i = digits - 1; i >= 0; i--) { // 유효한 범위만 출력
                System.out.print(a[i]);
            }
            System.out.println(); // 줄바꿈
        }
    }
