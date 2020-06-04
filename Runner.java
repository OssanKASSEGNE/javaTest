import vroom.*;

public class Runner{
    public static void main(String[] args) {
        Vehicule v;
        v = new Vehicule();
        v.description();
        v = new Voiture();
        v.description();
        v = new Fiat();
        v.description();
        v = new Bus();
        v.description();
    }
}