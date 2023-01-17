package practiceforinterviews;

public class Circle extends Shape{
    
    int radius;
    public Circle(int value)
    {
        super("Circle");
        this.radius = value;
    }

    @Override
    public double area()
    {
        return 3.14*radius*radius;
    }

    @Override
    double perimeter() {
        
        return 2*3.14*radius;
    }
}
