package practiceinheritance;

import java.util.Scanner;

public class mainCharacter {
protected String name;
protected int health;
protected int attack;

public mainCharacter(String name, int health, int attack){
    this.name=name;
    this.health=health;
    this.attack=attack;
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

}}

void attackPower(){
System.out.println(name + "attack power: " + attack);
}

void display(){
    incAttack();
    System.out.println("name character: " + name);
    System.out.println("health: " + health);
    System.out.println("attack: " + attack);
}}

