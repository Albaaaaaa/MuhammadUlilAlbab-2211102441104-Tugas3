import greenfoot.*;  
import java.util.*;

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    private Bird naga;  // Pastikan variabel naga telah didefinisikan

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        super(900, 500, 1); 
        GreenfootImage img = new GreenfootImage("sky.jpeg");

        naga = new Bird();  // Inisialisasi objek naga
        this.addObject(naga, 100, 100);  // Tambahkan objek naga ke dunia

        Random rnd = new Random();
        setPaintOrder(Bird.class);
        for(int i = 0; i < 7; i++){
            this.addObject(new Awan(), rnd.nextInt(this.getWidth()-1), rnd.nextInt(this.getHeight()-1));
        }
        prepare();
    }

    public void act() {
        if(Greenfoot.getRandomNumber(350) < 1) {
           addObject(new pesawat(), 853, Greenfoot.getRandomNumber(479));
        }

    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        pesawat pesawat = new pesawat();
        addObject(pesawat,896,388);
        pesawat.setLocation(881,140);
        pesawat.setLocation(848,168);
    }
}