package com.kodilla.patterns.singleton;

public class Logger {
    private static Logger settingsLogger = null;
    private String lastLog = "";

    private Logger() {
    }

    public static Logger getInstance() {
        if (settingsLogger == null) {
            synchronized (Logger.class) {
                if (settingsLogger == null) {
                    settingsLogger = new Logger();
                }
            }
        }
        return settingsLogger;
    }

    public void log(String log) {
        lastLog = log;
        System.out.println("Log: [" + log + "]");
    }

    public String getLastLog() {
        return lastLog;
    }

    public void open(final String lastLog) {
        this.lastLog = lastLog;
        System.out.println("Opening the logger");
    }

    public void close() {
        this.lastLog = "";
        System.out.println("Closing the logger");
    }

}

