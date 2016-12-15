import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.BoxLayout;
import javax.swing.JButton;

public class Tchat implements KeyListener{
	
	JFrame fenetre;
	JPanel panel;
	JTextArea affichage;
	JButton nouveau;
	JTextField saisie;
	
	String first="[user] : ";
	String ssi="";
	String res="\n";
	
	Tchat(){
		fenetre=new JFrame("Radio Tchat");
		fenetre.pack();
		fenetre.setSize(350, 550);
		fenetre.setLocationRelativeTo(null);
		fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panel = new JPanel();
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS ));
		panel.setBackground(new Color(250,250,250));
		
		nouveau = new JButton("Nouvel Auditeur");
		nouveau.setAlignmentX(Component.CENTER_ALIGNMENT);
		nouveau.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
			}
		});
		
		affichage = new JTextArea();
		affichage.setPreferredSize(new Dimension(350,500));
		affichage.setEditable(false);
		affichage.setBackground(new Color(250,250,250));
		
		saisie = new JTextField();
		saisie.setPreferredSize(new Dimension(350, 30));
		saisie.setForeground(Color.GRAY);
		saisie.setBackground(new Color(230,230,230));
		saisie.addKeyListener(new KeyListener(){
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				switch(e.getKeyCode()){
					case KeyEvent.VK_ENTER : ssi = first ; ssi+=saisie.getText(); res+=ssi+"\n"; affichage.setText(res); saisie.setText(""); break;
				}
			}

			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			});
		
		panel.add(nouveau);
		panel.add(affichage);
		panel.add(saisie);
		
		
		fenetre.setContentPane(panel);
		fenetre.setVisible(true);
	}
	
	public static void main(String[] args){
		new Tchat();
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
}
