import java.util.Scanner;

public class J04002 {
    private final int a;
    private final int b;
    private String color;

    public J04002(int a, int b) {
        this.a = a;
        this.b = b;

    }
    public int getPerimeter(){
        return 2*(a+b);
    }
    public int getArea(){
        return a*b;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a>0 && b>0){
            J04002 rectangle = new J04002(a, b);
            System.out.println("Chu vi: " + rectangle.getPerimeter());
            System.out.println("Dien tich: " + rectangle.getArea());
        }
        sc.close();
    }
}
