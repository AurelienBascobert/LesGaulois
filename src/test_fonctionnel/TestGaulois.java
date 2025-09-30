package test_fonctionnel;

import personnages.Chaudron;
import personnages.Druide;
import personnages.Gaulois;
import personnages.Romain;

public class TestGaulois {
    public static void main(String[] args) {
        Gaulois asterix = new Gaulois("Asterix",8);
        Gaulois obelix = new Gaulois("Obélix",16);
        System.out.println("Le Gaulois "+asterix.getNom()+" : Bonjour "+ obelix.getNom());
        System.out.println("Le Gaulois "+obelix.getNom()+" : Bonjour "+ asterix.getNom()+
                ". Ca te dirais d'aller chasser des sangliers ?");
        System.out.println("Le Gaulois "+asterix.getNom()+" : Oui très bonne idée. ");
        Romain minus = new Romain("Minus",6);
        System.out.println("Dans la forêt "+asterix+" et "+ obelix+
                " tombent nez a nez sur le romain "+minus);
        for (int i = 0; i<3; i++){
            asterix.frapper(minus);
        }
        System.out.println("\n\n");
        Romain brutus  = new Romain("Brutus",14);
        Druide panoramix = new Druide("Panoramix",2);
        panoramix.fabriquerPotion(4,3);
        panoramix.boosterGaulois(obelix);
        panoramix.boosterGaulois(asterix);
        for (int i = 0; i<3; i++){
            asterix.frapper(brutus);
        }
    }


}
