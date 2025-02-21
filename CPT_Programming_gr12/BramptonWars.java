

public class BramptonWars
{
  myname=""
  myskill=0;
  myhealth=0;
  public fightsequence()
  {
    String attacktype="";
    String opname="";
    int opposehealth=0;
    int blockchance=0;
    int enemydamage=0;
    myhealth=thehealth;
    myskill=theskill;
    Scanner fromFileopp = new Scanner(new FileReader("Opponents.txt"));
    Scanner fromFilestat = new Scanner(new FileReader("OpponentStats.txt"));
    ArrayList<Integer> opponent = new ArrayList<Integer>();
    ArrayList<Integer> statsheal = new ArrayList<Integer>();
    ArrayList<Integer> statsskill = new ArrayList<Integer>();   
    int n=(int)(Math.random()*5);
    for(int j=0; j>5;j++)
    {
      opname=fromFileopp.next();
      opponent.add(opname);
    }
    for(int j=0; j>10;j++)
    {
      enemyskill=fromFile.nextInt();
      enemyhealth=fromFile.nextInt();
      statsskill.add(enemyskill);
      statsheal.add(enemyhealth);
    }
    System.out.println("you are fighting an" + opponent[n]);
    String enemy=opponent[n];
    enemyskill=statsskill[n];
    enemyhealth=statshealth[n];
    System.out.println("what kind of attack would you like to do?");
    while(myhealth >0 && enemyhealth >0)
    {
      System.out.println("Safe Attack or Risky?");
      String attacktype="";
      attacktype=input.next();
      if(attacktype.equalsIgnorecase("Safe"))
      {
        System.out.println("Safe"); 
        n=(int)(Math.random()*4)+1; 
        n=n+3;
        opposehealth=enemyhealth-n;
      }
      if (attacktype.equalsIgnorecase("Risky"))
      {
        System.out.println("You do a Risky Attack"); 
        n=(int)(Math.random()*11);
        opposehealth=enemyhealth-n;
      }
      else
      {
        System.out.println("You do nothing"); 
      }
      System.out.println(enemy + " does an attack");
      enemydamage=(int)(Math.random()*enemyskill);
      if(weapon.equalsIgnorecase("pike"))
      {
        if(n>=2)
          n=n-2;
        if(n<2)
          n=0;
        blockchance=(int)(Math.random()*5)+1;
        if(blockchance<=2)
          enemydamage=0;
        
      }
      if(weapon.equalsIgnorecase("sword"))
      {
        if(n>0)
          n=n-1;
        if(n<1)
          n=0;
        blockchance=(int)(Math.random()*5)+1;
        if(blockchance<=1)
          enemydamage=0;
      }
      myhealth=myhealth-enemydamage;
      System.out.println("Your enemy the " + enemy + " has " + enemyhealth + " health remaining");
      System.out.println("you have " + myhealth + " health"); 
      
    }
  }
  public finalbossfight()
    
  {
      String bossname="Dlip Folf";
      bossskill=11;
      bosshealth=60;
      int convstophalf=0;
    
    System.out.println("you are fighting " + bossname );
    System.out.println( " Narrator: Your must stop his reign of terror " );
    System.out.println( " Your enemy has been trained in various forms of combat " );
    System.out.println( " He is known as Al Sa-Her the magician and he is Ra's al Ghul head of the demon" );
    System.out.println( " He will be tough to defeat" );
    if(weapon.equalsIgnorecase("sword"))
      {
    System.out.println( "Ra's al Ghul: you come with the sword which has already failed you once" );
    }
    if(weapon.equalsIgnorecase("pike"))
      {
    System.out.println( "Ra's al Ghul: you have decided to come with a pike this time" );
    System.out.println( "Interesting it is not the weapon you fought with last time" );
    System.out.println( "It will not matter my attacks will overcome your defences" );
    }
    if(weapon.equalsIgnorecase("bow"))
      {
    System.out.println( "Ra's al Ghul: You have decided to come with a bow this time" );
    System.out.println( "This will only be a minor inconveniance your range will be overcome" );
    }
    System.out.println( "You will lose again and i shall rule unoposed once more" );
    System.out.println( "you will fall upon my sword and be destoroyed" );
    System.out.println("what kind of attack would you like to do?");
    while(myhealth >0 && bosshealth >0)
    {
      
      if(bosshealth<30 && convstop==0)
      {
        bossskill=14;
      bosshealth=45;
      System.out.println( "Your think you will defeat me but you will fail like so many before you" );
      convstophalf++;
      }
      if(bosshealth<15 && convstop==0)
      {
        bossskill=16;
      bosshealth=30;
      System.out.println( "I am still far from death" );
      convstophalf++;
      }
      System.out.println("Safe Attack or Risky?");
      String attacktype="";
      attacktype=input.next();
      if(attacktype.equalsIgnorecase("Safe"))
      {
        System.out.println("Safe"); 
        n=(int)(Math.random()*4)+1; 
        n=n+3;
        opposehealth=enemyhealth-n;
      }
      if (attacktype.equalsIgnorecase("Risky"))
      {
        System.out.println("You do a Risky Attack"); 
        n=(int)(Math.random()*11);
        opposehealth=enemyhealth-n;
      }
      else
      {
        System.out.println("You do nothing"); 
      }
      System.out.println(bossname + " does an attack");
      enemydamage=(int)(Math.random()*bossskill);
      if(weapon.equalsIgnorecase("pike"))
      {
        if(n>=2)
          n=n-2;
        if(n<2)
          n=0;
        blockchance=(int)(Math.random()*5)+1;
        if(blockchance<=2)
          enemydamage=0;
        
      }
      if(weapon.equalsIgnorecase("sword"))
      {
        if(n>0)
          n=n-1;
        if(n<1)
          n=0;
        blockchance=(int)(Math.random()*5)+1;
        if(blockchance<=1)
          enemydamage=0;
      }
      myhealth=myhealth-enemydamage;
      if(myhealth <= 0)
      {
        System.out.println("Narrator: You die just like i though you would");
        System.out.println("Ra's al Ghul: There is one thing i must say before i die");
        System.out.println("The cycle will never end if you win you become me and if you die");
        System.out.println("you journey will begin again");
      break;
      }
      if(bosshealth <= 0)
      {
        System.out.println("Narrator: you have succeeded in killing " + bossname );
        System.out.println(" Thank you for saving us we would have let you live ");
        System.out.println(" but we cant have someone more powerful than " + bossname + " in our lands");
        for(int j=0; j>myhealth-1 j++)
        {
          int losehealth=0;
          losehealth=myhealth;
          System.out.println("you have " + losehealth + " health"); 
          losehealth=losehealth-1;
          System.out.println(" *You destroy the village in anger*");
      }
      System.out.println("Your enemy the " + bossname + " has " + bosshealth + " health remaining"); 
      System.out.println("you have " + myhealth + " health"); 
    }
  
    
    
    
  }
  
} 


