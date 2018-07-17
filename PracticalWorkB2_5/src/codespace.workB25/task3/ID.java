package codespace.workB25.task3;

import java.util.Random;

public class ID {
    private static int nextId;
    private int id;

    static {
        Random random = new Random();
        nextId = random.nextInt(100) + 1;
    }

    public int getId() {
        return id;
    }

    public ID() {
        id = nextId;
        nextId++;
    }
}
