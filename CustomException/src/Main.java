public class Main {
    public static void main(String[] args) throws AgeLessThanZeroException {
//        validateAge(-1);
        System.out.println(args.length);

        try {
            validateAge1(-1);
        }catch (AgeLessThanZeroException e){
            e.printStackTrace();
            e.getMessage();
            System.out.println("\n" + e.getMessage());
            System.out.println("\n" + e.toString());
        }

    }

    private static void validateAge1(int age) {
        if(age < 0){
            throw new AgeLessThanZeroException("Skal være over 0 ",new AgeLessThanZeroException());
//            throw new AgeLessThanZeroException();
        }
    }

    public static void validateAge(int age) throws AgeLessThanZeroException{
        if(age < 0){
            throw new AgeLessThanZeroException("Skal være over 0 ",new AgeLessThanZeroException());
//            throw new AgeLessThanZeroException();
        }
        
    }
}