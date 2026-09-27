import java.util.Scanner;
public class J01004 {
    public static boolean isPrime(int n){
        if(n<2){
            return false;
        }
        else {
            for (int i = 2; i*i < n + 1; i++) {
                if (n % i == 0) {
                    return false;
                }
            }
            return true;
            }
        }



    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        if (scn.hasNextInt()){
            while(t-- >0 && scn.hasNext()){
                int n = scn.nextInt();
                if (isPrime(n)){
                    System.out.println("YES");
                }else {
                    System.out.println("NO");
                }
            }
        }
        scn.close();
    }
}