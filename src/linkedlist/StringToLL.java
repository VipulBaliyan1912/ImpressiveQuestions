package linkedlist;
import java.sql.SQLOutput;
import java.util.Scanner;
public class StringToLL {
    static class Node{
        char data;
        Node next;
    }
    static Node add(char ch){
        Node newNode=new Node();
        newNode.data=ch;
        newNode.next=null;
        return newNode;
    }
    static Node stringtoLL(String str,Node head){
        head=add(str.charAt(0));
        Node curr=head;
        for(int i=1;i<str.length();i++){
            curr.next=add(str.charAt(i));
            curr=curr.next;
        }
        return head;
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String str=sc.next();
        Node head=null;
        head=stringtoLL(str,head);
        Node p=head;
        while(p!=null){
            System.out.print(p.data+"->");
            p=p.next;
        }
    }
}
