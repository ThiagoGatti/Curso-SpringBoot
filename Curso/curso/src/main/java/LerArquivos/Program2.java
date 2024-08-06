package LerArquivos;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Program2 {

    String path = "C:\\Windows\\Temp\\in.txt";
    FileReader fr = null;
    BufferedReader br = null;


    try
    {
        try {
            fr = new FileReader(path);
        } catch (FileNotFoundException ex) {
            throw new RuntimeException(ex);
        }
        br = new BufferedReader(fr);
        String line = null;
        try {
            line = br.readLine();
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }

        while (line != null) {
            System.out.println(line);
            line = br.readLine();
        }
    }
    catch(IOException e){
        System.out.println("Error: " + e.getMessage());
    }
    finally
    {
        try {
            if (br != null) {
                br.close();
            }
            if (fr != null) {
                fr.close();
            }
        } catch(IOException e) {

            e.printStackTrace();
        }
    }
}

