
package javafxapplication3;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
;

public final class DatabaseHandler {
   private static DatabaseHandler handler;
   
   private static final String DB_URL = "jdbc:derby:database;create = true";
   private static Connection conn = null;
   private static Statement stmt = null;
   
   public DatabaseHandler(){
   createConnection();
   setupCourseTable();
   }
void createConnection(){ 
    try {
    Class.forName("org.apache.derby.EmbeddedDriver").newInstance();
   conn = DriverManager.getConnection(DB_URL);
    }catch(Exception e){
    e.printStackTrace();
    
    
    }

   }
void setupCourseTable(){
        String TABLE_NAME = "COURSE";
       try{
        stmt = conn.createStatement();
        DatabaseMetaData dbm = conn.getMetaData();
        ResultSet tables = dbm.getTables(null,null,TABLE_NAME.toUpperCase(),null);
        if(tables.next()){
        System.out.println("Table"+ TABLE_NAME +"already exists.Ready for go");
        
     }else {
        stmt.execute("CREATE TABLE" + TABLE_NAME + " {"
                + "       id varchar{200} primary key,\n"
                + "       faculty varchar{200} ,\n"
                + "       department varchar{200} ,\n"
                + "       level varchar{200} ,\n"
                + "       course varchar{200} ,\n"
                + "       isAvail boolean default true"
               + " }"
        );
        }


}catch(SQLException e) {
    System.err.println(e.getMessage()+"--- setupDatabase" );
}finally{
        }}
}
