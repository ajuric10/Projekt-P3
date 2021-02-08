package ffos.ajuric_20.pasmineapk;

public class Pasmine {

    private int sifra;
    private String nazivPasmine;
    private String kategorijaVelicine;
    private String zivotniVijek;
    private String drzava;
    private String sveAnotacije;

    public Pasmine(int sifra, String nazivPasmine, String kategorijaVelicine, String zivotniVijek, String drzava, String sveAnotacije) {
        this.sifra = sifra;
        this.nazivPasmine = nazivPasmine;
        this.kategorijaVelicine = kategorijaVelicine;
        this.zivotniVijek = zivotniVijek;
        this.drzava = drzava;
        this.sveAnotacije = sveAnotacije;
    }

    public int getSifra() {
        return sifra;
    }

    public void setSifra(int sifra) {
        this.sifra = sifra;
    }

    public String getNazivPasmine() {
        return nazivPasmine;
    }

    public void setNazivPasmine(String nazivPasmine) {
        this.nazivPasmine = nazivPasmine;
    }

    public String getKategorijaVelicine() {
        return kategorijaVelicine;
    }

    public void setKategorijaVelicine(String kategorijaVelicine) {
        this.kategorijaVelicine = kategorijaVelicine;
    }

    public String getZivotniVijek() {
        return zivotniVijek;
    }

    public void setZivotniVijek(String zivotniVijek) {
        this.zivotniVijek = zivotniVijek;
    }

    public String getDrzava() {
        return drzava;
    }

    public void setDrzava(String drzava) {
        this.drzava = drzava;
    }

    public String getSveAnotacije() {
        return sveAnotacije;
    }

    public void setSveAnotacije(String sveAnotacije) {
        this.sveAnotacije = sveAnotacije;
    }
}
