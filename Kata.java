import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Kata extends Actor
{
    private String kata;
    
    // encapsulation
    // getter
    public String getKata() {
        return kata;
    }
    
    
    public Kata() {
        // berikan nilai default pada kata
        // mengambil pada random dari arrray of String kata
        kata = MyWorld.kataIndonesia[Greenfoot.getRandomNumber(MyWorld.kataIndonesia.length)];
        GreenfootImage textImage = new GreenfootImage(kata, 24, Color.WHITE, null);
        setImage(textImage);
    }
    
    public void act()
    {
        move(-1);
    }
}
