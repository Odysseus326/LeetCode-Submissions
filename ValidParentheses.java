class Solution {
    public boolean isValid(String s) {
        Stack brackets = new Stack();

        for(char c : s.toCharArray()) {
            if(c == '(')
                brackets.push(')');
            else if(c == '[')
                brackets.push(']');
            else if(c == '{')
                brackets.push('}');
            else if(brackets.isEmpty() || brackets.pop() != c)
                return false;
        }
        return brackets.isEmpty();
    }
}

class Stack {
    char[] stack = new char[2];
    int top = 0;

    public void push(char data) {
        if(isFull())
            stack = expand(stack);
        stack[top] = data;
        top++;
    }

    public char pop() {
        top--;
        char data = stack[top];
        return data;
    }

    public char peak() {
        return stack[top - 1];

    }
    public boolean isFull() {
        if(top == stack.length)
            return true;
        return false;
    }

    public boolean isEmpty() {
        if(top == 0)
            return true;
        return false;
    }

    public char[] expand(char[] oldArr) {
        char[] newArr = new char[oldArr.length + 2];

        for(int i = 0; i < oldArr.length; i++)
            newArr[i] = oldArr[i];
        return newArr;
    }

}

public class ValidParentheses
{
    public static void main(String args[])
    {
        String test1 = "((()){}{}[][])"; // valid
        String test2 = "({)}"; // invalid
        String test3 = "((())}"; // invalid
        String test4 = "(})"; // invalid
        String test5 = "({[]})"; // valid
        String test6 = "()()(())"; // valid

        Solution solution = new Solution();
        System.out.println(solution.isValid(test1));
        System.out.println(solution.isValid(test2));
        System.out.println(solution.isValid(test3));
        System.out.println(solution.isValid(test4));
        System.out.println(solution.isValid(test5));
        System.out.println(solution.isValid(test6));

    }
}