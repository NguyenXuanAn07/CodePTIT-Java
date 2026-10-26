
import java.util.Scanner;



import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class J02007 {

    public static boolean isPrime(int n) {
        if (n < 2) return false;

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for (int test = 1; test <= t; test++) {
            int n = sc.nextInt();

            Map<Integer, Integer> map = new LinkedHashMap<>();

            for (int i = 0; i < n; i++) {
                int x = sc.nextInt();

                if (isPrime(x)) {
                    map.put(x, map.getOrDefault(x, 0) + 1);
                }
            }

            System.out.println("Test " + test + ":");

            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                System.out.println(entry.getKey() + " " + entry.getValue());
            }
        }

        sc.close();
    }
}
