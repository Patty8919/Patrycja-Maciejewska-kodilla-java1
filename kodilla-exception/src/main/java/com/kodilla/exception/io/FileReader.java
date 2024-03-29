package com.kodilla.exception.io;

import com.kodilla.exception.FileReaderException;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FileReader {
    public void readFile() throws FileReaderException {

        ClassLoader classLoader = getClass().getClassLoader();
        File file = new File(classLoader.getResource("file/names.txt").getFile());
        //Path path = Paths.get(file.getPath());
        try (Stream<String> fileLines = Files.lines(Paths.get("test.txt"))) {
        } catch (IOException e) {
            throw new FileReaderException();
        } finally {
            System.out.println("I am");
        }

       // System.out.println(file.getPath());
    }
}
