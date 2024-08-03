public class Stroj implements OperacijeStroja {
    // Preostale lastnosti in metode ostanejo nespremenjene

    private int moc; // v kilovatih
    private boolean jeVklopljen;
    private String tip;
    private int steviloUrDelovanja;

    public Stroj(int m, String t) {
        moc = m;
        jeVklopljen = false;
        tip = t;
        steviloUrDelovanja = 0;
        System.out.println("Ustvarjam objekt tipa Stroj z močjo " + m + " kW in tipom " + t);
    }

    @Override
    public boolean vklopi() {
        if (jeVklopljen) {
            System.out.println("Stroj je že vklopljen.");
            return false;
        } else {
            jeVklopljen = true;
            System.out.println("Stroj je zdaj vklopljen.");
            return true;
        }
    }

    @Override
    public boolean izklopi() {
        if (!jeVklopljen) {
            System.out.println("Stroj je že izklopljen.");
            return false;
        } else {
            jeVklopljen = false;
            System.out.println("Stroj je zdaj izklopljen.");
            return true;
        }
    }

    @Override
    public void dodajUreDelovanja(int ure) {
        if (jeVklopljen) {
            steviloUrDelovanja += ure;
            System.out.println("Stroj je deloval dodatnih " + ure + " ur. Skupno ur: " + steviloUrDelovanja);
        } else {
            System.out.println("Stroj ni vklopljen. Ne morem dodati ur delovanja.");
        }
    }

    public String getTip() {
        return tip;
    }

    public int getMoc() {
        return moc;
    }
}