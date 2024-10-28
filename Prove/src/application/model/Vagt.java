package application.model;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Vagt {
    private String navn;
    private LocalDateTime tidFra;
    private LocalDateTime tidTil;
    private ArrayList<Medarbejder> medarbejders = new ArrayList<>();
    private ArrayList<Antal> antalFunktioner = new ArrayList<>();

    public Vagt(String navn,LocalDateTime tidFra, LocalDateTime tidTil){
        this.navn = navn;
        this.tidFra = tidFra;
        this.tidTil = tidTil;
    }

}
