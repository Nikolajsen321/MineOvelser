package InterStrukturBestarAfArrayEllerKæde;

import java.util.LinkedList;


public class CommonOperationListTeori {
    /*
    List, stack, queues, and prioty queues er klasiske data struktyr
    supported i java API
    kigger på hvordan disse data struktur er implementeret under kølehjelmen(hood)
    lave custom data structures






     */

    public static void main(String[] args) {
        /*
        List common operationer defines i List interface
        Populær data structure for at lager data i en sequential order
        list student, rooms,byer,bøger osv.
        følgende operationer kan udføres med en liste:
          - Retrieve elements from list
          - Insert new elements into the list
          - Delete an element from the list
          - Find out how many elements are in the list
          - Determine whether an element is in the list
          - Check wheter the list is empty

        To måder at implemente en list
         1. bruge et Array til at lager elements, Array size er fixed, og hvis kapacitet
         af array bliver overgået, skal et nyt større Array laves  og kopier det data fra gammel til nyt

         2. Linked structure
          linked structure består af nodes, hver node er dynamisk lavet til at holde element
          alle nodes er linked sammen til at danne (form a list) en list
          Derfor kan man definere to klasser for lists

           For at gøre nemt kaldes de MyArrayList og MyLinkedList
           Disse to klasser har ens (common) operationer men forskellige implemenation

           Man kan name et  interface MyList repræsenter "List interface"
           og definere det som en subtype af Collection så de
           common operationer i Collection interface også er tilgænglig i MyList
           Figur 24.2 viser forholdet  af Collection, MyList og MyArrayList og MyLinkedList
           metoder i MyList vises i figur 24.3 hvor List 24.1 giver source code for MyList


           Kapitel 24.2 giver et eksempel på hvor MyList er lavet ved at implementere Collection altså
           hvordan List implementere Collection
           Kaptiel 24.3 giver et eksempel på hvordan en ArrayList er implementere List
           altså MyArrayList implementere MyList til at lave en ArrayList af et Array
           Samt implementation

           Kaptiel 24.4 giver et eksempel på LinkedList
           Så siden MyArrayList er implementeret ved at bruge en Array, metoderne
           get(int index) og set(int index,E e) for accessing og modifying et generic element gennem
           et index og add(E e) metode for adding element ved enden af listen er effektiv.
           Men metoderne add(int index, E e) og remove(int index) er ikke effektiv da
           de kræver man potentiel skal flytte en storre mængde af elementer.
           Det vil sige Array i ArrayList skal jo dynamisk udvides nogen gange
           som kræver mange ressourcer
           Man kan benytte Linked structure til implementere en list til at forbedre effektivitet
           for adding og removing et element at begging of the list


            Nodes kig på NodesTest klasse
           Eksempel der laver en linked list der skal holde 3 nodes
         */

        //Det første man gøre er at declare head og tail

        NodesTest<String> head = null;
        NodesTest<String> tail = null;

        //Så laver man første Node til kædestrukturen og appender til listen
        //Efter første node inserted i listen peger både head og tail på denne Node
        if (head == null) {
//            head = new NodesTest<>("Chicago");
//            tail = head;
            head = new NodesTest<>("Chicago");
            tail =head;
        }
//        else {
        /*
        lav ny node og append den til listen
        append anden node til list, link førte node med nye node nye node er nu tail,
        så tail point skal pege på den
          */
//        tail.next = new NodesTest<>("Denver"); //tilføjer til head
//        tail = tail.next; //sætter head til at pege på næste node
        tail.setNext(new NodesTest<>("Denver"));
        tail = tail.getNext();

        /*
        lav 3 node til listen og append til listen, link sidste node med ny node
        ny node er ny tail node så tail skal pointe på den nye
         */
//        tail.next = new NodesTest<>("Dallas");
//        tail = tail.next;
        tail.setNext(new NodesTest<>("Dallas"));
        tail = tail.getNext();

        int test = 0;
        while (test < 1) {
//            if (test == 0) {
                System.out.println("Hej");
//            }
            test++;
        }
        System.out.println(test);

        /*
        hver node indholder element og et data field navn kaldet next der peger på
        next element  hvis node er sdiste er next = null
        kan bruge den egenskab til at opdage sidste node
        følgende loop for at traverse alle node i listen for her fx String
         */
//        }


//            System.out.println(head.next.element);  // næste element
            NodesTest<String> current = head;
            while (current != null) {
//                System.out.println(current.element);
                System.out.println(current.getElement());
                current = current.getNext();
            }






        /*Hvis man benytter linkedList eller her MyLinkedList i bogen 24.4
        bruger altså en Linked structure til at implementere dynamisk list
        fx implements MyList (List), giver udover metoderne addFirst(), addLast, removeFirst
        removeLast, getFirst, getLast  vidst i figur 24.11 959
         */
            System.out.println();
            LinkedList<String> list = new LinkedList<>();
            list.add("America");
            list.add("Canada");
            list.add("Russia");
            list.addLast("France");
            list.add(2, "Germany");
            list.add(5, "Norway");
            list.add(0, "Poland");
            list.remove(0);
            list.remove(2);
            list.remove(list.size() - 1);
            for (String s : list) {
                System.out.println(s.toUpperCase());
            }
            list.clear();
            System.out.println("\nAfter clearing the list, the size is " + list.size());
            System.out.println(list);



        /*
        Eksempel på hvordan addFirst virker i LinkedList
        altså metode laver new node der holder element e
        ny node bliver first node i list  kan implementeres under
         */
            //public void addFirst(E e){  e = den værdi der kommer som paramter dog skal jeg slev finde på dme her
            // fx Mars
            NodesTest<String> newNode = new NodesTest<>("newElementParameterIMetode"); //lav ny node
//            newNode.next = head; //link den ny node til head
        newNode.setNext(head);
            head = newNode; // head peger på den nye node
            //size++; inrease list size
            if (tail == null) { //Den nye node er den eneste node i listen
                tail = head;
            }
        /*
        LinkedList addLast metode eksempel
        addLast(e) metode laver en node der holder elements og append node i enden af list
        kan implementeres på følgende måde
         */
            //public void addLast(E e) {
            NodesTest<String> newNode2 = new NodesTest<>("eEksempelParameter"); // Lav en ny node for e
            if (tail == null) {
                head = tail = newNode2; // eneste node i listen tail og head peger på den node
            } else {
//                tail.next = newNode2; // Link the new node with last node
                tail.setNext(newNode2);
                tail = newNode; //tail peger nu på den sidste node
            }
            //size++;  // forøg størrelsen på listen

        /*
        Hvis list er tom vil både head og tail pege på ny node
        eller link node til sidste node i listen, tail skal nu pege på på denne nye node
         */

        /*
        Implementing add(index,e) metode inserter et element ind i list ved specificeret index
        fx på følgende måde kan implementeres
         */





        /*
        Det gode ved en linked list er man kan få fat på første
         */





            //public void add(int index,E e){
//        if(index == 0){
//            addFirst(e); //insert first
//        }
//        else if(index >= size){
//            addLast(e); // insert last
//        }
//        else { //inset in the middle
//            NodesTest<E> current = head;
//            for(int i = 0; i < index; i++){
//                current = current.next;
//                NodesTest<E> temp = current.next;
//                current.next = new NodesTest<>(E);
//                (current.next).next = temp;
//                size++;
        /*
        There are three cases when inserting an element into the list:
1. If index is 0, invoke addFirst(e) (line 2) to insert the element at the beginning of the list.
2. If index is greater than or equal to size, invoke addLast(e) (line 3) to insert the
element at the end of the list.
3. Otherwise, create a new node to store the new element and locate where to insert it. As
shown in Figure 24.14a, the new node is to be inserted between the nodes current
and temp. The method assigns the new node to current.next and assigns temp
to the new node’s next, as shown in Figure 24.14b. The size is now increased by 1
(line 11).
         */



        /*
        Remove first metode i listen  følgende
         */
            //public E removeFirst() {
//        if(size == 0 ){ //Nothing to delete
//            return null;
//        }else {
//            NodesTest<E> temp = head; //keep the first node temporaily    (behold gammel head)
//            head = head.next; // flyt head til at pege på next mode (new head)
//            size--; // reduce size by 1
//            if(head == null){
//                tail = null; // list becomes empty  (destroy node)
//                return temp.element;
//
//            }
//        }
        /*
        Consider two cases:
        1. If the list is empty, there is nothing to delete, so return null (line 2).
        2. Otherwise, remove the first node from the list by pointing head to the second node.
        Figures 24.15a and 15b show the linked list before and after the deletion. The size is
        reduced by 1 after the deletion (line 6). If the list becomes empty, after removing the
        element, tail should be set to null (line 7).
         */

        /*
        removeLast() metode fjerner det sidste element fra list, kan implementes as follows
         */
            //public E romoveLast(){
//        if(size == 0 || size == 1){
//            return removeFirst();
//        }
//        else {
//            NodesTest<E> current = head;
//            for(int i = 0; i < size -2; i++){
//                current = current.next;
//            }
//            E temp = tail.element;
//            tail = current;
//            tail.next =null;
//            size--;
//            return temp;
//        }

        /*
        Consider three cases:
1. If the list is empty or has a single element, invoking removeFirst() will take care of
this case (lines 2–4).
2. Otherwise, locate current to point to the second-to-last node (lines 6–9). Save the value
of tail to temp (line 11). Set tail to current (line 12). tail is now repositioned
to
point to the second-to-last node and destroy the last node (line 13). The size is reduced
by 1 after the deletion (line 14) and the element value of the deleted node is returned
(line 15).
         */


        /*
        remove(index) metode finder node ved specificeret index og derefter removes it
        føglende
         */
            //public E remove(int index){
//        if(index < 0 || index >= size){
//            return null;  // out of range
//        }
//        else if(index == 0){
//            return removeFirst(); //remove first
//        }else if(index == size -1) {
//            return removeLast(); //remove last
//        }
//        else {
//            NodesTest<E> previous = head;
//            for(int i = 0; i < index; i++){
//                previous = previous.next;  // locate previous
//            }
//            NodesTest<E> current = previous.next;  //locate previous
//            previous.next = current.next;  // remove from list
//            size--;  // reduce size
//            return current.element; // return element
//        }
        /*
          1. If index is beyond the range of the list (i.e., index < 0 || index >= size), return
            null (line 2).
          2. If index is 0, invoke removeFirst() to remove the first node (line 3).
          3. If index is size − 1, invoke removeLast() to remove the last node (line 4).
          4. Otherwise, locate the node at the specified index. Let current denote this node
          and previous denote the node before this node, as shown in Figure 24.17a. Assign
          current.
          next to previous.next to eliminate the current node, as shown in
          Figure 24.17b.


          /*
          Iterator metode defined in java.lang.Iterable interface er implementeret til at return
          en instance on java.utill.Iterator  (linje 128 -130) i bogen 966 -967
          LinkedListIterator class implements Iterator med konkrete metoder  for hashNext(), next og remove
          (linje 132 - 152)  denne implementation bruger current til at pege på current positionen af element
          being traversed. Intially current points to the head of the list 
         */


        }

}













        





