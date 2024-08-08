package com.hitsuni.section02.stream;

import java.io.FileWriter;
import java.io.IOException;

public class Application4 {
    public static void main(String[] args) {
        /* FileWriter 이해하고 사용할 수 있다. */
        try(FileWriter fw = new FileWriter("testWriter.txt")) {
            fw.write(97);
            fw.write('A');
            fw.write(new char[] {'a', 'b', 'c', 'd', 'e'});
            fw.write("안녕하세요");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
