package com.binary.day3and4and5.files;

public class WordDoc  implements  Readable, Writeable{


    private String content;


    public WordDoc(String content) {
        this.content = content;
    }

    @Override
    public String read() {
        return content;
    }

    @Override
    public String write(String write) {
        content = content + write;
        return content;
    }
}
