package com.speksy.ocp.chapter4.advancedStreamPipelineConcepts;

import java.io.IOException;
import java.util.List;
import java.util.function.Supplier;

public class ExceptionCaseStudy {
    private static List<String> create() throws IOException {
        throw new IOException();
    }

    private static List<String> createSafe(){
        try {
            return ExceptionCaseStudy.create();
        }catch (IOException e){
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        try {
            ExceptionCaseStudy.create().stream().count();
        } catch (IOException e) {
            e.printStackTrace();
        }

//        Supplier<List<String>> s = ExceptionCaseStudy::create;  // DOES MOT COMPILE
        Supplier<List<String>> s = () -> {
          try {
              return ExceptionCaseStudy.create();
          } catch (IOException e) {
              throw new RuntimeException(e);
          }
        };

        createSafe();

        // The code compiles because checked exception is
        // handled in the createSafe method.
        Supplier<List<String>> s2 = ExceptionCaseStudy::createSafe;
    }
}
