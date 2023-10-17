import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player extends Actor
{
    /**
     * Act - do whatever the Player wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int gravity = 5;
    public void act()
    {
        this.setLocation(this.getX(), this.getY()+gravity);
        if(Greenfoot.isKeyDown("space"))
        {
            this.setLocation(this.getX(), this.getY()-10);
        }
        
    }
    
}
