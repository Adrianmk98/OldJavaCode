import java.io.*; 
import java.util.Scanner;
import java.util.*;

public class BramptonWarsClient
{
  public static void main( String[] args ) throws Exception
  {
    Scanner input = new Scanner( System.in );   
    int health=100;
    String name="";
    String gender="";
    String worldlocation="";

    System.out.println("This is the Character Creator");
  System.out.println("To start out i will need to know your name");
  name=input.nextLine();
  System.out.println("Are you a (G)irl or a (B)oy?");
  gender=input.next();
  System.out.println("Where are you from?");
  worldlocation=input.nextLine();
  if(gender.equalsIgnoreCase("B")||gender.equalsIgnoreCase("boy"))
    gender="him";
  if(gender.equalsIgnoreCase("G")||gender.equalsIgnoreCase("girl"))
    gender="her";

   
  BramptonWars_Dialogue bqd = new BramptonWars_Dialogue();  
String weapon="nones";
int sentinel=0;
bqd.StartingDialogue(name,gender,worldlocation);
while(sentinel==0)
{
  System.out.println(" Please make a choice (N)orth, (E)ast or (W)est");
   String citylocation=input.next();
   
   if(citylocation.equalsIgnoreCase("West")|| citylocation.equalsIgnoreCase("W")){
     
       weapon=bqd.WeaponShopDialogue(name,gender,worldlocation);
    
   } 
   if(citylocation.equalsIgnoreCase("East")|| citylocation.equalsIgnoreCase("E")){
       health=bqd.SkillShopDialogue(name,gender,worldlocation,health);
    
   } 
   if(citylocation.equalsIgnoreCase("North") || citylocation.equalsIgnoreCase("N")){
       bqd.North(name,gender,worldlocation,health,weapon);
       break;
   }   
   } 
  }
  } 
 
