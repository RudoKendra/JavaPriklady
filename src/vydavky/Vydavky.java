package vydavky;

public class Vydavky {
    private String nazov;
    private double suma;
    private boolean jeOsobny;

    public String getNazov() {
        return nazov;
    }

    public void setNazov(String nazov) {
        this.nazov = nazov;
    }

    public double getSuma() {
        return suma;
    }

    public void setSuma(double suma) {
        this.suma = suma;
    }

    public boolean isJeOsobny() {
        return jeOsobny;
    }

    public void setJeOsobny(boolean jeOsobny) {
        this.jeOsobny = jeOsobny;
    }

    public Vydavky(String nazov, double suma, boolean jeOsobny) {
        this.nazov = nazov;
        this.suma = suma;
        this.jeOsobny = jeOsobny;
    }

    public Vydavky() {
        this.nazov = "chlieb";
        this.suma = 2.5;
        this.jeOsobny = true;
    }
}
