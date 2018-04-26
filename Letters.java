package oop10hmtsk4;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.StringReader;

public class Letters {

    private String string;
    public Letters() {
    }

    public Letters(String string) {
        this.string = string;
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    public void getCharArray() throws FileNotFoundException, IOException {
        char[] charArray = string.toCharArray();
        printLetters(charArray);
    }

    public void printLetters(char[] charArray) throws FileNotFoundException, IOException {
        String line;
        String line2;
        String fullLine = "";
        for (char c : charArray) {
            BufferedReader reader = new BufferedReader(new FileReader(c + ".txt"));
            BufferedReader reader2=new BufferedReader(new StringReader(fullLine));
            fullLine="";
            while ((line = reader.readLine()) != null) {
                    line2=reader2.readLine();
                    fullLine += line2+line+"\n";
            }
        }
        System.out.println(fullLine);
    }
}
