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
    public void act() 
    {
        fade();
    }   

    public void jumpUpAndDown()
    {
        int amount = getImage().getHeight() / 2; // height of the jump is 1/2 height of cat image height
        setLocation(getX(),getY() - amount);
        checkForPizza();
        wait(10);
        setLocation(getX(),getY() + amount);
    }
}
