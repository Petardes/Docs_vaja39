public class VarilniStroj extends Stroj {
    private int maxDebelinaMateriala; // v mm

    public VarilniStroj(int m, int deb) {
        super(m, "Varilni stroj");
        maxDebelinaMateriala = deb;
    }

    public int getMaxDebelinaMateriala() {
        return maxDebelinaMateriala;
    }

    public void nastaviMaxDebelino(int deb) {
        maxDebelinaMateriala = deb;
        System.out.println("Največja debelina materiala, ki jo lahko obdeluje varilni stroj, je zdaj " + maxDebelinaMateriala + " mm.");
    }
}