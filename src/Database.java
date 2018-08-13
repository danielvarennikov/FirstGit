import java.sql.*;
import java.util.ArrayList;
public class Database {
  protected Connection con;
  protected static Statement st;
  protected ResultSet rs;
  
  ArrayList<String> dataUsers=new ArrayList<>();
  ArrayList<String> dataPass=new ArrayList<>();
  
  ArrayList<String> highUsersList=new ArrayList<>();
  ArrayList<String> highLevelsList=new ArrayList<>();
  public void connect(){
      try{
      Class.forName("com.mysql.cj.jdbc.Driver");
      con=DriverManager.getConnection("jdbc:mysql://localhost:3306/database?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "root","root");
      st=con.createStatement();
      System.out.println("Connected to database");
  }catch(Exception e){
      System.out.println("Could not connect to database: " +e);
  }
  }
  
  public void readData(){
      try{
          
          String query="SELECT * FROM users1";
          rs=st.executeQuery(query);
          
          while(rs.next()){ 
            
              dataUsers.add(rs.getString("username"));
              dataPass.add(rs.getString("password"));
          }
          
      }catch(Exception e){
          System.out.println("Couldn't read database: "+e);
      }
  }

  public void insertData(String username,String password,int age){
   try{   
  String query="INSERT INTO `users1` (username,password,age,highest_level) VALUES ('"+username+"','"+password+"','"+age+"','0')";
  st.executeUpdate(query);
  System.out.println("Users updated");
   }catch(Exception e){
       System.out.println("Couldn't add data: "+e);
   } 
}
  
  public void addHighscore(String player,int level){
      try{
         
          String query="SELECT highest_level FROM users1 WHERE username='"+player+"'";
          rs=st.executeQuery(query);
          if(rs.next()){
          if(level>Integer.parseInt(rs.getString("highest_level"))){
            String query2="UPDATE users1 SET highest_level='"+level+"' WHERE username='"+player+"'";
            st.executeUpdate(query2);
            System.out.println("Highscore added");
          }
          }
              }catch(Exception e){
                  System.out.println("Couldn't update highscore: "+e);
              }
              
  }
  
  public void countHighscores(){
      try{
          String query="SELECT username, highest_level FROM users1";
          rs=st.executeQuery(query);
         
          while(rs.next()){
              highUsersList.add(rs.getString("username"));
              highLevelsList.add(rs.getString("highest_level"));
          }
          String highUsers[]=new String[highUsersList.size()];
          highUsers=highUsersList.toArray(highUsers);
          
          String highLevels[]=new String[highLevelsList.size()];
          highLevels=highLevelsList.toArray(highLevels);
      }catch(Exception e){
          System.out.println("Couldn't display highscores: "+e);
      }
  }
  
}


