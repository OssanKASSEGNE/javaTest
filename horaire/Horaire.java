package horaire;

/**
 *  Classe décrivant des Horaires
 *  @author Ossan KASSEGNE AFACOMMS
 */

 public class Horaire{

    /**
     * Heures de 0 à 23
     */
    private int heure;
    /**
     * Minutes de 0 à 59
     */
    private int minute;
    /**
     * Constructeur sans arguments crée une instance 00H00
     */
    public Horaire(){
        this.heure = 0;
        this.minute =0;
    }
    /**
     * Constructeur avec un argument retourne l'heure H00
     * @param heure heure indiquée par l'utilisateur
     */
    public Horaire(int heure) throws HeureException{
        if(heure > 23 || heure < 0) throw new HeureException(heure,"Heure entre 0 et 23");

        else{         
        this.heure = heure;
        this.minute =0;
        }
    }

    /**
     * Constructeur avec deux arguments retourne l'heure H minute 
     * @param heure heure indiquée par l'utilisateur
     * @param minute minute indiquée par l'utilisateur 
     */
    public Horaire(int heure, int minute)throws HeureException, MinuteException{
        if(heure > 23 || heure < 0) throw new HeureException(heure,"Heure entre 0 et 23");
        else if(minute > 59 || minute < 0) throw new MinuteException(minute, "Minute entre 0 et 59")   ;
        else{         
        this.heure = heure;
        this.minute =minute;
        }
    }

    public String toString(){
        return String.valueOf(this.heure)+"h"+String.valueOf(this.minute);
    }
 }