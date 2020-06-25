package horaire;

/**
 * Classe décrivant des Horaires
 * 
 * @author Ossan KASSEGNE AFACOMMS
 */

public class Horaire implements Comparable<Horaire>{

    private int heure;
    private int minute;

    /**
     * Construit une instance de Heure 0h0
     */
    public Horaire() {
        this.heure = 0;
        this.minute = 0;
    }

    /**
     * Constructeur avec un argument retourne l'heure H00
     * 
     * @param heure heure indiquée par l'utilisateur
     */
    public Horaire(final int heure) {
        if (heure > 23 || heure < 0){
            System.out.println("Valeur Incorrect!\nHeure remise à 0!");
            this.heure = 0;}
        else {
            this.heure = heure;
            this.minute = 0;
        }
    }

    /**
     * Constructeur avec deux arguments retourne l'heure H minute
     * 
     * @param heure  heure indiquée par l'utilisateur
     * @param minute minute indiquée par l'utilisateur 
     */
    public Horaire(final int heure, final int minute) {
        if (heure > 23 || heure < 0){
            System.out.println("Valeur Incorrect!\nHeure remise à 0!");
            this.heure = 0;}
        else if (minute > 59 || minute < 0){
            System.out.println("Valeur Incorrect!\nminute remise à 0!");
            this.minute = 0;}
        else {
            this.heure = heure;
            this.minute = minute;
        }
    }

    public String toString() {
        return String.valueOf(this.heure) + "h" + String.valueOf(this.minute);
    }

    public int getMinute() {
        return minute;
    }

    public int getHeure() {
        return heure;
    }

    /**
     * Compare deux Horaires et retourne true si leurs heures et minutes sont
     * identiques
     */
    public boolean equals(final Object obj) {

        if (!(obj instanceof Horaire)) {
            return false;
        }
        final Horaire other = (Horaire) obj;
        return (this.heure == other.getHeure()) && (this.minute == other.getMinute());
    }
    /**
     *  Deux instances horaires identiques retournent le même hashcode
     * 
     */
    public int hashCode(){
        int hash = 17;
        final int PRIME = 31;
        hash = PRIME * hash + heure;
        hash = PRIME * hash + minute;
        return hash;
    }
    /**
     * 
     * @param autre Horaire invoqué pour la comparaison ; Lève une IllegalArgumentException si autre< this
     * @return  la différence entre les deux horaires en minutes
     */
    public int ecart (Horaire autre) throws IllegalArgumentException{
        //On fait la différence entre les deux en minutes
        int valeurEcart =  (autre.getHeure()*60 + autre.getMinute()) - (this.heure* 60 + this.minute);
        if(valeurEcart < 0) {throw new IllegalArgumentException(autre.toString() +" est plus tôt dans la  journée que "+this.toString()); }
        return valeurEcart;
    }

    @Override
    public int compareTo(Horaire autre) {
      try {
        if(this.ecart(autre)>0) return 1;
        if(this.ecart(autre)==0 ) return 0;
        
      } catch (Exception e) {
          
      }finally{
          return -1 ;
      }
          
    }
}