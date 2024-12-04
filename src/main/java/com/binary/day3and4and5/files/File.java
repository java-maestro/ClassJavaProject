package com.binary.day3and4and5.files;

public class File implements  Readable{
     private String content;


     public File(String content) {
         this.content = content;
     }

    @Override
    public String read() {
        return content;
    }
}
