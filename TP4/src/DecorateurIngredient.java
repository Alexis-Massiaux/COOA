
public abstract class DecorateurIngredient {
	
	protected Dessert dessert; 
	
	public String getLibelle() {
		return dessert.getLibelle();
	}
	
	public double getPrix(){
		return dessert.getPrix();
	}

}
