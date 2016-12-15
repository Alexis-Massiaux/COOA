import java.util.Random;

public class AtelierSevere extends Atelier{
	
	private static Atelier a = null;

	@Override
	int reparer(Voiture voiture) {
		// TODO Auto-generated method stub
		return new Random().nextInt(4)+3;
	}
	
	public static synchronized Atelier getInstance(){
		if(a == null)
			a = new AtelierLeger();
		return a;
	}

}
