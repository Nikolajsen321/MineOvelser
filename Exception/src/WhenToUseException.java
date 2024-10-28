//public class WhenToUseException {
//
//        /*
//        try - blok indeholder kode som udføres under normale forhold
//        catch - blok udføres under exceptionelle forhold
//        Exception handling separates Error - handling code from
//        normal programing tasks, derved gør programmet nemmer at læse og modificer
//        dog kræver exception handling, kræver normalt mere tid og resources
//        fordi det kræver instans af et nyt exception objekt, ruller call stack
//        tilbage og udbrede undtagelsen gennem en kæde af metode calls for at søge
//        for handler
//
//        Exception sker i en metode. Hivs man vil have exception skal procssed af
//        dens caller så skal man lave et exception objekt og throw det
//
//        Hvis man kan håndrtere exception i en metode hvor den opstår
//        der ingen grund til at throw eller bruge en exception
//
//        Generalt, normal forkomende exceptions der kan opstå i flere classer i et projekt
//        er kandiadter for exception klasser.
//
//        Simple Error der kan opstå i individuelle metoder er bedst håndteret uden
//        throwing exception, det kan gøres ved bruge if statements for at chekke for errors
//
//        Man bruger altså en try - catch blok  når man har med uventtet,
//        man bruger ikke en try - catch hvis man har med simpel forventet situationer
//
//         */
//    public static void main(String[] args) {
//        // eksempel på hvornår man ikke skal bruge try - catch
//        try {
//            // ref er et objekt af en klasse
//            System.out.println(ref.toString);
//        } catch (NullPointerException e){
//            System.out.println("ref er null");
//        }
//        // erstattes af
//        if(refVar != null){
//            System.out.println(refVar.toString);
//        }else {
//            System.out.println("refVar er null");
//        }
//
//    }
//}
