import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.*;

import course.Pilote;
import course.Temps;

public class RunTemps{
    public static void main(String[] args) {
        Temps t1 = new Temps(12,150,24);
        System.out.println(t1);
        Pilote p1 = new Pilote ("Albert", "brainman");
        Pilote p2 = new Pilote ("Albert","falca");
        Pilote p3 = new Pilote("Jacki","Rappon");

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        
        List<Pilote> list = Arrays.asList(p3,p2,p1);
        System.out.println(list);
        Collections.sort(list);
         System.out.println(list);       
        List<Pilote> l = list.stream()
                            .filter(p -> p.getPrenom().contains("J"))
                            .collect(Collectors.toList());
        
         
         System.out.println(l);       
                            System.out.println(list);   
                            
        Temps t2 = new Temps(12,150,2000);
        System.out.println(t2.ecart(t1));
        Temps t3 = new Temps(0,52,995);
        Temps t4 = new Temps(5,52,995);
        Temps t5 = new Temps(4,50,95);
        Temps t6 = new Temps(25,20,85);
        List<Temps> lTemps = Arrays.asList(t1,t2,t3,t4,t5,t6);
        System.out.println(lTemps);
        Collections.sort(lTemps,Temps.cTempsCroissant);
         System.out.println(lTemps);   
         Collections.sort(lTemps,Temps.cTempsDecroissant);
             System.out.println(lTemps);
    }
}