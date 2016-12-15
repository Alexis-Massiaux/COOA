import java.util.ArrayList;
import java.util.Iterator;

public class Garage implements Iterable<Voiture> {
	
	ArrayList<Voiture> list;
	Atelier atelier = null;
	
	Garage(){
		list = new ArrayList<Voiture>();
	}
	
	void add(Voiture voiture){
		list.add(voiture);
	}
	
	void remove(Voiture voiture){
		list.remove(voiture);
	}
	
	Voiture getVoiture(int indice){
		return list.get(indice);
	}
	
	public String toString(){
		String res="";
		Iterator<Voiture> it = iterator();
		while(it.hasNext()){
			Voiture voiture = it.next();
			res+="Modele : "+voiture.modele+"   Etat : "+voiture.etat+"\n";
		}
		return res;
	}

	public Iterateur iterator() {
		return new Iterateur(list);
	}

}
