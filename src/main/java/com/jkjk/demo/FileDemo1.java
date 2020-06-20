package com.jkjk.demo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileDemo1 {
    public static void main(String[] args) {
        try {
            FileReader fileReader = new FileReader(new File("I:\\aa.txt"));
            int lenght = 0;
            while ((lenght = fileReader.read()) != -1){
                System.out.print((char)lenght);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
