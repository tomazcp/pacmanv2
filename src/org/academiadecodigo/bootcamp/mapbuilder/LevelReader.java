package org.academiadecodigo.bootcamp.mapbuilder;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LevelReader {

    private static final String DIR = "resources/";
    private BufferedReader bufferedReader;

    /**
     * Reads a file and converts it to string
     *
     * @param file to load
     * @return string representation of the file
     */
    public String read(String file) {
        String fileStr = "";
        try {
            FileReader fileReader = new FileReader(DIR + file);
            bufferedReader = new BufferedReader(fileReader);
            String line = "";

            while ((line = bufferedReader.readLine()) != null) {
                fileStr += line;
            }

        } catch (IOException ex) {
            System.err.println(ex.getMessage());
        } finally {
            closeBuffer();
        }
        return fileStr;
    }

    /**
     * Closes buffered reader
     */
    private void closeBuffer() {
        try {
            bufferedReader.close();
        } catch (IOException ex) {
            System.err.println(ex.getMessage());
        }
    }
}
