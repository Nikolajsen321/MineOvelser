package genericPakke;

import java.util.ArrayList;

public class GenericTeori {
    /*
    Generic er at parame
    Man kan definere metoder eller klasser med generic types og compiler
    kan erstatte med den konkrete type

    Fx java definere en arraylist class for at lager elementer af generic
    type
    fra denen type kan man så lave ArrayList objekter der holder fx String og nogen som holder Integers
    så man siger her at string og numbers er konkret typer der
    erstatter den generic type

    Fordel ved generic er at error kan opdages ved compile time i stedet for runtime

    Man får lov til at specficere tilladt typer objekter som klassen kan arbejde med '

    Java har siden JDK 1.5 tilladt at definere generic klasser, interfaces metoder
    før var det defineret med objeckt klassen så når man brugte fx
    en arraylist vil den være lavet af objekt klassen det vil sige polymorfi
    vil gør man kunne add flere

    Fx <T> eller <E> repræsenter formel generic type som kan erstattes senere med en
    aktuel konkret type  og erstate en genric type kaldes instainition

    Fordele ved generic over objekt

     public interface Comparable{
     public int compareTo(Object o)
     }

     public interface Comparable<E> {
     public int compareTo(T o)

     Ved a opdages fejl først ved run time

     Comparable c = new Date();
       System.out.println(c.compareTo("red"));
     (a) Prior to JDK 1.5

     ved b opdages fejl ved compile time

      Comparable<Date> c = new Date();
        System.out.println(c.compareTo("red"));
         (b) JDK 1.5

         Generic typer skal være af references types må ikke være primitive






     */






    public static void main(String[] args) {
        ArrayList o = new ArrayList<>();

        o.add("String");
        o.add(2);
        
        System.out.println(o.get(1));

        String string = (String) o.get(0);
        int tal  = (Integer) o.get(1);
    }
}
