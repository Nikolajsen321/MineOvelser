package Strategy;

public class StrategyTeori {
    public static void main(String[] args) {
        //Strategy pattern
        //Fortræk komposition over nedarvning
        /*
        Her kigger man på hvordan man kan indkapsle
        Fx et duck interface vil ikke virke fordi man skal implementere, der altså ingen reuse
        Uanset hvad når man skal ændre kode skal man trakke hvad der skal ændres
        og så skal man ændre for hver subklasse hvor opfrøelsen er definertet


       Heldivis er der princip for denne situation:
       1. princip:

       Identicer aspekter af ens applikation der variere og
       seperere dem fra det der forbliver det samme

       fx noget i koden der variere ved hver nye fx krav,
       så ved man at man har en behavior der skal trækkes ud
       og seperarres fra det der ikke ændres

       tag dele der ændre sig og enkapsulae dem, så man senere
       kan ændre og extend delene der ændre uden at påvirke dem der ikke gør

       Alle patterns provide en vej til at lade en del af systemet variere
       uafhængigt af alle andre dele


       Design klasser som implementere behaviour

       2. design principle:
       Programer til et interface ikke en implementation

       Man vil bruge et interface til at repræsentere opførelserne
       fx QuackBeahviour og FlyBehavoiur
       og hver behvaiour vil implement en af disse interfaces

       Så ikke længere DUCK klasse der implementer flying behvoior
       i stedet laver man et par klasser som implementer disse behaviour

       Det ikke længere konrete behviorerne er ikke låst i duck klassen


       Programmer til interface  altså hver duck har den erklærede type af behaviour
       men med forskellige aktuelle typer  (skabe mere løs kobling)


       Duck vil her være klient klassen da det er den som bruger
       interfacet


         */









    }
}
