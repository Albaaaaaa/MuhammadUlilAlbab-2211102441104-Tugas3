import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bird here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bird extends Player
{
    /**
     * Act - do whatever the Bird wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void Bird()
    {
        this.setImage(new GreenfootImage("naga1.png"));
    }
    {
        GreenfootImage img = this.getImage();
        img.scale(120,120);
        this.setImage(img);
    }
    
    int lastNameNo = 1;
    int animationDelay = 10;
    void animate(){
        if(animationDelay<10){
            animationDelay++;
            return;
        }
        animationDelay = 0;
        if(lastNameNo==4){
            lastNameNo = 1;
        }else{
            lastNameNo++;
        }
        
        this.setImage(new GreenfootImage("naga"+lastNameNo+".png"));
        GreenfootImage img = this.getImage();
        img.scale(120,120);
        this.setImage(img);
    }
    
    public void act()
    {
    animate();
    super.act();
    
    if (isTouching(pesawat.class)) {
            // Tambahkan logika ketika pesawat terkena naga (misalnya, game over atau penurunan skor)
            World wrld = this.getWorld();
            wrld.removeObject(this); // Hapus pesawat
        }
   }
}

