import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Kata here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Kata extends Actor
{
    private String kata;
    // encapsulation
    // getter
    public String getKata() {
        return kata;
    }
    /**
     * Act - do whatever the Kata wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     * 
     * 
     */
    public Kata() {
        kata = MyWorld.kataIndonesia[Greenfoot.getRandomNumber(100)];
        GreenfootImage textImage = new GreenfootImage(kata, 24, Color.WHITE, null);
        setImage(textImage);
    }
    
    public void act()
    {
        move(-1);
    }
}
