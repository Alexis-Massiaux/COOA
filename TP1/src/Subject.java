import java.util.ArrayList;
import java.util.List;

public abstract class Subject {
	
	private List<Observer> list = new ArrayList<>();
	
	void attach(Observer o){
		list.add(o);
	}
	
	void detach(Observer o){
		list.add(o);
	}
	
	void notifyObservers(){
		for(Observer o : list){
			o.update();
		}
	}
}
