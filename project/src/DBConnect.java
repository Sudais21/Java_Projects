
import com.mysql.jdbc.Connection;
import java.sql.DriverManager;

class DBConnect {
    public static Connection connect(){
        Connection con=null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/school?","root","");
            System.out.println("Connect success");
        }catch(Exception e){
            System.out.println("inter.DBConnect.connect()");
            
        }
        return con;
    }
}
