package com.example;

import com.example.io.IoUtil;

import java.io.File;

public class Main {

    public static void main(String[] args) {
        IoUtil.createBaseFolder();
        IoUtil.createPackage("com.test.demo");
        IoUtil.createNestedFolders("a/b/c/d");
        File root = new File("C:\\Users\\008366\\Documents\\io");
        IoUtil.printStructure(root, 0);
        IoUtil.deleteFolder("a/b/c");
    }
}
