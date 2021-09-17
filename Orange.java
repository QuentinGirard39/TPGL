/**
 *
 * @author roudet
 */
public class Orange {
    private double prix;
    private String origine;
	
    public Orange() 
    {
        this.prix = 0.5;  //prix en euros
        this.origine="Espagne";
    }
    
    public Orange(double prix, String origine) 
    {
	if(prix < 0)
	    this.prix = -prix;  //une solution possible pour interdire les prix negatifs
	else
	    this.prix = prix;

	if(origine.equals(""))
            this.origine = "Espagne";  //Espagne par défaut
	else
            this.origine = origine;   
    }

    public double getPrix(){
	return prix;
    }

    public void setPrix(double prix){
	this.prix=prix;
    }

    public String getOrigine(){
	return origine;
    }
 
    public void setOrigine(String origine){
	this.origine=origine;
    }

    @Override
    public String toString(){
        return("Orange de : " + origine + " a " + prix + " euros");
    }

    @Override
    public boolean equals(Object o){  //predicat pour tester si 2 oranges sont equivalentes
        if(o != null && getClass() == o.getClass()){
            Orange or = (Orange) o;
            return (prix == or.prix && origine.equals(or.origine));
        }
        return false;
    }

    public boolean isSeedless() {  //predicat indiquant qu'une orange a des pepins
        return false;
    }


    public static void main (String[] args){
        //Ecrire ici vos tests
Orange or18 = new Orange(-2,"France");        
        
	System.out.println("premier test Orange");
	Orange or = new Orange(-10,"France");
	System.out.println(or.toString());
	
	System.out.println("deuxieme test Orange");
	Orange or2 = new Orange(10,"France");
	System.out.println(or2.toString());
	
	System.out.println("troisieme test Orange");
	Orange or3 = new Orange(10,"");
	System.out.println(or3.toString());

	System.out.println("setPrix");
	or.setPrix(2);
	System.out.println(or.toString());
	
	System.out.println("setOrigine");
	or2.setOrigine("Belgique");
	System.out.println(or2.toString());
	
	System.out.println("getPrix");
	System.out.println(or.getPrix());
	
	System.out.println("getOrigine");
	System.out.println(or2.getOrigine());
	
	System.out.println("Orange 1 = orange 2 ?");
	
	System.out.println(or.equals(or3));
	System.out.println(or.equals(or18));
	
   }
}
