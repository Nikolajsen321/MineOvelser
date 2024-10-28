package caseStudyTowerOfHanoi;

import java.util.Scanner;

public class EksempelKanLoseRekursiv {
    public static void main(String[] args) {
        /*
        Tower of Hanoi er et klassisk problem der nemt kan løses med rekursion
        men ellers er svært at løse

        Problemet ivolvere at flytte specificeret nummer af disk af distinc size fra
        et torn til et andet ved at observer følgende regler

        ■■ There are n disks labeled 1, 2, 3, . . . , n and three towers labeled A, B, and C.
        ■■ No disk can be on top of a smaller disk at any time.
        ■■ All the disks are initially placed on tower A.
        ■■ Only one disk can be moved at a time and it must be the smallest disk on a tower.

        Handler om at skal kunne flytte alle disks fra A til B ved hjælp af C
        Hvis man har 3 diske, trine for at flytte alle diskene fra A til B er vidst i figur 18.6

        Mål for tower of Hanoi problem er at flytte disks fra A til B den at bryde reglen

        I tilfældet med 3 diske kan man finde løsningen manuel .
        For et større nummer af disk, enda for 4 diske er problemet ret kompleks
        Heldigvis har problemet et ret rekursivt natur, der før til en ligetil rekursiv løsning
        base case er altså: n = 1 hvis n == 1, man kan simpel flytte disk fra A til B

        når n > 1 kan man dele orignal problem ud til 3 subproblemer og løse dem sequentialy

        1. flyt først n-1 disk fra A til C rekursivt med assitance tower B vidst i trin 1 figur 18.7
        2. flyt disk n fra A til B som vidst i trin 2 18.7
        3 flyt n-1 disks fra C til B rekursivt med hjælp fra tower A som vidst i trin 3 figur 18.7


        Følgende metode flytter n disks fra fromTower til toTower med assitance fra auxTower

        void moveDisks(int n,char fromTower,char toTower, char auxTower)
        algoritme fra metode kan beskrives som:
        if(n == 1) //stopping condition
        flyt disk 1 fra fromTower til toTower
        else{
        moveDisks(n-1,fromTower,auxTower,toTower)
        Move disk n fra fromTower til toTower
        moveDisks(n-1,auxTower,toTower,fromTower)
        }
        Listing 18.8 giver et program der får bruger til at indtaste et antal disks og invoke den
        rekursive metode moveDisks for at vise løsningen for at flytte diskene
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Indtast antal af diske ");
        int n = input.nextInt();

        System.out.println("Flytningen er ");
        moveDisks(n,'A','B','C');

    }

    /* The method for finding the solution to move n disks
      from fromTower to toTower with auxTower */

    private static void moveDisks(int n, char fromTower, char toTower, char auxTower) {
        if(n == 1){ // stopping condition
            System.out.println("flyt disks " + n + " fra " + fromTower + " til " + toTower);
        }
        else {
            moveDisks(n-1,fromTower,auxTower,toTower);
            System.out.println("flyt disks " + n + " fra " + fromTower + " til " + toTower);
            moveDisks(n-1,auxTower,toTower,fromTower);
        }


    }

    /*
   This problem is inherently recursive. Using recursion makes it possible to find a natural, simple
   solution. It would be difficult to solve the problem without using recursion.
   Consider tracing the program for n = 3. The successive recursive calls are shown in
   Figure 18.8. As you can see, writing the program is easier than tracing the recursive calls. The
   system uses stacks to manage the calls behind the scenes. To some extent, recursion provides
   a level of abstraction that hides iterations and other details from the user.

     */
}
