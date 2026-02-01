package practiceinheritance;

public class attackerCharacter  extends mainCharacter{
    private int power;
    public attackerCharacter(String name, int health, int attack, int power){
        super(name, health, attack);
        this.power=power;
    }
@Override
void display() {
    incAttack();
    attackPower();
    System.out.println("Name character: " + name );
    System.out.println("health: " + health );
    System.out.println("attack: " + attack );
    System.out.println("Super power: " + power);   
}
}
