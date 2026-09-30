import java.util.Arrays;
import java.util.Scanner;

public class J02005 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int m = sc.nextInt();
        int[] b = new int[m];
        if(n>1 && m>1 && m<100 && n<100){


            for(int i = 0; i<n; i++) {
                a[i] = sc.nextInt();
            }
            for (int j = 0; j<m; j++) {
                b[j] = sc.nextInt();
            }

            int[] A = new int[n];
            int sizeA = 0;

            //Lọc a
            for (int i = 0; i<n; i++){
                boolean trung = false;
                for (int j = 0; j<n; j++){
                    if (A[j] == a[i]){
                        trung = true;
                        break;
                    }
                }
                if (!trung){
                    A[sizeA] = a[i];
                    sizeA ++;
                }
            }

            //Loc b

            int[] B = new int[m];
            int sizeB = 0;
            for (int i = 0; i<n; i++){
                boolean trung = false;
                for(int j = 0; j<n; j++){
                    if (B[j] == b[i]){
                        trung = true;
                        break;
                    }
                }
                if (!trung){
                    B[sizeB] = b[i];
                    sizeB++;
                }
            }
            int[] C = new int[Math.min(sizeA, sizeB)];
            int sizeC = 0;
            for(int i = 0; i<sizeA; i++) {
                for (int j = 0; j < sizeB;j++){
                    if(A[i] == B[j]){
                        C[sizeC] = A[i];
                        sizeC ++;
                        break;
                    }
                }
            }
            for (int i = 0; i < sizeC; i++) {
                if (i > 0) System.out.print(" ");
                System.out.print(C[i]);
            }
            System.out.println();
        }
    }
}
