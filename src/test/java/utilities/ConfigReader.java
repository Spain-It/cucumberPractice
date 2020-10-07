package utilities;


import java.io.FileInputStream;
import java.util.Properties;

public class ConfigReader {
    //This class will READ THE DATA FROM configuration.properties file!!!!!!!
    //create a properties instance. Data type=Properties, instance name =properties
    private static Properties properties;

    static {
        //path of teh configuration.properties file
        String path = "configuration.properties";
        try {
            //Openning the configuration.properties file
            FileInputStream fileInputStream = new FileInputStream(path);
            //loading the file
            properties = new Properties();
            properties.load(fileInputStream);
            //closing the file
            fileInputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //Create a method to READ
    //This method weill get the KEY and return the VALUE
    public static String getProperty(String key){
        return properties.getProperty(key);
    }

//    TESTING IF OUR LOGIC WORKS
//    public static void main(String[] args) {
//        System.out.println(properties.getProperty("url"));
//    }

}

