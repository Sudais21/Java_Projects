
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
public class DBConnection {
    public static void main(String[] args) {
        Connection conn=null;
        try{
     conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/college","root","apple1234");
      PreparedStatement ps= conn.prepareStatement("INSERT INTO `college`.`student`(`StudentName`) VALUES(`ALI`);");
     
           if(conn!=null){
               System.out.println("Connection to database successffuly");
               ps.executeUpdate();
               conn.close();
           }
        }catch(Exception e){
//            System.out.println("Not Connected to Database");
            
        }
    
        
    }
    
}
