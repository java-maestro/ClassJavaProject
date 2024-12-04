package com.binary.day3and4and5.files;

public class FileManagementSystem {
    public static void main(String[] args) {

        File file1 = new File("Hello Java");

        System.out.println(file1.read());

        SystemFile systemFile1 = new SystemFile("Hello System");

        System.out.println(systemFile1.write(" Welcome"));

        WordDoc wordDoc = new WordDoc("This is Word Document");

        wordDoc.read();
        wordDoc.write(" we are doing through interface.");

        System.out.println(wordDoc.read());




    }
}
