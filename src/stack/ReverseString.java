package stack;
import java.util.*;
public class ReverseString {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String str=sc.next();
        Stack<Character> stk=new Stack<>();
        for(int i=0;i<str.length();i++){
            stk.push(str.charAt(i));
        }
        StringBuilder reverse=new StringBuilder();
        for(int j=0;j<str.length();j++){
            reverse.append(stk.pop());
        }
        System.out.println(reverse.toString());
    }
}
