package interface_abstarct;

// Membuat abstract class
public abstract class Tumbuhan{
    protected String nama;
    protected int suhu;
    protected String fungsi;

    // Constructor
    public Tumbuhan(String nama, int suhu, String fungsi){
        this.nama=nama;
        this.suhu=suhu;
        this.fungsi=fungsi;
    }

    // Setter dan getter var nama
    public void setNama(String nama){
        this.nama=nama;
    }
    public String getNama(){
        return nama;
    }

    // Setter dan getter var suhu
    public void setSuhu(int suhu){
        this.suhu=suhu;
    }
    public int getSuhu(){
        return suhu;
    }

    // Setter dan getter var fungsi
    public void setFungsi(String fungsi){
        this.fungsi=fungsi;
    }
    public String getFungsi(){
        return fungsi;
    }

    // Membuat abstact method
    public abstract void displayCiri();
    public abstract void displaySuhu();
}