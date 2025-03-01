import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class CallTheRace extends JFrame implements ActionListener {

 private JLabel label1, label2;
 private JPanel panel1 , panel2;
 private JButton button1,button2,button3,button4;
 private JButton button5, button6,button7,button8;
 private JButton button9,buttonL,buttonC,buttonR;
 private JButton buttonP, start, stats;
 private JTextArea ta1;
 private JTextArea ta2;
 private JTextArea ta3;
 public Double[] vvdata= new Double[10];
 public Integer[] ppdata= new Integer[10];
 public int time=1;
 public double turn=0;
 public double pcall=0;
 public String ampm="AM";
 private int gamesplayed=0;
 private int victory=0;
 public CallTheRace() {
  
  //Initialize all datafields and or widgets
  start = new JButton();
  stats = new JButton();
  ImageIcon City = new ImageIcon("City.png");
  ImageIcon Farm = new ImageIcon("Farm.png");
  ImageIcon Suburb = new ImageIcon("Suburb.png");
  button1 = new JButton();
  button1.setIcon(Farm);
  button2 = new JButton("");
  button2.setIcon(Farm);
  button3 = new JButton("");
  button3.setIcon(Farm);
  button4 = new JButton("");
  button4.setIcon(Farm);
  button5 = new JButton("");
  button5.setIcon(City);
  button6 = new JButton("");
  button6.setIcon(Farm);
  button7 = new JButton("");
  button7.setIcon(Farm);
  button8 = new JButton("");
  button8.setIcon(Farm);
  button9 = new JButton("");
  button9.setIcon(Suburb);
  buttonL = new JButton("Orange");
  buttonC = new JButton("Next Hour");
  buttonR = new JButton("Green");
  buttonP = new JButton("Play Again");
  ta1 = new JTextArea(5, 20);
  ta2 = new JTextArea(5, 20);
  ta3 = new JTextArea(5, 20);
  ta1.setEditable(false);
  ta2.setEditable(false);
  ta3.setEditable(false);
  button1.addActionListener(this);
  button2.addActionListener(this);
  button3.addActionListener(this);
  button4.addActionListener(this);
  button5.addActionListener(this);
  button6.addActionListener(this);
  button7.addActionListener(this);
  button8.addActionListener(this);
  button9.addActionListener(this);
  buttonL.addActionListener(this);
  buttonC.addActionListener(this);
  buttonR.addActionListener(this);
  buttonP.addActionListener(this);
  start.addActionListener(this);
  panel1 = new JPanel();
  panel1.setLayout(new GridLayout(5,3));
  panel1.add(button1);
  panel1.add(button2);
  panel1.add(button3);
  panel1.add(button4);
  panel1.add(button5);
  panel1.add(button6);
  panel1.add(button7);
  panel1.add(button8);
  panel1.add(button9);
  panel1.add(buttonL);
  panel1.add(buttonC);
  panel1.add(buttonR);
  panel1.add(ta1);
  panel1.add(ta2);
  panel1.add(ta3);
  this.add(panel1);  //add panel to window
  //InnerGame IG= new InnerGame();
  InnerGame vdata= new InnerGame();
  InnerGame pdata= new InnerGame();
  InnerGame tturn= new InnerGame();
  vvdata=vdata.votedata();
  ppdata=pdata.population();
  tturn.turn();
  }
 
 

 public void actionPerformed(ActionEvent e) {
   
if(e.getSource() == button1) 
{
  double Ovdata1=pcall/100*(ppdata[0]*(vvdata[0]/100));
  double Opdata1=pcall/100*(ppdata[0]*((100-vvdata[0])/100));
  ta1.setText("Orange:" + (int)Ovdata1 + "\n" + "Green:" + (int)Opdata1 + "\n" + "Total Population: " + (int)ppdata[0]);
 }
if(e.getSource() == button2) 
{
  double Ovdata2=pcall/100*(ppdata[1]*(vvdata[1]/100));
  double Opdata2=pcall/100*(ppdata[1]*((100-vvdata[1])/100));
  ta1.setText("Orange:" + (int)Ovdata2 + "\n" + "Green:" + (int)Opdata2 + "\n" + "Total Population: " + (int)ppdata[1]);
 }
if(e.getSource() == button3) 
{
  double Ovdata3=pcall/100*(ppdata[2]*(vvdata[2]/100));
  double Opdata3=pcall/100*(ppdata[2]*((100-vvdata[2])/100));
  ta1.setText("Orange:" + (int)Ovdata3 + "\n" + "Green:" + (int)Opdata3 + "\n" + "Total Population: " + (int)ppdata[2]);
 }
if(e.getSource() == button4) 
{
  double Ovdata4=pcall/100*(ppdata[3]*(vvdata[3]/100));
  double Opdata4=pcall/100*(ppdata[3]*((100-vvdata[3])/100));
  ta1.setText("Orange:" + (int)Ovdata4 + "\n" + "Green:" + (int)Opdata4 + "\n" + "Total Population: " + (int)ppdata[3]);
 }
if(e.getSource() == button5) 
{
  double Ovdata5=pcall/100*(ppdata[4]*(vvdata[4]/100));
  double Opdata5=pcall/100*(ppdata[4]*((100-vvdata[4])/100));
  ta1.setText("Orange:" + (int)Ovdata5 + "\n" + "Green:" + (int)Opdata5 + "\n" + "Total Population: " + (int)ppdata[4]);
 }
if(e.getSource() == button6) 
{
  double Ovdata6=pcall/100*(ppdata[5]*(vvdata[5]/100));
  double Opdata6=pcall/100*(ppdata[5]*((100-vvdata[5])/100));
  ta1.setText("Orange:" + (int)Ovdata6 + "\n" + "Green:" + (int)Opdata6 + "\n" + "Total Population: " + (int)ppdata[5]);
 }
if(e.getSource() == button7) 
{
  double Ovdata7=pcall/100*(ppdata[6]*(vvdata[6]/100));
  double Opdata7=pcall/100*(ppdata[6]*((100-vvdata[6])/100));
  ta1.setText("Orange:" + (int)Ovdata7 + "\n" + "Green:" + (int)Opdata7 + "\n" + "Total Population: " + (int)ppdata[6]);
 }
if(e.getSource() == button8) 
{
  double Ovdata8=pcall/100*(ppdata[7]*(vvdata[7]/100));
  double Opdata8=pcall/100*(ppdata[7]*((100-vvdata[7])/100));
  ta1.setText("Orange:" + (int)Ovdata8 + "\n" + "Green:" + (int)Opdata8 + "\n" + "Total Population: " + (int)ppdata[7]);
 }
if(e.getSource() == button9) 
{
  double Ovdata9=pcall/100*(ppdata[8]*(vvdata[8]/100));
  double Opdata9=pcall/100*(ppdata[8]*((100-vvdata[8])/100));
  ta1.setText("Orange:" + (int)Ovdata9 + "\n" + "Green:" + (int)Opdata9 + "\n" + "Total Population: " + (int)ppdata[8]);
 }
if(e.getSource() == buttonC) 
{
  InnerGame pcalls= new InnerGame();
  pcall=pcall+(pcalls.percentcall());
  if(pcall>100)
    pcall=100;
  if(time%12==0)
  {
  if(ampm.equals("AM"))
  {
    ampm="PM";
  }
  else
  {
    ampm="AM";
  }
  }

  ta2.setFont(new Font("Serif",Font.PLAIN,40));
  ta2.setText("    " + time + ":00" + ampm);
  if(time==12)
  {
   time=1; 
  }
  else
  {
  time++;
  }
  turn++;
 }
if(e.getSource() == buttonR || e.getSource() == buttonL) 
{
  double totvo=0;
  double totvg=0;
  for(int loop=0; loop<9; loop++)
  {
   totvo=totvo+(vvdata[loop]/100)*ppdata[loop];
   totvg=totvg+((100-vvdata[loop])/100)*ppdata[loop];
  }
  /*
  if(totvo>totvg && e.getSource() == buttonL)
  {
    ta2.setText("Victory");
    panel1.remove(buttonC);
    panel1.add(buttonP);
  }
  if(totvo<totvg && e.getSource() == buttonL)
  {
    ta2.setText("Loss");
    panel1.remove(buttonC);
    panel1.add(buttonP);
  }
  if(totvo<totvg && e.getSource() == buttonR)
  {
    ta2.setText("Victory");
    panel1.remove(buttonC);
    panel1.add(buttonP);
  }
  if(totvo>totvg && e.getSource() == buttonR)
  {
    ta2.setText("Loss");
    panel1.remove(buttonC);
    panel1.add(buttonP);
  }
  */
  
  ta1.setText("Total Vote" + "\n" + "Orange:"+ (int)totvo + "\n" + "Green:" + (int)totvg);
 }
if(e.getSource() == buttonP) 
{
 CallTheRace gui = new CallTheRace();
 }
 
 
 }
 public static void main(String[] args) {

  CallTheRace gui = new CallTheRace();
  gui.setVisible(true);
  gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  gui.setSize(600,600);
  gui.setTitle("Call The Race");
 }





}
