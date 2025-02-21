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
  name=input.next();
  System.out.println("Are you a (G)irl or a (B)oy?");
  gender=input.next();
  System.out.println("Where are you from?");
  worldlocation=input.next();
  if(gender.equalsIgnoreCase("B")||gender.equalsIgnoreCase("boy"))
    gender="him";
  if(gender.equalsIgnoreCase("G")||gender.equalsIgnoreCase("girl"))
    gender="her";

   int warn=0;
  BramptonWars_Dialogue bqd = new BramptonWars_Dialogue();  
String weapon="";
int sentinel=0;
bqd.StartingDialogue(name,gender,worldlocation);
while(sentinel==0)
{
  System.out.println(" Please make a choice (N)orth, (E)ast, (W)est, or (S)outh");
   String citylocation=input.next();
   
   if(citylocation.equalsIgnoreCase("West")|| citylocation.equalsIgnoreCase("W")){
     
       weapon=bqd.WeaponShopDialogue(name,gender,worldlocation);
       warn=warn+1;
    
   } 
   if(citylocation.equalsIgnoreCase("East")|| citylocation.equalsIgnoreCase("E")){
       health=bqd.SkillShopDialogue(name,gender,health);
    
   } 
   if(citylocation.equalsIgnoreCase("North") || citylocation.equalsIgnoreCase("N")){
     if(warn!=0)
     {
       bqd.North(name,gender,health,weapon);
     }
       else
       {
         System.out.println(" Are you sure you want to go there without a weapon?");
         warn=warn+1;
       }
   }   
   if(citylocation.equalsIgnoreCase("South") || citylocation.equalsIgnoreCase("S")){
       health=bqd.SouthCity(name,gender,worldlocation,health,weapon);
       
   }  
   } 
  }
  } 
 
