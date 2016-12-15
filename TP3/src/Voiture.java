
public class Voiture {
	
	String modele;
	Etat etat;
	Atelier atelier;
	
	Voiture(String modele, Etat etat){
		this.modele=modele;
		this.etat=etat;
		if(etat.equals(Etat.PLEGERE))
			atelier = AtelierLeger.getInstance();
		else if(etat.equals(Etat.PSEVERE))
			atelier = AtelierSevere.getInstance();
	}

}
