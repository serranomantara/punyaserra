package dataMovie;

import java.sql.*;
import java.util.*;
import koneksi.connector;
import model.*;
import DAOImplement.DataMovieImplement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class dataMoviee implements DataMovieImplement{
    Connection connection;
    
    final String select = "select * from movie;";
    final String insert = "INSERT INTO movie (judul, alur, penokohan, akting, nilai) VALUES (?, ?, ?, ?, ?);";
    final String update = "update movie set alur=?, penokohan=?, akting=?, nilai=? where judul=?";
    final String delete = "delete from movie where judul=?";
    private DataMovie movie;

    public dataMovie(){
        connection = connector.connection();
    }
    
    @Override
    public void insert(DataMovie m) {
       PreparedStatement statement = null;
        try{
            statement = connection.prepareStatement(insert, Statement.RETURN_GENERATED_KEYS);
            statement.setString(1, m.getJudul());
            statement.setDouble(2, m.getAlur());
            statement.setDouble(3, m.getPenokohan());
            statement.setDouble(4, m.getAkting());
            statement.setDouble(5, m.HitungNilai());
            statement.executeUpdate();
            ResultSet rs = statement.getGeneratedKeys();
            while(rs.next()){
                m.setJudul(rs.getString(1));
            }
        }catch(SQLException ex){
            ex.printStackTrace();
        }finally{
            try{
                statement.close();
            }catch(SQLException ex){
                ex.printStackTrace();
            }
        }
    }

    @Override
public void update(DataMovie m) {
    PreparedStatement statement = null;
    try {
        statement = connection.prepareStatement(update);
        statement.setDouble(1, m.getAlur());
        statement.setDouble(2, m.getPenokohan());
        statement.setDouble(3, m.getAkting());
        statement.setDouble(4, m.HitungNilai());
        statement.setString(5, m.getJudul());
        statement.executeUpdate();
    } catch (SQLException ex) {
        ex.printStackTrace();
    } finally {
        try {
            statement.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}

    @Override
    public void delete(String judul) {
        PreparedStatement statement = null;
        try{
            statement = connection.prepareStatement(delete);
            
            statement.setString(1, judul);
            statement.executeUpdate();
        }catch(SQLException ex){
            ex.printStackTrace();
        }finally{
            try{
                statement.close();
            }catch(SQLException ex){
                ex.printStackTrace();
            }
        }
    }

    @Override
    public List<DataMovie> getAll() {
        List<DataMovie> dtm = null;
        try{
            dtm = new ArrayList<DataMovie>();
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(select);
            while(rs.next()){
                DataMovie movie = new DataMovie();
                movie.setJudul(rs.getString("judul"));
                movie.setAlur(rs.getDouble("alur"));
                movie.setPenokohan(rs.getDouble("penokohan"));
                movie.setAkting(rs.getDouble("akting"));
                movie.setNilai(rs.getDouble("nilai"));
                dtm.add(movie);
                
            }
        }catch(SQLException ex){
            Logger.getLogger(dataMovie.class.getName()).log(Level.SEVERE, null,ex);
        }
        
        return dtm;
    }
}
