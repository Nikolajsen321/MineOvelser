import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        /*
        Forbedre performance med en stream og aggregate operationer

        java giver en bedre måde til at kører en collection igennem
        istedet for at lave et foreach
         */
        Double[] numbers = {2.4, 55.6, 90.12, 26.6};
        Set<Double> set = new HashSet<>(Arrays.asList(numbers));
        int count = 0;
        for (double e: set)
            if (e > 60)
                count++;
        System.out.println("Count is " + count);
        /*
        Ved at man bruger en aggregate funktion
         */
        System.out.println("Aggregate operation Counter is " +
                set.stream().filter(e->e>60).count());

        /*
        invoking stream metode set returns en Stream for elements for et set
        filter metode  specficer en betingelse for selecting elements i stream der opfylder betingelse

        En collection stream  eller simple  stream er en sekevens af elementer
        operation på stream kaldes aggregate operation (stream operations)  apllies til alt data
        i stream


        //STREAM PIPELINES


        En stream pipeline består af stream lavet af data source, nul eller flere intermediate
        metoder og en sidste terminal metode

        et array eller collection er et objekt for at lager data
        stream er et transient object for processing data
        efter data process dør stream

        Collection frame work har  stream() metoden
        Stream interface extend BaseStream interface og indholder de aggregate metoder og utility metoder

        så fx
         */
        set.stream().limit(50).distinct().count();
        /*
        set = source
        stream() = create a stream
        limit() & distinct() = zero or more intermediate metoder
        count() = En terminal metode
         */

        System.out.println();

        String[] names = {"John", "Peter", "Susan", "Kim", "Jen",
                "George", "Alan", "Stacy", "Michelle", "john"};

        //Display de første fire navn  sorted
        Stream.of(names).limit(4).sorted().forEach(e-> System.out.println(e + " "));


    }
}