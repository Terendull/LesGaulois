package personnages;
import java.util.Random;

public class Druide {
	private String nom;
	private int effetPotionMin;
	private int effetPotionMax;
	private int forcePotion;
	
	public Druide(String nom, int effetPotionMin, int effetPotionMax) {
		this.nom = nom;
		this.effetPotionMin = effetPotionMin;
		this.effetPotionMax = effetPotionMax;
		forcePotion = 1;
		parler("Bonjour, je suis le druide " + nom + " et ma potion peut aller d'une force " + effetPotionMin + " à " + effetPotionMax + ".");
	}
	
	public String getNom() {
		return nom;
	}
	
	public void parler(String texte) {
		System.out.println(prendreParole() + "« " + texte + "»");
	}
	
	private String prendreParole() {
		return "Le druide " + nom + " : ";
	}
	
	public void preparerPotion() {
		Random random = new Random();
		forcePotion = effetPotionMin + random.nextInt(effetPotionMax-effetPotionMin+1);
		if (forcePotion > 7) {
			this.parler("J ai prepare une super potion de force "+forcePotion);
		}
		else {
			this.parler("Je n ai pas trouve tous les ingredients, ma potion est seulement de force "+forcePotion);
		}
	}
	
	public void booster(Gaulois gaulois) {
		if (gaulois.getNom() == "Obelix" ) {
			this.parler("Non Obelix!... Tu n'auras pas de potion magique!");
		}
		else {
			gaulois.boirePotion(forcePotion);
		}
	}
	
	public String toString() {
		return "Druide [nom=" + nom + ", forcePotion=" + forcePotion + "]";
	}
}
