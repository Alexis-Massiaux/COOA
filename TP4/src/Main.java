
public class Main {
	
	public static void main(String args[]){
		DessertFactory dessert = new DessertFactory();
		dessert.getDessert("Crepe");
		dessert.getDessert("Chocolat");
		System.out.println(dessert.toString());
	}

}
