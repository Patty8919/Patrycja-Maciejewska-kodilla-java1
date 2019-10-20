package com.kodilla.rps;

public class Scissors implements Move {

    @Override
    public String name() {
        return "Scissors";
    }

    @Override
    public RoundResult win(Move move) {
        switch (move.name()) {
            case "Rock":
                return new RoundResult(false, true, false);
            case "Scissors":
                return new RoundResult(false, false, true);
            case "Paper":
                return new RoundResult(true, false, false);
        }

        return null;
    }
}
