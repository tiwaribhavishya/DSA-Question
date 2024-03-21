package Stack;

import java.util.Scanner;
import java.util.Stack;
import java.util.*;

public class ValidParentheses {
    public static boolean isValid(String str){
        char arr[] = str.toCharArray();
        Stack<Character> stack1 = new Stack<>();
        // if the element contain open bracket push to the stack
        for(char ele:arr){
            if(ele == '(' || ele=='{'||ele=='['){
                stack1.push(ele);
                continue;
            }
            else if(stack1.empty()){
                return false;
            }
            char top = stack1.pop();
            if(top=='('&&ele!=')'){
                return false;
            }
            else if(top == '{' && ele!='}'){
                return false;
            }
            else if(top=='[' && ele!=']'){
                return false;
            }

        }
        return(stack1.empty()==true);


         
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String str = sc.nextLine();

        System.out.println("is the given string is valid ? "+isValid(str));


    }
}
