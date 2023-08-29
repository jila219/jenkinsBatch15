package class31;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigFileReadDemo1 {
    public static void main(String[] args) throws IOException {
        //locattion or path of file from wich we want to read the data
        String path="src/files/config.properties";
        // a class that helps us navigate to that folder where file is stored
        //if you face ab issues hover your mouse and click on add exeption to method signature
        FileInputStream fileInputStream=new FileInputStream(path);
        /*
        this Properties class will assist us to read and write data to properties files
         */

        Properties properties=new Properties();
        // loads all of the data from files inside the above object "proprities
        properties.load(fileInputStream);
        System.out.println(properties.get("user"));
        System.out.println(properties.get("password"));
        System.out.println(properties.get("browser"));
        System.out.println(properties.get("URL"));
        fileInputStream.close();



    }
}
