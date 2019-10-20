package com.kodilla.rps;

import java.util.Random;

public class Computer implements Moves {
    private final Random random;

    public Computer(Random random) {
        this.random = random;
    }


    public String play() {
        return Options[this.random.nextInt(Options.length)];
    }

}
