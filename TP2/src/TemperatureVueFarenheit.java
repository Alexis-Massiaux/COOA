import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Observable;

public class TemperatureVueFarenheit extends TemperatureVue{
	
	public TemperatureVueFarenheit(TemperatureModel model, TemperatureController controller, int posX, int posY) {
		super("Temperature_Farenheit", model, controller, posX, posY);
		setDisplay(""+model.getF());
		addUpListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				controller.augmenteDegresF();
			}
		});
		addDownListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				controller.diminueDegresF();
			}
		});
		addDisplayListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				double tempF = getDisplay();
				controller.fixeDegresF(tempF);
			}
		});
	}

	
	public void update(Observable o, Object arg) {
		setDisplay(""+model().getF());
	}

}
