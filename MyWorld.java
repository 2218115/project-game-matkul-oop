import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class MyWorld extends World
{
    private int nyawa = 3;
    private int skor = 0;
    
    public void setNyawa(int nyawa){
        this.nyawa = nyawa--;
    }
    
    public void setSkor(int skor){
        this.skor += skor;
    }
    
    public int getNyawa(){
        return nyawa;
    }
    
    public int getSkor(){
        return skor;
    }
    
    public void displayStatus() {
        showText("Nyawa: " + getNyawa(), 100, 32);
        showText("Skor: " + getSkor(), getWidth() - 200, 32);
    }

    public static String[] kataIndonesia = {
           "Hari", "Bumi", "Mata", "Laut", "Rumah", "Tari", "Gila", "Jadi", "Sapi", "Padi",
            "Raja", "Tahu", "Cuci", "Kali", "Jala", "Bola", "Kura", "Kopi", "Ikan", "Api",
            "Pena", "Tiga", "Emas", "Warna", "Lang", "Kaca", "Kuda", "Raja", "Tuli", "Enak",
            "Liar", "Gigi", "Lima", "Besi", "Kaos", "Paku", "Hati", "Duri", "Suka", "Mata",
            "Tari", "Lari", "Duri", "Kaca", "Paku", "Rusa", "Menu", "Batu", "Pena", "Tali",
            "Gula", "Kaus", "Nasi", "Kopi", "Tuna", "Ikan", "Isti", "Aksi", "Seja", "Duka",
            "Pena", "Baja", "Raja", "Tapi", "Roda", "Awan", "Aksi", "Padi", "Baja", "Kopi"
    };
    
    GreenfootSound suaraLatarBelakang = new GreenfootSound("back.wav");
    
    public MyWorld()
    {    
        super(1280, 720, 1);
        addObject(new Rocket(), 64, getHeight() / 2);
        displayStatus();
        suaraLatarBelakang.setVolume(20);
        suaraLatarBelakang.playLoop();
    }
}
