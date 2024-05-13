package enity;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class testGetbyID {
    private Connection con = null;
    private PreparedStatement ps = null;
    private ResultSet rs = null;
    public String getNamebyID(int id){
        //System.out.println("be called");
        ConnDB connDB = new ConnDB();
        con = connDB.getCon();
        try {
            PreparedStatement ps = null;
            ResultSet rs = null;
            ps = con.prepareStatement("SELECT * FROM goods WHERE goodsId = " + id);
            rs = ps.executeQuery();
            if(rs.next()) {   // Add this line
                String name=rs.getString(2);
                //System.out.println(name);
                return name;
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return null;
    }
}
