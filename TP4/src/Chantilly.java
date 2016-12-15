
public class Chantilly extends DecorateurIngredient{
	
	public Chantilly(Dessert d){
		/*String libelle = d.getLibelle();
		if(libelle.equals(""))
			libelle="Chantilly";
		else
			libelle+="/Chantilly";*/
		d.setLibelle("Chantilly");
	}
	
	public String getLibelle(){
		return getLibelle();
	}
	
	public double getPrix(){
		return getPrix()+1;
	}
}
