package oop11hmtsk4;

import java.io.IOException;

public class OOP11HMTSK4 {

    public static void main(String[] args) throws IOException {
  Thread sct80=new Thread(new Socket80());
  Thread sct9001=new Thread(new Socket9001());
  sct80.start();
  sct9001.start();
    }
}
