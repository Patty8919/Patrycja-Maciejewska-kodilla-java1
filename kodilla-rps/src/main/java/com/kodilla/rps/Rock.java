package com.kodilla.rps;

public class Rock implements Move {

    @Override
    public String name() {
        return "Rock";
    }

    @Override
    public RoundResult win(Move move) {
        switch (move.name()) {
            case "Rock":
                return new RoundResult(false, false, true);
            case "Scissors":
                return new RoundResult(true, false, false);
            case "Paper":
                return new RoundResult(false, true, false);
        }

        return null;
    }
}
