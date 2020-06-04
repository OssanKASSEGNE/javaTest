package vroom;

/**
 * Classe décrivant Fiat héritent de Voiture
 * 
 * @author OssanKASSEGNE AFACOMMS
 * @version 0.0.0
 * @see Vehicule , Voiture
 */
public class Fiat extends Voiture {
    //pas besoin de déclarer le constructeur sans arguments, existe par défaut
    //Puis on a un appel implicite de Voiture() au début de Fiat()
   
    /**
     * Redéfinition de la catégorie en Fiat
     * 
     * @return Je suis une Fiat
     */
    @Override
    public String categorie() {
        return "Je suis une Fiat";
    }

}