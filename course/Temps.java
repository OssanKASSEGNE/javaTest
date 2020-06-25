package course;

import java.util.Comparator;

/**
 * Classe Temps descrit le Temps en minutes, secondes et millisecondes
 * 
 * @author Ossan KASSEGNE AFACOMMS
 * 
 */
public class Temps {
   private int minute;
   private int seconde;
   private int milliseconde;
   
   public Temps (int minute, int seconde, int milliseconde){
       //Si un des paramètres n'est pas dans le bon intervalle, on renvoie un message et on remet à 0;
        this.minute = minute;
        this.seconde = seconde;
        this.milliseconde = milliseconde;
       if ((minute < 0) || (minute > 59)) this.minute = 0;
        if ((seconde  < 0) || (seconde  > 59)) this.seconde = 0;
        if ((milliseconde  < 0) || (milliseconde  > 999)) this.milliseconde = 0;
        
   }

   public int getMinute(){
       return this.minute;
   }
   public int getSeconde(){
       return this.seconde;
   }
   public int getMilliseconde(){
       return this.milliseconde;
   }

   @Override
   public String toString(){
       String nomClass = this.getClass().getSimpleName();
       return "<"+nomClass+">: "+this.minute+"min"+this.seconde+"s"+this.milliseconde;
   }

   public int ecart(Temps other){
       return (this.getMinute()-other.getMinute())*60*1000 + (this.getSeconde()-other.getSeconde())*1000 + (this.getMilliseconde()-other.getMilliseconde());
   }

   public static Comparator <Temps> cTempsCroissant = (t1, t2) -> t1.ecart(t2);
   public static Comparator <Temps> cTempsDecroissant = cTempsCroissant.reversed();

}