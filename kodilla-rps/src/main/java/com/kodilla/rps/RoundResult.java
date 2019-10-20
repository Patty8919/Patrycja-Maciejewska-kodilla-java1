package com.kodilla.rps;

public class RoundResult {
   private boolean win;
    private boolean fault;
    private boolean tie;

    public RoundResult(boolean win, boolean fault, boolean tie) {
        this.win = win;
        this.fault = fault;
        this.tie = tie;
    }

    public boolean isWin() {
        return win;
    }

    public boolean isFault() {
        return fault;
    }

    public boolean isTie() {
        return tie;
    }
}
