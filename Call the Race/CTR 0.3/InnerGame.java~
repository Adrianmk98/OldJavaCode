class InnerGame  {
  public Double[] votedata= new Double[10];
 public Integer[] popdata= new Integer[10];
 public double turn=1;
 public double pcall=0;
  public double turn()
  {   
   turn=turn+1; 
   return turn;
  }
  public double percentcall()
  {   
   double rand = (Double)(Math.random() * 6)+1;
   pcall=pcall+rand;
   if(pcall>100)
     pcall=100;
   return pcall;
  }
  public Double[] votedata()
  {
    Double randv;
    int loop=0;
    for(loop=0; loop<4; loop++)
    {
    randv = (Double)(Math.random() * 30)+10;
    votedata[loop]=randv;
    }
    randv = (Double)(Math.random() * 30)+60;
    votedata[4]=randv;
    for(loop=0; loop<3; loop++)
    {
    randv = (Double)(Math.random() * 30)+10;
    votedata[loop+5]=randv;
    }
    randv=0.0;
    while(randv < 30 || randv > 70)
    {
    randv = (Double)(Math.random() * 100);
    }
    votedata[8]=randv;
    return votedata;
    
    
  }
  public Integer[] population()
  {
    int randp;
    int loop=0;
    for(loop=0; loop<4; loop++)
    {
    randp = (int)(Math.random() * 10000) + 5000;
    popdata[loop]=randp;
    }
    randp = (int)(Math.random() * 50000) + 50000;
    popdata[4]=randp;
    for(loop=0; loop<3; loop++)
    {
    randp = (int)(Math.random() * 10000) + 5000;
    popdata[loop+5]=randp; 
    }
    randp=0;
    while(randp < 20000)
    {
    randp = (int)(Math.random() * 25000) + 10000;
    }
    popdata[8]=randp;
    return popdata;
  }
  /*
  public double button1()
  {
    return votedata[0];
  }
  
  public double button2()
  {
    return votedata[1];
  }
  public String button3()
  {
    return;
  }
  public String button4()
  {
    return;
  }
  public String button5()
  {
    return;
  }
  public String button6()
  {
    return;
  }
  public String button7()
  {
    return;
  }
  public String button8()
  {
    return;
  }
  public String button9()
  {
    return;
  }
  */
}