package ThucHanh1;

import java.util.Scanner;

public class counting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 1; i <= t; i++) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int j = 0; j < n; j++) {
                arr[j] = sc.nextInt();
            }

            System.out.println("Test " + i + ":");
            boolean[] visited = new boolean[n];
            for (int j = 0; j < n; j++) {
                if (visited[j]) {
                    continue;
                }

                int count = 1;
                for (int k = j + 1; k < n; k++) {
                    if (arr[k] == arr[j]) {
                        count++;
                        visited[k] = true;
                    }
                }

                System.out.println(arr[j] + " xuat hien " + count + " lan");
            }
        }
    }
}
