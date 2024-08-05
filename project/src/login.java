import com.mysql.jdbc.Connection;
import java.sql.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;
public class login extends JFrame  {

    public login()   { 

            // For Jframe
            JFrame frame=new JFrame("Login");
            
            // For Label
            JLabel label=new JLabel("Login Form ".toUpperCase());
            label.setBounds(165, 30, 200, 30);
            label.setForeground(Color.black);
            label.setBackground(Color.white);
            label.setFont(new Font("Verdana",Font.BOLD,18));
            
            // label for textField
            JLabel label2=new JLabel("Username");
            label2.setBounds(60, 95, 200, 30);
            label2.setForeground(Color.darkGray);
            label2.setBackground(Color.white);
            label2.setFont(new Font("Verdana",Font.BOLD,15));
            
            // label for passwordField
            JLabel label3=new JLabel("Password");
            label3.setBounds(60, 175, 200, 30);
            label3.setForeground(Color.DARK_GRAY);
            label3.setBackground(Color.white);
            label3.setFont(new Font("Verdana",Font.BOLD,15));
            
            // For TextField
            JTextField textField=new JTextField(20);
            textField.setBounds(195, 100, 200, 27);
            textField.setFont(new Font("Verdana",Font.BOLD,13));
            
            // For PasswordField
            JPasswordField passwordField=new JPasswordField(20);
            passwordField.setBounds(195, 175, 200, 27);
            
            // For Button
            JButton button1=new JButton("Sign In");
            button1.setBounds(195,240 , 80, 30);
            button1.setForeground(Color.black);
            button1.setBackground(Color.green);
            button1.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent ae) {
                    String name=textField.getText();
                    String password=passwordField.getText();
                    if("king".equals(name) && "123".equals(password) ){ 
                        JOptionPane.showMessageDialog(null,"Login Successfully!");
                    }
                    else{
                        JOptionPane.showMessageDialog(null,"Incorrect Userinput!");
                    }
                }
            });
            JButton button2=new JButton("Exit");
            button2.setBounds(315, 240, 80, 30);
            button2.setForeground(Color.white);
            button2.setBackground(Color.red);
            button2.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent ae) {
                    System.exit(0);
                }
            });
            // getContent pane
             JLabel emptyLabel = new JLabel("");
            emptyLabel.setPreferredSize(new Dimension(175, 100));
            frame.getContentPane().setBackground(Color.pink);
            
            // Frame size
            frame.setSize(450, 450);
            frame.setLocation(400, 100);
            frame.setResizable(false);
            frame.setLayout(null);
            frame.setVisible(true);
            
            
            // Frame Adding
            frame.add(label);
            frame.add(textField);
            frame.add(passwordField);
            frame.add(label2);
            frame.add(label3);
            frame.add(button1);
            frame.add(button2);
           
 
    }
         
    public static void main(String[] args)  {
      //login l=new login();
      Connection conn=null;
      conn=DBConnect.connect();
      ResultSet resultSet = null;
      try{
             // the mysql insert statement
   String query = " insert into student (name, id)" + " values (?, ?)";
  PreparedStatement preparedStmt = conn.prepareStatement(query);
  Scanner sc=new Scanner(System.in);
          System.out.println("Enter user id");
  int a=sc.nextInt();
  sc.nextLine();
          System.out.println("ENter user name");
  String b =sc.nextLine();
  
 preparedStmt.setString (1,b );
   preparedStmt.setInt(2, a);
   preparedStmt.execute();

      query = "select * from school.student";
      preparedStmt = conn.prepareStatement(query);
      resultSet = preparedStmt.executeQuery();
       while (resultSet.next()) {
      String name = resultSet.getString("name");
      int id = resultSet.getInt("id");
      System.out.println("ID: " + id);
      System.out.println("Name: " + name);
       }
          System.out.println("Data insert successfully");
      }catch(Exception e){
          System.out.println(e);
      }
      
      
    }
}
