import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Dealer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.ArrayList;

public class Dealer extends Actor
{
    /**
     * Act - do whatever the Dealer wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int triplesRemaining;
    private Deck deck;
    
    
    
    
    
    public void addedToWorld(World world)
    {
        dealBoard();
    }
    
    public void dealBoard()
    {
        for(int row = 0; row < 5; row++)
        {
            for(int col = 0; col < 3; col++)
            {
                getWorld().addObject(deck.getTopCard(),
                        85 + 130 * col,80 + 80 * row);
                
            }
        }
        
    }
    
    private void setUI()
    {
        String cardsRemainingText = new Integer(triplesRemaining * 3).toString();
        String scoreText = new Integer(Scorekeeper.getScore()).toString();
        getWorld().showText(cardsRemainingText, 310, 470);
        getWorld().showText(scoreText, 310, 504);   
    }
    public void checkIfEndGame()
    {
        
    }
    public void checkIfTriple(ArrayList<Card> cardsOnBoard, Card[] cardsSelected, 
                               ArrayList<Integer> selectedCardsIndex)
    {
        
    }
    private void removeAndReplaceTriple(ArrayList<Card> cardsOnBoard, Card[] cardsSelected, 
                               ArrayList<Integer> selectedCardsIndex)
    {
        
    }
    public Dealer(int numCardsInDeck)
    {
        deck = new Deck(numCardsInDeck);
        triplesRemaining = numCardsInDeck / 3;
        Scorekeeper.setDeckSize(numCardsInDeck);
    }
    
       
    
    
}
