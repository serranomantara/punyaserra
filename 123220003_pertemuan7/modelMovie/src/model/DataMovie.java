package model;

public class DataMovie {
    private String judul;
    private Double alur;
    private Double penokohan;
    private Double akting;
    private Double nilai;


    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public Double getAlur() {
        return alur;
    }

    public void setAlur(Double alur) {
        this.alur = alur;
    }

    public Double getPenokohan() {
        return penokohan;
    }

    public void setPenokohan(Double penokohan) {
        this.penokohan = penokohan;
    }

    public Double getAkting() {
        return akting;
    }

    public void setAkting(Double akting) {
        this.akting = akting;
    }

    public Double getNilai() {
        return nilai;
    }

    public void setNilai(Double nilai) {
        this.nilai = nilai;
    }
    
    public Double HitungNilai() {
        return (this.alur + this.penokohan + this.akting) / 3;
    }
    

}
