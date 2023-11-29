package stack;
import java.util.Stack;

class StackUsingLL {
    Node head=null;
    Node top=null;
   class Node{
        int data;
        Node next;
        Node (int data){
            this.data=data;
        }
    }
    void push(int x){
        Node newNode=new Node(x);
        newNode.next=null;
        Node curr=head;
        if (head == null){
            head=newNode;
            top=newNode;
        }
        else{
            Node p=top;
            p.next=newNode;
            top=newNode;
        }
    }
    int pop(){
       int x= top.data;
       if(top==null){
           System.out.println("Stack is empty.Can't pop element");
       }
       else {
           Node temp=head;
           while(temp.next!=top){
               temp=temp.next;
           }
           temp.next=null;
           top=temp;
       }
        return x;
    }
    void traverse(){
        if(top==null){
            System.out.println("Stack is empty.Can't traverse");
        }
        else {
            Node temp = head;
            while (temp != top) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println(top.data);
        }
    }
    public static void main(String[] args) {
        StackUsingLL stk=new StackUsingLL();
        stk.traverse();
        stk.push(10);
        stk.push(20);
        stk.push(30);
        stk.push(40);
        stk.push(50);
        stk.push(60);
        stk.push(70);
        stk.traverse();
        System.out.println(stk.pop());
        System.out.println(stk.pop());
        System.out.println(stk.pop());
        System.out.println(stk.pop());
        System.out.println(stk.pop());
        System.out.println(stk.pop());
        System.out.println(stk.pop());

        stk.traverse();
    }
}
