
public class Chocolat extends DecorateurIngredient{
	
	public Chocolat(Dessert d){
		String libelle = d.getLibelle();
		if(libelle.equals(""))
			libelle="Chocolat";
		else
			libelle+="/Chocolat";
		d.setLibelle(libelle);
	}
	
	public String getLibelle(){
		return getLibelle();
	}
	
	public double getPrix(){
		return getPrix()+1;
	}
}
