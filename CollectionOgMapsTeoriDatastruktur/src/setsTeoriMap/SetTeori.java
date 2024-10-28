package setsTeoriMap;

import java.util.*;

public class SetTeori {
    public static void main(String[] args) {
        /*Fx en liste der skal hvilke personer som må komme ind eller ud af en
        natklub, en effektiv data struktur vil være et SET til at lager name

        3 konkrete klasse af set interfacet der extender Collection interfacet  er
        HashSet, LinkedHashSet, TreeSet


        Introducere ikke nye metoder og konstanter, men det bestemmer at en instans af Set
        indholder ikke nogen duplicates elementer


        AbstractSet class Extend AbstractCollection og partial (delvis) implementere Set

        AbstractSet class provides konkret implementation for equals metoden og den hashCode metode
        hashCode af et set er summen af hash codes af alle elements i  set

        Siden size og iterator metode ikke er implementeret i AbstractSet class, AbstractSet er en Abstract klasse

        Tre konkret af Set  er HashSet, LinkedHashSet, TreeSet

        */


        //HashSet

        /*
          Konkret klasse der implementere Set interface, laves fra nog Arg eller fra existernede collection
          Defualt intial capacity er 16  load factor er på 0,75  kender størrelse på set
          kan man sætte speicify intial capacity og load factor i constructor
          load factor  0.0 til 1.0

          load factor hvor fuld må sæt være før capacitet bliver udvivdet   16 * 0.75 = 12
          og kommer op på 12 vil kapaicetet bliver fordoblet til dobbelt 32

          HashSet bruges til at lager dublicate fri elementer.
          For effektivetet, objectere der addes til hash set skal implementere hashCode metoden
          på en måde, der konkret spreder hash code

          hashCode metodne er defineret i Object class. hash code af to objekter skal være den samme
          hvis to objekter er ens

          to ikke lige objekter kan have samme hashcode, men man skal implementere hashCode metoden
          for at undgå for mange  af disse tilfælde

          De fleste klasser i Java API implements hashCode metoden

          fx  hasCode for en Integer class returns den int værdi
          hasCode for Character class returns dens Unicode af character

          hashCode af string returns  se side 838 i bogen

          To elementer  er duplicate for HashSet
          hvis e1 og e2 hvis e1.hashCode() == e2.hashCode() og e1.equal(e2)

          Bemærk ved kontrakt, hvis to elementer er ens skal deres hashCode være den samme.
          Så man skal tilsidesætte (overide)  hashCode() metoden, når equals- metoden  (is overriden)
          tilsidesættes i klassen
       */

        Set<String> set = new HashSet<>();

        set.add("London");
        set.add("Paris");
        set.add("New York");
        set.add("San Francisco");
        set.add("Beijing");
        set.add("New York");

        //New york bliver kun vist engang
        System.out.println(set);
        System.out.println();
        //Viser elementer i hash set for loop med get(i) kan ikke bruges her
//        for(int i = 0; i < set.size(); i++){
//            set.get
//        }
        // for each loop

        for(String s: set){
            System.out.println(s.toUpperCase() + " ");
        }
        System.out.println();

        // bearbejder elementerne ved hjælp af en forEach metode
        set.forEach(e-> System.out.println(e.toLowerCase() + " "));
        System.out.println();


        /*Tydeligt at se at duplicates ikke vises, og elementerne lagers ikke i den order som de sættes ind i
        Der ingen partikulær order for elemterne i et hash set, der skal man bruge et LinkedHashSet

        Collection interface extends Iterable interface, så elementer i  et set er iterable

        for each loop bruges til at traverese alle elementer

        Kan bruge forEach() metode til process each element i et set

        siden set er en instans af collection, alle metoder i defined i Collection kan  bruges i sets

         */
        // eksempel hvor man bruger metoder fra Collection interface på sets
        System.out.println("set er " +  set);
        System.out.println(set.size() + " elementer i set");
        System.out.println();

        //fjern element
        System.out.println(set.remove("London"));
        System.out.println("set er " +  set);
        System.out.println(set.size() + " elementer i set");
        System.out.println();
        //Lav set 2
        Set<String>  set2 = new HashSet<>();

        set2.add("London");
        set2.add("Shanghai");
        set2.add("Paris");

        System.out.println("set2 er " +  set2);
        System.out.println(set.size() + " elementer i se2t");

        System.out.println();
        System.out.println("Er Tapai i set2 " + set2.contains("Tapai"));

        set.addAll(set2);
        System.out.println("Efter adding af set2 fra set, set er nu "  + set);
        System.out.println();
        set.removeAll(set2);
        System.out.println("Efter fjerning af set2 fra set, set er nu "  + set);
        System.out.println();
        set.retainAll(set2);
        System.out.println("Efter retain fælles elementer  i set og set er " + set);


        /*LinkedHashSet
        extends HashSet med en linked - list implementation  der support en orddering af
        elementerne i set.

        I et LinkedHasSet kan elementerne hentes i den order som de blev sat ind i set
       (Ikke sidste)

        LinkedHasSet har fire constructor  der minder om dem fra HashSet

        under eksempel fra før i starten bare erstattet HashSet med Linked
             */


        System.out.println("LinkedHashSet");
        LinkedHashSet<String> linkedSet = new LinkedHashSet<>();
        System.out.println();

        linkedSet.add("London");
        linkedSet.add("Paris");
        linkedSet.add("New York");
        linkedSet.add("San Francisco");
        linkedSet.add("Beijing");
        linkedSet.add("New York");

        for (String s : linkedSet){
            System.out.println(s);
        }



        /*
        TreeSet
        Et sortedSet er en subinterface af Set, der garantere at elementerne i set er sorted, og
        giver metoden first() og last() for at retunere første og sidste element fra set,
        headSet(toElement) og tailSet(fromEllement) for at retunere en portion af set hvis elements er mindre
        end toElement  eller større end eller lig med fromElement

        NavigableSet extends SortedSet  for at provide navigation metoder  lower(e) mindre end,
        floor(e) mindre end eller lig med,  ceiling(e) størr end og lig med, og higher(e) eller større end
         og return null hvis der ikke findes noget element

         polfirst() og polLast()  removes  og retunere første og sidste element i sets1


         TreeSet implements SortedSet interface. For at lave et TreeSet, bruges en constructor som under
                */

        Set<String> sets1 = new HashSet<>();
        sets1.add("London");
        sets1.add("Paris");
        sets1.add("New York");
        sets1.add("San Francisco");
        sets1.add("Beijing");
        sets1.add("New York");
        System.out.println();

        TreeSet<String> treeSet = new TreeSet<>(sets1);
        System.out.println("Sorted tree set " + treeSet);

        //Bruger metode fra SortedSet interface
        System.out.println("first(): " + treeSet.first());
        System.out.println("last() : " + treeSet.last());
        System.out.println("headSet : (New York) " + treeSet.headSet("New York") );
        System.out.println("Tailset  (New York) " +  treeSet.tailSet("New York"));

        //Brug af metoder i NavigableSet interface
        System.out.println("lower(\"P\") : " + treeSet.lower("P"));
        System.out.println("Higher(\"P\") : " + treeSet.higher("P"));
        System.out.println("floor(\"P\") : " + treeSet.floor("P"));
        System.out.println("ceiling(\"P\") : " + treeSet.ceiling("P") );
        System.out.println("pollFirst : " + treeSet.pollFirst() );
        System.out.println("pollLast() : " + treeSet.pollLast());
        System.out.println("New tree set : " + treeSet);

        /*String i et tree set sorted efter compareTo metode fra compareable interfacet
        fx to e1.compareTo(e2) = 0 er duplicate fra comparable og e1.compare(e2)   = 0 for comparator
        Så når man laver tree set fra hashSet bliver elements fra hashset sorted når man
        laver objeketet  fra HashSet ved bruge new TreeSet<>(sets1)  eller man kan bruge
        no arg constructor til add i tree set


       Hvis man bare laver et tree set med no - arg construc, bruger compareTo metode til
       at compare i et set, antaget at class element implementere Comparable interface fx String klassen
       implementere altså comparable

       For at bruge en Comparator skal man bruge TreeSet(Comparator comparator) for at
       lave en sorted set der bruger compare metode i comparator for at order element i et set
      under er eksempel
         */
        Set<Studerende2> setStud = new TreeSet<>();
        ArrayList<Integer> karakter = new ArrayList<>();
        karakter.add(10);
        karakter.add(12);
        karakter.add(7);

        setStud.add(new Studerende2(2,"Hans",karakter));
        karakter = new ArrayList<>(List.of(10,12,4));
        setStud.add(new Studerende2(1,"Jens",karakter));
        karakter = new ArrayList<>(List.of(7,4,2));
        setStud.add(new Studerende2(3,"Mads",karakter));

        System.out.println("Uden comparator men comparable fra studerende2 studieNr");
        for (Studerende2 s : setStud){
            System.out.println("Navn = " + s.getNavn()+ " StudieNr "+ s.getStudieNr());
        }
        System.out.println();
        Set<Studerende2> setStudComp = new TreeSet<>(new ComparatorStuderende());
        setStudComp.addAll(setStud);

        System.out.println("En sorteret set af studerende objekter comparator efter navn ");
       for(Studerende2 s: setStudComp){
           System.out.println("Navn = " + s.getNavn() + " StudieNr " + s.getStudieNr());
       }



       /*Programede ved en comparator laver man altså et tree set af setsTeoriMap.Studerende2 objekter ved brug
         af setsTeoriMap.ComparatorStuderende() for at sammenligne elementerne
          */
















    }
}
