package StakkeOgKøer.Stack;

public class StakIntegerEksempel {
    private int[] elements;
    private int size;
    public static final int defaultCapaci = 16;

    //Constructor med default
    public StakIntegerEksempel(){
        this(defaultCapaci);
    }

    //Stak specficeret med specified capacity
    public StakIntegerEksempel(int capcity){
        elements = new int[capcity];
    }

    //Push en ny integer til toppen af stakken
    public void push(int value){
        if(size >= elements.length){
            growIfNodvendig();
        }
        elements[size++] = value;

    }

    //return og fjern det øverste element fra stack
    public int pop(){
        int elementRemoved = elements[--size];
        elements[size] = 0;
        return elementRemoved;

    }

    private void growIfNodvendig() {
        int[] newElements = new int[elements.length *2];
        for(int i = 0; i < elements.length; i++){
            newElements[i] = elements[i];
        }
        elements = newElements;
    }

    //retunere top element af stack
    public int peek(){
        return elements[size-1];
    }

    public boolean isEmpty(){
        return size ==0;
    }



    public int getSize(){
        return  size;
    }


    public void whatIsInStack(){
        for(int e : elements){
            if(e != 0)
            System.out.println(e);
        }
    }


}
