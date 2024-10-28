package InterStrukturBestarAfArrayEllerKæde;

public class ListEnkeltNoPointer {
 private String element;
 private ListEnkeltNoPointer nextElement;

    public ListEnkeltNoPointer(String element) {
        this.element = element;
    }


    public String getElement() {
        return element;
    }

    public ListEnkeltNoPointer getNextElement() {
        return nextElement;
    }

    public void setNextElement(ListEnkeltNoPointer nextElement) {
        this.nextElement = nextElement;
    }


    @Override
    public String toString() {
        return "ListEnkeltNoPointer{" +
                "element='" + element + '\'' +
                '}';
    }
}
