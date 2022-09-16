package com.gb;

public class InfixPostfixNotation {
    private String infixExp;
    private String postfixExp;
    private int length;
    private float result;

    public InfixPostfixNotation (String string) {
        this.infixExp = string.replaceAll(" ", "");
        this.postfixExp = "";
        this.length = this.infixExp.length();
        this.result = 0.0F;
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
            Float.parseFloat(s);
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
            if(isDigit(Character.toString(symbol)) || Character.isLetter(symbol)) {
                postfixBuilder.append(symbol);
            }
            else if(symbol == '(') {
                stack.push('(');
            }
            else if(symbol == '^') {
                stack.push('^');
                postfixBuilder.append(" ");
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

        String[] array = exp.split(" ");

        Stack<Float> stack = new Stack<>(array.length);

        for(int i = 0; i < array.length; i++) {
            String item = array[i];

            if (isDigit(item)) {
                stack.push(Float.parseFloat(item));
            }
            else {
                switch (item) {
                    case "+":
                        this.result = stack.pop() + stack.pop();
                        stack.push(this.result);
                        break;
                    case "-":
                        this.result = -stack.pop() + stack.pop();
                        stack.push(this.result);
                        break;
                    case "*":
                        this.result = stack.pop() * stack.pop();
                        stack.push(this.result);
                        break;
                    case "/":
                        this.result = (float) Math.pow(stack.pop(), -1) * stack.pop();
                        stack.push(this.result);
                        break;
                    case "^":
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
