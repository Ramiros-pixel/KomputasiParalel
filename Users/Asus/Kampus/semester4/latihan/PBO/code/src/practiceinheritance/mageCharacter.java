package practiceinheritance;

import java.util.Scanner;

public class mageCharacter extends mainCharacter{
private int mana;
public mageCharacter(String name,int health,int attack, int mana){
    super(name, health, attack);
    this.mana=mana;
}

void incAttack(){

boolean validate = true;

while(validate){
    System.out.println("attack the enemy now");
    Scanner X = new Scanner(System.in);
    String attackNow = X.nextLine();
    if (attackNow == ""){
    attack+=1;
    System.out.println("the attack increment: "+ attack);}
    else{
        validate = false;
    }

} 

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
