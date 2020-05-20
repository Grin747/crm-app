package cruds;

import java.util.Properties;

public abstract class Crud {
    static String url = "jdbc:postgresql://localhost:5432/crmdb";
    static Properties info = new Properties();

    {
        info.setProperty("user", "crm");
        info.setProperty("password", "");
        info.setProperty("useUnicode","true");
        info.setProperty("characterEncoding","UTF-8");
    }
}
