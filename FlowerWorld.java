import greenfoot.*;

/**
 * Write a description of class FlowerWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FlowerWorld extends World
{
    private static final int NUMBER_FLOWERS = 8;
    private static final int HOW_OFTEN_TO_ADD = Flower.FLOWER_LIFE / NUMBER_FLOWERS;
    private int worldAge;

    /**
     * Constructor for objects of class FlowerWorld.
     * 
     */
    public FlowerWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        worldAge = 0;
        populateFlowerBed();

    }

    public void act()
    {
        worldAge = worldAge + 1;
        checkToAddFlower();
    }


    public void checkToAddFlower()
    {
        if ( (worldAge % HOW_OFTEN_TO_ADD) == 0)
        {
            addObject(new Flower(0), 
                Greenfoot.getRandomNumber(getWidth()),
                getHeight() - 30);
        }
    }

    public void populateFlowerBed() 
    {
        for ( int i = 0; i < 8 ; i++)
        {
            addObject(new Flower(Greenfoot.getRandomNumber(Flower.FLOWER_LIFE)),
                Greenfoot.getRandomNumber(getWidth()),
                getHeight() - 30);
        }
    }
}
