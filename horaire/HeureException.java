package horaire;
/**
 * Classe qui gère l'enregistrement d'heures illégales
 */
public class HeureException extends Exception{
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    private int heure;
    public HeureException (int heure, String message){
        super(message);
        this.heure = heure;
    }

    public String getMessage(){
      
        return super.getMessage() +" Valeur saisie : "+String.valueOf(this.heure);
    }

}