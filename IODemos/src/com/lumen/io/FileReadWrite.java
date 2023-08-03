package com.lumen.io;

import java.io.FileWriter;
import java.io.IOException;
import java.io.FileReader;

public class FileReadWrite {
	public static void main(String[] args) {
		
		FileReader fileReader=null;

        FileWriter fileWriter=null;

        try {

            fileReader=new FileReader("demo.txt");

            fileWriter= new FileWriter("trial.txt");

            int ch = fileReader.read();

            while (ch!=-1) {

                fileWriter.append((char)ch);

                ch = fileReader.read();

            }

        }

            catch(IOException e) {

                e.printStackTrace();

                

            }finally {

                try {

                    fileReader.close();

                    fileWriter.close();

                    

                }catch (IOException e) {

                    e.printStackTrace();

        

                }

    }

}

    }