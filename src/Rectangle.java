import java.util.Scanner;

public class Rectangle {
    private double height;
    private  double width;
    private String color;

    public Rectangle(double height, double width, String color) {
        this.height = height;
        this.width = width;
        this.color = color;
    }
    public double findPerimeter(){
        return 2*(height+width);
    }
    public double findArea(){
        return height*width;
    }
    public void setColor(){
        this.color = color;
    }
    public String getColor(){
        return color;
    }
    public void setHeight(){
        this.height = height;
    }
    public double getHeight(){
        return height;
    }
    public void setWidth(){
        this.width = width;
    }
    public double getWidth(){
        return width;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double height = sc.nextInt();
        double width = sc.nextInt();
        String color = sc.nextLine();
        if (height>0 && width>0){
            Rectangle rectangle = new Rectangle(height, width, color);
            System.out.println((int)rectangle.findPerimeter() + " " + (int)rectangle.findArea() + " " + rectangle.getColor());
        }else {
            System.out.println("INVALID");
        }
        sc.close();
    }
}
