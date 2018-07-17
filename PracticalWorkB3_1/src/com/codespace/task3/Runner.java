package com.codespace.task3;

import java.io.*;

public class Runner {
    public void run(/*String[] args*/) {
        copyFiles(new File("C:\\temp\\test.txt"), new File("C:\\temp\\test1.txt"));
        replacementInFile(new File("C:\\temp\\test.txt"));
    }

    private void copyFiles(File oldFile, File newFile) {
        System.out.println("Copying of file...");
        try (InputStream fileInputStream = new FileInputStream(oldFile);
             OutputStream fileOutputStream = new FileOutputStream(newFile)) {
            int value;
            while ((value = fileInputStream.read()) != -1) {
                fileOutputStream.write(value);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Copying ended successfully!");
    }

    private void replacementInFile(File file) {
        System.out.println("Replacement in the file...");
        String name = file.getName();
        if (!name.substring(name.lastIndexOf('.') + 1).equals("txt")){
            System.out.println("Invalid file format");
            return;
        }
            if (!file.exists()) {
                System.out.println("Process ended with mistake - file does not exist!");
                System.exit(-1);
            } else {
                try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
                    StringBuilder old = new StringBuilder();
                    String line = bufferedReader.readLine();
                    while (line != null) {
                        old.append(line).append(System.lineSeparator());
                        line = bufferedReader.readLine();
                    }
                    String newS = old.toString().replaceAll("lol", "private");
                    FileWriter fileWriter = new FileWriter(file);
                    fileWriter.write(newS);
                    fileWriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        System.out.println("Replacement done successfully!");
    }

}
