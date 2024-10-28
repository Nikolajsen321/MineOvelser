package InterStrukturBestarAfArrayEllerKæde;

public class NodesTest<E>{
    /*
    En linked list brstår af hvilket som helst nummer af Nodes i en kæde
    Variable head refer til første Node i listen og tail til den sidste
    Hvis list er tom både head og tail er null


     */
   private E element;
    private NodesTest<E> next;


    public NodesTest(E e){
        this.element = e;
    }


    public E getElement() {
        return element;
    }

    public NodesTest<E> getNext() {
        return next;
    }

    public void setNext(NodesTest<E> next) {
        this.next = next;
    }
}
