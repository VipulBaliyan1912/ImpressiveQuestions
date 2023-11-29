package queue;

import java.sql.SQLOutput;

class QueueUsingLL {
    Node front =null;
    Node rear=null;
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
     void enqueue(int x){
        Node newNode=new Node(x);
        newNode.next=null;
        if (front == null){
            front=newNode;
            rear=newNode;
        }
        else{
            Node p=rear;
            p.next=newNode;
            rear=newNode;
        }
    }
    void dequeue(){

        if (front == null){
            System.out.println("Queue is empty .Can not delete");
        }
        else{
            Node p = front;
            front=p.next;
            p=null;
        }
    }
    void traverse(){
        if(front==null){
            System.out.println("Queue is empty .Can not traverse");
        }
        else {
            Node p=front;
            while(p != null){
                System.out.print(p.data+" ");
                p=p.next;
            }
        }
    }
}
