package personnages;

public class Druide {
    private String nom;
    private int force;

    public Druide(String nom, int force, Chaudron chaudron) {
        this.nom = nom;
        this.force = force;
        ZZZ = new Chaudron(0,0);
    }

    public String getNom() {
        return nom;
    }

    public void parler(String texte) {
        System.out.println(prendreParole() + "\"" + texte + "\"");
    }

    private String prendreParole() {
        return "Le Druide " + nom + " : ";

    }
    public void fabriquerPotion(int quantite, int forcePotion){
        chaudron.remplirChaudron(quantite, forcePotion);
        System.out.println("J'ai concocté " + quantite + " doses de potion magique. Elle a une force de "
                + forcePotion + ".");
    }

    public void boosterGaulois(Gaulois gaulois){
        if (chaudron.resterPotion()){
            if (gaulois.getNom() == "Obélix") {
                parler("Non, " + gaulois + " Non !... Et tu le sais tres bien ");
            }
            else {
                 gaulois.boirePotion(chaudron.prendreLouche());
                 parler("Tiens "+ gaulois+ " un peu de potion magique.");
            }
        }
        else {
            parler("Désolé " + gaulois + " il n'y a plus une seule goutte de potion.");
        }


    }
}
