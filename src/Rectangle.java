import java.util.Scanner;
public class Rectangle {
    private final int a;
    private final int b;

    public Rectangle(int a, int b) {
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
            Rectangle rectangle = new Rectangle(a, b);
            System.out.println("Chu vi: " + rectangle.getPerimeter());
            System.out.println("Dien tich: " + rectangle.getArea());
        }
        sc.close();
    }
}
