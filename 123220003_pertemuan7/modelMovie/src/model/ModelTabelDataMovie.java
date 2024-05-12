package model;

import java.util.List;
import javax.swing.table.AbstrackTableModel;

public class ModelTabelDataMovie extends AbstractTableModel {
    List<DataMovie> datamovie;
    public ModelTabelDataMovie(List<DataMovie>datamovie){
    this.datamovie = datamovie;
    }
    
    @Override
    public int getRowCount() {
        return datamovie.size();
    }
    
    @Override
    public int getColumnCount() {
        return 5;
    }
    
    @Override
    public String getColumnName(int column){
        switch(column){
            case 0:
                return "Judul";
            case 1:
                return "Alur";
            case 2:
                return "Penokohan";
            case 3:
                return "Akting";
            case 4:
                return "Nilai";
            default:
                return null;
        }
    }
    
    @Override
    public Object getValueAt(int row, int column) {
        switch(column){
            case 0:
                return datamovie.get(row).getJudul();
            case 1:
                return datamovie.get(row).getAlur();
            case 2:
                return datamovie.get(row).getPenokohan();
            case 3:
                return datamovie.get(row).getAkting();
            case 4:
                return datamovie.get(row).getNilai();
            default:
                return null;
        }
    }   
}
