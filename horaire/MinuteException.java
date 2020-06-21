package horaire;

public class MinuteException extends Exception{
    /**
     *
     */
    private static final long serialVersionUID = 5410917203079074038L;
    private int minute;
    public MinuteException (int minute, String message){
        super(message);
        this.minute = minute;
    }
    public String getMessage(){
        return super.getMessage() + " Valeur saisie : "+String.valueOf(this.minute);
    }
}