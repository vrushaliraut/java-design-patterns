package com.design.patterns.structural.compositedesign.pattern.starter;

public class File {
    private String name;
    private long size;

    public File(String name, long size) {
        this.name = name;
        this.size = size;
    }

    public long getSize() {
        return size;
    }

    public String getName() {
        return name;
    }
}
