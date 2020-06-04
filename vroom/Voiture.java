package vroom;

/**
 * Classe décrivant les voitures héritent de Véhicule
 * 
 * @author OssanKASSEGNE AFACOMMS
 * @version 0.0.0
 * @see Vehicule
 */
public class Voiture extends Vehicule {
    /**
     * Contructeur sans Arguments de la classe Voiture initialise l'attribut protégé de Véhicle nbRoues à 4
     */
    public Voiture(){
        nbRoues = 4;
    }
    /**
     * Redéfinition de la catégorie en voiture
     * @return Je suis une voiture
     */
    
    public String categorie(){
        return "Je suis une voiture";
    }

  
    public void description(){
        System.out.println(categorie() + " a " + nbRoues + " roues");
    }
}