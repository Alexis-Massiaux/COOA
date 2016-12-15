import java.util.ArrayList;
import java.util.Iterator;

public class Iterateur implements Iterator<Voiture>{
	
	int indice = -1;
	private ArrayList<Voiture> list;
	private int size = 0;
	
	Iterateur(ArrayList<Voiture> list){
		this.list=list;
		size=list.size();
	}

	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		return (indice + 1)<size;
	}

	@Override
	public Voiture next() {
		// TODO Auto-generated method stub
		indice ++;
		return list.get(indice);
	}

}
