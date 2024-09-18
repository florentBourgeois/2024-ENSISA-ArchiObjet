package uha.ensisa.archiobjet.uno.question1;


import java.util.List;

/**
 * représente une main de cartes
 * Cette classe permet de spécifier un vocabulaire orienté "jeu de carte" plutot qu'un vocabulaire orienté "programmation" avec une liste
 */
public class Hand  {

    private List<Card> cards;

    /**
     * ajoute une carte piochée à la main
     * @param c la carte qui a été piochée
     */
    public void pickedACard(Card c){
        this.cards.add(c);
    }

    /**
     * joue une carte (la retire de la main)
     * @param c la carte à jouer
     */
    public void playCard(Card c){
        this.cards.remove(c);
    }

    /**
     * vérifie si la main contient une carte donnée
     * @param c la carte à vérifier
     * @return
     */
    public boolean holdsCard(Card c){
        return this.cards.contains(c);
    }

    /**
     * retourne le nombre de cartes dans la main
     * @return
     */
    public int nbrOfCards(){
        return this.cards.size();
    }


}
