
public class DessertFactory extends Dessert{

	public void getDessert(String dessert){
		switch(dessert){
		case "Crepe" : 
			add(new Crepe());
			break;
		case "Gaufre":
			add(new Gaufre());
			break;
		case "Chocolat":
			if(!list.isEmpty())
				//add(new Chocolat(list.get(list.size()-1)));
				System.out.println(list.get(list.size()-1));
			break;
		case "Chantilly":
			if(!list.isEmpty())
				System.out.println(list.get(list.size()-1));
				//add(new Chantilly(list.get(list.size()-1)));
			break;
		}
	}

}
