package dao;

import java.sql.*;

import java.util.ArrayList;
import java.util.function.Predicate;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.ClassStudent;

public class DBContext implements DatabaseInfo {

    public static Connection getConnect() {
        try {
            Class.forName(DRIVERNAME);
        } catch (ClassNotFoundException e) {
            System.out.println("Error loading driver" + e);
        }
        try {
            Connection con = DriverManager.getConnection(DBURL, USERDB, PASSDB);
            return con;
        } catch (SQLException e) {
            System.out.println("Error: " + e);
        }
        return null;
    }

    /*public static Connection getConnect(){
        try{
            Context initContext = new InitialContext();
            Context envContext = (Context) initContext.lookup("java:/comp/env");
                    DataSource ds = (DataSource) envContext.lookup("jdbc/mydb");
                    return ds.getConnection();
        } catch (SQLException | NamingException ex){
            System.out.println("Error: " + ex);
        }
        return null;
    }*/
   
//--------------------------------------------------------------------------------------------

   
 
//-----------------------------------------------------------------------------------

//    public static Class update(Class s) {
//        try (Connection con = getConnect()) {
//            PreparedStatement stmt = con.prepareStatement("Update Products set productName=?, description=?,price=? where productID =?");
//            stmt.setString(1, s.getProductName());
//            stmt.setString(2, s.getDescription());
//
//            int rc = stmt.executeUpdate();
//            con.close();
//            return s;
//        } catch (Exception ex) {
//            Logger.getLogger(ClassDB.class.getName()).log(Level.SEVERE, null, ex);
//            throw new RuntimeException("Invalid data");
//        }
//    //    return null;
//    }
//--------------------------------------------------------------------------------
//--------------------------------------------------------------------------------------------
  
//--------------------------------------------------------------------------------------------

//-------------------------------------------------------------------------------------------
    public static ArrayList<ClassStudent> listAll() {
        ArrayList<ClassStudent> list = new ArrayList<>();
        //Connection con = getConnect();
        try (Connection con = getConnect()) {
            PreparedStatement stmt = con.prepareStatement("Select ClassID,Name,NumberOfStudent from YourID where NumberOfStudent > 31 ");
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                list.add(new ClassStudent(rs.getString(1), rs.getString(2), rs.getInt(3)));
            }
            con.close();
            return list;
        } catch (Exception ex) {
            Logger.getLogger(DBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
//--------------------------------------------------------------------------------------------

   
//-------------------------------------------------------------------------------------------------        

    
//------------------------------------------------------------

    
//---------------------------------------------------------
    public static void main(String[] a) {
        ArrayList<ClassStudent> list = DBContext.listAll();
        for (ClassStudent item : list) {
            System.out.println(item);
        }
    }
//---------------------------------------------------------------------------

}
