import java.util.Random;

public class AtelierLeger extends Atelier{
	
	private static Atelier a = null;

	@Override
	int reparer(Voiture voiture) {
		// TODO Auto-generated method stub
		return new Random().nextInt(3)+1;
	}
	
	public static synchronized Atelier getInstance(){
		if(a == null)
			a = new AtelierLeger();
		return a;
	}	
}
