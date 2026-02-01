package practiceinheritance;


public class mainCharacter {
protected String name;
protected int health;
protected int attack;

public mainCharacter(String name, int health, int attack){
    this.name=name;
    this.health=health;
    this.attack=attack;
}    

void attackPower(){
System.out.println(name + "attack power: " + attack);
}

void display(){
    System.out.println("name character: " + name);
    System.out.println("health: " + health);
    System.out.println("attack: " + attack);
}
}
