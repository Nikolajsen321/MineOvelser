package InterStrukturBestarAfArrayEllerKæde;

import java.util.LinkedList;

public class NoPointerTest {
    public static void main(String[] args) {

        /*
        Pointen med denne er at påvise at man ikke kan nemt fjerne det sidst element fra
        en linkedlist som ikke har pointers
         */


        ListEnkeltNoPointer firstElement = null;
        ListEnkeltNoPointer current = null;
        ListEnkeltNoPointer previous = null;


        if (firstElement == null) {
            firstElement = new ListEnkeltNoPointer("tegn1 ");
        }

        current = new ListEnkeltNoPointer("tegn2");
        current.setNextElement(firstElement);
        firstElement = current;


//        previous = firstElement;
        current = new ListEnkeltNoPointer("tegn3");
        current.setNextElement(firstElement);
        firstElement = current;


        System.out.println(firstElement);

//        while (head !=null ){
//            System.out.println(head.getElement());
//            head =head.getNextElement();
//
//        }


        // indsæt element fra indeks 2
//        insertAfter(current,0,"tegn4");
        current = removeFrom(current,1);
//        removeFromAfter(current,0);
         current = insertOnIndex(current,1,"tegn5");

        while (current!=null ){
            System.out.println(current.getElement());
            current = current.getNextElement();

        }


        /*
         så min remove metode skal altså køre alle elementerne igennem
         for at nå det sidste element i listen, da der ikke er pointers i følgende
         */


    }

    private static ListEnkeltNoPointer insertOnIndex(ListEnkeltNoPointer prevNode, int index, String element) {
        int count = 0;
        ListEnkeltNoPointer previous = prevNode;
        ListEnkeltNoPointer newNode = new ListEnkeltNoPointer(element);

        if(index < 0){
            throw new RuntimeException("Index er mindre end 0 ");
        }
        else {

            if(index == 0) { // følgende er et tilfælde der svarer til bare at add et new element i starten
              previous = prevNode;
              newNode.setNextElement(previous);
              prevNode = newNode;
              return prevNode;

            }

            while (count < index -1){ // hvis index = 2 stopper ved index = 1
                if(prevNode == null) {
                    throw new RuntimeException("Index holder ingen værdi ");
                }
                prevNode = prevNode.getNextElement(); //værdien i kædestrukturen som står -
                // - på index = index-1

                count++;
            }


            if(newNode == null){
                throw new RuntimeException("Den valgte node er null");
            }
            else {
                newNode.setNextElement(prevNode.getNextElement());
                prevNode.setNextElement(newNode);
            }
        }
        return previous;
    }



    private static ListEnkeltNoPointer removeFrom(ListEnkeltNoPointer prevNode, int index) {
        if (prevNode == null) {
            System.out.println("Listen er tom. Kan ikke fjerne element.");
            return null;
        }

        if (index < 0) {
            throw new RuntimeException("Indeks mindre end 0");
        }

        if (index == 0) {
            // Fjern det første element
            return prevNode.getNextElement();
        }

        ListEnkeltNoPointer current = prevNode;
        ListEnkeltNoPointer previous = null;
        int count = 0;

        // Find elementet, der skal fjernes
        while (current != null && count < index) {
            previous = current;
            current = current.getNextElement();
            count++;
        }

        if (current == null) {
            throw new RuntimeException("Indeks er out of bound");
        }

        // Fjern elementet
        /*
          tegn3 --> tegn2 --> tegn1
        Så elementet der før current der er previos peger på det der kommer efter det current
        element atså current.getNext() element og

        current element der her for index = 1 være tegn2  og previous vil være tegn3
        så tegn 3 skal pege på tegn1  i stedet for tegn2 så så previous.setNext(current.getnext)
        tegn3 -X> tegn2 -> null
        tegn3 --> tegn1

         */

        previous.setNextElement(current.getNextElement());
        current.setNextElement(null);

        return prevNode;
    }

    private static void insertAfter(ListEnkeltNoPointer prevNode,int index, String newValue) {
        int count = 0;

        if (index < 0) {
            throw new RuntimeException("Indeks mindre end 0");
        } else {

            while (count < index-1 ) {
//        for(int i = 0; i < index -1; i++) {

                if (prevNode == null) {
                    System.out.println("Du har valgt et indeks der går ud af listen");
                }
                prevNode = prevNode.getNextElement(); // man bliver ved til man når fx indeks 2
                count++;

            /*
            count < indeks -1 er fordi man skal gå igennem alle elementerne
            det vil sige man går fra 0 til 1 til 2 indekset alts når man har 3 elementer
            vil de være på 0, 1 og 2 indeksene

            er ved tegn3  og

             så når man skal adde til dem, og giver indekset 2  så starter count = 0
             det mindre end 2-1 så køre videre

             nu er man ved tegn 2
             count = 1

             nu har man elementet på indeks 1 altså det før indeks to og man
             kan nu bruge den til at pege på det nye element som skal sættes ind

             så forsætter man til næste del og laver nyNode der skal holde det nye element
             så tjekker man om prevNode stadig re prevNode == null
             eller så skal man sige newNode.setPrevious(previous.getNext)



             */
            }


        /*
        Nu har man nået indeks 1 og skal indsætte det nye element på indekset foran på indeks 2
        element tegn4 til at pege på Noden som holder tegn3
        og så sætter man noden der holder tegn2 på indekset 1 kommer til
        at pege på noden der holder tegn4 og tegn 3 kommer nu til at være på indekset 3
        hvor tegn4 kommer til at være på indekset 2
        Det er et godt eksempel på hvor en linkedList ikke er konstant men linære


         */



            ListEnkeltNoPointer newNode = new ListEnkeltNoPointer(newValue);
            if (prevNode == null) {
                System.out.println("Du har valgt et indeks der går ud af listen ");
            } else {
                newNode.setNextElement(prevNode.getNextElement()); // ny peger på peger på næste element
                prevNode.setNextElement(newNode); // previos element peger på det nye element

            }
        }
    }

}
