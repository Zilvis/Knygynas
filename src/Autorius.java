import java.util.ArrayList;

public class Autorius {
    private String vardas, pavarde;

    @Override
    public String toString() {
        return "Autorius{" +
                "vardas='" + vardas + '\'' +
                ", pavarde='" + pavarde + '\'' +
                ", gimimoMetai=" + gimimoMetai +
                '}';
    }

    private int gimimoMetai;

    public Autorius(String vardas, String pavarde, int gimimoMetai) {
        this.vardas         = vardas;
        this.pavarde        = pavarde;
        this.gimimoMetai    = gimimoMetai;
    }

    public String getVardas() {
        return vardas;
    }

    public String getPavarde() {
        return pavarde;
    }
}
