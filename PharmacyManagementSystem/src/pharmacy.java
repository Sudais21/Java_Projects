// here i use the circular linked list just to interconnected the pharmacy with each other
import static java.lang.System.exit;
import java.util.Scanner;
public class pharmacy {
  public class Node{  
        String data;  
        Node next;  
        public Node(String data) {  
            this.data = data;  
        }  
    }  
    public Node head = null;  
    public Node tail = null;  
      
    //This function will add the new node at the end of the list.  
    public void add(String data){   
        Node newNode = new Node(data);   
        if(head == null) {  
             //If list is empty, both head and tail would point to new node.  
            head = newNode;  
            tail = newNode;  
            newNode.next = head;  
        }  
        else {  
            //tail will point to new node.  
            tail.next = newNode;  
            //New node will become new tail.  
            tail = newNode;  
            //Since, it is circular linked list tail will point to head.  
            tail.next = head;  
        }  
    } 
      public void search(String element) {  
        Node current = head;  
        int i = 1;  
        boolean flag = false;  
        //Checks whether list is empty  
        if(head == null) {  
            System.out.println("List is empty");  
        }  
        else {  
             do{  
                 //Compares element to be found with each node present in the list  
                if(current.data==element) {  
                    flag = true;  
                    break;  
                }  
                current = current.next;  
                i++;  
            }while(current != head);  
             if(flag)  
   System.out.println("This pharmacy is present  at the position : "+ i + " Pharmacy Name: "+current.data);  
          else  
   System.out.println("This Pharmacy is not present in the list that are interlinked with eachother");  
        }  
    }  
    //Displays all the nodes in the list  
    public void display() {  
        Node current = head;  
        if(head == null) {  
            System.out.println("List is empty");  
        }  
        else {  
            System.out.println("Pharmacies that are interlinked with each other are: ");  
             do{  
                System.out.print(" "+ current.data+"------>");  
                current = current.next;  
            }while(current != head);  
            System.out.println();  
        }  
    }  
      
    public static void main(String[] args) {  
        pharmacy p = new pharmacy();  
        //Adds data to the list  
        p.add("ALSHIFA");  
        p.add("CareFirst");  
        p.add("Medlife");  
        p.add("MedSavvy"); 
        p.add("OptumRx");
        p.add("The Pill Club");
        Scanner sc=new Scanner(System.in);
        System.out.println("*****MAIN MENU*****");
        System.out.println("Press 1 to Show the pharmacy that are interlinked with eachother");
        System.out.println("Press 2 to Search the pharmacy position");
        System.out.println("Press 3 to exit");
        
        while(sc.hasNext()){
        int num=sc.nextInt();
        switch(num){
            case 1:
                p.display();
                break;
            case 2:
                p.search("Medlife");
                break;
            case 3:
                exit(0);
                break;
            default:
                System.out.println("Invalid user Input");
        }
        }
    }  
}  
    

