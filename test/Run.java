package test;

class C{

    private int i = 0;
    public void inc(){i++;};
    public void println(){System.out.println(i);}

    
}
 public class Run {
    public static void main(String[] args) {
        C c1 = new C();
        C c2 = new C();
        c1.println();
        c2.println();
        c2 = c1;
        c1.inc();
        c1.println();
        c2.println();
    }
}