package ThucHanh1;

import java.util.Scanner;
public class toHop {
    static int N;
    static int K;
    static int[] num;
    static long total;

    static void generated(int start, int position) {
        if (position == K) {
            printCombination();
            total++;
            return;
        }

        for (int x = start; x <= N - (K - position) + 1; x++) {
            num[position] = x;
            generated(x + 1, position + 1);
        }
    }

    static void printCombination() {
        for (int i = 0; i < K; i++) {
            System.out.print(num[i] + (i == K - 1 ? "\n" : " "));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        K = sc.nextInt();

        if (K < 0 || K > N) {
            System.out.println("Tong cong co 0 to hop");
            return;
        }

        num = new int[K];
        generated(1, 0);
        System.out.println("Tong cong co " + total + " to hop");
    }
}
