package project_testpkl;

import java.util.Stack;

/*
Soal 3
By: Dian Slamet Saputra | SMKN 4 Bandung
Thanks to: w3schools.com & youtube :)
*/

public class Soal_3 {
    
    public static void main(String args[]) {
        //Input
        System.out.println(balancedParenthensies("{[(1)]}"));
        System.out.println(balancedParenthensies("{[(2])}"));
        System.out.println(balancedParenthensies("{(([])3[])[]}"));
    }

    public static boolean balancedParenthensies(String s) {
        System.out.println("Output: ");
        Stack<Character> stack  = new Stack<>();
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            switch (c) {
                case '[':
                case '(':
                case '{':
                    stack.push(c);
                    break;
                case ']':
                    if(stack.isEmpty() || stack.pop() != '[') {
                        return false;
                    }   break;
                case ')':
                    if(stack.isEmpty() || stack.pop() != '(') {
                        return false;
                    }   break;
                case '}':
                    if(stack.isEmpty() || stack.pop() != '{') {
                        return false;
                    }   break;
                default:
                    break;
            }
        }
        return stack.isEmpty();
    }
}