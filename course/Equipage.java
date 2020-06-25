package course;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

public class Equipage {
    private Pilote pilote1,pilote2;
    private List<Temps> grilleTemps;

    public Equipage(Pilote pilote1, Pilote pilote2){
        this.pilote1 = pilote1;
        this.pilote2 = pilote2;
    }

    public void addTemps(Temps t1 ){
        this.grilleTemps.add(t1);
    }

    public List<Temps> getGrille(){
        return grilleTemps.stream()
                .collect(Collectors.toList());
    }
    
    public List<Temps> listeTempsCroissant (){
        return grilleTemps.stream()
            .sorted(Temps.cTempsCroissant)
            .collect(Collectors.toList());
    }

    public List<Temps> listeTempsDecroissant (){
        return grilleTemps.stream()
            .sorted(Temps.cTempsDecroissant)
            .collect(Collectors.toList());
    }

    public Temps meilleurTemps(){
        return grilleTemps.stream()
            .min(Temps.cTempsCroissant)
            .orElseThrow(NoSuchElementException::new);
    }
    
    public Temps PireTemps(){
        return grilleTemps.stream()
            .max(Temps.cTempsCroissant)
            .orElseThrow(NoSuchElementException::new);
    }
}