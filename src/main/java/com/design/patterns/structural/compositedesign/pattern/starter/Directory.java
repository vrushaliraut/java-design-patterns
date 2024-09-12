package com.design.patterns.structural.compositedesign.pattern.starter;

import java.util.ArrayList;
import java.util.List;

public class Directory {
    private String name;
    private List<File> files;

    private List<Directory> subDirectories;

    public Directory(String name) {
        this.name = name;
        this.files = new ArrayList<>();
        this.subDirectories = new ArrayList<>();
    }

    public void addFile(File file) {
        files.add(file);
    }

    public void addSubDirectory(Directory subDirectory) {
        subDirectories.add(subDirectory);
    }

    public long getTotalSize() {
        long totalSize = 0;

        // Sum the size of all files in the directory
        for (File file : files) {
            totalSize += file.getSize();
        }

        // Recursively calculate the size of all subdirectories
        for (Directory subDirectory : subDirectories) {
            totalSize += subDirectory.getTotalSize();
        }

        return totalSize;
    }

    public void displayStructure(String indent) {
        System.out.println(indent + "Directory: " + name);

        // Display all files
        for (File file : files) {
            System.out.println(indent + "  File: " + file.getName() + " (Size: " + file.getSize() + ")");
        }

        // Display all subdirectories
        for (Directory subDirectory : subDirectories) {
            subDirectory.displayStructure(indent + "  ");
        }
    }
}
