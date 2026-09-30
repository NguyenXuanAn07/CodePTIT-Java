package ThucHanh1;

import java.util.Scanner;

public class J01001 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int width = scanner.nextInt();
        if (length <= 0 || width <= 0){
            System.out.println("0");
        } else {
            int square = length*width;
            int perimeter = (length+width)*2;
            System.out.println(perimeter + " " + square);
        }
    }
}
