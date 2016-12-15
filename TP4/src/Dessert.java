import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class Dessert {
	
	private String libelle="";
	private double prix=0;
	List<Dessert> list = new ArrayList<>();
	
	public void add(Dessert d){
		list.add(d);
	}
	
	public void remove(Dessert d){
		list.remove(d);
	}
	
	public String getLibelle() {
		String res="";
		Iterator<Dessert> it = list.iterator();
		while(it.hasNext()){
			res+=it.next().libelle;
			if(!it.hasNext())
				res+=";";
		}
		return res;
	}
	
	public double getPrix(){
		double prix=0;
		Iterator<Dessert> it = list.iterator();
		while(it.hasNext()){
			prix+=it.next().getPrix();
		}
		return prix;
	}
	
	protected void setLibelle(String libelle){
		this.libelle=libelle;
	}
	
	protected void setPrix(double prix){
		this.prix=prix;
	}
	
	public String toString(){
		return "Dessert : "+getLibelle()+" Prix : "+getPrix();
	}
	

}
