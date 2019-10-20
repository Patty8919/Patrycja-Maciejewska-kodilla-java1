package com.kodilla.rps;

public interface Move {
    String name();

    RoundResult win(Move move);
}
