package com.invoice_cloud.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {

    // Create the object of properties
   private static Properties properties = new Properties();

    static {
        try {

            //This will open the file in java memory: FileInputStream
            FileInputStream file = new FileInputStream("configuration.properties");
            //To load the properties object using fileinputstream
            properties.load(file);
            //close the file
            file.close();

        } catch (IOException e) {
            System.out.println("File not found in the ConfigurationReader class");
        }

    }


    public static String getProperty(String keyword){
        return properties.getProperty(keyword);
    }


}
