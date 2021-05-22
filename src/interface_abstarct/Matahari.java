package interface_abstarct;

// Implements class Abstract dan Interface
public class Matahari extends Tumbuhan implements Monokotil, Dikotil{

    // Constructor
    public Matahari(String nama, int suhu, String fungsi){
        super(nama, suhu, fungsi);
    }

    // Mengisi method interface
    public void displayCiri(){
        System.out.println("Tumbuhan ini merupakan tumbuhan, "+ jenisD + " sehingga memiliki akar " + akarD + " dan batang " + batangD);
    }

    // Mengisi method abstract
    public void displaySuhu(){
        System.out.println(getNama() +" merupakan tanaman yang hidup pada tempat yang memiliki temperatur "+getSuhu()+" derajat celcius" );
    }

    // Membuat Method Display
    public void displayData(){
        displaySuhu();
        displayCiri();
        System.out.println("Tumbuhan ini merupakan "+ fungsi + "\n");
    }
}
