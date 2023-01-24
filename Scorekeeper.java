import greenfoot.*;
/**
 * Write a description of class Scorekeeper here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Scorekeeper  
{
    // instance variables - replace the example below with your own
    private static int deckSize;
    private static int score;
    private static long startTime = System.currentTimeMillis();
    
    public static void setDeckSize(int size)
    {
        deckSize = size;
    }
    
    public static int getScore()
    {
        return score;
    }
    
    public static void updateScore()
    {
        int timePassed = (int)((System.currentTimeMillis() - startTime) / 1000);
        int points = deckSize - timePassed;
        if(points > 0)
        {
            score += points;
        }
        startTime = System.currentTimeMillis();
    }

    /**
     * Constructor for objects of class Scorekeeper
     */
    
    
    public Scorekeeper()
    {
        
    }


}
