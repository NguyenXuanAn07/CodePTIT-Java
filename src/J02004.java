import java.util.Scanner;
public class J02004 {
    public static void main(String[] args){
        Scanner scanner = new Scanner((System.in));
        long t = scanner.nextLong();
        while (t-- >0){
            int n = scanner.nextInt();
            if (n<=100 && n>0){
                long[] arr = new long[n];

                for (int i = 0; i<n; i++){
                    arr[i] = scanner.nextLong();
                }
                boolean ok = true;
                for(int i = 0; i<n/2; i++){
                    if (arr[i] != arr[n-1-i]){
                        ok = false;
                        break;
                    }
                }
                System.out.println(ok ? "YES":"NO");
            } else{return;}
        }
        scanner.close();
    }
}
