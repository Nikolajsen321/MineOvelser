package Singleton;

public class SingletonTeori {
    public static void main(String[] args) {
        /*
        Singleton pattern:
        Sikker en klasse kun har en instans og har et
        global acsess point til den

        Skær der lidt mere ud:
        -Hvad sker der virkeligt?
          Man tager en klasse og lader den håndtere en enkel instans af den slev
          Man forhindre også andre klasser for at lave instancer selv
          For at få en instans skal man gå igennem klassen selv

          -Giver også et global acsess point til instansen.
          Når man har brug for en instans bare select (query) klassen
          og den vil give dig den eneste instans


          1.
          Eager Initialization (Ivrig Initialisering):

Ved eager initialization oprettes instansen af klassen straks, når klassen indlæses
eller applikationen starter.
Dette betyder, at uanset om klassen bliver brugt eller ej,
oprettes instansen tidligt i applikationslivscyklussen.
Dette kan medføre en hurtigere adgangstid, n
år klassen først skal bruges, men det kan også føre til unødvendig oprettelse af instansen,
hvis den ikke bruges i løbet af applikationens livscyklus.

2.
Lazy Initialization (Lad Initialisering):

Ved lazy initialization oprettes instansen af klassen først,
når den er nødvendig, normalt ved første kald til en metode eller hentning af instansen.
Dette kan medføre en langsommere adgangstid første gang klassen bruges, da instansen skal
 oprettes på det tidspunkt. Dog undgås unødvendig oprettelse,
 hvis klassen aldrig bruges i løbet af applikationens livscyklus.
Lazy initialization bruges ofte til at forsinke oprettelsen af ressourcetunge objekter,
indtil de faktisk er påkrævet, hvilket kan forbedre ydeevnen og ressourceforbrug.
         */
    }
}
