
public class TemperatureMVC {
	
	public TemperatureMVC(){
		TemperatureModel tempmod = new TemperatureModel();
		TemperatureController tempcontrolC = new TemperatureController(tempmod);
		TemperatureController tempcontrolF = new TemperatureController(tempmod);
		TemperatureVueCelsius pvc = new TemperatureVueCelsius(tempmod, tempcontrolC, 100, 200);
		TemperatureVueFarenheit tvf = new TemperatureVueFarenheit(tempmod, tempcontrolF, 100, 350);
		tempcontrolC.addView(pvc);
		tempcontrolF.addView(tvf);
	}
	
	public static void main(String args[]){
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run(){
				new TemperatureMVC();
			}
		});
	}

}
