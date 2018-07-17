package com.codespace.task1;

import java.io.File;

public class Runner {
    public void run(String[] args) {
        File file = null; //на всякий случай - инициализируем
        if (args.length > 0) {
            file = new File(args[0]);
        } else {
            file = new File("./");
        }

        if (file.isDirectory() /*&& file.exists()*/) {
            File[] files = file.listFiles();
            for (File elem : files) {
                System.out.println(elem.getName());
            }
        } else {
            System.out.println("File is not a directory!");
        }
    }
}
