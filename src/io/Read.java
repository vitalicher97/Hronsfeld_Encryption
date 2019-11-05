package io;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Read {

    public String readString(){

        Scanner in = new Scanner(System.in);

        return in.nextLine();

    }

    public String readStringFile(String fileName){

        String data = "";

        try{
            File file = new File(fileName);
            Scanner in = new Scanner(file);
            while(in.hasNextLine()){
                data = in.nextLine();
            }
            in.close();
        } catch (FileNotFoundException e){
            System.out.println("\nio.Read.readStringFile error occurred.");
            e.printStackTrace();
        }

        return data;

    }



}