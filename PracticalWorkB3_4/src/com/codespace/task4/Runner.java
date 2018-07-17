package com.codespace.task4;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Runner {
    public void run() {
        List<Integer> integers = Stream.iterate(10, n -> n + 10).limit(10).map(n -> n / 2).collect(Collectors.toList());
        System.out.println(Arrays.toString(integers.toArray()));

        System.out.println("================");

    }
}
