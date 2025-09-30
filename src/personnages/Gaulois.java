package personnages;

public class Gaulois {
    private String nom;
    private int force;

    public Gaulois(String nom, int force) {
        this.nom = nom;
        this.force = force;
    }

    public int getForce() {
        return force;
    }

    public void frapper(Romain romain){
        System.out.println(nom + " envoie un grand coup dans la machoire de "+ romain.getNom());
        romain.recevoirCoup(force / 3);

    }

    public void boirePotion(int forcePotion){
        force += forcePotion;
    }



    public String getNom() {
        return nom;
    }

    public void parler(String texte) {
        System.out.println(prendreParole() + "\"" + texte + "\"");
    }

    private String prendreParole() {
        return "Le gaulois " + nom + " : ";

    }

    @Override
    public String toString() {
        return nom;
    }

    public static void main(String[] args) {
        Gaulois asterix = new Gaulois("Astérix",8);
        System.out.println(asterix);
    }

}
