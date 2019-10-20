package com.kodilla.rps;

import java.util.Scanner;

public class User implements Moves {
    private final Scanner scanner;

    public User(Scanner scanner) {
        this.scanner = scanner;
    }


    public String play() {
        System.out.println("1 => Rock");
        System.out.println("2 => Paper");
        System.out.println("3 => Scissors");

        int choice = this.scanner.nextInt();
        return Moves.Options[choice - 1];
    }
}
