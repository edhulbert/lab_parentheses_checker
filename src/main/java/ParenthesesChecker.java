import java.util.Stack;

public class ParenthesesChecker {

    public boolean checkParentheses(String string){
        Stack<Character> characterStack = new Stack<>();

        for (int i = 0; i < string.length(); i++) {
            //characterStack.push(string.charAt(i));
            char temp = string.charAt(i);
            if (temp=='('|| temp== '{'|| temp=='[' || temp=='<' ){
                characterStack.push(temp);
            }
            else if (temp == ')'|| temp=='}' || temp==']' || temp == '>'){
                if (characterStack.empty()){
                    return false;
                } else {
                    if ((characterStack.peek() == '(' && temp == ')')|| (characterStack.peek() =='{' && temp == '}')||
                            (characterStack.peek()=='[' && temp==']') || (characterStack.peek() == '<' && temp == '>')){
                        characterStack.pop();
                    }
                }
            }
        // (nested {mixture)}
            // 0 -> (
            // 1 -> {
        }
        if (characterStack.empty()){
            return true;
        } else {
            return false;
        }

    }

    }


