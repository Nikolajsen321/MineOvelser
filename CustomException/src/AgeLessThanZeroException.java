public class AgeLessThanZeroException extends  RuntimeException {
    public AgeLessThanZeroException(){

    }
    public AgeLessThanZeroException(String message){
        // husk det er en subException af Exception class der kan man kalde super
        // så man kalder Exception class constructoren  eller subclass
        super(message);

    }

    public AgeLessThanZeroException(Throwable cause){
        super(cause);
    }

    public AgeLessThanZeroException(String message,Throwable cause){
        super(message,cause);
    }


}
