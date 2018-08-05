import java.util.Timer;
import java.util.TimerTask;
import java.util.Random;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class CatMouse extends javax.swing.JFrame implements KeyListener{
public static int mouseLocationX,mouseLocationY;
public static int catLocationX,catLocationY; 
public static boolean matchX,matchY;
public static boolean upgrade;
public static int addLocation=2;

    public CatMouse() {
        
        initComponents();
        
        obstacle1.setVisible(false);
        obstacle2.setVisible(false);
        obstacle3.setVisible(false);
        obstacle4.setVisible(false);
        obstacle5.setVisible(false);
        obstacle6.setVisible(false);
        obstacle7.setVisible(false);
        obstacle8.setVisible(false);
        obstacle9.setVisible(false);
        obstacle10.setVisible(false);
        obstacle11.setVisible(false);
        obstacle12.setVisible(false);
        obstacle13.setVisible(false);
        obstacle14.setVisible(false);
        obstacle15.setVisible(false);
        obstacle16.setVisible(false);
        
        upgrade1.setVisible(false);
        upgrade2.setVisible(false);
        upgrade3.setVisible(false);
        upgrade4.setVisible(false);
        
        jLabel13.setVisible(false);
        jLabel14.setVisible(false);
        
        again.setVisible(false);
        
        cat.grabFocus();
        cat.addKeyListener(this);
        
        tutorial();
       
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel14 = new javax.swing.JLabel();
        mouse = new javax.swing.JLabel();
        cat = new javax.swing.JLabel();
        obstacle1 = new javax.swing.JLabel();
        obstacle2 = new javax.swing.JLabel();
        obstacle3 = new javax.swing.JLabel();
        obstacle4 = new javax.swing.JLabel();
        obstacle5 = new javax.swing.JLabel();
        obstacle6 = new javax.swing.JLabel();
        obstacle7 = new javax.swing.JLabel();
        obstacle8 = new javax.swing.JLabel();
        obstacle9 = new javax.swing.JLabel();
        obstacle10 = new javax.swing.JLabel();
        obstacle11 = new javax.swing.JLabel();
        obstacle12 = new javax.swing.JLabel();
        obstacle13 = new javax.swing.JLabel();
        obstacle14 = new javax.swing.JLabel();
        obstacle15 = new javax.swing.JLabel();
        obstacle16 = new javax.swing.JLabel();
        upgrade1 = new javax.swing.JLabel();
        upgrade2 = new javax.swing.JLabel();
        upgrade3 = new javax.swing.JLabel();
        upgrade4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        again = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(500, 500));
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel14.setText("GAME OVER");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(120, 50, 250, 70);

        mouse.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mouse.png"))); // NOI18N
        getContentPane().add(mouse);
        mouse.setBounds(280, 90, 30, 30);

        cat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cattest.png"))); // NOI18N
        getContentPane().add(cat);
        cat.setBounds(210, 440, 34, 30);

        obstacle1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/trap.png"))); // NOI18N
        getContentPane().add(obstacle1);
        obstacle1.setBounds(210, 270, 70, 30);

        obstacle2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/trap.png"))); // NOI18N
        getContentPane().add(obstacle2);
        obstacle2.setBounds(330, 180, 70, 26);

        obstacle3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/trap.png"))); // NOI18N
        getContentPane().add(obstacle3);
        obstacle3.setBounds(330, 200, 80, 26);

        obstacle4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/trap.png"))); // NOI18N
        getContentPane().add(obstacle4);
        obstacle4.setBounds(330, 220, 80, 26);

        obstacle5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/trap.png"))); // NOI18N
        getContentPane().add(obstacle5);
        obstacle5.setBounds(330, 240, 60, 26);

        obstacle6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/trap.png"))); // NOI18N
        getContentPane().add(obstacle6);
        obstacle6.setBounds(330, 260, 60, 26);

        obstacle7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/trap.png"))); // NOI18N
        getContentPane().add(obstacle7);
        obstacle7.setBounds(330, 280, 60, 26);

        obstacle8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/trap.png"))); // NOI18N
        getContentPane().add(obstacle8);
        obstacle8.setBounds(330, 300, 70, 26);

        obstacle9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/trap.png"))); // NOI18N
        getContentPane().add(obstacle9);
        obstacle9.setBounds(330, 320, 70, 26);

        obstacle10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/trap.png"))); // NOI18N
        getContentPane().add(obstacle10);
        obstacle10.setBounds(330, 340, 70, 26);

        obstacle11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/trap.png"))); // NOI18N
        getContentPane().add(obstacle11);
        obstacle11.setBounds(330, 360, 70, 26);

        obstacle12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/trap.png"))); // NOI18N
        getContentPane().add(obstacle12);
        obstacle12.setBounds(330, 380, 60, 26);

        obstacle13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/trap.png"))); // NOI18N
        getContentPane().add(obstacle13);
        obstacle13.setBounds(330, 400, 70, 26);

        obstacle14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/trap.png"))); // NOI18N
        getContentPane().add(obstacle14);
        obstacle14.setBounds(330, 420, 60, 26);

        obstacle15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/trap.png"))); // NOI18N
        getContentPane().add(obstacle15);
        obstacle15.setBounds(330, 440, 70, 26);

        obstacle16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/trap.png"))); // NOI18N
        getContentPane().add(obstacle16);
        obstacle16.setBounds(330, 460, 70, 26);

        upgrade1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/steak.png"))); // NOI18N
        getContentPane().add(upgrade1);
        upgrade1.setBounds(210, 340, 60, 26);

        upgrade2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/steak.png"))); // NOI18N
        getContentPane().add(upgrade2);
        upgrade2.setBounds(10, 170, 60, 26);

        upgrade3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/steak.png"))); // NOI18N
        getContentPane().add(upgrade3);
        upgrade3.setBounds(10, 190, 60, 26);

        upgrade4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/steak.png"))); // NOI18N
        getContentPane().add(upgrade4);
        upgrade4.setBounds(10, 210, 60, 26);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Don't step on these:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(160, 240, 160, 20);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("In CatMouse, the rules are simple:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(10, 70, 280, 20);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("TM");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(320, 30, 34, 14);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Eat these to run faster:");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(150, 310, 180, 14);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/controls.png"))); // NOI18N
        getContentPane().add(jLabel8);
        jLabel8.setBounds(180, 160, 100, 70);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("Use these to move:");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(170, 140, 150, 14);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("Have fun :)");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(190, 410, 160, 14);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setText("<--the Mouse");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(320, 100, 100, 14);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setText("Eat the Mouse to  begin");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(150, 380, 180, 15);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo.png"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(150, 30, 180, 40);

        jLabel13.setText("jLabel13");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(420, 20, 80, 14);

        again.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        again.setText("Play again");
        again.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                againActionPerformed(evt);
            }
        });
        getContentPane().add(again);
        again.setBounds(160, 360, 150, 23);

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel15.setText("by");
        getContentPane().add(jLabel15);
        jLabel15.setBounds(330, 50, 60, 20);

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel16.setText("Daniel Varennikov");
        getContentPane().add(jLabel16);
        jLabel16.setBounds(340, 70, 130, 20);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Catch the Mouse before it exits the frame,");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(10, 100, 280, 14);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/background.jpg"))); // NOI18N
        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 0, 500, 490);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void againActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_againActionPerformed
        obstacle1.setVisible(false);
        obstacle2.setVisible(false);
        obstacle3.setVisible(false);
        obstacle4.setVisible(false);
        obstacle5.setVisible(false);
        obstacle6.setVisible(false);
        obstacle7.setVisible(false);
        obstacle8.setVisible(false);
        obstacle9.setVisible(false);
        obstacle10.setVisible(false);
        obstacle11.setVisible(false);
        obstacle12.setVisible(false);
        obstacle13.setVisible(false);
        obstacle14.setVisible(false);
        obstacle15.setVisible(false);
        obstacle16.setVisible(false);
        
        upgrade1.setVisible(false);
        upgrade2.setVisible(false);
        upgrade3.setVisible(false);
        upgrade4.setVisible(false);
        
        jLabel13.setVisible(false);
        jLabel14.setVisible(false);
        
        again.setVisible(false);
        
        addLocation=2;
        
        cat.grabFocus();
        cat.addKeyListener(this);
        cat.setLocation(400,400);
        upgrade=false;
        firstLife();
    }//GEN-LAST:event_againActionPerformed
    public static void gameOver(){
        if(((mouseLocationX<0)||(mouseLocationX>500)) || ((mouseLocationY<0)||(mouseLocationY>500))){
        jLabel14.setVisible(true);
        again.setVisible(true);;
       } 
    }   
    
    public static void getUpgrade(){
    if (upgrade==true){
    addLocation=4;    
    }else{
    addLocation=2;
    }
    
   
     
        
       
    }
    
    public static void tutorial(){
       obstacle1.setVisible(true);
       upgrade1.setVisible(true);
    
     Timer timerT=new Timer();
     TimerTask taskT=new TimerTask(){
     public void run(){   
       
    mouseLocationX=(mouse.getLocation().x);
    mouseLocationY=(mouse.getLocation().y);
    
    catLocationX=cat.getLocation().x;
    catLocationY=cat.getLocation().y;
       
       //Checks if cat is near mouse (x)
        for(int i=mouseLocationX-20;i<mouseLocationX+20;i++){
        if(i==catLocationX){
        matchX=true;
        break;
        }else{
        matchX=false;
        }
        }
        
        //Checks if cat is near mouse (y)
        for(int i=mouseLocationY-20;i<mouseLocationY+20;i++){
        if(i==catLocationY){
        matchY=true;
        break;
        }else{
        matchY=false;
        }
        }
        
        //Compares the two
        if((matchX==true)&&(matchY==true)){
            System.out.println("Victory");
            jLabel1.setVisible(false);
            jLabel2.setVisible(false);
            jLabel4.setVisible(false);
            jLabel5.setVisible(false);
            jLabel6.setVisible(false);
            jLabel7.setVisible(false);
            jLabel8.setVisible(false);
            jLabel9.setVisible(false);
            jLabel10.setVisible(false);
            jLabel11.setVisible(false);
            jLabel12.setVisible(false);
            jLabel15.setVisible(false);
            jLabel16.setVisible(false);
            timerT.cancel();
            upgrade=false;
            firstLife();
       
    }
        }        
        };
        timerT.scheduleAtFixedRate(taskT,1000,10);//1000ms =1sec
        
    }
     
     
    public static void firstLife(){
        
        jLabel13.setText("Level 1");
        jLabel13.setVisible(true);
        Random dice0=new Random();
        obstacle1.setLocation(dice0.nextInt(460),dice0.nextInt(460));
        obstacle1.setVisible(true);
        
        upgrade1.setLocation(dice0.nextInt(460),dice0.nextInt(460));
        upgrade1.setVisible(true);
        mouse.setLocation(0,0);
        
        Timer timer1=new Timer();
        TimerTask task1=new TimerTask(){
        public void run(){
        System.out.println(addLocation); 
        getUpgrade();
        
        mouseLocationX=(mouse.getLocation().x)+1;
        mouseLocationY=(mouse.getLocation().y)+1;
        mouse.setLocation(mouseLocationX,mouseLocationY);
        
        gameOver();
        
        catLocationX=cat.getLocation().x;
        catLocationY=cat.getLocation().y;
        
        //checks if cat is near upgrade 
       for(int y=-15;y<15;y++){
           if(catLocationX==(upgrade1.getLocation().x)+y){
              for(int o=-15;o<15;o++){
                  if (catLocationY==(upgrade1.getLocation().y)+o){
                  System.out.println("Upgraded");
                  upgrade=true;
                  upgrade1.setVisible(false);
                  break;
               }
              }
            }
        }
        
        
       //checks if cat is near obstacle 
       for(int q=-15;q<15;q++){
           if(catLocationX==(obstacle1.getLocation().x)+q){
              for(int w=-15;w<15;w++){
                  if (catLocationY==(obstacle1.getLocation().y)+w){
                  jLabel14.setVisible(true);
                  again.setVisible(true);
                  timer1.cancel();
                  break;
               }
              }
            }
        }
       
        //Checks if cat is near mouse (x)
        for(int i=mouseLocationX-20;i<mouseLocationX+20;i++){
        if(i==catLocationX){
        matchX=true;
        break;
        }else{
        matchX=false;
        }
        }
        
        //Checks if cat is near mouse (y)
        for(int i=mouseLocationY-20;i<mouseLocationY+20;i++){
        if(i==catLocationY){
        matchY=true;
        break;
        }else{
        matchY=false;
        }
        }
        
        //Compares the two
        if((matchX==true)&&(matchY==true)){
            System.out.println("Victory");
            timer1.cancel();
            upgrade=false;
            secondLife();
            
        }
        }        
        };
        timer1.scheduleAtFixedRate(task1,1000,300);//1000ms =1sec
    }
    
    public static void secondLife(){
    jLabel13.setText("Level 2");
     
     //make a random location for the mice and obstacles
     Random dice=new Random();
     obstacle1.setLocation(dice.nextInt(460),dice.nextInt(460));
     obstacle1.setVisible(true);
     obstacle2.setLocation(dice.nextInt(460),dice.nextInt(460));
     obstacle2.setVisible(true);
     obstacle3.setLocation(dice.nextInt(460),dice.nextInt(460));
     obstacle3.setVisible(true);
     obstacle4.setLocation(dice.nextInt(460),dice.nextInt(460));
     obstacle4.setVisible(true);
     
     upgrade1.setLocation(dice.nextInt(460),dice.nextInt(460));
     upgrade1.setVisible(true);
     
     int newLocationX=dice.nextInt(500);
     int newLocationY=dice.nextInt(500);
     mouse.setLocation(newLocationX,newLocationY);
     
        Timer timer2=new Timer();
        TimerTask task2=new TimerTask(){
        public void run(){
            
        getUpgrade();
            
        if(newLocationX<250){
        mouseLocationX=(mouse.getLocation().x)+1;
        }else{
        mouseLocationX=(mouse.getLocation().x)-1;    
        }
        if(newLocationY<250){
        mouseLocationY=(mouse.getLocation().y)+1;
        }else{
        mouseLocationY=(mouse.getLocation().y)-1;   
        }
        
        gameOver(); 
        
        mouse.setLocation(mouseLocationX,mouseLocationY);
        catLocationX=cat.getLocation().x;
        catLocationY=cat.getLocation().y;
        
        //checks if cat is near upgrade
        for(int y=-15;y<15;y++){
           if(catLocationX==(upgrade1.getLocation().x)+y){
              for(int o=-15;o<15;o++){
                  if (catLocationY==(upgrade1.getLocation().y)+o){
                  System.out.println("Upgraded");
                  upgrade=true;
                  upgrade1.setVisible(false);
                  break;
               }
              }
            }
        }
        
        
        for(int q=-15;q<15;q++){
           if(catLocationX==(obstacle1.getLocation().x)+q){
              for(int w=-15;w<15;w++){
                  if (catLocationY==(obstacle1.getLocation().y)+w){
                  jLabel14.setVisible(true);
                  again.setVisible(true);
                  timer2.cancel();
                  break;
               }
              }
            }
        }
        
        for(int q=-15;q<15;q++){
           if(catLocationX==(obstacle2.getLocation().x)+q){
              for(int w=-15;w<15;w++){
                  if (catLocationY==(obstacle2.getLocation().y)+w){
                  jLabel14.setVisible(true);
                  again.setVisible(true);
                  timer2.cancel();
                  break;
               }
              }
            }
        }
        
        for(int q=-15;q<15;q++){
           if(catLocationX==(obstacle3.getLocation().x)+q){
              for(int w=-15;w<15;w++){
                  if (catLocationY==(obstacle3.getLocation().y)+w){
                  jLabel14.setVisible(true);
                  again.setVisible(true);
                  timer2.cancel();
                  break;
               }
              }
            }
        }
        
        for(int q=-15;q<15;q++){
           if(catLocationX==(obstacle4.getLocation().x)+q){
              for(int w=-15;w<15;w++){
                  if (catLocationY==(obstacle4.getLocation().y)+w){
                  jLabel14.setVisible(true);
                  again.setVisible(true);
                  timer2.cancel();
                  break;
               }
              }
            }
        }
        
        //Checks if cat is near mouse (x)
        for(int i=mouseLocationX-20;i<mouseLocationX+20;i++){
        if(i==catLocationX){
        matchX=true;
        break;
        }else{
        matchX=false;
        }
        }
        
        //Checks if cat is near mouse (y)
        for(int i=mouseLocationY-20;i<mouseLocationY+20;i++){
        if(i==catLocationY){
        matchY=true;
        break;
        }else{
        matchY=false;
        }
        }
        
        //Compares the two
        if((matchX==true)&&(matchY==true)){
            System.out.println("Victory");
            timer2.cancel();
            upgrade=false;
            thirdLife();
        }
        }        
        };
        timer2.scheduleAtFixedRate(task2,1000,150);//1000ms =1sec
     
    }
    
    public static void thirdLife(){
    jLabel13.setText("Level 3"); 
      
      //make a random location for the mice and obstacles
     Random dice2=new Random();
     
     obstacle1.setLocation(dice2.nextInt(460),dice2.nextInt(460));
     obstacle1.setVisible(true);
     obstacle2.setLocation(dice2.nextInt(460),dice2.nextInt(460));
     obstacle2.setVisible(true);
     obstacle3.setLocation(dice2.nextInt(460),dice2.nextInt(460));
     obstacle3.setVisible(true);
     obstacle4.setLocation(dice2.nextInt(460),dice2.nextInt(460));
     obstacle4.setVisible(true);
     obstacle5.setLocation(dice2.nextInt(460),dice2.nextInt(460));
     obstacle5.setVisible(true);
     obstacle6.setLocation(dice2.nextInt(460),dice2.nextInt(460));
     obstacle6.setVisible(true);
     obstacle7.setLocation(dice2.nextInt(460),dice2.nextInt(460));
     obstacle7.setVisible(true);
     obstacle8.setLocation(dice2.nextInt(460),dice2.nextInt(460));
     obstacle8.setVisible(true);
     
     upgrade1.setLocation(dice2.nextInt(460),dice2.nextInt(460));
     upgrade1.setVisible(true);
     
     int newLocationX=dice2.nextInt(500);
     int newLocationY=dice2.nextInt(500);
     mouse.setLocation(newLocationX,newLocationY);
     
        Timer timer3=new Timer();
        TimerTask task3=new TimerTask(){
        public void run(){
            
        getUpgrade();    
            
        if(newLocationX<250){
        mouseLocationX=(mouse.getLocation().x)+1;
        }else{
        mouseLocationX=(mouse.getLocation().x)-1;    
        }
        if(newLocationY<250){
        mouseLocationY=(mouse.getLocation().y)+1;
        }else{
        mouseLocationY=(mouse.getLocation().y)-1;   
        }
        
        gameOver();
        
        mouse.setLocation(mouseLocationX,mouseLocationY);
        catLocationX=cat.getLocation().x;
        catLocationY=cat.getLocation().y;
        
        //checks if cat is near upgrade
        for(int y=-15;y<15;y++){
           if(catLocationX==(upgrade1.getLocation().x)+y){
              for(int o=-15;o<15;o++){
                  if (catLocationY==(upgrade1.getLocation().y)+o){
                  System.out.println("Upgraded");
                  upgrade=true;
                  upgrade1.setVisible(false);
                  break;
               }
              }
            }
        }
        
        for(int q=-15;q<15;q++){
           if(catLocationX==(obstacle1.getLocation().x)+q){
              for(int w=-15;w<15;w++){
                  if (catLocationY==(obstacle1.getLocation().y)+w){
                  jLabel14.setVisible(true);
                  again.setVisible(true);
                  timer3.cancel();
                  break;
               }
              }
            }
        }
        
        for(int q=-15;q<15;q++){
           if(catLocationX==(obstacle2.getLocation().x)+q){
              for(int w=-15;w<15;w++){
                  if (catLocationY==(obstacle2.getLocation().y)+w){
                  jLabel14.setVisible(true);
                  again.setVisible(true);
                  timer3.cancel();
                  break;
               }
              }
            }
        }
        
        for(int q=-15;q<15;q++){
           if(catLocationX==(obstacle3.getLocation().x)+q){
              for(int w=-15;w<15;w++){
                  if (catLocationY==(obstacle3.getLocation().y)+w){
                  jLabel14.setVisible(true);
                  again.setVisible(true);
                  timer3.cancel();
                  break;
               }
              }
            }
        }
        
        for(int q=-15;q<15;q++){
           if(catLocationX==(obstacle4.getLocation().x)+q){
              for(int w=-15;w<15;w++){
                  if (catLocationY==(obstacle4.getLocation().y)+w){
                  jLabel14.setVisible(true);
                  again.setVisible(true);
                  timer3.cancel();
                  break;
               }
              }
            }
        }
        
        for(int q=-15;q<15;q++){
           if(catLocationX==(obstacle5.getLocation().x)+q){
              for(int w=-15;w<15;w++){
                  if (catLocationY==(obstacle5.getLocation().y)+w){
                  jLabel14.setVisible(true);
                  again.setVisible(true);
                  timer3.cancel();
                  break;
               }
              }
            }
        }
        
        for(int q=-15;q<15;q++){
           if(catLocationX==(obstacle6.getLocation().x)+q){
              for(int w=-15;w<15;w++){
                  if (catLocationY==(obstacle6.getLocation().y)+w){
                  jLabel14.setVisible(true);
                  again.setVisible(true);
                  timer3.cancel();
                  break;
               }
              }
            }
        }
        
        for(int q=-15;q<15;q++){
           if(catLocationX==(obstacle7.getLocation().x)+q){
              for(int w=-15;w<15;w++){
                  if (catLocationY==(obstacle7.getLocation().y)+w){
                  jLabel14.setVisible(true);
                  again.setVisible(true);
                  timer3.cancel();
                  break;
               }
              }
            }
        }
        
        for(int q=-15;q<15;q++){
           if(catLocationX==(obstacle8.getLocation().x)+q){
              for(int w=-15;w<15;w++){
                  if (catLocationY==(obstacle8.getLocation().y)+w){
                  jLabel14.setVisible(true);
                  again.setVisible(true);
                  timer3.cancel();
                  break;
               }
              }
            }
        }
        
        //Checks if cat is near mouse (x)
        for(int i=mouseLocationX-20;i<mouseLocationX+20;i++){
        if(i==catLocationX){
        matchX=true;
        break;
        }else{
        matchX=false;
        }
        }
        
        //Checks if cat is near mouse (y)
        for(int i=mouseLocationY-20;i<mouseLocationY+20;i++){
        if(i==catLocationY){
        matchY=true;
        break;
        }else{
        matchY=false;
        }
        }
        
        //Compares the two
        if((matchX==true)&&(matchY==true)){
            System.out.println("Victory");
            timer3.cancel();
            upgrade=false;
            fourthLife();
        }
        }        
        };
        timer3.scheduleAtFixedRate(task3,1000,50);//1000ms =1sec
      
    }
    
    public static void fourthLife(){
    jLabel13.setText("Level 4");
     
     
     //make a random location for the mice and obstacles
     Random dice4=new Random();
     
     obstacle1.setLocation(dice4.nextInt(460),dice4.nextInt(460));
     obstacle1.setVisible(true);
     obstacle2.setLocation(dice4.nextInt(460),dice4.nextInt(460));
     obstacle2.setVisible(true);
     obstacle3.setLocation(dice4.nextInt(460),dice4.nextInt(460));
     obstacle3.setVisible(true);
     obstacle4.setLocation(dice4.nextInt(460),dice4.nextInt(460));
     obstacle4.setVisible(true);
     obstacle5.setLocation(dice4.nextInt(460),dice4.nextInt(460));
     obstacle5.setVisible(true);
     obstacle6.setLocation(dice4.nextInt(460),dice4.nextInt(460));
     obstacle6.setVisible(true);
     obstacle7.setLocation(dice4.nextInt(460),dice4.nextInt(460));
     obstacle7.setVisible(true);
     obstacle8.setLocation(dice4.nextInt(460),dice4.nextInt(460));
     obstacle8.setVisible(true);
     obstacle9.setLocation(dice4.nextInt(460),dice4.nextInt(460));
     obstacle9.setVisible(true);
     obstacle10.setLocation(dice4.nextInt(460),dice4.nextInt(460));
     obstacle10.setVisible(true);
     obstacle11.setLocation(dice4.nextInt(460),dice4.nextInt(460));
     obstacle11.setVisible(true);
     obstacle12.setLocation(dice4.nextInt(460),dice4.nextInt(460));
     obstacle12.setVisible(true);
     obstacle13.setLocation(dice4.nextInt(460),dice4.nextInt(460));
     obstacle13.setVisible(true);
     obstacle14.setLocation(dice4.nextInt(460),dice4.nextInt(460));
     obstacle14.setVisible(true);
     obstacle15.setLocation(dice4.nextInt(480),dice4.nextInt(460));
     obstacle15.setVisible(true);
     obstacle16.setLocation(dice4.nextInt(460),dice4.nextInt(460));
     obstacle16.setVisible(true);
     
     upgrade1.setLocation(dice4.nextInt(460),dice4.nextInt(460));
     upgrade1.setVisible(true);
     upgrade2.setLocation(dice4.nextInt(460),dice4.nextInt(460));
     upgrade2.setVisible(true);
     upgrade3.setLocation(dice4.nextInt(460),dice4.nextInt(460));
     upgrade3.setVisible(true);
     
     int newLocationX=dice4.nextInt(500);
     int newLocationY=dice4.nextInt(500);
     mouse.setLocation(newLocationX,newLocationY);
     
        Timer timer4=new Timer();
        TimerTask task4=new TimerTask(){
        public void run(){
            
        getUpgrade();    
            
        if(newLocationX<250){
        mouseLocationX=(mouse.getLocation().x)+1;
        }else{
        mouseLocationX=(mouse.getLocation().x)-1;    
        }
        if(newLocationY<250){
        mouseLocationY=(mouse.getLocation().y)+1;
        }else{
        mouseLocationY=(mouse.getLocation().y)-1;   
        }
        
        gameOver();
        
        mouse.setLocation(mouseLocationX,mouseLocationY);
        catLocationX=cat.getLocation().x;
        catLocationY=cat.getLocation().y;
        
        //checks if cat is near upgrade
        for(int y=-15;y<15;y++){
           if(catLocationX==(upgrade1.getLocation().x)+y){
              for(int o=-15;o<15;o++){
                  if (catLocationY==(upgrade1.getLocation().y)+o){
                  System.out.println("Upgraded");
                  upgrade=true;
                  upgrade1.setVisible(false);
                  break;
               }
              }
            }
        }
        
        //checks if cat is near upgrade
        for(int y=-15;y<15;y++){
           if(catLocationX==(upgrade2.getLocation().x)+y){
              for(int o=-15;o<15;o++){
                  if (catLocationY==(upgrade2.getLocation().y)+o){
                  System.out.println("Upgraded");
                  upgrade=true;
                  upgrade2.setVisible(false);
                  break;
               }
              }
            }
        }
        
        //checks if cat is near upgrade
        for(int y=-15;y<15;y++){
           if(catLocationX==(upgrade3.getLocation().x)+y){
              for(int o=-15;o<15;o++){
                  if (catLocationY==(upgrade3.getLocation().y)+o){
                  System.out.println("Upgraded");
                  upgrade=true;
                  upgrade3.setVisible(false);
                  break;
               }
              }
            }
        }
        
        //checks if cat is near obstacles
        for(int q=-15;q<15;q++){
           if(catLocationX==(obstacle1.getLocation().x)+q){
              for(int w=-15;w<15;w++){
                  if (catLocationY==(obstacle1.getLocation().y)+w){
                  jLabel14.setVisible(true);
                  again.setVisible(true);
                  timer4.cancel();
                  break;
               }
              }
            }
        }
        
        for(int q=-15;q<15;q++){
           if(catLocationX==(obstacle2.getLocation().x)+q){
              for(int w=-15;w<15;w++){
                  if (catLocationY==(obstacle2.getLocation().y)+w){
                  jLabel14.setVisible(true);
                  again.setVisible(true);
                  timer4.cancel();
                  break;
               }
              }
            }
        }
        
        for(int q=-15;q<15;q++){
           if(catLocationX==(obstacle3.getLocation().x)+q){
              for(int w=-15;w<15;w++){
                  if (catLocationY==(obstacle3.getLocation().y)+w){
                  jLabel14.setVisible(true);
                  again.setVisible(true);
                  timer4.cancel();
                  break;
               }
              }
            }
        }
        
        for(int q=-15;q<15;q++){
           if(catLocationX==(obstacle4.getLocation().x)+q){
              for(int w=-15;w<15;w++){
                  if (catLocationY==(obstacle4.getLocation().y)+w){
                  jLabel14.setVisible(true);
                  again.setVisible(true);
                  timer4.cancel();
                  break;
               }
              }
            }
        }
        
        for(int q=-15;q<15;q++){
           if(catLocationX==(obstacle5.getLocation().x)+q){
              for(int w=-15;w<15;w++){
                  if (catLocationY==(obstacle5.getLocation().y)+w){
                  jLabel14.setVisible(true);
                  again.setVisible(true);
                  timer4.cancel();
                  break;
               }
              }
            }
        }
        
        for(int q=-15;q<15;q++){
           if(catLocationX==(obstacle6.getLocation().x)+q){
              for(int w=-15;w<15;w++){
                  if (catLocationY==(obstacle6.getLocation().y)+w){
                  jLabel14.setVisible(true);
                  again.setVisible(true);
                  timer4.cancel();
                  break;
               }
              }
            }
        }
        
        for(int q=-15;q<15;q++){
           if(catLocationX==(obstacle7.getLocation().x)+q){
              for(int w=-15;w<15;w++){
                  if (catLocationY==(obstacle7.getLocation().y)+w){
                  jLabel14.setVisible(true);
                  again.setVisible(true);
                  timer4.cancel();
                  break;
               }
              }
            }
        }
        
        for(int q=-15;q<15;q++){
           if(catLocationX==(obstacle8.getLocation().x)+q){
              for(int w=-15;w<15;w++){
                  if (catLocationY==(obstacle8.getLocation().y)+w){
                  jLabel14.setVisible(true);
                  again.setVisible(true);
                  timer4.cancel();
                  break;
               }
              }
            }
        }
        
        for(int q=-15;q<15;q++){
           if(catLocationX==(obstacle9.getLocation().x)+q){
              for(int w=-15;w<15;w++){
                  if (catLocationY==(obstacle9.getLocation().y)+w){
                  jLabel14.setVisible(true);
                  again.setVisible(true);
                  timer4.cancel();
                  break;
               }
              }
            }
        }
        
        for(int q=-15;q<15;q++){
           if(catLocationX==(obstacle10.getLocation().x)+q){
              for(int w=-15;w<15;w++){
                  if (catLocationY==(obstacle10.getLocation().y)+w){
                  jLabel14.setVisible(true);
                  again.setVisible(true);
                  timer4.cancel();
                  break;
               }
              }
            }
        }
        
        for(int q=-15;q<15;q++){
           if(catLocationX==(obstacle11.getLocation().x)+q){
              for(int w=-15;w<15;w++){
                  if (catLocationY==(obstacle11.getLocation().y)+w){
                  jLabel14.setVisible(true);
                  again.setVisible(true);
                  timer4.cancel();
                  break;
               }
              }
            }
        }
        
        for(int q=-15;q<15;q++){
           if(catLocationX==(obstacle12.getLocation().x)+q){
              for(int w=-15;w<15;w++){
                  if (catLocationY==(obstacle12.getLocation().y)+w){
                  jLabel14.setVisible(true);
                  again.setVisible(true);
                  timer4.cancel();
                  break;
               }
              }
            }
        }
        
        for(int q=-15;q<15;q++){
           if(catLocationX==(obstacle13.getLocation().x)+q){
              for(int w=-15;w<15;w++){
                  if (catLocationY==(obstacle13.getLocation().y)+w){
                  jLabel14.setVisible(true);
                  again.setVisible(true);
                  timer4.cancel();
                  break;
               }
              }
            }
        }
        
        for(int q=-15;q<15;q++){
           if(catLocationX==(obstacle14.getLocation().x)+q){
              for(int w=-15;w<15;w++){
                  if (catLocationY==(obstacle14.getLocation().y)+w){
                  jLabel14.setVisible(true);
                  again.setVisible(true);
                  timer4.cancel();
                  break;
               }
              }
            }
        }
        
        for(int q=-15;q<15;q++){
           if(catLocationX==(obstacle15.getLocation().x)+q){
              for(int w=-15;w<15;w++){
                  if (catLocationY==(obstacle15.getLocation().y)+w){
                  jLabel14.setVisible(true);
                  again.setVisible(true);
                  timer4.cancel();
                  break;
               }
              }
            }
        }
        
        for(int q=-15;q<15;q++){
           if(catLocationX==(obstacle16.getLocation().x)+q){
              for(int w=-15;w<15;w++){
                  if (catLocationY==(obstacle16.getLocation().y)+w){
                  jLabel14.setVisible(true);
                  again.setVisible(true);
                  timer4.cancel();
                  break;
               }
              }
            }
        }
        
        //Checks if cat is near mouse (x)
        for(int i=mouseLocationX-20;i<mouseLocationX+20;i++){
        if(i==catLocationX){
        matchX=true;
        break;
        }else{
        matchX=false;
        }
        }
        
        //Checks if cat is near mouse (y)
        for(int i=mouseLocationY-20;i<mouseLocationY+20;i++){
        if(i==catLocationY){
        matchY=true;
        break;
        }else{
        matchY=false;
        }
        }
        
        //Compares the two
        if((matchX==true)&&(matchY==true)){
            System.out.println("Victory");
            timer4.cancel();
            upgrade=false;
            fifthLife();
        }
        }        
        };
        timer4.scheduleAtFixedRate(task4,1000,30);//1000ms =1sec
      
        
        
    }

    public static void fifthLife(){
    jLabel13.setText("Level 5");
        
        //make a random location for the mice and obstacles
     Random dice5=new Random();
     
     obstacle1.setLocation(dice5.nextInt(460),dice5.nextInt(460));
     obstacle1.setVisible(true);
     obstacle2.setLocation(dice5.nextInt(460),dice5.nextInt(460));
     obstacle2.setVisible(true);
     obstacle3.setLocation(dice5.nextInt(460),dice5.nextInt(460));
     obstacle3.setVisible(true);
     obstacle4.setLocation(dice5.nextInt(460),dice5.nextInt(460));
     obstacle4.setVisible(true);
     obstacle5.setLocation(dice5.nextInt(460),dice5.nextInt(460));
     obstacle5.setVisible(true);
     obstacle6.setLocation(dice5.nextInt(460),dice5.nextInt(460));
     obstacle6.setVisible(true);
     obstacle7.setLocation(dice5.nextInt(460),dice5.nextInt(460));
     obstacle7.setVisible(true);
     obstacle8.setLocation(dice5.nextInt(460),dice5.nextInt(460));
     obstacle8.setVisible(true);
     obstacle9.setLocation(dice5.nextInt(460),dice5.nextInt(460));
     obstacle9.setVisible(true);
     obstacle10.setLocation(dice5.nextInt(460),dice5.nextInt(460));
     obstacle10.setVisible(true);
     obstacle11.setLocation(dice5.nextInt(460),dice5.nextInt(460));
     obstacle11.setVisible(true);
     obstacle12.setLocation(dice5.nextInt(460),dice5.nextInt(460));
     obstacle12.setVisible(true);
     obstacle13.setLocation(dice5.nextInt(460),dice5.nextInt(460));
     obstacle13.setVisible(true);
     obstacle14.setLocation(dice5.nextInt(460),dice5.nextInt(460));
     obstacle14.setVisible(true);
     obstacle15.setLocation(dice5.nextInt(460),dice5.nextInt(460));
     obstacle15.setVisible(true);
     obstacle16.setLocation(dice5.nextInt(460),dice5.nextInt(460));
     obstacle16.setVisible(true);
     
     upgrade1.setLocation(dice5.nextInt(460),dice5.nextInt(460));
     upgrade1.setVisible(true);
     upgrade2.setLocation(dice5.nextInt(460),dice5.nextInt(460));
     upgrade2.setVisible(true);
     upgrade3.setLocation(dice5.nextInt(460),dice5.nextInt(460));
     upgrade3.setVisible(true);
     
     int newLocationX=dice5.nextInt(500);
     int newLocationY=dice5.nextInt(500);
     mouse.setLocation(newLocationX,newLocationY);
     
        Timer timer5=new Timer();
        TimerTask task5=new TimerTask(){
        public void run(){
            
        getUpgrade();    
            
        if(newLocationX<250){
        mouseLocationX=(mouse.getLocation().x)+1;
        }else{
        mouseLocationX=(mouse.getLocation().x)-1;    
        }
        if(newLocationY<250){
        mouseLocationY=(mouse.getLocation().y)+1;
        }else{
        mouseLocationY=(mouse.getLocation().y)-1;   
        }
        
        gameOver();
        
        mouse.setLocation(mouseLocationX,mouseLocationY);
        catLocationX=cat.getLocation().x;
        catLocationY=cat.getLocation().y;
        
        //checks if cat is near upgrade
        for(int y=-15;y<15;y++){
           if(catLocationX==(upgrade1.getLocation().x)+y){
              for(int o=-15;o<15;o++){
                  if (catLocationY==(upgrade1.getLocation().y)+o){
                  System.out.println("Upgraded");
                  upgrade=true;
                  upgrade1.setVisible(false);
                  break;
               }
              }
            }
        }
        
        //checks if cat is near upgrade
        for(int y=-15;y<15;y++){
           if(catLocationX==(upgrade2.getLocation().x)+y){
              for(int o=-15;o<15;o++){
                  if (catLocationY==(upgrade2.getLocation().y)+o){
                  System.out.println("Upgraded");
                  upgrade=true;
                  upgrade2.setVisible(false);
                  break;
               }
              }
            }
        }
        
        //checks if cat is near upgrade
        for(int y=-15;y<15;y++){
           if(catLocationX==(upgrade3.getLocation().x)+y){
              for(int o=-15;o<15;o++){
                  if (catLocationY==(upgrade3.getLocation().y)+o){
                  System.out.println("Upgraded");
                  upgrade=true;
                  upgrade3.setVisible(false);
                  break;
               }
              }
            }
        }
        
        for(int q=-15;q<15;q++){
           if(catLocationX==(obstacle1.getLocation().x)+q){
              for(int w=-15;w<15;w++){
                  if (catLocationY==(obstacle1.getLocation().y)+w){
                  jLabel14.setVisible(true);
                  again.setVisible(true);
                  timer5.cancel();
                  break;
               }
              }
            }
        }
        
        for(int q=-15;q<15;q++){
           if(catLocationX==(obstacle2.getLocation().x)+q){
              for(int w=-15;w<15;w++){
                  if (catLocationY==(obstacle2.getLocation().y)+w){
                  jLabel14.setVisible(true);
                  again.setVisible(true);
                  timer5.cancel();
                  break;
               }
              }
            }
        }
        
        for(int q=-15;q<15;q++){
           if(catLocationX==(obstacle3.getLocation().x)+q){
              for(int w=-15;w<15;w++){
                  if (catLocationY==(obstacle3.getLocation().y)+w){
                  jLabel14.setVisible(true);
                  again.setVisible(true);
                  timer5.cancel();
                  break;
               }
              }
            }
        }
        
        for(int q=-15;q<15;q++){
           if(catLocationX==(obstacle4.getLocation().x)+q){
              for(int w=-15;w<15;w++){
                  if (catLocationY==(obstacle4.getLocation().y)+w){
                  jLabel14.setVisible(true);
                  again.setVisible(true);
                  timer5.cancel();
                  break;
               }
              }
            }
        }
        
        for(int q=-15;q<15;q++){
           if(catLocationX==(obstacle5.getLocation().x)+q){
              for(int w=-15;w<15;w++){
                  if (catLocationY==(obstacle5.getLocation().y)+w){
                  jLabel14.setVisible(true);
                  again.setVisible(true);
                  timer5.cancel();
                  break;
               }
              }
            }
        }
        
        for(int q=-15;q<15;q++){
           if(catLocationX==(obstacle6.getLocation().x)+q){
              for(int w=-15;w<15;w++){
                  if (catLocationY==(obstacle6.getLocation().y)+w){
                  jLabel14.setVisible(true);
                  again.setVisible(true);
                  timer5.cancel();
                  break;
               }
              }
            }
        }
        
        for(int q=-15;q<15;q++){
           if(catLocationX==(obstacle7.getLocation().x)+q){
              for(int w=-15;w<15;w++){
                  if (catLocationY==(obstacle7.getLocation().y)+w){
                  jLabel14.setVisible(true);
                  again.setVisible(true);
                  timer5.cancel();
                  break;
               }
              }
            }
        }
        
        for(int q=-15;q<15;q++){
           if(catLocationX==(obstacle8.getLocation().x)+q){
              for(int w=-15;w<15;w++){
                  if (catLocationY==(obstacle8.getLocation().y)+w){
                  jLabel14.setVisible(true);
                  again.setVisible(true);
                  timer5.cancel();
                  break;
               }
              }
            }
        }
        
        for(int q=-15;q<15;q++){
           if(catLocationX==(obstacle9.getLocation().x)+q){
              for(int w=-15;w<15;w++){
                  if (catLocationY==(obstacle9.getLocation().y)+w){
                  jLabel14.setVisible(true);
                  again.setVisible(true);
                  timer5.cancel();
                  break;
               }
              }
            }
        }
        
        for(int q=-15;q<15;q++){
           if(catLocationX==(obstacle10.getLocation().x)+q){
              for(int w=-15;w<15;w++){
                  if (catLocationY==(obstacle10.getLocation().y)+w){
                  jLabel14.setVisible(true);
                  again.setVisible(true);
                  timer5.cancel();
                  break;
               }
              }
            }
        }
        
        for(int q=-15;q<15;q++){
           if(catLocationX==(obstacle11.getLocation().x)+q){
              for(int w=-15;w<15;w++){
                  if (catLocationY==(obstacle11.getLocation().y)+w){
                  jLabel14.setVisible(true);
                  again.setVisible(true);
                  timer5.cancel();
                  break;
               }
              }
            }
        }
        
        for(int q=-15;q<15;q++){
           if(catLocationX==(obstacle12.getLocation().x)+q){
              for(int w=-15;w<15;w++){
                  if (catLocationY==(obstacle12.getLocation().y)+w){
                  jLabel14.setVisible(true);
                  again.setVisible(true);
                  timer5.cancel();
                  break;
               }
              }
            }
        }
        
        for(int q=-15;q<15;q++){
           if(catLocationX==(obstacle13.getLocation().x)+q){
              for(int w=-15;w<15;w++){
                  if (catLocationY==(obstacle13.getLocation().y)+w){
                  jLabel14.setVisible(true);
                  again.setVisible(true);
                  timer5.cancel();
                  break;
               }
              }
            }
        }
        
        for(int q=-15;q<15;q++){
           if(catLocationX==(obstacle14.getLocation().x)+q){
              for(int w=-15;w<15;w++){
                  if (catLocationY==(obstacle14.getLocation().y)+w){
                  jLabel14.setVisible(true);
                  again.setVisible(true);
                  timer5.cancel();
                  break;
               }
              }
            }
        }
        
        for(int q=-15;q<15;q++){
           if(catLocationX==(obstacle15.getLocation().x)+q){
              for(int w=-15;w<15;w++){
                  if (catLocationY==(obstacle15.getLocation().y)+w){
                  jLabel14.setVisible(true);
                  again.setVisible(true);
                  timer5.cancel();
                  break;
               }
              }
            }
        }
        
        for(int q=-15;q<15;q++){
           if(catLocationX==(obstacle16.getLocation().x)+q){
              for(int w=-15;w<15;w++){
                  if (catLocationY==(obstacle16.getLocation().y)+w){
                  jLabel14.setVisible(true);
                  again.setVisible(true);
                  timer5.cancel();
                  break;
               }
              }
            }
        }
        
        //Checks if cat is near mouse (x)
        for(int i=mouseLocationX-20;i<mouseLocationX+20;i++){
        if(i==catLocationX){
        matchX=true;
        break;
        }else{
        matchX=false;
        }
        }
        
        //Checks if cat is near mouse (y)
        for(int i=mouseLocationY-20;i<mouseLocationY+20;i++){
        if(i==catLocationY){
        matchY=true;
        break;
        }else{
        matchY=false;
        }
        }
        
        //Compares the two
        if((matchX==true)&&(matchY==true)){
            System.out.println("Victory");
            timer5.cancel();
            upgrade=false;
            sixthLife();
        }
        }        
        };
        timer5.scheduleAtFixedRate(task5,1000,18);//1000ms =1sec
      
        
        
    }
    
    public static void sixthLife(){
    jLabel13.setText("Level 6");
        
        
         //make a random location for the mice and obstacles
     Random dice6=new Random();
     
     obstacle1.setLocation(dice6.nextInt(460),dice6.nextInt(460));
     obstacle1.setVisible(true);
     obstacle2.setLocation(dice6.nextInt(460),dice6.nextInt(460));
     obstacle2.setVisible(true);
     obstacle3.setLocation(dice6.nextInt(460),dice6.nextInt(460));
     obstacle3.setVisible(true);
     obstacle4.setLocation(dice6.nextInt(460),dice6.nextInt(460));
     obstacle4.setVisible(true);
     obstacle5.setLocation(dice6.nextInt(460),dice6.nextInt(460));
     obstacle5.setVisible(true);
     obstacle6.setLocation(dice6.nextInt(460),dice6.nextInt(460));
     obstacle6.setVisible(true);
     obstacle7.setLocation(dice6.nextInt(460),dice6.nextInt(460));
     obstacle7.setVisible(true);
     obstacle8.setLocation(dice6.nextInt(460),dice6.nextInt(460));
     obstacle8.setVisible(true);
     obstacle9.setLocation(dice6.nextInt(460),dice6.nextInt(460));
     obstacle9.setVisible(true);
     obstacle10.setLocation(dice6.nextInt(460),dice6.nextInt(460));
     obstacle10.setVisible(true);
     obstacle11.setLocation(dice6.nextInt(460),dice6.nextInt(460));
     obstacle11.setVisible(true);
     obstacle12.setLocation(dice6.nextInt(460),dice6.nextInt(460));
     obstacle12.setVisible(true);
     obstacle13.setLocation(dice6.nextInt(460),dice6.nextInt(460));
     obstacle13.setVisible(true);
     obstacle14.setLocation(dice6.nextInt(460),dice6.nextInt(460));
     obstacle14.setVisible(true);
     obstacle15.setLocation(dice6.nextInt(460),dice6.nextInt(460));
     obstacle15.setVisible(true);
     obstacle16.setLocation(dice6.nextInt(460),dice6.nextInt(460));
     obstacle16.setVisible(true);
     
     upgrade1.setLocation(dice6.nextInt(460),dice6.nextInt(460));
     upgrade1.setVisible(true);
     upgrade2.setLocation(dice6.nextInt(460),dice6.nextInt(460));
     upgrade2.setVisible(true);
     upgrade3.setLocation(dice6.nextInt(460),dice6.nextInt(460));
     upgrade3.setVisible(true);
     upgrade4.setLocation(dice6.nextInt(460),dice6.nextInt(460));
     upgrade4.setVisible(true);
     
     int newLocationX=dice6.nextInt(500);
     int newLocationY=dice6.nextInt(500);
     mouse.setLocation(newLocationX,newLocationY);
     
        Timer timer6=new Timer();
        TimerTask task6=new TimerTask(){
        public void run(){
            
        getUpgrade();    
            
        if(newLocationX<250){
        mouseLocationX=(mouse.getLocation().x)+1;
        }else{
        mouseLocationX=(mouse.getLocation().x)-1;    
        }
        if(newLocationY<250){
        mouseLocationY=(mouse.getLocation().y)+1;
        }else{
        mouseLocationY=(mouse.getLocation().y)-1;   
        }
        
        gameOver();
        
        mouse.setLocation(mouseLocationX,mouseLocationY);
        catLocationX=cat.getLocation().x;
        catLocationY=cat.getLocation().y;
        
        //checks if cat is near upgrade
        for(int y=-15;y<15;y++){
           if(catLocationX==(upgrade1.getLocation().x)+y){
              for(int o=-15;o<15;o++){
                  if (catLocationY==(upgrade1.getLocation().y)+o){
                  System.out.println("Upgraded");
                  upgrade=true;
                  upgrade1.setVisible(false);
                  break;
               }
              }
            }
        }
        
        //checks if cat is near upgrade
        for(int y=-15;y<15;y++){
           if(catLocationX==(upgrade2.getLocation().x)+y){
              for(int o=-15;o<15;o++){
                  if (catLocationY==(upgrade2.getLocation().y)+o){
                  System.out.println("Upgraded");
                  upgrade=true;
                  upgrade2.setVisible(false);
                  break;
               }
              }
            }
        }
        
        //checks if cat is near upgrade
        for(int y=-15;y<15;y++){
           if(catLocationX==(upgrade3.getLocation().x)+y){
              for(int o=-15;o<15;o++){
                  if (catLocationY==(upgrade3.getLocation().y)+o){
                  System.out.println("Upgraded");
                  upgrade=true;
                  upgrade3.setVisible(false);
                  break;
               }
              }
            }
        }
        
        //checks if cat is near upgrade
        for(int y=-15;y<15;y++){
           if(catLocationX==(upgrade4.getLocation().x)+y){
              for(int o=-15;o<15;o++){
                  if (catLocationY==(upgrade4.getLocation().y)+o){
                  System.out.println("Upgraded");
                  upgrade=true;
                  upgrade4.setVisible(false);
                  break;
               }
              }
            }
        }
        
        for(int q=-15;q<15;q++){
           if(catLocationX==(obstacle1.getLocation().x)+q){
              for(int w=-15;w<15;w++){
                  if (catLocationY==(obstacle1.getLocation().y)+w){
                  jLabel14.setVisible(true);
                  again.setVisible(true);
                  timer6.cancel();
                  break;
               }
              }
            }
        }
        
        for(int q=-15;q<15;q++){
           if(catLocationX==(obstacle2.getLocation().x)+q){
              for(int w=-15;w<15;w++){
                  if (catLocationY==(obstacle2.getLocation().y)+w){
                  jLabel14.setVisible(true);
                  again.setVisible(true);
                  timer6.cancel();
                  break;
               }
              }
            }
        }
        
        for(int q=-15;q<15;q++){
           if(catLocationX==(obstacle3.getLocation().x)+q){
              for(int w=-15;w<15;w++){
                  if (catLocationY==(obstacle3.getLocation().y)+w){
                  jLabel14.setVisible(true);
                  again.setVisible(true);
                  timer6.cancel();
                  break;
               }
              }
            }
        }
        
        for(int q=-15;q<15;q++){
           if(catLocationX==(obstacle4.getLocation().x)+q){
              for(int w=-15;w<15;w++){
                  if (catLocationY==(obstacle4.getLocation().y)+w){
                  jLabel14.setVisible(true);
                  again.setVisible(true);
                  timer6.cancel();
                  break;
               }
              }
            }
        }
        
        for(int q=-15;q<15;q++){
           if(catLocationX==(obstacle5.getLocation().x)+q){
              for(int w=-15;w<15;w++){
                  if (catLocationY==(obstacle5.getLocation().y)+w){
                  jLabel14.setVisible(true);
                  again.setVisible(true);
                  timer6.cancel();
                  break;
               }
              }
            }
        }
        
        for(int q=-15;q<15;q++){
           if(catLocationX==(obstacle6.getLocation().x)+q){
              for(int w=-15;w<15;w++){
                  if (catLocationY==(obstacle6.getLocation().y)+w){
                  jLabel14.setVisible(true);
                  again.setVisible(true);
                  timer6.cancel();
                  break;
               }
              }
            }
        }
        
        for(int q=-15;q<15;q++){
           if(catLocationX==(obstacle7.getLocation().x)+q){
              for(int w=-15;w<15;w++){
                  if (catLocationY==(obstacle7.getLocation().y)+w){
                  jLabel14.setVisible(true);
                  again.setVisible(true);
                  timer6.cancel();
                  break;
               }
              }
            }
        }
        
        for(int q=-15;q<15;q++){
           if(catLocationX==(obstacle8.getLocation().x)+q){
              for(int w=-15;w<15;w++){
                  if (catLocationY==(obstacle8.getLocation().y)+w){
                  jLabel14.setVisible(true);
                  again.setVisible(true);
                  timer6.cancel();
                  break;
               }
              }
            }
        }
        
        for(int q=-15;q<15;q++){
           if(catLocationX==(obstacle9.getLocation().x)+q){
              for(int w=-15;w<15;w++){
                  if (catLocationY==(obstacle9.getLocation().y)+w){
                  jLabel14.setVisible(true);
                  again.setVisible(true);
                  timer6.cancel();
                  break;
               }
              }
            }
        }
        
        for(int q=-15;q<15;q++){
           if(catLocationX==(obstacle10.getLocation().x)+q){
              for(int w=-15;w<15;w++){
                  if (catLocationY==(obstacle10.getLocation().y)+w){
                  jLabel14.setVisible(true);
                  again.setVisible(true);
                  timer6.cancel();
                  break;
               }
              }
            }
        }
        
        for(int q=-15;q<15;q++){
           if(catLocationX==(obstacle11.getLocation().x)+q){
              for(int w=-15;w<15;w++){
                  if (catLocationY==(obstacle11.getLocation().y)+w){
                  jLabel14.setVisible(true);
                  again.setVisible(true);
                  timer6.cancel();
                  break;
               }
              }
            }
        }
        
        for(int q=-15;q<15;q++){
           if(catLocationX==(obstacle12.getLocation().x)+q){
              for(int w=-15;w<15;w++){
                  if (catLocationY==(obstacle12.getLocation().y)+w){
                  jLabel14.setVisible(true);
                  again.setVisible(true);
                  timer6.cancel();
                  break;
               }
              }
            }
        }
        
        for(int q=-15;q<15;q++){
           if(catLocationX==(obstacle13.getLocation().x)+q){
              for(int w=-15;w<15;w++){
                  if (catLocationY==(obstacle13.getLocation().y)+w){
                  jLabel14.setVisible(true);
                  again.setVisible(true);
                  timer6.cancel();
                  break;
               }
              }
            }
        }
        
        for(int q=-15;q<15;q++){
           if(catLocationX==(obstacle14.getLocation().x)+q){
              for(int w=-15;w<15;w++){
                  if (catLocationY==(obstacle14.getLocation().y)+w){
                  jLabel14.setVisible(true);
                  again.setVisible(true);
                  timer6.cancel();
                  break;
               }
              }
            }
        }
        
        for(int q=-15;q<15;q++){
           if(catLocationX==(obstacle15.getLocation().x)+q){
              for(int w=-15;w<15;w++){
                  if (catLocationY==(obstacle15.getLocation().y)+w){
                  jLabel14.setVisible(true);
                  again.setVisible(true);
                  timer6.cancel();
                  break;
               }
              }
            }
        }
        
        for(int q=-15;q<15;q++){
           if(catLocationX==(obstacle16.getLocation().x)+q){
              for(int w=-15;w<15;w++){
                  if (catLocationY==(obstacle16.getLocation().y)+w){
                  jLabel14.setVisible(true);
                  again.setVisible(true);
                  timer6.cancel();
                  break;
               }
              }
            }
        }
        
        //Checks if cat is near mouse (x)
        for(int i=mouseLocationX-20;i<mouseLocationX+20;i++){
        if(i==catLocationX){
        matchX=true;
        break;
        }else{
        matchX=false;
        }
        }
        
        //Checks if cat is near mouse (y)
        for(int i=mouseLocationY-20;i<mouseLocationY+20;i++){
        if(i==catLocationY){
        matchY=true;
        break;
        }else{
        matchY=false;
        }
        }
        
        //Compares the two
        if((matchX==true)&&(matchY==true)){
            System.out.println("Victory");
            timer6.cancel();
            upgrade=false;
            seventhLife();
        }
        }        
        };
        timer6.scheduleAtFixedRate(task6,1000,12);//1000ms =1sec
      
        
        
    }
    
    public static void seventhLife(){
    
    jLabel13.setText("Level 7");
        
        
         //make a random location for the mice and obstacles
     Random dice7=new Random();
     
     obstacle1.setLocation(dice7.nextInt(460),dice7.nextInt(460));
     obstacle1.setVisible(true);
     obstacle2.setLocation(dice7.nextInt(460),dice7.nextInt(460));
     obstacle2.setVisible(true);
     obstacle3.setLocation(dice7.nextInt(460),dice7.nextInt(460));
     obstacle3.setVisible(true);
     obstacle4.setLocation(dice7.nextInt(460),dice7.nextInt(460));
     obstacle4.setVisible(true);
     obstacle5.setLocation(dice7.nextInt(460),dice7.nextInt(460));
     obstacle5.setVisible(true);
     obstacle6.setLocation(dice7.nextInt(460),dice7.nextInt(460));
     obstacle6.setVisible(true);
     obstacle7.setLocation(dice7.nextInt(460),dice7.nextInt(460));
     obstacle7.setVisible(true);
     obstacle8.setLocation(dice7.nextInt(460),dice7.nextInt(460));
     obstacle8.setVisible(true);
     obstacle9.setLocation(dice7.nextInt(460),dice7.nextInt(460));
     obstacle9.setVisible(true);
     obstacle10.setLocation(dice7.nextInt(460),dice7.nextInt(460));
     obstacle10.setVisible(true);
     obstacle11.setLocation(dice7.nextInt(460),dice7.nextInt(460));
     obstacle11.setVisible(true);
     obstacle12.setLocation(dice7.nextInt(460),dice7.nextInt(460));
     obstacle12.setVisible(true);
     obstacle13.setLocation(dice7.nextInt(460),dice7.nextInt(460));
     obstacle13.setVisible(true);
     obstacle14.setLocation(dice7.nextInt(460),dice7.nextInt(460));
     obstacle14.setVisible(true);
     obstacle15.setLocation(dice7.nextInt(460),dice7.nextInt(460));
     obstacle15.setVisible(true);
     obstacle16.setLocation(dice7.nextInt(460),dice7.nextInt(460));
     obstacle16.setVisible(true);
     
     upgrade1.setLocation(dice7.nextInt(460),dice7.nextInt(460));
     upgrade1.setVisible(true);
     upgrade2.setLocation(dice7.nextInt(460),dice7.nextInt(460));
     upgrade2.setVisible(true);
     upgrade3.setLocation(dice7.nextInt(460),dice7.nextInt(460));
     upgrade3.setVisible(true);
     upgrade4.setLocation(dice7.nextInt(460),dice7.nextInt(460));
     upgrade4.setVisible(true);
     
     int newLocationX=dice7.nextInt(500);
     int newLocationY=dice7.nextInt(500);
     mouse.setLocation(newLocationX,newLocationY);
     
        Timer timer7=new Timer();
        TimerTask task7=new TimerTask(){
        public void run(){
            
        getUpgrade();    
            
        if(newLocationX<250){
        mouseLocationX=(mouse.getLocation().x)+1;
        }else{
        mouseLocationX=(mouse.getLocation().x)-1;    
        }
        if(newLocationY<250){
        mouseLocationY=(mouse.getLocation().y)+1;
        }else{
        mouseLocationY=(mouse.getLocation().y)-1;   
        }
        
        gameOver();
        
        mouse.setLocation(mouseLocationX,mouseLocationY);
        catLocationX=cat.getLocation().x;
        catLocationY=cat.getLocation().y;
        
        //checks if cat is near upgrade
        for(int y=-15;y<15;y++){
           if(catLocationX==(upgrade1.getLocation().x)+y){
              for(int o=-15;o<15;o++){
                  if (catLocationY==(upgrade1.getLocation().y)+o){
                  System.out.println("Upgraded");
                  upgrade=true;
                  upgrade1.setVisible(false);
                  break;
               }
              }
            }
        }
        
        //checks if cat is near upgrade
        for(int y=-15;y<15;y++){
           if(catLocationX==(upgrade2.getLocation().x)+y){
              for(int o=-15;o<15;o++){
                  if (catLocationY==(upgrade2.getLocation().y)+o){
                  System.out.println("Upgraded");
                  upgrade=true;
                  upgrade2.setVisible(false);
                  break;
               }
              }
            }
        }
        
        //checks if cat is near upgrade
        for(int y=-15;y<15;y++){
           if(catLocationX==(upgrade3.getLocation().x)+y){
              for(int o=-15;o<15;o++){
                  if (catLocationY==(upgrade3.getLocation().y)+o){
                  System.out.println("Upgraded");
                  upgrade=true;
                  upgrade3.setVisible(false);
                  break;
               }
              }
            }
        }
        
        //checks if cat is near upgrade
        for(int y=-15;y<15;y++){
           if(catLocationX==(upgrade4.getLocation().x)+y){
              for(int o=-15;o<15;o++){
                  if (catLocationY==(upgrade4.getLocation().y)+o){
                  System.out.println("Upgraded");
                  upgrade=true;
                  upgrade4.setVisible(false);
                  break;
               }
              }
            }
        }
        
        for(int q=-15;q<15;q++){
           if(catLocationX==(obstacle1.getLocation().x)+q){
              for(int w=-15;w<15;w++){
                  if (catLocationY==(obstacle1.getLocation().y)+w){
                  jLabel14.setVisible(true);
                  again.setVisible(true);
                  timer7.cancel();
                  break;
               }
              }
            }
        }
        
        for(int q=-15;q<15;q++){
           if(catLocationX==(obstacle2.getLocation().x)+q){
              for(int w=-15;w<15;w++){
                  if (catLocationY==(obstacle2.getLocation().y)+w){
                  jLabel14.setVisible(true);
                  again.setVisible(true);
                  timer7.cancel();
                  break;
               }
              }
            }
        }
        
        for(int q=-15;q<15;q++){
           if(catLocationX==(obstacle3.getLocation().x)+q){
              for(int w=-15;w<15;w++){
                  if (catLocationY==(obstacle3.getLocation().y)+w){
                  jLabel14.setVisible(true);
                  again.setVisible(true);
                  timer7.cancel();
                  break;
               }
              }
            }
        }
        
        for(int q=-15;q<15;q++){
           if(catLocationX==(obstacle4.getLocation().x)+q){
              for(int w=-15;w<15;w++){
                  if (catLocationY==(obstacle4.getLocation().y)+w){
                  jLabel14.setVisible(true);
                  again.setVisible(true);
                  timer7.cancel();
                  break;
               }
              }
            }
        }
        
        for(int q=-15;q<15;q++){
           if(catLocationX==(obstacle5.getLocation().x)+q){
              for(int w=-15;w<15;w++){
                  if (catLocationY==(obstacle5.getLocation().y)+w){
                  jLabel14.setVisible(true);
                  again.setVisible(true);
                  timer7.cancel();
                  break;
               }
              }
            }
        }
        
        for(int q=-15;q<15;q++){
           if(catLocationX==(obstacle6.getLocation().x)+q){
              for(int w=-15;w<15;w++){
                  if (catLocationY==(obstacle6.getLocation().y)+w){
                  jLabel14.setVisible(true);
                  again.setVisible(true);
                  timer7.cancel();
                  break;
               }
              }
            }
        }
        
        for(int q=-15;q<15;q++){
           if(catLocationX==(obstacle7.getLocation().x)+q){
              for(int w=-15;w<15;w++){
                  if (catLocationY==(obstacle7.getLocation().y)+w){
                  jLabel14.setVisible(true);
                  again.setVisible(true);
                  timer7.cancel();
                  break;
               }
              }
            }
        }
        
        for(int q=-15;q<15;q++){
           if(catLocationX==(obstacle8.getLocation().x)+q){
              for(int w=-15;w<15;w++){
                  if (catLocationY==(obstacle8.getLocation().y)+w){
                  jLabel14.setVisible(true);
                  again.setVisible(true);
                  timer7.cancel();
                  break;
               }
              }
            }
        }
        
        for(int q=-15;q<15;q++){
           if(catLocationX==(obstacle9.getLocation().x)+q){
              for(int w=-15;w<15;w++){
                  if (catLocationY==(obstacle9.getLocation().y)+w){
                  jLabel14.setVisible(true);
                  again.setVisible(true);
                  timer7.cancel();
                  break;
               }
              }
            }
        }
        
        for(int q=-15;q<15;q++){
           if(catLocationX==(obstacle10.getLocation().x)+q){
              for(int w=-15;w<15;w++){
                  if (catLocationY==(obstacle10.getLocation().y)+w){
                  jLabel14.setVisible(true);
                  again.setVisible(true);
                  timer7.cancel();
                  break;
               }
              }
            }
        }
        
        for(int q=-15;q<15;q++){
           if(catLocationX==(obstacle11.getLocation().x)+q){
              for(int w=-15;w<15;w++){
                  if (catLocationY==(obstacle11.getLocation().y)+w){
                  jLabel14.setVisible(true);
                  again.setVisible(true);
                  timer7.cancel();
                  break;
               }
              }
            }
        }
        
        for(int q=-15;q<15;q++){
           if(catLocationX==(obstacle12.getLocation().x)+q){
              for(int w=-15;w<15;w++){
                  if (catLocationY==(obstacle12.getLocation().y)+w){
                  jLabel14.setVisible(true);
                  again.setVisible(true);
                  timer7.cancel();
                  break;
               }
              }
            }
        }
        
        for(int q=-15;q<15;q++){
           if(catLocationX==(obstacle13.getLocation().x)+q){
              for(int w=-15;w<15;w++){
                  if (catLocationY==(obstacle13.getLocation().y)+w){
                  jLabel14.setVisible(true);
                  again.setVisible(true);
                  timer7.cancel();
                  break;
               }
              }
            }
        }
        
        for(int q=-15;q<15;q++){
           if(catLocationX==(obstacle14.getLocation().x)+q){
              for(int w=-15;w<15;w++){
                  if (catLocationY==(obstacle14.getLocation().y)+w){
                  jLabel14.setVisible(true);
                  again.setVisible(true);
                  timer7.cancel();
                  break;
               }
              }
            }
        }
        
        for(int q=-15;q<15;q++){
           if(catLocationX==(obstacle15.getLocation().x)+q){
              for(int w=-15;w<15;w++){
                  if (catLocationY==(obstacle15.getLocation().y)+w){
                  jLabel14.setVisible(true);
                  again.setVisible(true);
                  timer7.cancel();
                  break;
               }
              }
            }
        }
        
        for(int q=-15;q<15;q++){
           if(catLocationX==(obstacle16.getLocation().x)+q){
              for(int w=-15;w<15;w++){
                  if (catLocationY==(obstacle16.getLocation().y)+w){
                  jLabel14.setVisible(true);
                  again.setVisible(true);
                  timer7.cancel();
                  break;
               }
              }
            }
        }
        
        //Checks if cat is near mouse (x)
        for(int i=mouseLocationX-20;i<mouseLocationX+20;i++){
        if(i==catLocationX){
        matchX=true;
        break;
        }else{
        matchX=false;
        }
        }
        
        //Checks if cat is near mouse (y)
        for(int i=mouseLocationY-20;i<mouseLocationY+20;i++){
        if(i==catLocationY){
        matchY=true;
        break;
        }else{
        matchY=false;
        }
        }
        
        //Compares the two
        if((matchX==true)&&(matchY==true)){
            jLabel14.setText("Victory");
            jLabel14.setVisible(true);
            timer7.cancel();
            upgrade=false;
            again.setVisible(true);
        }
        }        
        };
        timer7.scheduleAtFixedRate(task7,1000,10);//1000ms =1sec
      
        
        
        
        
    }
    
    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CatMouse().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private static javax.swing.JButton again;
    private static javax.swing.JLabel cat;
    private static javax.swing.JLabel jLabel1;
    private static javax.swing.JLabel jLabel10;
    private static javax.swing.JLabel jLabel11;
    private static javax.swing.JLabel jLabel12;
    private static javax.swing.JLabel jLabel13;
    private static javax.swing.JLabel jLabel14;
    private static javax.swing.JLabel jLabel15;
    private static javax.swing.JLabel jLabel16;
    private static javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private static javax.swing.JLabel jLabel4;
    private static javax.swing.JLabel jLabel5;
    private static javax.swing.JLabel jLabel6;
    private static javax.swing.JLabel jLabel7;
    private static javax.swing.JLabel jLabel8;
    private static javax.swing.JLabel jLabel9;
    private static javax.swing.JLabel mouse;
    private static javax.swing.JLabel obstacle1;
    private static javax.swing.JLabel obstacle10;
    private static javax.swing.JLabel obstacle11;
    private static javax.swing.JLabel obstacle12;
    private static javax.swing.JLabel obstacle13;
    private static javax.swing.JLabel obstacle14;
    private static javax.swing.JLabel obstacle15;
    private static javax.swing.JLabel obstacle16;
    private static javax.swing.JLabel obstacle2;
    private static javax.swing.JLabel obstacle3;
    private static javax.swing.JLabel obstacle4;
    private static javax.swing.JLabel obstacle5;
    private static javax.swing.JLabel obstacle6;
    private static javax.swing.JLabel obstacle7;
    private static javax.swing.JLabel obstacle8;
    private static javax.swing.JLabel obstacle9;
    private static javax.swing.JLabel upgrade1;
    private static javax.swing.JLabel upgrade2;
    private static javax.swing.JLabel upgrade3;
    private static javax.swing.JLabel upgrade4;
    // End of variables declaration//GEN-END:variables

    @Override
    public void keyTyped(KeyEvent ke) {
        
    }

    @Override
    public  void keyPressed(KeyEvent ke) {
    int keyCode=ke.getKeyCode();
    
    if (keyCode==KeyEvent.VK_D) cat.setLocation(cat.getLocation().x+addLocation,cat.getLocation().y);
    if (keyCode==KeyEvent.VK_A) cat.setLocation(cat.getLocation().x-addLocation,cat.getLocation().y);
    if (keyCode==KeyEvent.VK_W) cat.setLocation(cat.getLocation().x,cat.getLocation().y-addLocation);
    if (keyCode==KeyEvent.VK_S) cat.setLocation(cat.getLocation().x,cat.getLocation().y+addLocation);
    if ((keyCode==KeyEvent.VK_W) && (keyCode==KeyEvent.VK_D)) cat.setLocation(cat.getLocation().x+addLocation,cat.getLocation().y-addLocation);
    if ((keyCode==KeyEvent.VK_W) && (keyCode==KeyEvent.VK_A)) cat.setLocation(cat.getLocation().x-addLocation,cat.getLocation().y-addLocation);
    if ((keyCode==KeyEvent.VK_S) && (keyCode==KeyEvent.VK_A)) cat.setLocation(cat.getLocation().x-addLocation,cat.getLocation().y+addLocation);
    if ((keyCode==KeyEvent.VK_S) && (keyCode==KeyEvent.VK_D)) cat.setLocation(cat.getLocation().x+addLocation,cat.getLocation().y+addLocation);
    }

    @Override
    public void keyReleased(KeyEvent ke) {
        
    }
}
