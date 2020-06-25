package course;

public class Pilote implements Comparable<Pilote>{
   private String nom;
    private String prenom;

    public Pilote (String nom, String prenom){
        this.nom = nom;
        this.prenom = prenom;
    }

    public String getNom(){
        return nom;
    }

    public String getPrenom(){
        return prenom;
    }

	@Override
	public int compareTo(Pilote o) {
		
		return this.nom.compareTo(o.getNom());
    }
    public boolean equals (Object o){
        if(!(o instanceof Pilote )) return false;

        Pilote p = (Pilote) o;
        return this.nom.equals(p.getNom()); 
    }
    public int hashCode(){
        int hash = 17;
        hash = 31 * hash + ((this.nom == null)? 0: this.nom.hashCode());
        return hash;

    }

   @Override 
   public String toString(){
       String nomClass = this.getClass().getSimpleName();
       return "<"+nomClass+">: "+this.nom+" "+this.prenom;
   }

    
}