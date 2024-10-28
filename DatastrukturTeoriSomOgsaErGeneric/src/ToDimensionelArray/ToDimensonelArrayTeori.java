package ToDimensionelArray;

public class ToDimensonelArrayTeori {
    public static void main(String[] args) {

       /* En to-dimensionel (eller dobbelt) array er en datastruktur, der organiserer data i et todimensionelt gitter, hvor dataene kan tilgås ved hjælp af to indekser. I Java skrives det som int[][] array eller int array[][]. Lad os diskutere nogle af de grundlæggende ideer og anvendelser af to-dimensionelle arrays:

        Todimensionelle Arrays:

        En en-dimensionel array organiserer data i en enkelt række,
        mens en to-dimensionel array organiserer data i rækker og kolonner.
                F.eks. kan du forestille dig en todimensionel array som et skakbræt,
                hvor rækkerne repræsenterer rækkerne på brættet,
                og kolonnerne repræsenterer kolonnerne på brættet.
                Anvendelser af Todimensionelle Arrays:

        Todimensionelle arrays bruges ofte til at repræsentere tabeller,
        matricer, billeder og andre strukturer, der har en naturlig todimensional form.
        For eksempel kan et karaktergennemsnit for flere studerende opbevares i en todimensional array,
        hvor hver række repræsenterer en studerende,
        og hver kolonne repræsenterer karaktererne for forskellige opgaver eller eksamener.
        Indeksnotation:

        Elementer i en todimensional array tilgås ved hjælp af to indekser. Første indeks repræsenterer rækken, og det andet indeks repræsenterer kolonnen. F.eks., array[i][j] refererer til elementet på række i og kolonne j.
                Udskrivning af Todimensionelle Arrays:

        For at udskrive en todimensional array anvendes ofte to indlejrede løkker. Den ydre løkke går igennem rækkerne, og den indre løkke går igennem kolonnerne.
        Eksempel på en todimensional array og dens anvendelse:

        */
        // Deklaration og initialisering af en 3x4 todimensional array
        int[][] matrix = new int[3][4];

        // Fyldning af arrayen med værdier
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = i * matrix[i].length + j + 1;
            }
        }

        // Udskrivning af arrayen
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();

        /*Her oprettes en todimensionel array med 3 rækker og 4 kolonner. Du kan tænke
        på det som et gitter med 3 rækker og 4 kolonner, hvor hver celle indeholder en int-værdi.*/


                int[][] matrix2 = {
                        {1, 2, 3},
                        {4, 5, 6},
                        {7, 8, 9}
                };

                // Udskrivning af array
                for (int i = 0; i < matrix2.length; i++) {
                    for (int j = 0; j < matrix2[i].length; j++) {
                        System.out.print(matrix2[i][j] + " ");
                    }
                    System.out.println();
                }
            }
        }


