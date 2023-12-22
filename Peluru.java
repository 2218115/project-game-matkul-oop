import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Peluru here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Peluru extends Actor
{
    private double x;
    private double y;
    private double moveX;
    private double moveY;
    
    public Peluru(int startX, int startY, double moveX, double moveY) {
        setLocation(startX, startY);
        x = startX;
        y = startY;
        this.moveX = moveX;
        this.moveY = moveY;
    }
    /**
     * Act - do whatever the Peluru wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        x += moveX;
        y += moveY;
        
        setLocation((int)x, (int)y);
    }
}
