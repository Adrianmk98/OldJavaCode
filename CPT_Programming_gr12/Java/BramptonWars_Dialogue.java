import java.util.Scanner;
import java.io.*; 
import java.util.*;
public class BramptonWars_Dialogue
{
  
  String myName = "";       
  String myGender = "";    
  String myWorldLocation = "";
  int myhealth=0;
  
  public void StartingDialogue(String theName, String theGender, String theWorldLocation)
  {
    String locationcity="";
    myName=theName;
    myGender=theGender;
    myWorldLocation=theWorldLocation;
  System.out.println("Welcome to Last Hearth i hope you had a nice trip from " + myWorldLocation);
  try {
          Thread.sleep(3000);                 //1000 milliseconds is one second.
        } catch(InterruptedException ex) {
          Thread.currentThread().interrupt();
        }
  System.out.println(" We are the last people who are still surviving in antarctica ");
  try {
          Thread.sleep(3000);                 //1000 milliseconds is one second.
        } catch(InterruptedException ex) {
          Thread.currentThread().interrupt();
        }
  System.out.println(" Ill be showing you around the city since you are obviously new here ");
  try {
          Thread.sleep(3000);                 //1000 milliseconds is one second.
        } catch(InterruptedException ex) {
          Thread.currentThread().interrupt();
        }
  System.out.println(" You can go East for the Gym, West for the Weaponsmith");
  try {
          Thread.sleep(3000);                 //1000 milliseconds is one second.
        } catch(InterruptedException ex) {
          Thread.currentThread().interrupt();
        }
  System.out.println(" If you go to the Northern part of the City there will be");
  try {
          Thread.sleep(3000);                 //1000 milliseconds is one second.
        } catch(InterruptedException ex) {
          Thread.currentThread().interrupt();
        }
  System.out.println(" monsters you can fight ");
  try {
          Thread.sleep(3000);                 //1000 milliseconds is one second.
        } catch(InterruptedException ex) {
          Thread.currentThread().interrupt();
        }
  }
  public String WeaponShopDialogue(String theName, String theGender, String theWorldLocation)
  {
     Scanner input = new Scanner( System.in );
    myName=theName;
    myGender=theGender;
    myWorldLocation=theWorldLocation;
    String weapon="";
    System.out.println("Hello " + myName + " welcome to my shop ");
    try {
          Thread.sleep(3000);                 //1000 milliseconds is one second.
        } catch(InterruptedException ex) {
          Thread.currentThread().interrupt();
        }
    System.out.println("I have a couple weapons that you can choose from ");
    try {
          Thread.sleep(3000);                 //1000 milliseconds is one second.
        } catch(InterruptedException ex) {
          Thread.currentThread().interrupt();
        }
    System.out.println("You can take this Bow");
    try {
          Thread.sleep(3000);                 //1000 milliseconds is one second.
        } catch(InterruptedException ex) {
          Thread.currentThread().interrupt();
        }
    System.out.println("You can take a sword");
    try {
          Thread.sleep(3000);                 //1000 milliseconds is one second.
        } catch(InterruptedException ex) {
          Thread.currentThread().interrupt();
        }
    System.out.println("You can take a pike");
    try {
          Thread.sleep(3000);                 //1000 milliseconds is one second.
        } catch(InterruptedException ex) {
          Thread.currentThread().interrupt();
        }
    System.out.println("So what will you take so you can defeat " + myGender);
    weapon=input.next();
    try {
          Thread.sleep(3000);                 //1000 milliseconds is one second.
        } catch(InterruptedException ex) {
          Thread.currentThread().interrupt();
        }
    if(weapon.equalsIgnoreCase("pike") ||weapon.equalsIgnoreCase("p"))
      {
      System.out.println("good choice you might encounter some problem with damage");
      try {
          Thread.sleep(3000);                 //1000 milliseconds is one second.
        } catch(InterruptedException ex) {
          Thread.currentThread().interrupt();
        }
      
    }
    if(weapon.equalsIgnoreCase("sword")||weapon.equalsIgnoreCase("s"))
      {
      System.out.println("The most balanced weapon you will be fine");
      try {
          Thread.sleep(3000);                 //1000 milliseconds is one second.
        } catch(InterruptedException ex) {
          Thread.currentThread().interrupt();
        }
      
    }
    if(weapon.equalsIgnoreCase("bow")||weapon.equalsIgnoreCase("b"))
      {
      System.out.println("The most attack friendly weapon hope might have some defensive problems");
      try {
          Thread.sleep(3000);                 //1000 milliseconds is one second.
        } catch(InterruptedException ex) {
          Thread.currentThread().interrupt();
        }
      
    }
    input.close();
    return weapon;
  }
  public Integer SkillShopDialogue(String theName, String theGender, String theWorldLocation,int theHealth)
  {
    String question="";
     Scanner input = new Scanner( System.in );
    myName=theName;
    myGender=theGender;
    myWorldLocation=theWorldLocation;
    int healthadder=0;
    System.out.println("Hello " + myName + " welcome to the gym ");
    try {
          Thread.sleep(3000);                 //1000 milliseconds is one second.
        } catch(InterruptedException ex) {
          Thread.currentThread().interrupt();
        }
    System.out.println(" here you can increase your health to be able to last longer against enemies ");
    try {
          Thread.sleep(3000);                 //1000 milliseconds is one second.
        } catch(InterruptedException ex) {
          Thread.currentThread().interrupt();
        }
    System.out.println(" Ill just ask distract you for a few minutes with random questions ");
    try {
          Thread.sleep(3000);                 //1000 milliseconds is one second.
        } catch(InterruptedException ex) {
          Thread.currentThread().interrupt();
        }
    System.out.println(" Whats the Capital of our country");
     question=input.next();
     try {
          Thread.sleep(3000);                 //1000 milliseconds is one second.
        } catch(InterruptedException ex) {
          Thread.currentThread().interrupt();
        }
     System.out.println(" How many fingerts am i holding up");
     question=input.next();
     try {
          Thread.sleep(3000);                 //1000 milliseconds is one second.
        } catch(InterruptedException ex) {
          Thread.currentThread().interrupt();
        }
     System.out.println(" While i was distracting you, your health increased");
     theHealth=theHealth+10;
    input.close();
    healthadder=theHealth;
    return healthadder;
  }
  public void North(String theName, String theGender, String theWorldLocation,int theHealth,String weapon)
  {
    myName=theName;
    myGender=theGender;
    myWorldLocation=theWorldLocation;
    myhealth=theHealth;

    ArrayList<String> opponent = new ArrayList<String>(
    Arrays.asList("Shiny knight", "K'hund", "Mirakuru Soldier","Corrupt Count","Illustrious Lancer","Republic Commander","Imperial Commander","Plague Carrier","Town Crier","Tyrion Lannister","Little Creppy Man","Creeper","Goblin","Cow","Zombie","Skeleton","Spider"));
    ArrayList<Integer> statsskill = new ArrayList<Integer>(
    Arrays.asList(5,13,9,3,8,5,10,1,4,12,11,15,10,1,5,7,12));
    ArrayList<Integer> statsheal = new ArrayList<Integer>(
    Arrays.asList(27,34,32,23,21,29,40,7,12,15,24,11,15,14,43,23,21)); 
 
        String opname="";
    int enemyhealth=0;
    int enemyskill=0;

     
    
    System.out.println("There are monsters everywhere ");
    int fightnum=(int)(Math.random()*5)+3;
      BramptonWars bq = new BramptonWars();  
    for(int loop=0; loop<fightnum; loop++)
    {
      int n=(int)(Math.random()*17);
    String enemy=opponent.get(n);
    
    enemyskill=statsskill.get(n);
    enemyhealth=statsheal.get(n);
      myhealth=bq.fightsequence(myName,myhealth,enemy,enemyskill,enemyhealth,weapon);
      if(myhealth <= 0)
        break;
    }
    bq.finalbossfight(myName,myhealth,weapon);
  }
}