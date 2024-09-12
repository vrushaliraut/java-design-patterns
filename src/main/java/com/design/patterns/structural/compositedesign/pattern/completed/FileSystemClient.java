package com.design.patterns.structural.compositedesign.pattern.completed;

public class FileSystemClient {
    public static void main(String[] args) {
        File file1 = new File("file1.txt", 100);
        File file2 = new File("file1.txt", 200);

        Directory dir1 = new Directory("dir1");
        dir1.addComponent(file1);

        Directory dir2 = new Directory("dir2");
        dir2.addComponent(file2);
        dir2.addComponent(dir1);  // Directory inside another directory

        System.out.println("Total size of dir2: " + dir2.getSize());
    }
}
