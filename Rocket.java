import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;

/**
 * Write a description of class Rocket here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Rocket extends Actor
{
    
    private String kataDiketik = "";
    private int counter = 0;
    
    public void act()
    {
        ((MyWorld)getWorld()).displayStatus();
        
        String key = Greenfoot.getKey();
        if (key != null) {
            
            if (key.length() == 1) {
                kataDiketik += key;
            } else if (key.equals("backspace") && kataDiketik.length() > 0) {
                kataDiketik = kataDiketik.substring(0, kataDiketik.length() - 1);
            }
        }
        
        counter++;
        if (counter >= 100) {
            getWorld().addObject(new Gajah(), getWorld().getWidth(), 50 + Greenfoot.getRandomNumber(getWorld().getHeight() - 100));
            counter = 0;
        }
        getWorld().showText(kataDiketik, getX(), getY() + 64);
        
        // ambil semua gajah
        List<Gajah> gajahs = getWorld().getObjects(Gajah.class);
        for (Gajah g : gajahs) {
            if (g.bandingkanCaption(kataDiketik)) {
                kataDiketik = "";
                double dX = getX() - g.ambilX();
                double dY = getY() - g.ambilY();
                double panjang = Math.sqrt(dX * dX + dY * dY);
                double normalX = dX / panjang;
                double normalY = dY / panjang;
                double kecepatan = 20;
                
                // spawn peluru
                getWorld().addObject(new Peluru(getX(), getY(), -normalX * kecepatan, -normalY * kecepatan), getX(), getY());
                // aktifkan bahwa gajah yang target ini sudah bisa untuk dihapus
                g.bolehkanUntukDiHapus();
            }
        }
    }
}
