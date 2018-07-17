package com.codespace.task2;

import java.io.*;

public class Runner {
    public void run(String[] args){
        if (args.length == 0) {
            System.out.println("No file");
            System.exit(-1);
        }
        File file = new File(args[0]);
        if (!file.isFile()) {
            System.out.println("Not a file");
            System.exit(666);
        }

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String string;
            while ((string = br.readLine()) != null) {
                System.out.println(string);
            }
        } catch (IOException e) {

        }
    }
}

//public class Runner {
//    public void run(String[] args) {
//        long start = new Date().getTime();
//        try (InputStream inputStreamReader = new FileInputStream(args[0]);
//             OutputStream outputStream = new ByteArrayOutputStream()) {
//            byte[] buffer = new byte[4096];
//            int read;
//            while ((read = inputStreamReader.read(buffer)) != -1) {
//                outputStream.write(buffer, 0, read);
//            }
//            System.out.println(outputStream.toString());
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        System.out.println(new Date().getTime() - start);
//    }
//}




//public class Runner {
//    public void run() throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        FileReader fin = new FileReader("C:\\temp\\test.txt");
//        String name;
//        int c;
//        System.out.println("Print File Files.txt? y/n");
//        name = br.readLine();
//        if (name.equals("y"))
//            while ((c = fin.read()) != -1) System.out.print((char) c);
//    }
//}
