import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Gajah here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Gajah extends Actor
{
    private String text;
    private Kata kata;
    private boolean spawnedKata = false;
    private boolean remove = false;
    
    public boolean bandingkanKata(String kataLain) {
        return kata.getKata().equals(kataLain);
    }
    
    public int ambilX() {
        return getX();
    }
    
    public int ambilY() {
        return getY();
    }
    
    public Gajah() {
        kata = new Kata();
    }
    
    public void activeToRemove() {
        remove = true;
    }
    
    /**
     * Act - do whatever the Gajah wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move(-1);
         
        if (spawnedKata == false) {
            spawnedKata = true;
            getWorld().addObject(kata, getX(), getY() + 35);
        }
        
        Actor p = getOneIntersectingObject(Peluru.class);
        if (p != null && p instanceof Peluru && remove == true) {
            getWorld().removeObject(p); // hapus peluru
            getWorld().removeObject(kata); // hapus kata
            getWorld().removeObject(this); // hapus gajah ini
        }
    }
}
