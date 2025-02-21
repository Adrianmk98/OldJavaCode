import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class CallTheRace extends JFrame implements ActionListener {

 private JLabel label1, label2;
 private JPanel panel1;
 private JButton button1,button2,button3,button4;
 //private JButton button2;
 //private JButton button3;
 //private JButton button4;
 private JButton button5, button6,button7,button8;
 //private JButton button6;
 //private JButton button7;
 //private JButton button8;
 private JButton button9,button10,button11,button12;
 //private JButton button10;
 //private JButton button11;
 //private JButton button12;
 private JTextArea ta1;
 private JTextArea ta2;
 private JTextArea ta3;
 
 public CallTheRace() {
  
  //Initialize all datafields and or widgets
  ImageIcon City = new ImageIcon("City.png");
  ImageIcon Farm = new ImageIcon("Farm.png");
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
  button9.setIcon(Farm);
  JButton button10 = new JButton("Orange");
  JButton button11 = new JButton("Next Hour");
  JButton button12 = new JButton("Green");
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
  button10.addActionListener(this);
  button11.addActionListener(this);
  button12.addActionListener(this);
  
  panel1 = new JPanel();
  panel1.setLayout(new GridLayout(5,0));
  panel1.add(button1);
  panel1.add(button2);
  panel1.add(button3);
  panel1.add(button4);
  panel1.add(button5);
  panel1.add(button6);
  panel1.add(button7);
  panel1.add(button8);
  panel1.add(button9);
  panel1.add(button10);
  panel1.add(button11);
  panel1.add(button12);
  panel1.add(ta1);
  panel1.add(ta2);
  panel1.add(ta3);
  this.add(panel1);  //add panel to window
 
 }
 

 public void actionPerformed(ActionEvent e) {
  
if(e.getSource() == button1) 
{
  //String info1= new CallTheRaceC();
  ta1.setText("Orange:" + "\n" + "1234");
 }
if(e.getSource() == button2) 
{
  ta1.setText("2323");
 }
if(e.getSource() == button3) 
{
  JOptionPane.showMessageDialog(null,String.format("Test 3"));
 }
if(e.getSource() == button4) 
{
  JOptionPane.showMessageDialog(null,String.format("Test 4"));
 }
if(e.getSource() == button5) 
{
  JOptionPane.showMessageDialog(null,String.format("Test 5"));
 }
if(e.getSource() == button6) 
{
  JOptionPane.showMessageDialog(null,String.format("Test 6"));
 }
if(e.getSource() == button7) 
{
  JOptionPane.showMessageDialog(null,String.format("Test 7"));
 }
if(e.getSource() == button8) 
{
  JOptionPane.showMessageDialog(null,String.format("Test 8"));
 }
if(e.getSource() == button9) 
{
  JOptionPane.showMessageDialog(null,String.format("Test 9"));
 }
if(e.getSource() == button10) 
{
  JOptionPane.showMessageDialog(null,String.format("Test 10"));
 }
if(e.getSource() == button11) 
{
  JOptionPane.showMessageDialog(null,String.format("Test 11"));
 }
if(e.getSource() == button12) 
{
  JOptionPane.showMessageDialog(null,String.format("Test 12"));
 }
 
 }
 public static void main(String[] args) {

  CallTheRace gui = new CallTheRace();
  
  gui.setVisible(true);
  gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  gui.setSize(600,600);
  gui.setTitle("Call The Race");
  //gui.setResizable(false);
 }





}
