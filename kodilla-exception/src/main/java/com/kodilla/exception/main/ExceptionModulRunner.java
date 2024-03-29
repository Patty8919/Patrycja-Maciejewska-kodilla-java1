package com.kodilla.exception.main;

import com.kodilla.exception.FileReaderException;
import com.kodilla.exception.io.FileReaderWithoutHandling;
import com.kodilla.exception.io.FileReader;


import java.io.IOException;

public class ExceptionModulRunner {
    public static void main(String args[]) {
        FileReader fileReader = new FileReader();

        try {
            fileReader.readFile();
        } catch (FileReaderException e) {
            System.out.println("Problem while reading a file!");
        }

    }
}
