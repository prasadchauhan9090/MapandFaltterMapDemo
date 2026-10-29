package com.chauhan.steamDemo;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;

public class Files {

    public static void main(String[] args) throws IOException
    {

        File file = new File("README.md");

        if(!file.exists())
           file.createNewFile();




    }


}
