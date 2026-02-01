import java.util.Scanner;

class motor{
    public String merk= "Harley Davidson";
    public void pemilik(){
        Scanner inp = new Scanner(System.in);
        System.out.println("Input nama pembeli: ");
        String pemilik = inp.nextLine();
        System.out.println("Nama pembeli adalah: " + pemilik);
    }
}

//Inheritance in Java
class inheritanceJava extends motor {

    private String detail = "Patagonian";

    public static void main(String[] args){
    inheritanceJava detailProduk = new inheritanceJava();
    detailProduk.pemilik();
    System.out.println("Merk motor: " + detailProduk.merk + detailProduk.detail);

    }
}

//implamentation


