package histoire;
import personnages.*;

public class Village {
	private String nom;
	private Chef chef;
	private int nbVillageois;
	private Gaulois[] villageois;
	
	public Village (String nom, int nbVillageoisMaximum) {
		this.nom=nom;
		nbVillageois=0;
		villageois= new Gaulois[nbVillageoisMaximum];
	}
	
	public void ajouterHabitant(Gaulois gaulois) {
		villageois[nbVillageois]=gaulois;
		nbVillageois +=1;
	}

	public Gaulois trouverHabitant(int numero) {
		return villageois[numero];
	}
	
	public void afficherVillageois() {
		System.out.println("Dans village du chef "+chef.getNom()+" vivent les legendaires gaulois :");
		for (int i = 0 ; i < nbVillageois ; i++) {
			System.out.println("- "+villageois[i].getNom());
		}
	}
	public void setChef(Chef chef) {
		this.chef=chef;
	}
	public String getNom() {
		return nom;
	}
}
