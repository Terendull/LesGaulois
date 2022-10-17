package personnages;

public class Romain {
	private String nom;
	private int force;
	private int nbEquipement =0;
	private Equipement[] equipements;
	
	public Romain(String nom, int force) {
		assert force >=0;
		this.nom = nom;
		this.force = force;
		equipements = new Equipement[2];
	}
	
	private void ajoutEquipement(Equipement equipement) {
		equipements[nbEquipement]=equipement;
		nbEquipement += 1;
		System.out.println("Le soldat "+this.getNom()+" s'equipe avec un "+equipement+".");
	}
	
	public void sEquiper(Equipement equipement) {
		switch (nbEquipement) {
		case 2 :
			System.out.println("Le soldat "+this.getNom()+" est deja bien protege !");
			break;
		case 1 :
			if (equipements[0] == equipement) {
				System.out.println("Le soldat "+this.getNom()+" possede deja un "+equipement+".");
			}
			else {
				ajoutEquipement(equipement);
			}
			break;
		default :
			ajoutEquipement(equipement);
		}
	}
	
	public String getNom() {
		return nom;
	}
	
	public void parler(String texte) {
		System.out.println(prendreParole() + "« " + texte + "»");
	}
	
	private String prendreParole() {
		return "Le romain " + nom + " : ";
	}
	
	public void recevoirCoup(int forceCoup) {
		assert force > 0;
		int forceDebut = force;
		force -= forceCoup;
		if (force > 0) {
			parler("Aïe");
		} else {
			parler("J'abandonne...");
		}
		assert force < forceDebut;
	}
}
