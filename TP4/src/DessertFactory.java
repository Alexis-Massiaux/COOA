
public class DessertFactory {

	public static Dessert d=null;

	public Dessert getDessert(){
		if(d == null){
			if(d.getLibelle().equals("Chocolat")){
				d=new Chocolat(d);
			}
			if(d.getLibelle().equals("Chantilly")){
				d=new Chantilly(d);
			}
		}
		return d;
	}

}
