import horaire.HeureException;
import horaire.Horaire;
import horaire.MinuteException;

public class RunHoraire {
    public static void main(final String[] args) {
        final Horaire h1 = new Horaire();
        Horaire h2 = null;
        Horaire h3 = null;
        try {

            h2 = new Horaire(122);
        } catch (final HeureException e) {
            System.out.println(e.getMessage());

        } catch (final Exception e) {

            System.out.println(e.getMessage());

        } finally {
            if (h2 == null) {
                h2 = new Horaire();
            }
        }
        try {
            h3 = new Horaire(14, 772);
        } catch (HeureException | MinuteException e) {
            System.out.println(e.getMessage());
        }

        finally {
            if (h3 == null) {
                h3 = new Horaire();
            }
            System.out.println(h1);
            System.out.println(h2);
            System.out.println(h3);
        }
    }
}