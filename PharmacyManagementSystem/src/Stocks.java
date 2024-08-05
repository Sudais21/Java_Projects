//doubly linked list
import static java.lang.System.exit;
import java.util.Scanner;
class Node1{
    String data;
    Node1 next;
    Node1 pre;
    Node1 tail;
}
public class Stocks {
    public Node1 insert(Node1 node,String data){
        if(node==null){
            return getnewnode(data);
        }
        Node1 head=node;
        while(node.next!=null){
            node=node.next;
        }
        Node1 n=getnewnode(data);
        n.pre=node;
        node.next=n;
        return head;
    }
    public Node1 insertatposition(Node1 node,String data,int pos){
        if(node==null){
            if(pos==1){
                return getnewnode(data);
            }else{
                return null;
            }
        }
            if(pos==1){
                Node1 t=getnewnode(data);
                t.next=node;
                node.pre=t;
                return t;
            }
            Node1 head=node;
            while(node!=null && pos>2){
                node=node.next;
                pos--;
            }
            if(node==null){
                System.out.println("Invalid position");
                return head;
            }
            Node1 b=getnewnode(data);
            b.next=node.next;
            b.pre=node;
            if(node.next!=null){
                node.next.pre=b;
            }
            node.next=b;
            return head;
    }       
    public Node1 deleteanyposition(Node1 root,int pos){
        if(root==null){
            return root;
        }
        if(pos==1){
            if(root.next!=null){
                root.next.pre=null;
            }
            return root.next;
        }
        Node1 head=root;
        while(head!=null && pos>1){
            head=head.next;
            pos--;
        }
        if(head==null){
            return null;
        }
        
        if(head.next!=null){
            head.next.pre=head.pre;
        }
        head.pre.next=head.next;
        return root;
    }
    public Node1 getnewnode(String data){
        Node1 m=new Node1();
        m.data=data;
        m.next=null;
        m.pre=null;
        return m;
    }
    public void print(Node1 node){
        if(node==null){
            return;
        }
        System.out.println("Stocks of Pharmacy:");
        while(node!=null){
            System.out.println(node.data);
            node=node.next;
        }
        System.out.println("");
    }
    public void  reversePrint(Node1 node){
        Node1 tail=node;
        while(tail.next!=null){
            tail=tail.next;
        }
        while (tail!=node){
            System.out.println(tail.data+" ");
            tail=tail.pre;
        }
        System.out.println(tail.data);
    }
//    public Node1 Mid(Node1 node){
//        Node1 head=node;
//    }
    
    
//    public void searchNode(String value,Node1 root) {  
//        int i = 1;  
//        boolean flag = false;  
//        //Node current will point to head  
//        Node1 current =root;  
//  
//        //Checks whether the list is empty  
//        if(root == null) {  
//            System.out.println("List is empty");  
//            return;  
//        }  
//        while(current != null) {  
//            //Compare value to be searched with each node in the list  
//            if(current.data == value) {  
//                flag = true;  
//                break;  
//            }  
//            current = current.next;  
//            i++;  
//        }  
//        if(flag)  
//System.out.println("This Stock is present in the pharmacy at the position : " + i+", Stock Name:"+value);  
//        else  
//             System.out.println("This Stock is not present in the pharmacy");  
//    }  

public static void main(String[] args) {
    Stocks s=new Stocks();
    Node1 root=null;
    
  
    // Inserted Stocks in the pharmacy
   
     //root=s.insertatposition(root, "Amerisource", 1);
   // root=s.insert(root, "gsk");
//    root=s.insert(root, "CVS Health");
//    root=s.insert(root, "Pfizer");
      root=s.insert(root, "ZTEG");
//    root=s.insert(root, "AbbVie");
//    root=s.insert(root, "Walgreens");
 //s.print(root); 

//    
//    System.out.println("**********MAIN MENU**********");
//    System.out.println("Press 1 to Show the Stocks in the Pharmacy");
//    System.out.println("Press 2 to Delete the Stocks at any position in the pharmacy");
//    System.out.println("Press 3 to Search the Stocks in the Pharmacy");
//    System.out.println("Press 4 to insert the Stocks at position in the Pharmacy");
//    System.out.println("Press 5 to exit");
//    Scanner sc=new Scanner(System.in);
//    while(sc.hasNext()){

//    int num=sc.nextInt();
//      switch(num){
//          case 1:
//            s.print(root); 
//            break;

//          case 2:
//               root=s.deleteanyposition(root, 1); 
//                 s.print(root);
//                 break;
//          case 3:
//               s.searchNode("Pfizer", root);
//               break;
//          case 4:
//              root=s.insertatposition(root, "Amerisource", 1);
//              s.print(root);
//              break;
//          case 5:
//              exit(0);
//          default:
//              System.out.println("Invalid Input");
//    }
              root=s.insert(root, "GETZ"); 
             s.reversePrint(root);
}
}
//}
   