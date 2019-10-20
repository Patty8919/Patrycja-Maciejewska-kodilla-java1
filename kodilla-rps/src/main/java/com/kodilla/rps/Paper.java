package com.kodilla.rps;

public class Paper implements Move {

    @Override
    public String name() {
        return "Paper";
    }

    @Override
    public RoundResult win(Move move) {

        switch (move.name()) {
            case "Rock":
                return new RoundResult(true, false, false);
            case "Scissors":
                return new RoundResult(false, true, false);
            case "Paper":
                return new RoundResult(false, false, true);
        }
        return null;
    }
}
