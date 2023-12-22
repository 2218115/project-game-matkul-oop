import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    public static String[] kataIndonesia = {
            "rumah", "mobil", "kucing", "sekolah", "buku", "komputer", "guru", "pelajar", "senang", "belajar",
            "kopi", "makan", "minum", "hujan", "angin", "matahari", "pohon", "bunga", "udara", "laut",
            "gunung", "negeri", "negara", "seratus", "dua ratus", "tiga ratus", "empat ratus", "lima ratus",
            "enam ratus", "tujuh ratus", "delapan ratus", "sembilan ratus", "seribu", "kata", "bahasa", "indonesia",
            "orang", "keluarga", "teman", "musik", "film", "television", "internet", "komunikasi", "telepon", "pesan",
            "pakaian", "sepatu", "topi", "mata", "hidung", "mulut", "telinga", "jantung", "otak", "tulang",
            "otot", "jari", "kaki", "tangan", "pintu", "jendela", "kunci", "lampu", "meja", "kursi",
            "kamar", "dapur", "mandi", "tempat tidur", "sepatu", "sendal", "topi", "baju", "celana", "jaket",
            "kacamata", "jam", "kalender", "uang", "dompet", "kertas", "pensil", "penghapus", "buku catatan", "kamera",
            "layar", "keyboard", "mouse", "speaker", "mikrofon", "gitar", "piano", "drum", "saxophone", "trumpet",
            "pelangi", "awan", "bintang", "bulan", "planet", "galaksi", "api", "air", "bumi", "angkasa",
            "perpustakaan", "museum", "taman", "rumput", "bola", "sepeda", "kapal", "pesawat", "mobil listrik", "kereta api",
            "taksi", "bus", "motor", "sepeda motor", "berenang", "berlari", "bersepeda", "bermain", "berdoa", "bermeditasi",
            "bernyanyi", "menari", "bermain game", "memasak", "membaca", "menulis", "menggambar", "melukis", "berbicara", "mendengarkan",
            "bertanya", "menjawab", "menulis surat", "mengirim email", "menelepon", "mengirim pesan", "berfoto", "berlibur", "bepergian", "bertualang"
    };
    
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1280, 720, 1);
        addObject(new Rocket(), 64, getHeight() / 2);
    }
}
