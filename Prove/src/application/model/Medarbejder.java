package application.model;

import java.time.LocalTime;
import java.util.ArrayList;

public class Medarbejder {
    private String navn;
    private int antalTimerPrDag;
    private LocalTime typiskMødeti;
    private ArrayList<Vagt> vagter = new ArrayList<>();


    public Medarbejder(String navn,int antalTimerPrDag,LocalTime typiskMødeti){
        this.navn = navn;
        this.antalTimerPrDag = antalTimerPrDag;
        this.typiskMødeti = typiskMødeti;
    }

    public void setNavn(){
        this.navn = navn;
    }

}
