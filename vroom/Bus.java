package vroom;

/**
 * Classe décrivant lesBus héritent de Véhicule
 * 
 * @author OssanKASSEGNE AFACOMMS
 * @version 0.0.0
 * @see Vehicule
 */
public class Bus extends Voiture {
    /**
     * Contructeur sans arguments de la classe Bus initialise l'attribut protégé de Véhicle nbRoues à 6
     */
    public Bus(){
        nbRoues = 6;
    }

    /**
     * Redéfinition de la catégorie en Bus
     * 
     * @return Je suis une Bus
     */
    @Override
    public String categorie() {
        return "Je suis une Bus";
    }

    // public void description(){
    // super.description();
    // }
}