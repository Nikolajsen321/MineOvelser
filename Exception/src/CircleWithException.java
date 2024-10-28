import java.util.Collection;

public class CircleWithException {
    private double radius;

    // number of object created
    private static int numberOfObjects = 0;

    // construct a circle with radius  1 * /


    public CircleWithException(){
        this(1.0);
    }
    // Construct a circle with a specfied radius

    public CircleWithException(double newRadius){
        setRadius(newRadius);
        numberOfObjects++;
    }

    // return radius
    public double getRadius(){
        return radius;
    }


    // set new radius

    private void setRadius(double newRadius) throws  IllegalArgumentException{
        if(newRadius >= 0){
            radius = newRadius;
        }else {
            throw new IllegalArgumentException("Radius cannot be negative");
        }
    }
    // return number of Objects

    public static int getNumberOfObjects(){
        return numberOfObjects;
    }
    // Return areal af circle
    public double findAreal(){
        return radius * radius * Math.PI;
    }
}
