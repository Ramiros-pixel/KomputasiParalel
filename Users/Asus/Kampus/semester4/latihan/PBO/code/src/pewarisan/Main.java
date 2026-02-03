package pewarisan;

import java.util.Scanner;

public class Main extends mobil {

    protected String tipe;
    void tipeMobil(){
        System.out.println("masukan tipe mobil: ");
         Scanner userIn = new Scanner(System.in);
        tipe = userIn.nextLine();
                
    }
    
    public static void main(String[] args) {
    Main obj = new Main();
    obj.merkMobil();
    obj.tipeMobil();

    System.out.println("Merk mobil adalah: " + obj.merk + " dan tipe mobil adalah: " + obj.tipe);

    }

}
