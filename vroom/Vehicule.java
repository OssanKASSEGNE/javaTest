package vroom;
/**
 * Classe décrivant tous les véhicules
 * @author OssanKASSEGNE AFACOMMS
 * @version 0.0.0
 */
public class Vehicule {
    protected int nbRoues;
    /**
     * Ne fais rien
     */
    public void demarrer(){};
    /**
     * Ne fais rien
     */
    public void rouler(){};
    /**
     *Afficher la catégorie
     * @return "Je suis un véhicule"
     */
    private String categorie(){
        return "Je suis un vehicule";
    }
    /**
     * Décrit un véhicule
     */
    public void description (){
       System.out.println(categorie() + " a "+ nbRoues + " roues"); 
    }
}