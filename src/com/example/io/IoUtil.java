package com.example.io;
import java.io.File;
public class IoUtil {


    public static void createBaseFolder() {
        File folder = new File("C:\\Users\\008366\\Documents\\io");
        if(!folder.exists()) {
          folder.mkdirs();
            System.out.println("Folder yaradildi!");
        } else {
            System.out.println("Bele folder artiq movcuddur!");
        }
    }


    public static void createPackage(String packageName) {
        String path = "C:\\Users\\008366\\Documents\\io\\" + packageName.replace(".", "\\");
        File folder = new File(path);
        if (!folder.exists()) {
            folder.mkdirs();
            System.out.println("Package ucun folder yaradildi " + path);
        } else {
            System.out.println("Package artiw movcuddur!");
        }

        }

        public static void createNestedFolders(String path) {
           String fullPath = "C:\\Users\\008366\\Documents\\io\\" +
                   path.replace("/" , "\\");

           File folder = new File(fullPath);
           if (!folder.exists()) {
               folder.mkdirs();
               System.out.println("Nested folder yaradildi!");
           } else {
               System.out.println("Artiq movcuddur!!!");
           }

        }

        public static void printStructure(File folder, int level) {
              if (folder == null || !folder.exists()) return;
              for (int i = 0; i < level; i++ ) {
                System.out.println("  ");
            }

            System.out.println(folder.getName());
              File[] files = folder.listFiles();
              if (files != null  ) {
                 for (File f : files) {
                     if (f.isDirectory()) {
                         printStructure(f, level + 1);
                     }
                 }
              }

        }

        public static void deleteFolder(String path) {

        File folder = new File("C:\\Users\\008366\\Documents\\io\\" + path);
        if (!folder.exists()) {
            System.out.println("Folder yoxdur");
            return;
        }

        File[] files = folder.listFiles();
        if (files != null && files.length >0) {
            System.out.println("Folder bos deyil, siline bilmez!");
            return;
        }
        folder.delete();
            System.out.println("Folder silindi!");

        }


    }
