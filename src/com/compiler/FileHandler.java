package com.compiler;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileHandler {
    private String filePath;
    private String outputFileName = "output/output.ino";
    public FileHandler(String path) {
        filePath = path;
    }

    public String getFileContent() throws IOException {
        return Files.readString(Paths.get(filePath));
    }

    public void makeFileFromStr(String str) throws IOException {
        File myObj = new File(outputFileName);
        if (myObj.exists()) {
            myObj.createNewFile();
        }
        FileWriter writer = new FileWriter(outputFileName);
        writer.write(str);
        writer.close();
        System.out.println("Successfully compiled to " + outputFileName);
    }
}
