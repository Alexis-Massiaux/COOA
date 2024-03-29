import java.util.Observable;

public class TemperatureModel extends Observable{
	
	private double temperatureC = 20;
	
	public double getC(){
		return temperatureC;
	}
	
	public void setC(double tempsC){
		temperatureC=tempsC;
		setChanged();
		notifyObservers();
	}
	
	public double getF(){
		return temperatureC*9.0/5.0 + 32.0;
	}
	
	public void setF(double tempF){
		temperatureC = (tempF - 32) * 5.0 / 9.0;
		setChanged();
		notifyObservers();
	}

}
