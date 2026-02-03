package pewarisan;

import java.util.*;

public class mobil {
    protected String merk;
    public void getMobil(){
        System.out.println("masukan merk mobil: ");
    }

    public void merkMobil(){ 
    getMobil();
    Scanner userIn = new Scanner(System.in);
    merk = userIn.nextLine();
    }

    public void suara(){
        System.out.println("BRUMMM BRUMM BRRR");
    }
    
}

