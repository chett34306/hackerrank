package practiceforinterviews;

abstract class Shape
{
    String Color;
    String shape_name;

    /**
     * @param shape_name
     */
    public Shape(String shape_name)
    {
        this.shape_name = shape_name;
    }
    abstract double area();
    /**
     * @return
     */
    abstract double perimeter();

}