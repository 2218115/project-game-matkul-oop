import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Gajah here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Gajah extends Actor implements DapatCaption
{
    private Kata kata;
    private boolean spawnedKata = false;
    private boolean hapus = false;
    private GreenfootSound suara = new GreenfootSound("explosion.wav");
    
    // method untuk membandingkan sebuah kata
    @Override
    public boolean bandingkanCaption(String kataLain) {
        return kata.getKata().equalsIgnoreCase(kataLain);
    }
    
    @Override
    public void spawnCaption() {
        if (spawnedKata == false) {
            spawnedKata = true;
            getWorld().addObject(kata, getX(), getY() + 35);
        }
    }
    
    // getter untuk posisi x dan y
    public int ambilX() {
        return getX();
    }
    
    public int ambilY() {
        return getY();
    }
    
    public Gajah() {
        // inisialisasi objek kata
        kata = new Kata();
    }
    
    // method untuk mengatur objek ini boleh di hapus
    public void bolehkanUntukDiHapus() {
        hapus = true;
    }
    
    public void act()
    {
        // berpindah
        move(-1);
        
        // spawn kata
        spawnCaption();
        
        if (isAtEdge()) {
            MyWorld world = (MyWorld)getWorld();
            world.setNyawa(world.getNyawa() - 1);
            if(world.getNyawa() == 0){
                ((MyWorld)getWorld()).displayStatus();
                getWorld().showText("GAME OVER", getWorld().getWidth()/2, getWorld().getHeight()/2);
                Greenfoot.stop();
            }  
            suara.play();
            world.removeObject(kata);
            world.removeObject(this);
            return;
        }
        
        // ambil peluru yang menyentuh ufo
        Actor p = getOneIntersectingObject(Peluru.class);
        // jika ada dan ufo sudah boleh di hapus
        if (p != null && p instanceof Peluru && hapus == true) {
            MyWorld world = (MyWorld)getWorld();
            world.setSkor(1000);
            suara.play();
            getWorld().removeObject(p); // hapus peluru
            getWorld().removeObject(kata); // hapus kata
            getWorld().removeObject(this); // hapus gajah ini
        }
    }
}
