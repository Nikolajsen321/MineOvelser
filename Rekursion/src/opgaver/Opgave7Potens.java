package opgaver;

import java.util.Scanner;

public class Opgave7Potens {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Indtast tal der skal opløftes ");
        int tal = input.nextInt();
        System.out.println("Indtast potens ");
        int potens = input.nextInt();

        System.out.println(tal + " opløftet i " + potens + " er " + potensMetode(tal,potens));
    }

    private static int potensMetode(int tal, int potens) {
        //Terminerings reglerne
        // begge to betingelser er rigtig for potens == 0 laver man et ekstra subcall
        if(potens == 0){
            System.out.println(tal +" "+ potens);
            return 1;
        }
//        if(potens == 1){
//            return tal;
//        }

        System.out.println(tal +" "+ potens);

        //Rekursions reglen
        return tal * potensMetode(tal,potens-1);
        /*
        Så det der sker er man ganger  med tal * tal *tal *tal
        når man laver sit første kald

        potens = 3
        tal = 2
        tal * potensMetode(tal,potens-1)

        potens = 2
        tal = 2
        så tjekker man for termnineringsreglen igen og ingen af dem opfyldes -
        - så laver man (subcall)  et tal * subcall - potensMetode(tal,potens-1)

        potens = 1
        tal = 2
        så tjekker man for termineringsreglen og for potens == 0 er den ikke opfyldt og man forsætter
        if(potens == 0)  derved begynder man ikke at retunere

        tjekker igen
        potens = 0
        tal = 2

        nu opfyldes betingelsen og den retunere nu  1

        potens 1
        tal = 2
        tal * potensMetode() =  2 * 1  og retunere

        potens 2
        tal = 2
        tal * potensMetode() = 2 * 2 = 4 og retunere

        potens = 3
        tal = 2
        tal * potensmetode() = 2 * 4 = 8

        og retunere 8 







        tjekker for termingerings reglen igen gælder

         */
    }
}
