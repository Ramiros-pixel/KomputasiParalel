package src.Komposisi;
public class rumah {
    private ruang kamarAnak;
    private ruang kamarOrtu;
    private perabotan perabotanAnak;
    private perabotan perabotanOrtu;
    public rumah(){
        kamarAnak = new ruang("Kamar anak");
        kamarOrtu = new ruang("Kamar ortu");
    }

    public void lihat(){
        System.out.println("Kamar dalam rumah : ");
        kamarAnak.getNamaRuang();
        kamarOrtu.getNamaRuang();

    }
    
}
