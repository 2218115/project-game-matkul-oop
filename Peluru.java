import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Peluru extends Actor
{
    private double x;
    private double y;
    private double moveX;
    private double moveY;
    private GreenfootSound suara = new GreenfootSound("shoot.wav");
    
    public Peluru(int startX, int startY, double moveX, double moveY) {
        setLocation(startX, startY);
        x = startX;
        y = startY;
        this.moveX = moveX;
        this.moveY = moveY;
        suara.play();
    }
    
    public void act()
    {
        x += moveX;
        y += moveY;
        
        setLocation((int)x, (int)y);
    }
}
