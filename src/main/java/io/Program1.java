package io;

import javafx.scene.input.KeyCode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Program1 {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            char symbol;
            StringBuffer str = new StringBuffer("");
            do {
                symbol = (char) reader.read();
                str.append(symbol);
            } while (symbol != '\n');
            System.out.println("You've entered: " + str.toString());

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
