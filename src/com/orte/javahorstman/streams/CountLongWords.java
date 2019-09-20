package com.orte.javahorstman.streams;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class CountLongWords {

    public static void main(String[] args) throws IOException {
        String contents = new String(Files.readAllBytes(Paths.get("C:\\Users\\Orte\\IdeaProjects\\JastApp\\src\\com\\orte\\javahorstman\\streams\\alice30.txt")), StandardCharsets.UTF_8);
        List<String> words = Arrays.asList(contents.split("\\PL+"));
        long count = 0;
        for (String w : words) {
            if (w.length() > 8) count++;

        }
        System.out.println(count);
        count = words.stream().filter(w -> w.length() > 5).count();
        System.out.println(count);
        count = words.parallelStream().filter(w -> w.equalsIgnoreCase("the")).count();
        System.out.println(count);
    }
}
