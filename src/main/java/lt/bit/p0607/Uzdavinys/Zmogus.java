package lt.bit.p0607.Uzdavinys;

import java.util.Objects;

public class Zmogus {
    private String vardas;
    private String pavarde;

    public String getVardas() {
        return vardas;
    }

    public String getPavarde() {
        return pavarde;
    }

    public String getAk() {
        return ak;
    }

    @Override
    public String toString() {
        return "Zmogus{" +
                "vardas='" + vardas + '\'' +
                ", pavarde='" + pavarde + '\'' +
                ", ak='" + ak + '\'' +
                '}';
    }

    public Zmogus(String vardas, String pavarde, String ak) {
        this.vardas = vardas;
        this.pavarde = pavarde;
        this.ak = ak;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Zmogus zmogus = (Zmogus) o;
        return  getVardas().equals(zmogus.getVardas()) &&
                getPavarde().equals(zmogus.getPavarde()) &&
                getAk().equals(zmogus.getAk());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getVardas(), getPavarde(), getAk());
    }

    private String ak;


}
