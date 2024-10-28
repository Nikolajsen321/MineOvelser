import java.util.*;

public class ListTeori {
    public static void main(String[] args) {

        /*
           List extends collection interface og definere en collection
           For at lager elementer in a sequential order.
           For at lave en list skal man bruge en af to konkrete klasser ArrayList og LinkedList
           ArrayList og LinkedList er defineret under List interface.
           List interface extends Collection for at definere en
           ordered collection hvor duplicates er tilladt
           List adder poistion orienteret operationer og nye list iterator der tillader
           en list at blive krydset to vejs(traversed bidirectionally)
           Metoder der introducered i list interface billedet under

           ArrayList er bedst når man har behov for et få adgang til et random idex af listen uden at indsætte
           eller fjerne elementer fra start eller slutning af list er en ArrayList bedst

           Men hvis ens Applikaiton har behov for man fjerner og tilføre elementer ved start og slut
           skal man nok vælge en LinkedList

        " If you need to support random access
        through an index without inserting or removing elements at the beginning of the list, Array-
        List is the most efficient. If, however, your application requires the insertion or deletion of
        elements at the beginning of the list, you should choose LinkedList."


           Hvis der ikke er behov for dynamisk voksene altså indsætning og fjerning
           af elementer løbende af en list skal man vælge en alm Array

           ArrayList vokser selv men skrumper ikke skal bruge trimToSize()  metoden, og som for et
           array er kapaciteten size af arrayet altså mængden den kan lager


           LinkedList er altså en Linked List implementation af List inerfacet (Kædestruktur?)


           List kan holde identiske elements

           Forskel mellem ArrayList og LinkedList har at gøre med internal implemenation, der på virker
           performance. Altså igen LinkedList effektiv for inserting og remvoing elements ved starten af listen, og
           ArrayLIst er effektiv til alle andre operationer





           Kan bruge get(i) i en LinkedList men bruger meget tid  brug i stedet for each loop
           forEach metode




           */


        List<String> array = new ArrayList<>();
        List<String> linkedList = new LinkedList();


        //Java's static as list metode
        List<Integer> arrayInt = Arrays.asList(1,2,3,4,5);

        array.add("Hans");
        array.add("Jens");
        array.add("Jane");

        // addAll collection
        // foreach
        System.out.println("For each loop");
        linkedList.addAll(array);
        for(String s : array) {
            System.out.println(s);
        }
        System.out.println();
        for(String s : linkedList) {
            System.out.println(s);
        }
        System.out.println();

        //forEach metode
        System.out.println("forEach metode");
        linkedList.forEach(e -> System.out.println(linkedList + " "));

        Iterator<String> iterator =array.iterator();

        while (iterator.hasNext()){
            String name = iterator.next();
            System.out.println(name);
        }















        /*Fra den abstrakte klasse List
        ArrayList og LinkedList indeholder alle mtoderne fra List interfacet

        Abstrakt
        En abstrakt klasse har ulempen der ingen multiple arv man kan altså kun extend en klasse
        hvis den laver kædenarvning, hvis man vælger lave abstrakte klasser skal man
        tænke på der kan være begrænsning hvordan man skal lave videre på klasse diagrammet

        Interface
        Godt ved interface man kan implementere ligeså mange som vil
        Husk interface er et løfte til omverden om hvad man kan og interface skal være public
        Der kan ikke laves objekter af interface og indeholder ikke feltvariable og constructor
        Interface er en fællesgrænseflade og kan ikke implementeres
        Når klasse implementere en interface så implementeres alle metoder i interfacen

        Interface giver en anden mulighed for generic programering,
        det vil være svært at bruge generic sort metode til at sort objekter uden at bruge en interface,
        i overstående ex da multiple nedarvning vil have værert nødvendig
        for at kunne nedarve comparable og en anden klasse som rektangel på samme tid
        da java ikke understøtter multiple nedarvning
        */

        // Eksempel på at bruge en ListIterator som implementere I
        System.out.println();
        System.out.println("Eksempel på ListItterator");
        ListIterator<String> listIterator = array.listIterator();
        while (listIterator.hasNext()){
            System.out.println(listIterator.next());
        }
        System.out.println();
        while (listIterator.hasPrevious()){
            System.out.println(listIterator.previous());
        }
        

    }


}