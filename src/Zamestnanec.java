public class Zamestnanec {

        private String meno;
        private String priezvisko;
        private char pohlavie;
        private String rokNarodenia;

    public String getMeno() {
        return meno;
    }

    public void setMeno(String meno) {
        this.meno = meno;
    }

    public String getPriezvisko() {
        return priezvisko;
    }

    public void setPriezvisko(String priezvisko) {
        this.priezvisko = priezvisko;
    }

    public char getPohlavie() {
        return pohlavie;
    }

    public void setPohlavie(char pohlavie) {
        this.pohlavie = pohlavie;
    }

    public String getRokNarodenia() {
        return rokNarodenia;
    }

    public void setRokNarodenia(String rokNarodenia) {
        this.rokNarodenia = rokNarodenia;
    }
    @Override
    public String toString() {
        return "Zamestnanec{" +
                "meno='" + meno + '\'' +
                ", priezvisko='" + priezvisko + '\'' +
                ", pohlavie=" + pohlavie +
                ", rokNarodenia='" + rokNarodenia + '\'' +
                '}';
    }
}
