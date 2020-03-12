package id.ac.polinema.recyclerview.models;

public class Latihan {
    public String judul;
    public String logo;
    public String name;

    public Latihan(String logo, String name, String judul) {
        this.judul = judul;
        this.logo = logo;
        this.name = name;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
