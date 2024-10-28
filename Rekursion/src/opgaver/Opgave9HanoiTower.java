package opgaver;

import java.util.Scanner;

public class Opgave9HanoiTower {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Indtast antal diske ");
        int n = input.nextInt();
        hanoiTowerMetode(n,'A','B','C');




    }






        public static void hanoiTowerMetode(int n,char towerA, char towerB, char towerC){

            if(n == 1){
                System.out.println("Flytter " + n + " fra  " + towerA + " til " + towerC);
//                System.out.println("Sidste ");
            }
            else {
                hanoiTowerMetode( n-1,towerA,towerC,towerB); //første
                System.out.println("Flytter  " + n + " fra " + towerA + " til " + towerC);
                hanoiTowerMetode(n-1,towerB,towerA,towerC); //andet
            }
        }

        /*
        følgende er hvad der sker for n = 3

        else
        n = 3, towerA = A, towerB = B, towerC = C
        flytter(n-1,towerA,towerC,towerB)  (subCall)

        else
        n = 2
        towerA = A,
        towerB = C,
        towerC = B
        flytter(n-1,towerA,towerC,towerB) (subCall)

        if(n== 1) betingelse opfyldt
        n = 1
        towerA = A,
        towerB =B,
        towerC = C
        sout(flytter n =1  fra towerA = A  til towerC = C)
        går ud af koden metoden (det samme som return) og tilbage til kaldet hvor n = 2
        return fra 3 sub call til 2 subcall

         n = 2
         towerA = A,
         towerB = C,
         towerC = B fra før
        sout(flytter n =2 fra towerA = A  til towerC = B)   "sout efter første rekursion kald"
        rekursion hanoiTowerMetode(n-1=2-1,towerB = C, towerA = A, towerC = B) andet rekursionkald

        if(n == 1) opfyldes
        n = 1
        towerA = C
        towerB = A
        towerC = B
        sout(flytter n = 1 fra towerA = C  til towerC = B)

        return fra sub call 3 til subcall 2 tilbage til første subcall

        n = 3
        towerA = A
        towerB = B
        towerC = C
        sout(flytter n = 3 fra towerA = A til towerC = C)
        laver subcall: hanoiTowerMetode(n-1,towerB,towerA,towerC)  andet rekursionkald

        n = 2
        towerA = B
        towerB = A
        towerC = C
        else betingelse da n!= 1
        subCall: hanoiTowerMetode(towerA =B,towerC = C,towerB =A) // første rekursive kald

         n = 1
        towerA = B
        towerB = C
        towerC = A
        if(n == 1) er opfyldt nu
        sout(flytter n= 1 fra towerA = B til towerC = A)

        retunere fra subcall tilbage til 2. subcall

        n = 2
        towerA = B
        towerB = A
        towerC = C
        sout(flytter n = 2 fra towerA = B til towerC = C )
        laver subcall:  hanoTowerMetode(n-1,towerB =A ,towerA = B,towerC = C) //andet rekursivekald

        n = 1
        towerA = A
        towerB = B
        towerC = C
        if(n==1) opfyldt
        sout(flytter n=1 fra towerA = A til towerC = C)

        retuner fra subcall  og retnurnere resten fra subcall



        Gennem gang med chatGBT hvor jeg har diskuteret hvad der sker og hvordan man finder
        frem til at fx ved 3 skal der være 7 rekursive kald  da  man har 2 rekursiveMetode kald
        som hver kalder 3 gange
        Lad os gå gennem det igen og inkludere, hvad return ville vise fra hvert subcall:

        hanoiTowerMetode(3, 'A', 'B', 'C') (første rekursive kald)
        hanoiTowerMetode(2, 'A', 'C', 'B') (andet rekursive kald)
        hanoiTowerMetode(1, 'A', 'B', 'C') (tredje rekursive kald, basistilfælde)
        returnerer fra det tredje rekursive kald til det andet rekursive kald
        hanoiTowerMetode(1, 'C', 'A', 'B') (fjerde rekursive kald, basistilfælde)
        returnerer fra det fjerde rekursive kald til det andet rekursive kald
        hanoiTowerMetode(2, 'B', 'A', 'C') (femte rekursive kald)
        hanoiTowerMetode(1, 'B', 'C', 'A') (sjette rekursive kald, basistilfælde)
        returnerer fra det sjette rekursive kald til det femte rekursive kald
        hanoiTowerMetode(1, 'A', 'B', 'C') (syvende rekursive kald, basistilfælde)
        returnerer fra det syvende rekursive kald til det femte rekursive kald
        Dette er, hvad return ville betyde i hvert trin.
        Returnering fra et basistilfælde betyder, at den specifikke rekursion er fuldført,
        og det går tilbage til det tidligere rekursive kald,
        indtil du når det første rekursive kald og slutter hele processen.

    Det første rekursive metodekald udløser 2 yderligere rekursive kald.
    Hvert af disse yderligere rekursive kald udløser igen 2 yderligere rekursive kald.

    total anatal rekursive kald = 2 x 2 = 4
    men du nævner, at der skulle være 7 rekursive kald.
    For at forklare det, ser vi på det andet rekursive metodekald,
    som også udløser 3 rekursive kald.









         */



























           /*

        I tilfældet med 3 diske kan man finde løsningen manuel .
        For et større nummer af disk, enda for 4 diske er problemet ret kompleks
        Heldigvis har problemet et ret rekursivt natur, der før til en ligetil rekursiv løsning
        base case er altså: n = 1 hvis n == 1, man kan simpel flytte disk fra A til B

        når n > 1 kan man dele orignal problem ud til 3 subproblemer og løse dem sequentialy

        1. flyt først n-1 disk fra A til C rekursivt med assitance tower B vidst i trin 1 figur 18.7
        2. flyt disk n fra A til B som vidst i trin 2 18.7
        3 flyt n-1 disks fra C til B rekursivt med hjælp fra tower A som vidst i trin 3 figur 18.7

         */



}
