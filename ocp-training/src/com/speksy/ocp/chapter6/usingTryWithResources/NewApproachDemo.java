package com.speksy.ocp.chapter6.usingTryWithResources;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class NewApproachDemo {
    public static void main(String[] args) {
        Path path1 = Paths.get("test.txt");
        Path path2 = Paths.get("test2.txt");
        try {
            newApproach(path1, path2);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void newApproach(Path path1, Path path2) throws IOException {
        try (BufferedReader in = Files.newBufferedReader(path1);
             BufferedWriter out = Files.newBufferedWriter(path2)) {
            out.write(in.readLine());
        }
    }
}
