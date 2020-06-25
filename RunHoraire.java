import java.util.Arrays;
import java.util.List;
import java.util.Collections;
import horaire.Horaire;
import java.util.function.Consumer; 

public class RunHoraire {
    public static void main(final String[] args) {
        Horaire h2 = null;

        Horaire h3 = null;
        Horaire h4 = null;

        h2 = new Horaire(12);
        h4 = new Horaire(12);

        h3 = new Horaire(14, 2);

        if (h2.equals(h3))
            System.out.println("Egaux");
        else
            System.out.println("Non égaux");

        if (h2.equals(h4))
            System.out.println("Egaux");
        else
            System.out.println("Non égaux");

 

        final List<Horaire> listHoraires = Arrays.asList(new Horaire(), new Horaire(12), new Horaire(04, 5),
                new Horaire(11, 52));
        
                // Déclaration
       final Consumer <List<Horaire>> display = (list) -> {
           for(final Horaire h : list) System.out.println(h);
       };
        //utilisation
       display.accept(listHoraires);

        Collections.sort(listHoraires);
        display.accept(listHoraires);


    }
}