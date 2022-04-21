package com.compiler;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileHandler {
    private String FilePath;
    public FileHandler(String path) {
        FilePath = path;
    }

    public String getFileContent() {
        try {
            File myObj = new File(FilePath);
            Scanner myReader = new Scanner(myObj);
            String data = "";
            while (myReader.hasNextLine()) {
                data += myReader.nextLine() + '\n';
            }
            myReader.close();
            return data;
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        return null;
    }
}
