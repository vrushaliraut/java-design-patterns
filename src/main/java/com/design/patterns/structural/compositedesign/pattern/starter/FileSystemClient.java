package com.design.patterns.structural.compositedesign.pattern.starter;

public class FileSystemClient {
    public static void main(String[] args) {
        File file1 = new File("file1.txt", 100);
        File file2 = new File("file2.txt", 200);

        Directory dir1 = new Directory("dir1");
        dir1.addFile(file1);

        Directory dir2 = new Directory("dir2");
        dir2.addFile(file2);
        dir2.addSubDirectory(dir1);  // Add subdirectory

        // Display structure
        dir2.displayStructure("");

        // Calculate total size of dir2
        System.out.println("Total size of dir2: " + dir2.getTotalSize());
    }
}
