package com.gb;

public class InfixPostfixNotation {
    String infixExp;
    String postfixExp;
    int length;
    float result;

    public InfixPostfixNotation (String string) {
        this.infixExp = string.replaceAll(" ", "");
        this.postfixExp = "";
        this.length = this.infixExp.length();
    }

    public String getInfix() {
        return this.infixExp;
    }

    public String getPostfix() {
        return this.postfixExp;
    }

    private int getPrecedence(char ch) {
        if(ch == '+' || ch == '-') {
            return 1;
        }
        else if(ch == '*' || ch == '/') {
            return 2;
        }
        else if(ch == '^') {
            return 3;
        }
        else {
            return 0;
        }
    }

    private static boolean isDigit(String s) throws NumberFormatException {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public String toPostfix(String infix) {
        Stack<Character> stack = new Stack<>(length);
        StringBuilder postfixBuilder = new StringBuilder();

        for(int i = 0; i < this.length; i++) {
            char symbol = infix.charAt(i);
            if(isDigit(Character.toString(symbol))) {
                postfixBuilder.append(symbol);
            }
            else if(symbol == '(') {
                stack.push('(');
            }
            else if(symbol == '^') {
                stack.push('^');
            }
            else if(symbol == ')') {
                while(!stack.isEmpty() && stack.peek() != '(') {
                    postfixBuilder.append(" ").append(stack.peek());
                    stack.pop();
                }
                stack.pop();
            }
            else {
                if(!stack.isEmpty() && getPrecedence(symbol) > stack.peek()) {
                    stack.push(symbol);
                }
                else {
                    while(!stack.isEmpty() && getPrecedence(symbol) <= getPrecedence(stack.peek())) {
                        postfixBuilder.append(" ").append(stack.peek());
                        stack.pop();
                    }
                    postfixBuilder.append(" ");
                    stack.push(symbol);
                }
            }
        }

        while(!stack.isEmpty()) {
            postfixBuilder.append(" ").append(stack.peek());
            stack.pop();
        }

        this.postfixExp = postfixBuilder.toString();

        return this.postfixExp;
    }

    public Float calcExpression(String exp) {
        Stack<Float> stack = new Stack<>(exp.length());

        for(int i = 0; i < exp.length(); i++) {
            char symbol = exp.charAt(i);

            if (isDigit(Character.toString(symbol))) {
                stack.push(Float.parseFloat(Character.toString(symbol)));
            }
            else {
                switch (symbol) {
                    case '+':
                        this.result = stack.pop() + stack.pop();
                        stack.push(this.result);
                        break;
                    case '-':
                        this.result = -stack.pop() + stack.pop();
                        stack.push(this.result);
                        break;
                    case '*':
                        this.result = stack.pop() * stack.pop();
                        stack.push(this.result);
                        break;
                    case '/':
                        float divider = stack.pop();
                        this.result = stack.pop() / divider;
                        stack.push(this.result);
                        break;
                    case '^':
                        float power = stack.pop();
                        this.result = (float) Math.pow(stack.pop(), power);
                        stack.push(this.result);
                        break;
                    default:
                        break;
                }
            }
        }
        this.result = stack.pop();

        return this.result;
    }

}
