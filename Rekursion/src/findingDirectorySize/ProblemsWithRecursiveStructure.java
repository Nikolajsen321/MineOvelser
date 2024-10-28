package findingDirectorySize;

import java.io.File;
import java.util.Scanner;

public class ProblemsWithRecursiveStructure {
    public static void main(String[] args) {
        /*
        Rekursive metoder er effektivt for at løse problemmer med rekursive struktur
        Forgående eksempler kunne nemt løses uden at bruge rekursion

        Denne del handler om problem der svært at løse uden at bruge rekursion.

        Problemet omhandler at finde størrelsen af en mappen.
        Størrelsen af mappen er sum af størrelserne på alle filerne i mappen

        En mappe d kan indholde submapper

        antag en mappe indholder filerne f1 f2 ... fm
        og submapperne: d1,d2 ....dn   se figur 18.5 i bogen

        størelse af mappen kan defineres som:
         size(d) = size(f1) + size(f2) +... size(fm) +size(d1) +size(d2) + ...+ size(dn)

         Fil klassen, introduceret fra kap 12.10 kan bruges til at repræsenter
         en fil eller en mappe og kan få egenskaberne fra filerne og mapperne

         ■■ The length() method returns the size of a file.
         ■■ The listFiles() method returns an array of File objects under a directory.
           Listing 18.7 gives a program that prompts the user to enter a directory or a file and displays
           its size.
         */

        //skriver en mappe eller fil
        Scanner input = new Scanner(System.in);
        System.out.println("Indtast en fil eller mappe ");
//        String mappe = input.nextLine();

//        System.out.println(getSize(new File(mappe)) + " bytes");
        System.out.println(getSize(new File("C:\\Users\\nikol\\OneDrive\\Skrivebord\\Datamatiker\\programering\\Min ovelser\\Rekursion\\src\\recursivehelpermetode")) + " bytes");

    }


    public static long getSize(File file){
        long size = 0;
        if(file.isDirectory()){
            File[] files = file.listFiles(); //alle filer og submapper metode return en array
            for(int i = 0; files!= null && i < files.length; i++){
                size+= getSize(files[i]);
            }
        }
        else {
            size += file.length();
        }
        return size;

    }

    /*
    Hvis file object reprsenter en mappe (linje 47)  hver file eller submappe i mappen er
    rekursivt ivoked (kaldt) for at opnå størrelsen  linje  50
    Hvis fil object repræsenter et objekt  linje 53 så er fil størrelsen hentet og lagt
    til den totale størrelse  (linje 54)


    Hvad sker der hvis en inkorkekt eller ikke eksisterende mappe indtastes.
    Program vil opdage det ikke er en mappe og invoke file.length linje(54) og return 0
    altså vil metoden getSize(File file) vil return 0
     */
}
