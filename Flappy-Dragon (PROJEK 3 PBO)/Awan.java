import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;

/**
 * Write a description of class Awan here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Awan extends Props
{
    /**
     * Act - do whatever the Awan wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Awan (){
        Random rnd = new Random();
        this.setImage("awan"+rnd.nextInt(6)+".png");
        
        GreenfootImage img = this.getImage();
        img.scale(120,90);
        this.setImage(img);
    }
    public void act()
    {
        this.setLocation(this.getX()-1, getY());
        if (this.getX() <= 0) {
            World wrld = this.getWorld();
            wrld.addObject(new Awan(), wrld.getWidth()-1, new Random().nextInt(wrld.getHeight()-1));
            wrld.removeObject(this);
        }
    }
}
