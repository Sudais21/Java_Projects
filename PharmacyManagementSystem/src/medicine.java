import static java.lang.System.exit;
 import java.util.Scanner;
class Node{
    String data;
    Node next;
}
public class medicine {
    Node head;
// insertion
public void insert(String data){
    Node node=new Node();
    node.data=data;
    node.next=null;
    if(head==null){
        head=node;
    }
    else{
        Node n=head;
        while(n.next!=null){
            n=n.next;
        }
        n.next=node;
    }
}
// Deletion
public void deleteAt(int index){
    if(index==0){
        head=head.next;
    }else{
        Node n=head;
        Node n1=null;
        for(int i=0;i<index-1;i++){
            n=n.next;
        }
            n1=n.next;
            n.next=n1.next;
            System.out.println("Deleted This Medicine From Pharmacy--->"+n1.data);
    }       
}
public void show(){
    Node node=head;
    while(node.next!=null){
        System.out.println(node.data);
        node=node.next;
    }
    System.out.println(node.data);
}
    public static void main(String[] args) {
         medicine m = new medicine();
         // Insertion here
            m.insert("Panadol 500mg");
            m.insert("Extor 80mg");
            m.insert("Risek 20mg");
            m.insert("Sitaglu Met 50mg");
            m.insert("Lipirex 10mg");
            m.insert("Getryl 2mg"); 
            m.insert("Loprin 75m");
       
        Scanner sc=new Scanner(System.in);
        System.out.println("**********MAIN MENU**********");
        System.out.println("Press 1 to Show Medicine In the Pharmacy");
        System.out.println("Press 2 to Delete Medicine from the Pharmacy");
        System.out.println("Press 3 to exit");
       while(sc.hasNext()){
        int num=sc.nextInt();
        
        switch(num){
            case 1: 
                m.show();
                break;
            case 2:
              m.deleteAt(6);
              m.show();
              System.out.println("");   
              break; 
            case 3:
                exit(0);
            default:
                System.out.println("Invalid User Input");
                    
        }   
       }
    }
}
