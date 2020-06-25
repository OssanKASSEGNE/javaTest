package horaire;
/**
 * Classe HeureException gère les cas où l'heure est illégale
 */
public class HeureException extends Exception{
   
    private static final long serialVersionUID = 1L;
    private int heure;
    /**
     * Construit une instance de HeureException avec l'heure illégale et un message
     */
    public HeureException (int heure, String message){
        super(message);
        this.heure = heure;
    }
    /**
     * 
     * Renvoie le message et la valeur incorrect saisie
     */
    @Override
    public String getMessage(){
      
        return super.getMessage() +" Valeur saisie : "+String.valueOf(this.heure);
    }

}