import java.util.Scanner;
public class J01002 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i=1; i<=n; i++){
            long N = scanner.nextLong();
            if (N>0){
                long S = N*(N+1)/2;
                System.out.println(S);
            }else{
                System.out.println("Please enter N>0!");
            }
        }
        scanner.close();
    }
}
