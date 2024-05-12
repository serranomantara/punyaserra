package dataMovieImplement;

import java.util.List;
import model.*;

public interface DataMovieImplement {
    public void insert(DataMovie movie);
    public void update(DataMovie movie);
    public void delete(String judul);
    public List<DataMovie> getAll();
}
