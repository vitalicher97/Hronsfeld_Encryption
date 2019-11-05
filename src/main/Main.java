package main;

import encryption.*;
import io.*;

public class Main {

    public static void main(String[] args) {

        Read read = new Read();
        Write write = new Write();
        HronsfeldCode hronsfeldCode = new HronsfeldCode();

        System.out.println("Input file name with text:");
        String fileName = read.readString();
        String text = read.readStringFile(fileName);
        System.out.println("Input key:");
        String key = read.readString();
        System.out.println("'code' or 'decode'?");
        String command = read.readString();

        String result = hronsfeldCode.codeHronsfeld(text, key, command);

        System.out.println(result);
        write.writeToFile("Result.txt", result);






    }
}
