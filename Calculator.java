package oop11hmtsk4;

public class Calculator {

    private char charInput;
    private static int temp;
    String line1 = "";
    String line2 = "";
    char mark;

    public Calculator() {
    }

    public void constractTheLine(char charToLine) {
        if (charToLine != '+' && charToLine != '-' && charToLine != '*' && charToLine != '/') {
            if (temp == 0) {
                line1 += charToLine;
            }
            if (temp == 1) {
                line2 += charToLine;
            }
        } else {
            temp++;
            mark = charToLine;
        }
    }

    public int culculateResult() {
        int anAnswer = 0;
//         System.out.println(line1);
        int number1 = Integer.valueOf(line1);
        int number2 = Integer.valueOf(line2);
        if (mark == '+') {
            anAnswer = number1 + number2;
        }
        if (mark == '-') {
            anAnswer = number1 - number2;
        }
        if (mark == '/') {
            anAnswer = number1 / number2;
        }
        if (mark == '*') {
            anAnswer = number1 * number2;
        }
        return anAnswer;
    }

    public char getCharInput() {
        return charInput;
    }

    public void setCharInput(char charInput) {
        this.charInput = charInput;
    }

}
