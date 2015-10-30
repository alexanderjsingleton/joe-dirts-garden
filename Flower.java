import greenfoot.*;

/**
 * Write a description of class Flower here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Flower extends Actor
{
    /**
     * Act - do whatever the Flower wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public static final int FLOWER_LIFE = 200;
    private int age;
    private int choice;
    public Flower(int startingAge)
    {
        age = startingAge;
        selectFlowerImage();
        // int choice = Greenfoot.getRandomNumber(4); // will get 0 or 1 or 2
        if ( choice == 0 ) 
        {
            setImage("flower2.png");
        }
        else if ( choice == 1 )
        {
            setImage("sunflower.png");
        }
        else if ( choice == 2 )
        {
            setImage("tulip.png");
        }
        else
        {
            setImage("ant3.png"); // bug in our program if this executes
        }
    }

    public void act() 
    {
        age = age + 1;
        fade();
        checkToRemoveObject();
    }   

    public void selectFlowerImage()
    {
      
    }

    public void checkToRemoveObject()
    {
        if ( age == FLOWER_LIFE ) 
        {
            World myWorldAssistant = getWorld();
            myWorldAssistant.removeObject(this);
        }
    }

    public void fade()
    {
        if( (age % 30 ) == 0 )
        {
            GreenfootImage myImageAssistant = getImage();
            int previousTransparency = myImageAssistant.getTransparency();
            int newTransparency = (int)(((double)previousTransparency) * .8);
            myImageAssistant.setTransparency(newTransparency); 
        }
    }
}
