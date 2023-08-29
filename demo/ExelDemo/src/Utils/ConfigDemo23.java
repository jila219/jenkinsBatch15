package Utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ConfigDemo23 {
    public static void main(String[] args) {
        String path = "Files/config.properties";

        try {
            FileInputStream fileInputStream = new FileInputStream(path);

        } catch (FileNotFoundException e) {
            System.out.println("Somthing gone wrong");
        } catch (NullPointerException e) {
            System.out.println("IO Exception occurred");
        }
    }

    }
