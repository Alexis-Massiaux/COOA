import java.util.Observable;
import java.util.Observer;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.JTextField;

public class Thermometre{
	private JFrame thermometre;
	private JSlider slider;
	private JPanel panel;
	
	public Thermometre(){
		thermometre=new JFrame();
		panel = new JPanel();
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		slider = new JSlider(JSlider.VERTICAL, 0,50,20);
		panel.add(slider);
		thermometre.add(panel);
		thermometre.setSize(75, 500);
		thermometre.setLocationRelativeTo(null);
		thermometre.setVisible(true);
		thermometre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void update(Observable o, Object arg) {
	}

}
