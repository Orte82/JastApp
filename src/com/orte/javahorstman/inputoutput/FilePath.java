package com.orte.javahorstman.inputoutput;

import java.io.*;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class FilePath {
    public static void main(String[] args) throws IOException {
//        File file = new File("some.txt");
//        if (file.exists()) {
//            file.createNewFile();
//        }
        // Java 7 NIO
        Path path;
        path = Paths.get("temp.txt").toAbsolutePath();
//        File file = new File("temp.txt");
//        path = file.toPath();
        System.out.println(path.getFileName());
        System.out.println(path.getParent());
        System.out.println(path.getRoot());
        System.out.println(path.isAbsolute());
        Files.copy(path, Paths.get("temp2.txt"), StandardCopyOption.REPLACE_EXISTING);

        Files.move(Paths.get("temp2.txt"), Paths.get("temp3.txt"), StandardCopyOption.REPLACE_EXISTING);
        Files.deleteIfExists(Paths.get("temp3.txt"));

        System.out.println(Files.size(path));
        System.out.println(Files.isDirectory(path));
        System.out.println(Files.isHidden(path));
        System.out.println(Files.isExecutable(path));
        System.out.println(Files.isReadable(path));
        System.out.println(Files.isWritable(path));

        System.out.println(Files.getAttribute(path, "size", LinkOption.NOFOLLOW_LINKS));
        // Attributes list
        BasicFileAttributes attributes = Files.readAttributes(path, BasicFileAttributes.class, LinkOption.NOFOLLOW_LINKS);

        //PosixFileAttributes posix = Files.readAttributes(path, PosixFileAttributes.class, LinkOption.NOFOLLOW_LINKS);
        attributes.creationTime();
        byte[] bytes = Files.readAllBytes(path);
        for (byte aByte : bytes) {
            System.out.print((char) aByte);
        }
        Files.write(path, "bla\n".getBytes());
        Files.write(path, "blue\n".getBytes());
        Files.write(path, "red\n".getBytes());

        List<String> list = new ArrayList<>();
        list.add("new");
        list.add("age");
        Files.write(path, list);

        List<String> list2 = Files.readAllLines(Paths.get("temp.txt"));
        for (String s : list2) {
            System.out.println("list2 " + s);
        }


        try (Writer writer = Files.newBufferedWriter(path);
             InputStream inputStream = Files.newInputStream(path);
             OutputStream outputStream = Files.newOutputStream(path);
             BufferedReader reader = Files.newBufferedReader(path))
        {
            String line;
            while ((line=reader.readLine())!=null){
                System.out.println(line );
            }
        }

        Files.walkFileTree(Paths.get("C:\\Users\\Orte\\IdeaProjects\\JastApp\\src\\com\\orte\\buchankajava"), new HashSet<>(), 1, new MyFileVisitor());

    }
}
class MyFileVisitor extends SimpleFileVisitor<Path>{
    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
        //System.out.println(file.getFileName());
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult postVisitDirectory(Path dir, IOException exc) throws IOException {
        System.out.println(dir.getFileName());
        return FileVisitResult.CONTINUE;
    }
}
