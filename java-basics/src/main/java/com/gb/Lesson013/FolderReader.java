package com.gb.Lesson013;

import java.io.File;
import java.nio.file.Path;
import java.util.ArrayList;

public class FolderReader {

    private static final ArrayList<String> list = new ArrayList<>();

    public static ArrayList<String> listDirectory(Path path, int level) {
        File dir = new File(path.toString());
        File[] firstLevelFiles = dir.listFiles();
        if (firstLevelFiles != null && firstLevelFiles.length > 0) {
            for (File aFile : firstLevelFiles) {
                int margin = 30 * level;
                if (aFile.isDirectory()) {
                    list.add("<a href=\"" + aFile.getName() + "/" + "\"STYLE=\"margin-left:" + margin + "px\">" + aFile.getName() + "</a>");
                    //listDirectory(aFile.toPath(), level + 1);
                } else {
                    list.add("<a href=\"" + aFile.getName() + "\" target=\"_blank\" STYLE=\"margin-left:" + margin + "px\">" + aFile.getName() + "</a>");
                }
            }
        }
        return list;
    }
}
