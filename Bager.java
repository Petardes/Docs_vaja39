public class Bager extends Stroj {
    private int kapacitetaKovinskeZmogljivosti; // v tonah

    public Bager(int m, int kap) {
        super(m, "Bager");
        kapacitetaKovinskeZmogljivosti = kap;
    }

    public int getKapacitetaKovinskeZmogljivosti() {
        return kapacitetaKovinskeZmogljivosti;
    }

    public void povecajKapaciteto(int kap) {
        kapacitetaKovinskeZmogljivosti += kap;
        System.out.println("Kapaciteta kovinske zmogljivosti bagerja je zdaj " + kapacitetaKovinskeZmogljivosti + " ton.");
    }
}