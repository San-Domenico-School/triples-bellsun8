import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.ArrayList;
public class Player extends Actor
{
    /**
     * Act - do whatever the Player wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private Dealer dealer;
    private Card[] cardsSelected;
    private ArrayList<Card> cardsOnBoard;
    private ArrayList<Integer> selectedCardsIndex;
    
 
    public Player(Dealer dealer)
    {
        this.dealer = dealer;
        cardsSelected = new Card[3];
    }
    
    public void act()
    {
        selectCards();
        if(threeCardsSelected())
        {
            dealer.checkIfTriple(cardsOnBoard, cardsSelected, selectedCardsIndex);
            resetCardsSelected();
        }
       
    }
       public void addedToWorld(World world)
    {
        cardsOnBoard = (ArrayList) getWorld().getObjects(Card.class);
    }
    
 
    
    private void selectCards()
    {
         for(int i = 0; i < cardsOnBoard.size(); i++)
           {
                  if(Greenfoot.mouseClicked(cardsOnBoard.get(i)))
                 {
                         if(cardsOnBoard.get(i).getIsSelected())
                         {
                              cardsOnBoard.get(i).setIsSelected(false);
                              cardsOnBoard.get(i).setImage(cardsOnBoard.get(i).getCardImage());
                              selectedCardsIndex.remove(new Integer(i));
                         }
                         else
                         {
                               cardsOnBoard.get(i).setIsSelected(true);
                               cardsOnBoard.get(i).setImage(cardsOnBoard.get(i).getSelectedCardImage());
                               selectedCardsIndex.add(new Integer(i));
                         }
                  }
            }
    }
    
    private void resetCardsSelected()
    {
         for(int i = 0; i < cardsOnBoard.size(); i++)
          {
                cardsOnBoard.get(i).setImage(cardsOnBoard.get(i).getCardImage());
                cardsOnBoard.get(i).setIsSelected(false);
          }
          selectedCardsIndex.clear();
    }
    
    private boolean threeCardsSelected()
    {
        return false;
    }

}
