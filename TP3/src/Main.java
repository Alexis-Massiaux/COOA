import java.util.Random;

public class Main {
	
	public static void main(String[] args){
		Garage garage = new Garage();
		/*garage.add(new Voiture("x", Etat.MARCHE));
		garage.add(new Voiture("y", Etat.PLEGERE));
		garage.add(new Voiture("z", Etat.PSEVERE));*/
		for(int i=0; i<100; i++){
			String modele = "N°"+i;
			int n = new Random().nextInt(3);
			Etat etat=Etat.MARCHE;
			switch(n){
			case 0 : etat=Etat.MARCHE; break;
			case 1 : etat=Etat.PLEGERE; break;
			case 2 : etat=Etat.PSEVERE; break;
			}
			garage.add(new Voiture(modele, etat));
		}
		System.out.println(garage.toString());
		Iterateur it = garage.iterator();
		while(it.hasNext()){
			Voiture voiture = it.next();
			garage.atelier=voiture.atelier;
			if(!(garage.getVoiture(it.indice).etat.equals(Etat.MARCHE))){
			System.out.println(voiture.modele+" est en cours de reparation...");
			try{
				Thread.sleep(garage.atelier.reparer(voiture)*1000);
			}catch(Exception e){
				System.out.println(e.getMessage());
			}
			
			garage.getVoiture(it.indice).etat = Etat.MARCHE;
			System.out.println(garage.toString());
			}
		}
	}

}
