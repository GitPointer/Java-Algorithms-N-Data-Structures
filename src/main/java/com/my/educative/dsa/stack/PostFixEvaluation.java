package com.my.educative.dsa.stack;
import java.util.Stack;

public class PostFixEvaluation {
    public static void main(String[] args) {
        PostFixEvaluation postFixEvaluation = new PostFixEvaluation();
        String exp = "921*-8-4+";
        System.out.println("postfix evaluation: "+ postFixEvaluation.evaluatePostfix(exp));
    }
    
     private int evaluatePostfix(String exp) {
         Stack<Integer> stack = new Stack<>();
         char[] chars = exp.toCharArray();
         for(int i = 0; i< chars.length; i++) {
            if (isOperator(chars[i])) {
              int secondOpd = stack.pop(); 
              int firstOpd = stack.pop(); 
              stack.push(evaluateExpression(firstOpd, secondOpd, chars[i]));           
            } else {
                stack.push(Character.getNumericValue(chars[i]));
            }
         }

         return stack.pop();  
     }


     //Helper Function
     public Boolean isOperator(char c) {
        return c == '+' || c == '-' || c == '*' || c == '/';
     }

     public int evaluateExpression(int opd1, int opd2, char operator) {
       switch (operator) {
        case '+' :
          return (opd1 + opd2);

        case '-':
         return (opd1 - opd2);    

        case '*':
         return (opd1 * opd2);

        case '/':
         return (opd1/opd2); 
       }
        return 1;
     }
   
     
}
