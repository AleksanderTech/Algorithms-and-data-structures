package com.alek.designpattern.decorator.javaio;

import java.io.*;

public class App {

    public static void main(String[] args) {
        int c;
        try {
            InputStream stream = new LowerCaseInputStream(new BufferedInputStream(new FileInputStream(new File("src/main/java/com/alek/designpattern/decorator/javaio/text.txt"))));

            while ((c = stream.read()) >= 0) {

                System.out.print((char) c);
            }
            stream.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
