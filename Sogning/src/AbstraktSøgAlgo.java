public class AbstraktSøgAlgo {
    public static void main(String[] args) {
        /*
        Man snakker altså om at hver søgning er karaktiseret ved, at man blandt en sammenling af elementer
        leder efter et eller flere med bestemte karakteristika

        Sammenling af elementer kaldes søgdemængde: SM
        Det element man søger kaldes målelemenetet

        Man antager yderligere at man et for et kan inspicere søgdemængdens elementer
        til forkomsten af mål element er forkommet

        Sm - søgdemængde - alle elementer der skal kigges i
        KM - kandidat mængden - den del der endnu ikke er afsøgt
        k - kandidat mængden det element man lige nu kigger på og udnersøger (chekker om er målelement)
         */


        //Eksempel
        /*
        <INITIALISER RESULTAT TIL IKKE-FUNDET>
        <INITIALISER KM>
         while (<RESULTAT ER IKKE-FUNDET> && <KM ≠ ∅>) {
               <UDVÆLG K FRA KM>
               if (<K ER LIG M>) {
              <SÆT RESULTAT (M ER FUNDET)>
               else
              <SPLIT KM I FORHOLD TIL K OG M>

              Start er hele kandidatmængde søgdemængden
              ved hver trin i søgning vælger man et element
              i kandidatmængden , kandidatelement og hvis
              det er lig med det man søger har man fundet det og er færdig

              ved binary kan man fra start udlængde en del fra kandidatmængden


              public int linearSearchList(ArrayList<String> list, String target) {
               int indeks = -1; <initialiser RESULTAT til ikke-fundet>
                int i = 0; <initialiser KM>
                while (indeks == -1 && while (<RESULTAT er ikke-fundet> &&
                 i < list.size()) { <KM ≠ ∅>) {
                String k = list.get(i); <Udvælg K fra KM>
                 if (k.equals(target)) if (<K er lig M>)
                indeks = i; <sæt RESULTAT (M er fundet)>
                else else
                 i++; <split KM i forhold til K og M>
                        } }
                  return indeks;
 }
}
              lineær et elment af gangen inskrænker SM
              binary  km indskrænkes til ca det halve
         */
    }
}
