package histoire;
import personnages.*;

public class Scenario {

	public static void main(String[] args) {
		
		
		Gaulois asterix = new Gaulois("Asterix",8);
		Gaulois obelix = new Gaulois("Obelix",20);
		Romain minus = new Romain ("Petibonum",6);
		Druide panoramix = new Druide ("Panoramix",5,10);
		panoramix.parler("Je vais aller preparer une petite potion...");
		panoramix.preparerPotion();
		panoramix.booster(obelix);
		obelix.parler("Par belenos! Ce n'est pas juste!");
		panoramix.booster(asterix);
		asterix.parler("Bonjour");
		minus.parler("UN GAU... UN GAUGAU...");
		asterix.frapper(minus);
		asterix.frapper(minus);
		asterix.frapper(minus);
	}

	
}
