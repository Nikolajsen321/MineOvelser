import java.io.FileNotFoundException;
import java.io.FileReader;

public class ChekedAndUncheked {
    public static void main(String[] args) throws FileNotFoundException{
        /*
        Cheked vs Uncheked
        cheked exception, er cheked for at compile time
         */

        // Eksempel 1 er Cheked
//        try {
//            readFileExCheked("MyFile.txt");
//        } catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
//        }
        readFileExCheked("MyFile.txt");
        String name = "John";

        name = null;
        readFileEx2UnCheked(name);
        /*
        Uncheked
        i en chekked så man håndtere med en try - catch blok eller declare man thrower det
        i metode signature.
        Dette er ikke sandt for unchekked Exception
         */

    }

    private static void readFileEx2UnCheked(String myString) {
        // hvis man nu sætter name til null i stedet altså får den jo en nullpointerException
        /*
        man har altså en case hvor man kan få en NullPointerException uden java
        giver en compilation error
        altså får java ikke en til at catch den i en try - catch og det
        tvinger ikke en til at Declare. Det er hovedforskellen mellem cheked og uncheked
        Men man kan sagten benytte en Declare og try - catch blok hvis man vil
        Man burde stadig lave en try - catch blok så programmet ikke bare terminater stopper
        Det vil sige i java er alle RuntimeException og alle subclass er unchekked exception
        og alle Exception der ikke er en runtime exception  eller subclass af runtime
        er en chekked exception og det inkludere exception class selv og alle andre subclass
        dog ikke runtime

         */
        // her ses forskellen tydelig på en unchekked og chekked exception
//        throw new Exception();
//        throw new RuntimeException();
        System.out.println(myString.length());
    }

    private static void readFileExCheked(String fileName) throws FileNotFoundException{
        // CHEKED EXCEPTION:
        // fx får man en Error her som fortæller at Java kan give en Exception FileNotfound exception
        // dette er en cheked exception
        /* Det vil sige en exception java får en til at ordne
        Når der skal compiles, så før programmet kan compile chekker java
        om man har med muligheden for at exception kan ske
        Hvis det var en unchekked exception, ville man ikke se den Error ved FileReader
         */
//        FileReader reader = new FileReader(fileName);
        /*
        Cheked Exception:
        Det kan løses på 1 af to måder
        Man kan lave en try catch - blok omkring den kode som throws exception
         */
//        try {
//            FileReader reader = new FileReader(fileName);
//
//        }catch (FileNotFoundException e){
//            System.out.println("Hey that file does not exist!");
//        }
        /*
        Man fortæller at java at dette kode som man caller kan kaste en exception
        men man ikke vil gøre noget ved det så man Declare altså dette kode i metoden
        kan kaste en exception FileNotFoundException, altså den throw declartion i metoden
        sætte på metoden her    throws FileNotFoundException
        2 måde er at lave en throw filenotfound

         */
        FileReader reader = new FileReader(fileName);

        //man problemmet kommer så ude i main som er en cheked exception igen som skal løses
        /*
        Altså er det opstået den nøjagtig samme fejl hvor man caller readFile metode
        som nu får en error, altså når denne FileNotFoundException kastes er der intet
        i metoden til at catch så den kastes bare ud til den kode som kaldte metoden
        nu skal metoden readFile så kaste en FileNotFoundException, og siden det stadig er en
        cheked skal det ordnes ved main altså her
         Problemet  kan altså løses  på samme måde ved
          at lave en try - catch blok eller declare throwable i metode signature
          Nu sker der dog ikke en anden fejl som i metoden, da det er main metoden
          Så man vil atlså et sted i sin metode hieraki vil man have en try - catch blok
          der fanger exception og håndtere det ordenligt

         */
    }

}