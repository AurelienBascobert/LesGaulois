package personnages;

public class Chaudron {
    private int quantitePotion;
    private int forcePotion;

    public Chaudron(int quantitePotion, int forcePotion) {
        this.quantitePotion = quantitePotion;
        this.forcePotion = forcePotion;
    }

    public void remplirChaudron(int quantite, int forcePotion){
    }
    public boolean resterPotion() {
        return quantitePotion > 0;
    }
    public int prendreLouche(){
        quantitePotion = quantitePotion - 1;
        return forcePotion;
    }
}
