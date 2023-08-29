package Utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
    public static Properties read() throws IOException {
        String path ="Files/config.properties";
        // A class that helps us to navigate to that folder where file is stored
        // if you face an issues have mouse and click an add exception to method signature
        FileInputStream fileInputStream= new FileInputStream(path);

        // this properties class will assist us to read and write data to .properties files

        Properties properties = new Properties();
        // loads all the data from file inside the above object "properties"
        properties.load(fileInputStream);
        return properties;
    }
}
