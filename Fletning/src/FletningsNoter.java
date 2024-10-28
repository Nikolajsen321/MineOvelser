import java.util.ArrayList;

public class FletningsNoter {
    public static void main(String[] args) {
        /*
        Flette to sorterede sekevenser:
        Eksempel:  totale fletning af skevenserne [3,7,9,9] og [1,2,4,7,7,8]
        er sekvensen: [1,2,3,4,7,7,7,8,9,9]
        Her er resultat en sorteret sekvens der indholder elementer fra de to sekevenser, der
        flettes

        På samme måde kan man også finde de to sekevenser har til fælles eller
        de elementer der er i den ene og ikke den anden

        Som sagt en fleting af to sorterede sekvenser giver en sorteret sekevens,
        som indholder præcis de elementer , der tilsammen findes i de to sekevenser
        fx totale fletning af s1 og s2 sekevensens resulatat
        s1 = [3,7,9,9]
        s2 = [1,2,4,7,7,8]
        result = [1,2,3,4,7,7,7,8,9,9]


    Totale fletning:
        Den totale fletning af to sekvenser er en sorteret sekevens, der indholder præcis
        de elementer, der findes i de to sekvenser

        En algo der danner den totale fletning af to sorterede sekevenser s1 og s2
        kan formuleres som følger, hvor idden er, at elementeren fra de to sekevenser
        behandles et for et ved (flettet) sekventielt gennemløb af de to sekvenser

        Metode:
        result = den tomme skevens
        while(der er elementer i s1 && s2 ){
        e1 = det element man er kommet til i s1
        e2 = det element man er kommet til i s2
        if(e1 <= e2){
        tilføj e1 bagerst i resultat
        gå videre i s1
        }
        else{
        til e2 bagerst i resultat gå videre i s2
        }
        }

        while(der elementer i s1){
        tilføj det element man er kommet til i s1 til result
        gå videre i s1 }

        while(der elementer i s2){
        tilføj det element man er kommet til i s2 til result
        gå videre i s2 }
        }

        return result

         */




        /*
        Generel fletning:
        Ideen fra før er central i den generelle flette skabelon også
        Generel fletning ikke givet at de aktuelle elementer i s1 henholdvis s2
        skal flyttes over i result , det afhænger af den konkret avendelse
        Fx hvis man kun er intereseret i dubleter eller dem som ikke er i begge
        skal der ske en flytning til result


        Skabelon for generel fletning tager udgangspunkt i skabelon for total fletning.
        Da det ikke er givet at alle elementerne fra de to oprindelig sekvenser
        skal med i result , betyder det at der er tre tilfælde der skal håndteres

        1. s1 har mindste elementer
        2. s2 har mindste elementer
        3  s1 og s2 har ens elementer

        giver følgende skabelon hvor if sætning  while er udvidet med endnu et tilfælde


        Metode:
        result = den tomme skevens
        while(der er elementer i s1 && og s2){
        e1 = det element man er kommet til i s1
        e2 = -||- s2
        if(e1 < e2) {
        håndtere element e1
        gå videre i s1
        }
        else if( e1 > e2){
        håndter elementet e2
        gå videre i s2
        }
        else{ //e1 == e2
        håndtere e1 og e2
        gå videre i s1 og s2
        }
        }

        while(der elementer i s1){
        tilføj det element man er kommet til i s1 til result
        gå videre i s1 }

        while(der elementer i s2){
        tilføj det element man er kommet til i s2 til result
        gå videre i s2 }
        }



       return result








         */


    }



    // følgende retuerne sorteret Arraylist der indholder
    public static ArrayList<Integer> totalFletning(ArrayList<Integer> s1, ArrayList<Integer> s2){
        ArrayList<Integer> result = new ArrayList<>();
        int i1 = 0;
        int i2 = 0;

        //flet så længde er noget i begge lister
        while (s1.size() > i1 && s2.size() > i2){
            if(s1.get(i1).compareTo(s2.get(i2)) <= 0){
                // s1 første tal er det mindste
                result.add(s1.get(i1));
                i1++;
            }
            else { // s2 første tal er det mindste
                result.add(s2.get(i2));
                i2++;
            }

            // tøm lister der stadig ikke er tomme
            while (i1 < s1.size()){
                result.add(s1.get(i1));
                i1++;
            }
            while (i2 < s2.size()){
                result.add(s2.get(i2));
                i2++;
            }
        }

        return result;
    }


    public static ArrayList<Integer> generelFletningEnsTal(ArrayList<Integer> s1, ArrayList<Integer> s2){
        ArrayList<Integer> result = new ArrayList<>();
        int i1 = 0;
        int i2 = 0;
        while (i1 < s1.size() && i2 < s2.size()){
            if(s1.get(i1) < s2.get(i2)){
                i1++;
            }
            else if(s1.get(i1) > s1.get(i2)){
                i2++;
            }
            else {
                result.add(s1.get(i1));
                i1++;
                i2++;
            }
        }
        return result;
    }
}
