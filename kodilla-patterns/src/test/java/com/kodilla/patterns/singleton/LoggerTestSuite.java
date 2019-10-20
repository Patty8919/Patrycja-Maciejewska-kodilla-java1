package com.kodilla.patterns.singleton;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class LoggerTestSuite {
    private static Logger settingsLogger;

    @BeforeClass
    public static void openSettingsFile() {
        settingsLogger.getInstance().open("myapp.settings");
    }

    @AfterClass
    public static void closeSettingsFile() {
        settingsLogger.getInstance().close();
    }

    @Test
    public void testGetFileName() {
        //Given
        //When
        String lastLog = settingsLogger.getInstance().getLastLog();
        System.out.println("Opened: " + lastLog);
        //Then
        Assert.assertEquals("myapp.settings", lastLog);
    }

}
