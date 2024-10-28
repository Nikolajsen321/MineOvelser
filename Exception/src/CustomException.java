import java.util.Random;

public class CustomException extends Exception{
    /*
    Man kan definere en custom exception klasse ved at udvide:
    java.lang.Exception
    Java har en del Exception class, som man bruger så længe det muligt
    Man bruger en Custom når man støder på et problem der ikke rigtig kan beskrives

    Man kan lave sin egen Exception class, derived fra Exception,
    eller fra en subclass af Exception som fx IOException
     */

    private  double radius;
    public static void main(String[] args) {
        /*
        Ex. CircleWithException. java setRadius metode throws en Exception
        hvis radius negativ antag du ønsker at passer radius til handler
        i det tilfælde eksempel:
         */

    }

    public CustomException(double radius) {
        super("Invalid radius " + radius);
        this.radius = radius;
    }
    /*
    Custom exception class extends java.lang.Exception  linje 3
    alle metoder  e.getMessage, toString og printStackTrace() i Exception
    er arvet af Throwable. Exception class indeholder fire constructors
    blandet dem bruges ofte constructor bruges
    + Exception() - Construct an exception with no message
    + Exception(message: String) - Construct an exception with specified message
    + Exception(message: String, cause: Exception) -
    - Consturct an exception with specified message and a cause. This forms a chained exception
     */
    public double getRadius(){
        return radius;
    }


}
