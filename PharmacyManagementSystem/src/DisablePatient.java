// For Disable Person Who Comes to the pharmacy
import static java.lang.System.exit;
import java.util.Scanner;
public class DisablePatient {
    int top=0;
    int max=10; 
    String arr[]=new String[max];
      public void insert(String val){
            if(isFull()){
                System.out.println("Pharmacy is Full for disabled seats");
            }
             arr[top++]=val;
        }
      public boolean isFull(){
          if(top==max){
              return true;
          }
              return false;
      }
      public String pop(){
          if(isEmpty()){
              System.out.println("Pharmacy seats is Empty for disabled person ");
          }
      
          return arr[--top ];
      }
      public boolean isEmpty(){
          if(top==0){
              return true;
          }
          return false;
      }
      public void show(){
          for(int i=0;i<top;i++){
              System.out.println(arr[i]);
          }
      }
    public static void main(String[] args) {
        DisablePatient c=new DisablePatient();
        
        c.insert("Ali");
        c.insert("Hassan");
        c.insert("Ayesha");
        c.insert("Alia");
   // Here disbled person will manage first and then the others 
        Scanner sc=new Scanner(System.in);
        System.out.println("**********MAIN MENU**********");
        System.out.println("Press 1 to show the names of disabled Person:");
        System.out.println("Press 2 to Pop the disabled person from the pharmacy:");
        System.out.println("Press 3 to exit");
        while(sc.hasNext()){
        int num=sc.nextInt();
        switch(num){
            case 1:
                System.out.println("List of Disabled Person:");
                c.show();
                break;
            case 2:
                System.out.println( c.pop()+(" is pop from the pharmacy "));
                c.show();
                break;
            case 3:
                exit(0);
            default:
                System.out.println("Invalid user input");
        }
    }
    }
}

