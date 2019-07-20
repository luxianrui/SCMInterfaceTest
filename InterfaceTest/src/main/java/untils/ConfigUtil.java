package untils;

import java.io.IOException;
import java.util.Properties;

public class ConfigUtil {
    public static Properties prop;

    static {
        prop = new Properties();
        try{
            prop.load(ConfigUtil.class.getClassLoader().getResourceAsStream(name:"./conf/db.properties"));
        }catch (IOException e){

        }
    }

}
