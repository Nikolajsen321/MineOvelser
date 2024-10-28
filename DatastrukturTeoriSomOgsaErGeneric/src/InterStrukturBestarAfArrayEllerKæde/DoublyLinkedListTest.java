package InterStrukturBestarAfArrayEllerKæde;

public class DoublyLinkedListTest {
    public static void main(String[] args) {

        /*
        Det er den dobbelt rettet kædestruktur i dette eksempel side 970 er et visuel eksempel





         */

        //Initialisering af head og tail:
        DoublyLinkedNode<String> head = null;
        DoublyLinkedNode<String> tail = null;


        /*
        Hvis listen er tom, oprettes et nyt DoublyLinkedNode med elementet
        "Chicago" som både head og tail.
         */
        if(head== null){
            head = new DoublyLinkedNode<>("Chicago");
            tail = head;
        }


        //Tilføjelse af et nyt element (Denver) til slutningen af listen:
        //previous bruges til at holde en reference til det tidligere sidste element.
      DoublyLinkedNode<String> previous = tail; //

        //Et nyt DoublyLinkedNode med elementet "Denver" tilføjes til tail.getNext().
      tail.setNext(new DoublyLinkedNode<>("Denver"));
      /*
      tail opdateres til det nye element,
      og previous bruges til at opdatere referencen til det foregående element.
       */
      tail = tail.getNext();
      tail.setPrevious(previous);



      DoublyLinkedNode<String> current = tail;
      //Traversal baglæns og udskrivning af elementerne:
        //Traverserer listen baglæns fra tail og udskriver hvert element.
      while (current != null){
          System.out.println(current.getElement());
         current = current.getPrevious();
      }

        System.out.println();

      //Traversal forlæns og udskrivning af elementerne:
        //Traverserer listen forlæns fra head og udskriver hvert element.
      current = head;
        while (current != null){
            System.out.println(current.getElement());
            current = current.getNext();
        }



    }
}
