
import java.util.Scanner;
public class BramptonWars
{
  String myname="";
  
  int myhealth=0;
  public Integer fightsequence(String theName,int theHealth,String enemy,int enemyskill,int enemyhealth,String weapon)
  {
    
    myname=theName;
    Scanner input = new Scanner( System.in );
    String attacktype="";
    
    int opposehealth=0;
    int blockchance=0;
    int enemydamage=0;
    myhealth=theHealth;
    
    int dpnone=0;
    int dppike=0;
      int dpsword=0;
      int dpbow=0;
    int n=(int)(Math.random()*5);
    
    System.out.println("you are fighting a " + enemy);
    
    System.out.println("what kind of attack would you like to do?");
    while(myhealth >0 && enemyhealth >0)
    {
      if(enemyhealth > 0){
        System.out.println("Your enemy the " + enemy + " has " + enemyhealth + " health remaining");
        System.out.println("you have " + myhealth + " health"); 
      }
      System.out.println("Safe Attack or Risky?");
      attacktype="";
      attacktype=input.next();
      if(attacktype.equalsIgnoreCase("Safe")|| attacktype.equalsIgnoreCase("S"))
      {
        System.out.println("Safe"); 
        n=(int)(Math.random()*4)+1; 
        n=n+3;
        
      }
      else if (attacktype.equalsIgnoreCase("Risky")||attacktype.equalsIgnoreCase("R"))
      { 
        System.out.println("You do a Risky Attack"); 
        n=(int)(Math.random()*11);
      }
      else
      {
        System.out.println("You do nothing"); 
      }
      
      enemydamage=(int)(Math.random()*enemyskill);
      
      if(weapon.equalsIgnoreCase("pike"))
      {
        if(n>=2)
          dppike=n-2;
        if(n<2)
          dppike=0;
        blockchance=(int)(Math.random()*100)+1;
        if(blockchance<=30){
          
          enemydamage=0;
          System.out.println("Attack Blocked");  
        }
        enemyhealth=enemyhealth-dppike;
        System.out.println(myname + " does an attack taking " + dppike + " health");
      }
      if(weapon.equalsIgnoreCase("bow"))
      {
        
        enemyhealth=enemyhealth-dpbow;
        blockchance=(int)(Math.random()*100)+1;
        if(blockchance<=5){
          
          enemydamage=0;
          System.out.println("Attack Blocked");  
        }
        System.out.println(myname + " does an attack taking " + dpbow + " health");
      }
      if(weapon.equalsIgnoreCase("sword"))
      {
        if(n>0)
          dpsword=n-1;
        if(n<1)
          dpsword=0;
        blockchance=(int)(Math.random()*100)+1;
        if(blockchance<=15)
        {
          enemydamage=0;
         System.out.println("Attack Blocked");  
        }
        enemyhealth=enemyhealth-dpsword;
        System.out.println(myname + " does an attack taking " + dpsword + " health");
      }
      if(weapon.equalsIgnoreCase("none"))
      {
        if(n>3)
          dpnone=n-3;
        if(n<3)
          dpnone=0;
       enemyhealth=enemyhealth-dpnone;
       System.out.println(myname + " does an attack taking " + dpnone + " health");
      }
      System.out.println(enemy + " does an attack taking " + enemydamage + " health");
      
      if(myhealth <= 0)
      {
      
        System.out.println("you couldnt even beat a " + enemy); 
        break;
      }
      myhealth=myhealth-enemydamage;
      }
      
      
      if(enemyhealth <= 0)
      {
        System.out.println("You beat " + enemy);
    }
    input.close();
    return myhealth;
  }
  public void finalbossfight(String theName,int theHealth,String weapon)
    
