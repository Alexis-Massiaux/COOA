
public abstract class Dessert {
	
	private String libelle;
	private double prix;
	
	public String getLibelle() {
		return libelle;
	}
	
	public double getPrix(){
		return prix;
	}
	
	protected void setLibelle(String libelle){
		this.libelle=libelle;
	}
	
	protected void setPirx(double prix){
		this.prix=prix;
	}
	
	public String toString(){
		return "Dessert : "+libelle+" ; "+prix;
	}
	

}
