package koneksi;

import com.mysql.cj.jdbc.MySqlDataSource;
import java.sql.Connection;
import java.sql.SQLException;

public class connector {
    static Connection connect;
    
    public static Connection connection() {
        if(connect==null) {
            MysqlDataSource data = new MysqlDataSource();
            data.setDatabaseName("movie");
            data.setUser("root");
            data.setPassword("");
            try{
                connect = data.getConnection();
                System.out.println("Koneksi Berhasil");
            }catch(SQLException ex) {
                ex.printStackTrace();
                System.out.println("Koneksi Gagal");
            }
        }
        
        return connect;
    }
}
