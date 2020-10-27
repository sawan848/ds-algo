package StackImplement;

import java.util.Stack;

/*
 * @author:Saawan
 * @created:[10/17/2020],Saturday
 * Time:9:03 PM
 */
public class PostfixToEval {

    public static int evalPostfix(String express){
        Stack<Integer>st=new Stack<>();
        for (int i = 0; i < express.length(); i++) {
            char ch=express.charAt(i);
            if (Character.isDigit(ch))
                st.push(ch-' ');
            else {
                int value=st.pop();
                int value2=st.pop();
                switch (ch){
                    case '+':
                        st.push(value+value2);
                        break;
                    case '-':
                        st.push(value2-value);
                        break;
                    case '*':
                        st.push(value2*value);
                        break;
                    case '/':
                        st.push(value2/value);
                        break;
                }
            }
        }
        return st.pop();
    }

    public static void main(String[] args) {
        String express="432*+13-";
        System.out.println("Postfix evaluaiton the given " +
                "expression comes out to be: "+evalPostfix(express));
    }
}
