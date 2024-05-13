package enity;

import java.sql.Connection;
import java.sql.DriverManager;


public class ConnDB {
    private Connection con = null;

    public Connection getCon() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test?useSSL=false&serverTimezone=Asia/Shanghai&useUnicode=true&characterEncoding=utf-8&autoReconnect=true","root","1234");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return con;
    }

}
