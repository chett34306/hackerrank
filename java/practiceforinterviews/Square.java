package practiceforinterviews;



public class Square extends Shape{

    int side;
    /**
     * @param value
     */
    public Square(int value)
    {
        super("Square");
        side = value;       
    }
    /* (non-Javadoc)
     * @see practiceforinterviews.Shape#area()
     */
    @Override
    public double area()
    {
        return side * side;
    }

    @Override
    public double perimeter()
    {
        return 4*side;
    }

    public int area1()
    {
        return side * side;
    }

    /**
     * @return
     */
    public String Name()
    {
        return null;
    }
}

/*
public class Abstraction {

    public static void main(String[] args)
    {
        Shape s = new Square(10);
        System.out.println(s.area());
    }
    
}
 */
