package src.Komposisi;

public class ruang {
    private String namaRuang;
    private perabotan meja;
    private perabotan kursi;

        
    public ruang(String namaRuang){
        this.namaRuang = namaRuang;
        if (namaRuang.contains("anak")){
            meja = new perabotan(" meja belajar anak");
            kursi = new perabotan(" kursi belajar anak");
        }
        else{
            meja = new perabotan(" meja belajar ortu");
            kursi = new perabotan(" kursi belajar ortu");
        }
    
    }

    public String getNamaRuang(){
        System.out.println( namaRuang + meja.getPerabotan() + kursi.getPerabotan() );
        return namaRuang;
    }

    public String semua(){
        getNamaRuang();
    }
    
}
