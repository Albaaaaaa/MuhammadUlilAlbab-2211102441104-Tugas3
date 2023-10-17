import greenfoot.*;

public class pesawat extends lawan
{
    private int kecepatan;
    
    public pesawat() 
    {
        GreenfootImage img = this.getImage();
        img.scale(200, 120);
        this.setImage(img);
        kecepatan = Greenfoot.getRandomNumber(5) + 1;
    }
    
    public void act() 
    {
        int x = getX();
        int y = getY();
        setLocation(x - kecepatan, y);
        
        if (x <= 0) {
            getWorld().removeObject(this);
        }
        
        if (Greenfoot.mouseMoved(null)) {
            MouseInfo mouse = Greenfoot.getMouseInfo();
            if (mouse.getY() > (y - 7) && mouse.getY() < (y + 7)) {
            }
        }
    }
}
