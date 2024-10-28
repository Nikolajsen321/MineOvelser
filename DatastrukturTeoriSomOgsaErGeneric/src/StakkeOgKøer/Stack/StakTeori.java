package StakkeOgKøer.Stack;

public class StakTeori {
    public static void main(String[] args) {
        /*
        Stak er af fist in last out   LIFO datastruktur bruges efter
        dette princip fx rekursion

        I en stak struktur kan elementer kun tilføjes, fjernes og fremfindes i
        en ende af objektsammenlingen, typisk kaldet stak toppen




        Operationen for input og output benævnes hhv. push(), pop() og peek()


        Man kan kun push ind på stakken for en array så længe cpacitet < size ellers
        skal array gøres større

        Eksempel:
         */

        StakIntegerEksempel stakIntegerEksempel = new StakIntegerEksempel();

        stakIntegerEksempel.push(2);
        stakIntegerEksempel.push(4);
        stakIntegerEksempel.push(5);
        stakIntegerEksempel.push(6);
        stakIntegerEksempel.push(7);


        stakIntegerEksempel.whatIsInStack();
        System.out.println();
        System.out.println(stakIntegerEksempel.pop());
        System.out.println();
        stakIntegerEksempel.whatIsInStack();


    }
}
