package personnages;

public class Romain {
    private String nom;
    private int force;

    public Romain(String nom, int force) {
        this.nom = nom;
        this.force = force;
    }

    public static void main(String[] args) {


    }

    @Override
    public String toString() {
        return nom;
    }

    public void recevoirCoup(int forceCoup){
        force = force - forceCoup;
        if (force <= 0){
            System.out.println(prendreParole()+" J'abandonne. ");
        }
        else {
            System.out.println(prendreParole()+" Aïe");
        }
    }


    public String getNom() {
        return nom;
    }

    public void parler(String texte) {
        System.out.println(prendreParole() + "\"" + texte + "\"");
    }

    private String prendreParole() {
        return "Le romain " + nom + " : ";

    }

    public int getForce() {
        return force;
    }
}