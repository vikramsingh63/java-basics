class Rectangle {

    double length;
    double width;

   
    Rectangle(double l, double w) {
        length = l;
        width = w;
    }

    
    double calculateArea() {
        return length * width;
    }

    double calculatePerimeter() {
        return 2 * (length + width);
    }
}

public class Main {
    public static void main(String[] args) {
        
        Rectangle myRectangle = new Rectangle(5.0, 3.0);

       
        double area = myRectangle.calculateArea();
        double perimeter = myRectangle.calculatePerimeter();


        System.out.println("Area of the rectangle: " + area);
        System.out.println("Perimeter of the rectangle: " + perimeter);
    }
}
