package com.binary.day3and4and5.files;

public class SystemFile implements Writeable{

    private String content;


    public SystemFile(String content) {
        this.content = content;
    }


    @Override
    public String write(String write) {
        this.content = this.content +write;
        return this.content;
    }
}
