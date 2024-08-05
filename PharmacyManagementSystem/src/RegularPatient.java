// here i will use Queue
//The first patient come in the pharmacy will treat first 
import static java.lang.System.exit;
import java.util.Scanner;
public class RegularPatient {
    String queue[]=new String[100];
    int size;
    int front;
    int rear;
    public void enQueue(String data){
       queue[rear]=data;
        rear++;
        size=size+1;
    }
    public void deQueue(){
        String data=queue[front];
        front++;
        size--;
        System.out.println(data+" is pop from Pharmacy");
    }
    public void display(){
        for(int i=0;i<size;i++){
            System.out.println(queue[i]+"");
        }
    }
        
    public static void main(String[] args) {
        RegularPatient rp=new RegularPatient();
        rp.enQueue("WAQAR");
        rp.enQueue("ALI");
        rp.enQueue("ASIF");
        rp.enQueue("NEELUM");
        rp.enQueue("MEHWISH");
        rp.enQueue("ZAINUB");
        
        Scanner sc=new Scanner(System.in);
        System.out.println("**********MAIN MENU**********");
        System.out.println("Press 1 to show the Patient");
        System.out.println("Press 2 to pop the patient");
        System.out.println("Press 3 to exit");
        while(sc.hasNext()){
        int num=sc.nextInt();
        switch(num){
            case 1:
                System.out.println("List of Patients:");
                rp.display();
                break;
            case 2:
                rp.deQueue();
                break;    
            case 3:
                exit(0);
            default:
                System.out.println("Invalid user input");
        }
    }
    }
}
