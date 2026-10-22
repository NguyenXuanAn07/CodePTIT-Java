
import java.util.Scanner;

public class Rectangle {
    private double width;
    private  double height;
    private String color;

    public Rectangle(double width, double height, String color) {
        this.height = height;
        this.width = width;
        this.color = color;
    }

    public double getWidth(){
        return width;
    }
    public void setWidth(){
        this.width = width;
    }

    public double getHeight(){
        return height;
    }
    public void setHeight(){
        this.height = height;
    }
    public String getColor(){
        return color;
    }
    public void setColor(){
        this.color = color;
    }
    public double findArea(){
        return height*width;
    }

    public double findPerimeter(){
        return 2*(height+width);
    }


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double height = sc.nextInt();
        double width = sc.nextInt();
        String color = sc.next();
        if (height>0 && width>0){
            Rectangle rectangle = new Rectangle(height, width, color);
            String cl = rectangle.getColor().substring(0, 1).toUpperCase() + rectangle.getColor().substring(1).toLowerCase();
            System.out.println((int)rectangle.findPerimeter() + " " + (int)rectangle.findArea() + " " + cl);
        }else {
            System.out.println("INVALID");
        }
        sc.close();
    }
}
