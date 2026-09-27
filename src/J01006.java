import java.util.Scanner;
public class J01006 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNext()){
            long t = scanner.nextLong();
            for (int i = 0; i<= t; i++){
                long n = scanner.nextLong();
                if (n == 1){
                    System.out.println(0);
                } else if (n == 2){
                    System.out.println(1);
                } else{
                    long f1 = 1;
                    long f2 = 1;
                    long fn = 0;

                    for(int j = 3; j<=n; j ++){
                        fn = f1+f2;
                        f1=f2;
                        f2=fn;
                    }
                    System.out.println(fn);
                }
            }
        }
    }
}
