package practiceforinterviews;

public class Car extends Vehicle {
    String name;
    String color;

    public void Vehicle() {
        name = "Car";
    }
    
    public Car() {
        name = "Car";
        color = "Yellow";
    }

    public String VehicleName() {
        return name;
    }

    public String VehicleColor()
    {
        return color;
    }
}