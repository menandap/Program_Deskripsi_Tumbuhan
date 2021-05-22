package interface_abstarct;

class Main{
    public static void main (String[] args){
        Padi padi = new Padi("Tanaman Padi",27,"tanaman pangan"); // Membuat object dan mengisi var
        padi.displayData();
        Matahari matahari = new Matahari("Bunga Matahari",22,"tanaman hias"); // Membuat object dan mengisi var
        matahari.displayData();
        KumisKucing kumisKucing = new KumisKucing("Tanaman Kumis Kucing",27,"tanaman obat"); // Membuat object dan mengisi var
        kumisKucing.displayData();
    }
}