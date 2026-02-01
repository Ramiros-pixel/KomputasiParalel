package practiceinheritance;

public class Main {
    public static void main(String[] args) {
        mainCharacter mage = new mageCharacter("Lina", 120, 25, 90);
        mainCharacter attacker = new attackerCharacter("Ryza", 90, 80, 23);
        mage.display();
        attacker.display();    
    }
}
