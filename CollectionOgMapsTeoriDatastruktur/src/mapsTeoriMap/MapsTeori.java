package mapsTeoriMap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapsTeori {
    public static void main(String[] args) {
        /*Man antag ens program fra natklub listen skal kunne lager name, men også
         height, gender, weight og nationalitet kan hentes ved at bruge name som en key

         Man kan lave et map fra de tre konkrete klasser:

         -HashMap
            effektiv for at lokalisere en værdi, inserting en entry, og deleting en entry
            Entries i hashmap ikke ordered


         -LinkedHashMap
         extender hashmap med en linkedlist implementation der støtter ordering af entries i map
         entries i Linked list kan hentes efter den order de blev instered i map (insertion order)
         eller i den order de sidst accesed  fra least recently til most recently accsed (access order)
         no - arg constructor constructos
         LinkedHashMap efter access order, brug LinkedHashMap(intialCapacity, LoadFactor,true) med access



         -TreeMap
         Common feature af de tre typer er defineret i Map interface
         effektiv for traversing keys i en sorted order
         keys kan blive sorted ved brug af Comparable interface eller comparator interface

         no-arg comparable compareTo metode i comaparable interface  altså antaget
         af class for key bruger comparable interface

         comparator TreeMap(Comparator comparator) constructor for at lave et sorted map der bruger
         compare metode i  comparatoren til at order entries i map baseret på keys

         SortedMap er et subInterface af Map hvilket garantere entries i map er sorted
         giver metoderne
         firstKey()  lastKey()
         headMap(toKey) og tailMap(fromKey) return keys mindre end til toKey  og større end eller lig fromKey
         return portion af keys

         NavigableMap extends SortedMap for at give navigation metoder
         lowerKey(key) return mindre end
         floorKey(key) return mindre end eller lig
         celingKey(key) return større end eller lig
         higherKey(key) return større end
         og alle  ellers return null hvis ingen sådan nøgle


         polFirstEntry() og pollLastentry() metode fjerner og return first og sidst entry i treemap
         respectivly











         En Map erklærede type der har de tre konkrete klasser som man kalder for de aktuelle typer
         altså er de tre konkrete klasser alle i brug af Map aktuelle typer af erklærede type

         Map er container objekt der store en collection af key og value pairs
          Det tillader hurtig hentning og deletion og updating af pair gennem nøglen, altså lager
          et map en nøgle sammen med sin værdi

          Keys er som indexes, i List indexes er intergers, i Map er, keys kan være hvilket
          som helst objekt

          En map kan ikke indeholde duplicate keys, hver key maps til en værdi

          Map interfac provides metoder for querying, updating og obtaining en collection af values og
          et set keys

       Update metoder:
          - clear() fjerner alle entries fra map

         - put(K key, V value) adds en entry for den specificeret key og værdi i map
          Hvis map indeholder entry fra key, vil gammel værid erstates af nye

         - putAll(Map m) add alle entries m til denne map

         - remove(Object key) fjerner alle entries for specifik key

       Query metoder
            - containskey(Object key) metode chekker om map indeholder entry for specificeret key

            - containsValue(Object value) tjekker om map indeholder entry for denne value

            - isEmpty checkker om map har nogle enrtires

            - size antal entries i map


            man kan få fat på et set af keys i map ved bruge keySet() metode og en collection
            af værdier (values) i map  ved at bruge values() metode

            entrySet() metode returns et set af entries. Entries er instanser af Map.Entry(K,V) interface
            hvor Entry er en inner interface for Map interface

            Inner interface et nested interface, altså et interface der declares inde i et andet interface
            fx entry interface der declares i map interface

            Der en forEach() metode i Map interface for at udføre en action på hver entry i map, denne
            metode kan bruges som en iterator for traversing entries i map


            AbstractMap class er en praktisk abstrakt klasse, der implementere alle metoderne i map interface
            undtagen entrySet() metoden


            HashMap LinkedHashmap TreeMap er konkrete implementationer af Map interface



            Eksempel under


         */

        Map<String,Integer> hashMap = new HashMap<>();
        hashMap.put("Smith",30);
        hashMap.put("Anderson",31);
        hashMap.put("Lewis",29);
        hashMap.put("Cook",29);

        System.out.println("Display entries in HashMap");
        System.out.println(hashMap + "\n");

        Map<String,Integer> treeMap = new TreeMap<>(hashMap);
        System.out.println("Display entries in accsending order of key");
        System.out.println(treeMap);


        Map<String,Integer> linkedHashMap = new LinkedHashMap<>(16,075f,
                true);

        linkedHashMap.put("Smith",30);
        linkedHashMap.put("Anderson",31);
        linkedHashMap.put("Lewis",29);
        linkedHashMap.put("Cook",29);

        System.out.println("\nThe age for Lewis is " + linkedHashMap.get("Lewis"));

        System.out.println("Display Entries in LinkedHashMap");
        System.out.println(linkedHashMap);

        System.out.println("\nNames and ages are");
        treeMap.forEach((name,age)-> System.out.println(name + ": " + age + " "));













    }
}
