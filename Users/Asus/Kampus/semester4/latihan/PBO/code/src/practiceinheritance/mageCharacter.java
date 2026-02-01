package practiceinheritance;

public class mageCharacter extends mainCharacter{
private int mana;
public mageCharacter(String name,int health,int attack, int mana){
    super(name, health, attack);
    this.mana=mana;
}

@Override
void display(){
    incAttack();
    attackPower();
    System.out.println("Name character: " + name );
    System.out.println("health: " + health );
    System.out.println("attack: " + attack );
    System.out.println("mana: " + mana);         
}
}
