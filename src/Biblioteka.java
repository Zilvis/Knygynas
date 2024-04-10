import java.util.ArrayList;
import java.util.List;

public class Biblioteka {
    private List<Knyga> knyguSarasas;
    public Biblioteka() {
        knyguSarasas = new ArrayList<>();
    }

    public void pridetiKnyga(Knyga knyga){
        knyguSarasas.add(knyga);
    }

    @Override
    public String toString() {
        return "Biblioteka : " + knyguSarasas;
    }
}
