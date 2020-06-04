import java.util.ArrayList;
import java.util.List;

public class Run {
    public static void main(final String[] args) {
         List<A> listA = new ArrayList<A>();
        listA.add(new A());
        listA.add(new B());
        listA.add(new C());

        for (final A a : listA) {
                System.out.println("---appel de h()---");
                a.h();
                System.out.println("--- appel de f() ---");
                a.f();
            }
    }
}

class A{

    private void z(){
        System.out.println("A.z()");
        this.k();
    }

    public void f() {
        System.out.println("A.f()");
        this.z();
        A.g();
    }

    public  static void g() {
        System.out.println("A.g()");
    }

    public void h() {
        System.out.println("A.h()");
        this.k();
    }

    public void k() {
        System.out.println("A.k()");
    }

    public void m() {
        System.out.println("A.m()");
    }

}

class B extends A{
    private void z(){
        System.out.println("B.z()");
        this.k();
    }
    
    public void f() {
        System.out.println("B.f()");
        super.f();
        B.g();
    }
    
    public void k() {
        System.out.println("B.k()");
    }
}

class C extends B{
    public static void  g(){
          System.out.println("C.g()");
    }

    public void h() {
        System.out.println("C.h()");
        this.m();
    }
}