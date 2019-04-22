package com.speksy.ocp.chapter6.usingTryWithResources;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class OldApproachDemo {
    public static void main(String[] args) {
        Path path1 = Paths.get("test.txt");
        Path path2 = Paths.get("test2.txt");
        try {
            oldApproach(path1, path2);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void oldApproach(Path path1, Path path2) throws IOException {
        BufferedReader in = null;
        BufferedWriter out = null;
         
    }
    /*
    !!! Sometimes if in.close() throws an exception then out.close() will never be
    executed, leaving us with an unclosed resource!

    Better implementation of old approach

    * */
    private static void oldApproach2(Path path1, Path path2) throws IOException {
        BufferedReader in = null;
        BufferedWriter out = null;
        try {
            in = Files.newBufferedReader(path1);
            out = Files.newBufferedWriter(path2);
            out.write(in.readLine());
        } finally {
            try {
                in.close();
            } catch (IOException e){}
            try {
                in.close();
            } catch (IOException e){}
        }
    }

}
