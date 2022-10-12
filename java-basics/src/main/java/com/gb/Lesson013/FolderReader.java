package com.gb.Lesson013;

import java.io.File;
import java.nio.file.Path;
import java.util.ArrayList;

public class FolderReader {

    private static final ArrayList<String> list = new ArrayList<>();

    public static ArrayList<String> listDirectory(Path path) {
        File dir = new File(path.toString());
        File[] firstLevelFiles = dir.listFiles();
        if (firstLevelFiles != null && firstLevelFiles.length > 0) {
            for (File aFile : firstLevelFiles) {
                if (aFile.isDirectory()) {
                    list.add("<a href=\"" + aFile.getName() + "/" + "\">" + aFile.getName() + "</a>");
                } else {
                    list.add("<a href=\"" + aFile.getName() + "\" target=\"_blank\">" + aFile.getName() + "</a>");
                }
            }
            if (!path.toString().equals(".")) {
                list.add("<a href=\"" + "../" + "\">" + "<--" + "</a>" + "<br>");
            }
        }
        return list;
    }
}
