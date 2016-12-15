
public class DessertFactory {

	public static Dessert d=null;

	public Dessert getDessert(String dessert){
		switch(dessert){
		case "Crepe" : 
			if(d == null)
				d = new Crepe();
			return d;
		case "Gaufre":
			if(d == null)
				d=new Gaufre();
			return d;
		case "Chcocolat":
			return new Chocolat(d);
		case "Chantilly":
			return new Chantilly(d);
		}
		return null;
	}

}
