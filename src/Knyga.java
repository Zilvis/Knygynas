public class Knyga{
    private int isleidimoMetai;
    private String autorius, pavadinimas;

    public Knyga(int isleidimoMetai, String pavadinimas) {
        this.isleidimoMetai = isleidimoMetai;
        this.pavadinimas    = pavadinimas;
        this.autorius = getAutorius();
    }

    public void setAutorius(Autorius autorius) {
        this.autorius = autorius.getVardas() + " " + autorius.getPavarde();
    }

    public String getAutorius() {
        return autorius;
    }

    @Override
    public String toString() {
        return "Knygos pavadinimas " + pavadinimas + " autorius: " +autorius+ " isleidimo metai: " +isleidimoMetai + "\n";
    }
}
