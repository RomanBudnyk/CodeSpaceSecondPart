package com.codespace.task3;

public class TrainSchedule {
    public Train[] trains;
    public int numberTrains;

    public TrainSchedule(int i) {
        trains = new Train[i];

    }

    public Train addTrain() {
        Train train = new Train(10);

        return train;
    }
}
