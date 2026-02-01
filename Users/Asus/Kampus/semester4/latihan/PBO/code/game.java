//This part for the example of code in java if we implamentation

class Player{
    String nama;
    Double health;
    Weapon weapon;
    Armor armor;

    Player(String nama, Double health){
        this.nama = nama;
        this.health = health;
    }

    void equipWeapon(Weapon weapon){
        this.weapon = weapon;
    }

    void equipArmor(Armor armor){
        this.armor=armor;
    }

    void summar(){
        System.out.println("Player: " + this.nama + "Health: " + this.health);
        this.weapon.weaponCall();
        this.armor.armorCall();
    }

    
}

class Weapon{
    String weapon;
    Double attack;

    Weapon(String weapon, Double attack) {
        this.weapon = weapon;
        this.attack = attack;
    }

    
    void weaponCall(){
        System.out.println("Nama weapon: " + this.weapon + "Power: " + this.attack);
    }
}

class Armor{
    String armor;
    Double defence;

    Armor(String armor, Double defence ){
        this.armor = armor;
        this.defence = defence;
    }

    void armorCall(){
        System.out.println("Nama armor: " + this.armor + "Defence: " + this.defence);
    }
}

public class game {
    public static void main(String[] args){

        Player karakter = new Player("Ken ",430.0);
        Armor bajuZirah = new Armor("Baju Zirah", 440.0);
        Weapon senjataApi =new  Weapon("Senjata Api", 5000.0); 

        karakter.equipArmor(bajuZirah);
        karakter.equipWeapon(senjataApi);
        karakter.summar();
}}