  {
    myname=theName;
    
    Scanner input = new Scanner( System.in );
    String bossname="Ra's al Ghul";
    int bossskill=11;
    int bosshealth=60;
    int convstop=0;
    int ragecounter=0;
    int n=0;
    int blockchance=0;
    int dpnone=0;
    int dppike=0;
      int dpsword=0;
      int dpbow=0;
      int enemydamage=0;
    System.out.println("you are fighting " + bossname );
    try {
      Thread.sleep(5000);                 //1000 milliseconds is one second.
    } catch(InterruptedException ex) {
      Thread.currentThread().interrupt();
    }
    System.out.println( " Narrator: Your must stop his reign of terror " );
    try {
      Thread.sleep(5000);                 //1000 milliseconds is one second.
    } catch(InterruptedException ex) {
      Thread.currentThread().interrupt();
    }
    System.out.println( " Your enemy has been trained in various forms of combat " );
    try {
      Thread.sleep(1000);                 //1000 milliseconds is one second.
    } catch(InterruptedException ex) {
      Thread.currentThread().interrupt();
    }
    System.out.println( " He is known as Al Sa-Her the magician and he is Ra's al Ghul head of the demon" );
    try {
      Thread.sleep(5000);                 //1000 milliseconds is one second.
    } catch(InterruptedException ex) {
      Thread.currentThread().interrupt();
    }
    System.out.println( " He will be tough to defeat" );
    try {
      Thread.sleep(5000);                 //1000 milliseconds is one second.
    } catch(InterruptedException ex) {
      Thread.currentThread().interrupt();
    }
    if(weapon.equalsIgnoreCase("sword"))
    {
      System.out.println( "Ra's al Ghul: you come with the sword which has already failed you once" );
    }
    if(weapon.equalsIgnoreCase("pike"))
    {
      System.out.println( "Ra's al Ghul: you have decided to come with a pike this time" );
      try {
        Thread.sleep(3000);                
      } catch(InterruptedException ex) {
        Thread.currentThread().interrupt();
      }
      System.out.println( "Interesting it is not the weapon you fought with last time" );
      try {
        Thread.sleep(3000);                
      } catch(InterruptedException ex) {
        Thread.currentThread().interrupt();
      }
      System.out.println( "It will not matter my attacks will overcome your defences" );
      try {
        Thread.sleep(3000);                
      } catch(InterruptedException ex) {
        Thread.currentThread().interrupt();
      }
    }
    if(weapon.equalsIgnoreCase("none"))
      {
        System.out.println( "You wish to fight me with nothing a foolish move" );
        try {
        Thread.sleep(3000);                
      } catch(InterruptedException ex) {
        Thread.currentThread().interrupt();
      }
      }
    
    if(weapon.equalsIgnoreCase("bow"))
    {
      System.out.println( "Ra's al Ghul: You have decided to come with a bow this time" );
      try {
        Thread.sleep(3000);                
      } catch(InterruptedException ex) {
        Thread.currentThread().interrupt();
      }
      System.out.println( "This will only be a minor inconveniance your range will be overcome" );
      try {
        Thread.sleep(3000);                
      } catch(InterruptedException ex) {
        Thread.currentThread().interrupt();
      }
    }
    System.out.println( "You will lose again and i shall rule unoposed once more" );
    try {
      Thread.sleep(3000);                 //1000 milliseconds is one second.
    } catch(InterruptedException ex) {
      Thread.currentThread().interrupt();
    }
    System.out.println( "you will fall upon my sword and be destoroyed" );
    try {
      Thread.sleep(3000);                 //1000 milliseconds is one second.
    } catch(InterruptedException ex) {
      Thread.currentThread().interrupt();
    }
    System.out.println("what kind of attack would you like to do?");
    try {
      Thread.sleep(3000);                 //1000 milliseconds is one second.
    } catch(InterruptedException ex) {
      Thread.currentThread().interrupt();
    }
    while(myhealth >0 && bosshealth >0)
    {
      
      if(bosshealth<=30 && convstop==0)
      {
        bossskill=14;
        bosshealth=45;
        System.out.println( "Ra's al Ghul: Your think you will defeat me but you will fail like so many before you" );
        convstop++;
      }
      if(bosshealth<=15 && convstop==1)
      {
        bossskill=16;
        bosshealth=30;
        System.out.println( "Ra's al Ghul: I am still far from death" );
        convstop++;
      }
      
      if(ragecounter > 25){
        bossskill=32;
        System.out.println( "Ra's al Ghul has Enraged" );
        
      }
      System.out.println("Safe Attack or Risky?");
      String attacktype="";
      attacktype=input.next();
      if(attacktype.equalsIgnoreCase("Safe")|| attacktype.equalsIgnoreCase("S"))
      {
        System.out.println("Safe"); 
        n=(int)(Math.random()*4)+1; 
        n=n+3;
        bosshealth=bosshealth-n;
      }
      else if (attacktype.equalsIgnoreCase("Risky")||attacktype.equalsIgnoreCase("R"))
      { 
        System.out.println("You do a Risky Attack"); 
        n=(int)(Math.random()*11);
        bosshealth=bosshealth-n;
      }
      else
      {
        System.out.println("You do nothing"); 
      }
      System.out.println(bossname + " does an attack");
      enemydamage=(int)(Math.random()*bossskill);
      if(weapon.equalsIgnoreCase("pike"))
      {
        if(n>=2)
          dppike=n-2;
        if(n<2)
          dppike=0;
        blockchance=(int)(Math.random()*100)+1;
        if(blockchance<=30)
          enemydamage=0;
        bosshealth=bosshealth-dppike;
        
      }
      if(weapon.equalsIgnoreCase("bow"))
      {
        
        bosshealth=bosshealth-dpbow;
        
      }
      if(weapon.equalsIgnoreCase("sword"))
      {
        if(n>0)
          dpsword=n-1;
        if(n<1)
          dpsword=0;
        blockchance=(int)(Math.random()*100)+1;
        if(blockchance<=15)
          enemydamage=0;
        bosshealth=bosshealth-dpsword;
      }
      if(weapon.equalsIgnoreCase("none"))
      {
        if(n>3)
          dpnone=n-3;
        if(n<3)
          dpnone=0;
       bosshealth=bosshealth-dpnone; 
      }
       if(bosshealth <= 0)
      {
        System.out.println("Narrator: you have succeeded in killing " + bossname );
        try {
          Thread.sleep(3000);                 //1000 milliseconds is one second.
        } catch(InterruptedException ex) {
          Thread.currentThread().interrupt();
        }
        System.out.println(" Thank you for saving us we would have let you live ");
        try {
          Thread.sleep(3000);                 //1000 milliseconds is one second.
        } catch(InterruptedException ex) {
          Thread.currentThread().interrupt();
        }
        System.out.println(" but we cant have someone more powerful than " + bossname + " in our lands");
        try {
          Thread.sleep(3000);                 //1000 milliseconds is one second.
        } catch(InterruptedException ex) {
          Thread.currentThread().interrupt();
        }
        int losehealth=0;
        losehealth=myhealth;
        for(int j=0; j<myhealth; j++)
        {
          
          try {
          Thread.sleep(100);                 //1000 milliseconds is one second.
        } catch(InterruptedException ex) {
          Thread.currentThread().interrupt();
        }
        if(losehealth==1)
          {
            System.out.println(" *You destroy the village in anger*");
            try {
              Thread.sleep(3000);                 //1000 milliseconds is one second.
            } catch(InterruptedException ex) {
              Thread.currentThread().interrupt();
            }
            System.out.println(" TO BE CONTINUED");
            
          }
        losehealth=losehealth-1;
        }
          
       }
          
      
      myhealth=myhealth-bossskill;
      System.out.println("Your enemy the " + bossname + " has " + bosshealth + " health remaining");
      System.out.println("you have " + myhealth + " health"); 
      if(myhealth <= 0)
      {
        System.out.println("Narrator: You die just like i though you would");
        try {
          Thread.sleep(3000);                 //1000 milliseconds is one second.
        } catch(InterruptedException ex) {
          Thread.currentThread().interrupt();
        }
        System.out.println("Ra's al Ghul: There is one thing i must say before you die");
        try {
          Thread.sleep(3000);                 //1000 milliseconds is one second.
        } catch(InterruptedException ex) {
          Thread.currentThread().interrupt();
        }
        System.out.println("The cycle will never end if you win you become me and if you die");
        try {
          Thread.sleep(3000);                 //1000 milliseconds is one second.
        } catch(InterruptedException ex) {
          Thread.currentThread().interrupt();
        }
        System.out.println("your journey will begin again");
        try {
          Thread.sleep(3000);                 //1000 milliseconds is one second.
        } catch(InterruptedException ex) {
          Thread.currentThread().interrupt();
        }
        break;
      }
      
          
          ragecounter=ragecounter+1;
        } 
        
        
       
        
        input.close();
    return;
      }
      
    
    
  } 




